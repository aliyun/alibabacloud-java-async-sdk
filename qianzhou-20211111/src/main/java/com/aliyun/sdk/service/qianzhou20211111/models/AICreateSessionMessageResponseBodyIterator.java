// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AICreateSessionMessageResponseBodyIterator extends SSEResponseIterator<AICreateSessionMessageResponseBody> {

    AICreateSessionMessageResponseBodyIterator() {
    }

    public static AICreateSessionMessageResponseBodyIterator create() {
        return new AICreateSessionMessageResponseBodyIterator();
    }

    @Override
    protected AICreateSessionMessageResponseBody toModel(String data) {
        AICreateSessionMessageResponseBody result = AICreateSessionMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
