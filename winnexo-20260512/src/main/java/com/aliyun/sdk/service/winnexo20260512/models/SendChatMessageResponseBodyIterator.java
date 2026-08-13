// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class SendChatMessageResponseBodyIterator extends SSEResponseIterator<SendChatMessageResponseBody> {

    SendChatMessageResponseBodyIterator() {
    }

    public static SendChatMessageResponseBodyIterator create() {
        return new SendChatMessageResponseBodyIterator();
    }

    @Override
    protected SendChatMessageResponseBody toModel(String data) {
        SendChatMessageResponseBody result = SendChatMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
