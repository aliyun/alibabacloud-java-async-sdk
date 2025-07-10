// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatStreamResponseBodyIterator extends SSEResponseIterator<ChatStreamResponseBody> {

    ChatStreamResponseBodyIterator() {
    }

    public static ChatStreamResponseBodyIterator create() {
        return new ChatStreamResponseBodyIterator();
    }

    @Override
    protected ChatStreamResponseBody toModel(String data) {
        ChatStreamResponseBody result = ChatStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
