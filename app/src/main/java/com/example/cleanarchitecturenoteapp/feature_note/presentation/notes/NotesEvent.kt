package com.example.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder


//1. `الفئة المختومة NotesEvent`: هذا يحدد الفئة المختومة المسماة `NotesEvent`
//يمكن أن تحتوي الفئة المختومة على أنواع فرعية (فئات فرعية) متداخلة بداخلها.
//في هذه الحالة، يعمل `NotesEvent` كفئة أساسية لمختلف الأحداث المتعلقة بالملاحظات.


//2. `طلب فئة البيانات (val noteOrder: NoteOrder) : NotesEvent ()`:
// هذه فئة بيانات متداخلة تمثل حدثًا حيث يريد المستخدم تغيير ترتيب الملاحظات.
//يحتوي على معلمة `noteOrder`، التي تحدد الترتيب الجديد، وهو نوع فرعي من `NotesEvent`.

//3. `` فئة البيانات حذف ملاحظة (فال ملاحظة: ملاحظة) : NotesEvent ()`:
// هذه فئة بيانات متداخلة تمثل حدثًا حيث يريد المستخدم حذف ملاحظة معينة.
// يحتوي على معلمة `note`، والتي تمثل الملاحظة المراد حذفها، وهي أيضًا نوع فرعي من `NotesEvent`.

//4.`object RestoreNote: NotesEvent()`: هذا كائن متداخل يمثل حدثًا لاستعادة ملاحظة.
// ليس لديه أي بيانات مرتبطة (إنه كائن بدون خصائص). وهو نوع فرعي من "NotesEvent".

//5. `object ToggleOrderSection : NotesEvent()`:
// هذا كائن متداخل آخر يمثل حدثًا لتبديل رؤية قسم الطلب في واجهة المستخدم. مثل الكائن السابق،
// لا يحتوي على أية بيانات مرتبطة به. وهو نوع فرعي من "NotesEvent".

//في تطبيق Android، يمكنك استخدام هذه الفئة المختومة لتغليف إجراءات المستخدم المختلفة
// أو الأحداث المتعلقة بالملاحظات.
// من خلال إنشاء أنواع فرعية لأحداث مختلفة، يمكنك التعامل مع هذه الأحداث بطريقة منظمة وآمنة للنوع،
// مما يجعل التعليمات البرمجية الخاصة بك أكثر قابلية للصيانة والقراءة.
// على سبيل المثال، يمكنك استخدامه مع فئات ViewModel للتعامل مع تفاعلات المستخدم في التطبيق.

sealed class NotesEvent {
     data class Order(val noteOrder: NoteOrder):NotesEvent()
     data class  DeleteNote(val note: Note): NotesEvent()
     object RestoreNote: NotesEvent()
     object ToggleOrderSection:NotesEvent()
}
