// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class StreamChatMessageResponseBodyIterator extends SSEResponseIterator<StreamChatMessageResponseBody> {

    StreamChatMessageResponseBodyIterator() {
    }

    public static StreamChatMessageResponseBodyIterator create() {
        return new StreamChatMessageResponseBodyIterator();
    }

    @Override
    protected StreamChatMessageResponseBody toModel(String data) {
        StreamChatMessageResponseBody result = StreamChatMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
