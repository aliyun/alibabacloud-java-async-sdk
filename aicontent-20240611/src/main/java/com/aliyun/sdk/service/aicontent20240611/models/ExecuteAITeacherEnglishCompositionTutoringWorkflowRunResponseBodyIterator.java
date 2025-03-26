// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator extends SSEResponseIterator<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody> {

    ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator() {
    }

    public static ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator create() {
        return new ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator();
    }

    @Override
    protected ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody toModel(String data) {
        ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody result = ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
