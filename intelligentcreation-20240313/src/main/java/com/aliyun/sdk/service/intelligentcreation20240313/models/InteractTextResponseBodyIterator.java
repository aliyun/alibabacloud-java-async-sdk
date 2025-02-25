// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InteractTextResponseBodyIterator extends SSEResponseIterator<InteractTextResponseBody> {

    InteractTextResponseBodyIterator() {
    }

    public static InteractTextResponseBodyIterator create() {
        return new InteractTextResponseBodyIterator();
    }

    @Override
    protected InteractTextResponseBody toModel(String data) {
        InteractTextResponseBody result = InteractTextResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
