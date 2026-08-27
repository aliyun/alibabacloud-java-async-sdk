// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeAIAgentResponseBodyIterator extends SSEResponseIterator<InvokeAIAgentResponseBody> {

    InvokeAIAgentResponseBodyIterator() {
    }

    public static InvokeAIAgentResponseBodyIterator create() {
        return new InvokeAIAgentResponseBodyIterator();
    }

    @Override
    protected InvokeAIAgentResponseBody toModel(String data) {
        InvokeAIAgentResponseBody result = InvokeAIAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
