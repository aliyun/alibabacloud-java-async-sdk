// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class SendSdkStreamMessageResponseBodyIterator extends SSEResponseIterator<SendSdkStreamMessageResponseBody> {

    SendSdkStreamMessageResponseBodyIterator() {
    }

    public static SendSdkStreamMessageResponseBodyIterator create() {
        return new SendSdkStreamMessageResponseBodyIterator();
    }

    @Override
    protected SendSdkStreamMessageResponseBody toModel(String data) {
        SendSdkStreamMessageResponseBody result = SendSdkStreamMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
