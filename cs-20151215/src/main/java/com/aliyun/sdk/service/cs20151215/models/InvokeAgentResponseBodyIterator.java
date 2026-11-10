// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeAgentResponseBodyIterator extends SSEResponseIterator<InvokeAgentResponseBody> {

    InvokeAgentResponseBodyIterator() {
    }

    public static InvokeAgentResponseBodyIterator create() {
        return new InvokeAgentResponseBodyIterator();
    }

    @Override
    protected InvokeAgentResponseBody toModel(String data) {
        InvokeAgentResponseBody result = InvokeAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
