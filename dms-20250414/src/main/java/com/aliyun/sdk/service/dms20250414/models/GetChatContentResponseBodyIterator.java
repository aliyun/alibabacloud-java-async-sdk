// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GetChatContentResponseBodyIterator extends SSEResponseIterator<GetChatContentResponseBody> {

    GetChatContentResponseBodyIterator() {
    }

    public static GetChatContentResponseBodyIterator create() {
        return new GetChatContentResponseBodyIterator();
    }

    @Override
    protected GetChatContentResponseBody toModel(String data) {
        GetChatContentResponseBody result = GetChatContentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
