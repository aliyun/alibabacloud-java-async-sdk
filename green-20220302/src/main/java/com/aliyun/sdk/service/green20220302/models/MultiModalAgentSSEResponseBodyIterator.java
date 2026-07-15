// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class MultiModalAgentSSEResponseBodyIterator extends SSEResponseIterator<MultiModalAgentSSEResponseBody> {

    MultiModalAgentSSEResponseBodyIterator() {
    }

    public static MultiModalAgentSSEResponseBodyIterator create() {
        return new MultiModalAgentSSEResponseBodyIterator();
    }

    @Override
    protected MultiModalAgentSSEResponseBody toModel(String data) {
        MultiModalAgentSSEResponseBody result = MultiModalAgentSSEResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
