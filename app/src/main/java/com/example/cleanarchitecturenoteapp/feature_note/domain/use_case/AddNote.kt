package com.example.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.example.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.model.repository.NoteRepository
import kotlin.Throws

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")

        }
        if (note.title.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}
//- `AddNote`: هذا هو اسم الفئة. وهو يمثل حالة استخدام أو عملية لإضافة ملاحظة جديدة إلى مستودع أو مصدر بيانات.

//- `مستودع val الخاص: NoteRepository`: هذه خاصية للفئة. يحتوي على مثيل لـ "NoteRepository"،
// والذي من المحتمل أن يكون واجهة أو فئة مسؤولة عن إدارة مجموعة من الملاحظات والتفاعل معها،
// مثل تخزينها واسترجاعها وتحديثها.

//- `@Throws(InvalidNoteException::class)`: يتم استخدام هذا التعليق التوضيحي للإشارة إلى أن وظيفة `الاستدعاء`
// يمكن أن تطرح استثناءً من النوع `InvalidNoteException`
// . إن `InvalidNoteException` هو نوع استثناء مخصص قد يتم طرحه إذا لم يتم استيفاء شروط معينة عند إضافة ملاحظة.

//داخل الوظيفة، يقوم بإجراء الفحوصات التالية:
//- يتحقق مما إذا كان "عنوان" الملاحظة فارغًا. إذا كان الأمر كذلك، فإنه يطرح "InvalidNoteException" مع رسالة خطأ.
//- يتحقق مما إذا كان "محتوى" الملاحظة فارغًا. إذا كان الأمر كذلك، فإنه يطرح "InvalidNoteException" آخر مع رسالة خطأ مختلفة.
//- إذا نجح كلا الاختبارين، فإنه يستدعي الأسلوب "insertNote" الموجود في "المستودع" لإضافة الملاحظة إلى مصدر البيانات.