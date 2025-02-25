// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class BaiLianSseChatResponseBodyIterator extends SSEResponseIterator<BaiLianSseChatResponseBody> {

    BaiLianSseChatResponseBodyIterator() {
    }

    public static BaiLianSseChatResponseBodyIterator create() {
        return new BaiLianSseChatResponseBodyIterator();
    }

    @Override
    protected BaiLianSseChatResponseBody toModel(String data) {
        BaiLianSseChatResponseBody result = BaiLianSseChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
