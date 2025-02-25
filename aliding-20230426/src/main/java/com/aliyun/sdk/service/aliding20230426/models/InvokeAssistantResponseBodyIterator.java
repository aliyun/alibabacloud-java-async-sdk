// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeAssistantResponseBodyIterator extends SSEResponseIterator<InvokeAssistantResponseBody> {

    InvokeAssistantResponseBodyIterator() {
    }

    public static InvokeAssistantResponseBodyIterator create() {
        return new InvokeAssistantResponseBodyIterator();
    }

    @Override
    protected InvokeAssistantResponseBody toModel(String data) {
        InvokeAssistantResponseBody result = InvokeAssistantResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
