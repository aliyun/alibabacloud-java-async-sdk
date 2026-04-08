// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeActionResponseBodyIterator extends SSEResponseIterator<InvokeActionResponseBody> {

    InvokeActionResponseBodyIterator() {
    }

    public static InvokeActionResponseBodyIterator create() {
        return new InvokeActionResponseBodyIterator();
    }

    @Override
    protected InvokeActionResponseBody toModel(String data) {
        InvokeActionResponseBody result = InvokeActionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
