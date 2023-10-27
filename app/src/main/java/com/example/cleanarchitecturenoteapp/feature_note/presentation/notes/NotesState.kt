package com.example.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.example.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

//data class
//1. `فئة البيانات`: تُستخدم هذه الكلمة الأساسية لتحديد فئة البيانات في Kotlin.
// تُستخدم فئات البيانات في المقام الأول للاحتفاظ بالبيانات،
// وتقوم تلقائيًا بإنشاء وظائف قياسية لتمثيل البيانات ومعالجتها،
// مثل أساليب `equals()` و`hashCode()` و`toString()`.

//2. `NotesState`: هذا هو اسم فئة البيانات. إنه يمثل الحالة المتعلقة بالملاحظات في طلبك.

// :الخصائص.3
//    - `الملاحظات notes`: تمثل هذه الخاصية قائمة من الملاحظات. تتم تهيئته بقائمة فارغة افتراضيًا.

//- `noteOrder`: تمثل هذه الخاصية الترتيب الذي يتم به عرض الملاحظات. تمت تهيئته بقيمة افتراضية هي
// `NoteOrder.Date(OrderType.Descending)`. يشير هذا إلى أنه افتراضيًا،
// يتم ترتيب الملاحظات حسب التاريخ بترتيب تنازلي، ولكن يمكن تخصيص ذلك.

//- `isOrderSectionVisible`: هذه الخاصية هي قيمة منطقية تشير إلى ما إذا كان قسم الطلب
// (حيث يمكن للمستخدمين اختيار كيفية ترتيب الملاحظات)
// مرئيًا أم لا. تمت تهيئته بقيمة افتراضية `خطأ`، مما يشير إلى أن قسم الطلب غير مرئي في البداية.

//في تطبيق Android،
// من المحتمل أن يتم استخدام فئة البيانات `NotesState` لإدارة وتمثيل حالة واجهة المستخدم المتعلقة بالملاحظات.
// يمكن استخدامه لتتبع قائمة الملاحظات، والترتيب الحالي الذي يتم عرض الملاحظات به،
// وما إذا كان يجب على واجهة المستخدم عرض قسم الطلب للتخصيص.

//يمكنك استخدام فئة البيانات هذه ضمن بنية تطبيقك،
// كما هو الحال مع ViewModels في مكون ViewModel في Android Architecture Components،
// لإدارة حالة ميزة الملاحظات والحفاظ عليها. وهذا يسمح بالاتصال الفعال بين واجهة المستخدم والبيانات.
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
