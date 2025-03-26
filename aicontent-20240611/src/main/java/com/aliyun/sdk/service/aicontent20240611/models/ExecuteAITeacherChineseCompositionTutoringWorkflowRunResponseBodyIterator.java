// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator extends SSEResponseIterator<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody> {

    ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator() {
    }

    public static ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator create() {
        return new ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator();
    }

    @Override
    protected ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody toModel(String data) {
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody result = ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
