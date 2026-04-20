// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class DialogueResponseBodyIterator extends SSEResponseIterator<DialogueResponseBody> {

    DialogueResponseBodyIterator() {
    }

    public static DialogueResponseBodyIterator create() {
        return new DialogueResponseBodyIterator();
    }

    @Override
    protected DialogueResponseBody toModel(String data) {
        DialogueResponseBody result = DialogueResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
