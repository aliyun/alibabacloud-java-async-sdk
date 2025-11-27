// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatWithDesensitizeSSEResponseBodyIterator extends SSEResponseIterator<ChatWithDesensitizeSSEResponseBody> {

    ChatWithDesensitizeSSEResponseBodyIterator() {
    }

    public static ChatWithDesensitizeSSEResponseBodyIterator create() {
        return new ChatWithDesensitizeSSEResponseBodyIterator();
    }

    @Override
    protected ChatWithDesensitizeSSEResponseBody toModel(String data) {
        ChatWithDesensitizeSSEResponseBody result = ChatWithDesensitizeSSEResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
