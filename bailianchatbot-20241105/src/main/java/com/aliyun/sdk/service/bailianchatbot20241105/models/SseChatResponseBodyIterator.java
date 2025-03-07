// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianchatbot20241105.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class SseChatResponseBodyIterator extends SSEResponseIterator<SseChatResponseBody> {

    SseChatResponseBodyIterator() {
    }

    public static SseChatResponseBodyIterator create() {
        return new SseChatResponseBodyIterator();
    }

    @Override
    protected SseChatResponseBody toModel(String data) {
        SseChatResponseBody result = SseChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
