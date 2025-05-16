// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ExecuteHundredThousandWhysDialogueResponseBodyIterator extends SSEResponseIterator<ExecuteHundredThousandWhysDialogueResponseBody> {

    ExecuteHundredThousandWhysDialogueResponseBodyIterator() {
    }

    public static ExecuteHundredThousandWhysDialogueResponseBodyIterator create() {
        return new ExecuteHundredThousandWhysDialogueResponseBodyIterator();
    }

    @Override
    protected ExecuteHundredThousandWhysDialogueResponseBody toModel(String data) {
        ExecuteHundredThousandWhysDialogueResponseBody result = ExecuteHundredThousandWhysDialogueResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
