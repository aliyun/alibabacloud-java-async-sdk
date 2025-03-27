// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ExecuteTextbookAssistantSseDialogueResponseBodyIterator extends SSEResponseIterator<ExecuteTextbookAssistantSseDialogueResponseBody> {

    ExecuteTextbookAssistantSseDialogueResponseBodyIterator() {
    }

    public static ExecuteTextbookAssistantSseDialogueResponseBodyIterator create() {
        return new ExecuteTextbookAssistantSseDialogueResponseBodyIterator();
    }

    @Override
    protected ExecuteTextbookAssistantSseDialogueResponseBody toModel(String data) {
        ExecuteTextbookAssistantSseDialogueResponseBody result = ExecuteTextbookAssistantSseDialogueResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
