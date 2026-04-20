// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class DescribeChatMessageResponseBodyIterator extends SSEResponseIterator<DescribeChatMessageResponseBody> {

    DescribeChatMessageResponseBodyIterator() {
    }

    public static DescribeChatMessageResponseBodyIterator create() {
        return new DescribeChatMessageResponseBodyIterator();
    }

    @Override
    protected DescribeChatMessageResponseBody toModel(String data) {
        DescribeChatMessageResponseBody result = DescribeChatMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
