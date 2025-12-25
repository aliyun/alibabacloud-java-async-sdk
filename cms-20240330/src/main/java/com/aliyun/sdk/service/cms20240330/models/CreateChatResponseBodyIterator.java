// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CreateChatResponseBodyIterator extends SSEResponseIterator<CreateChatResponseBody> {

    CreateChatResponseBodyIterator() {
    }

    public static CreateChatResponseBodyIterator create() {
        return new CreateChatResponseBodyIterator();
    }

    @Override
    protected CreateChatResponseBody toModel(String data) {
        CreateChatResponseBody result = CreateChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
