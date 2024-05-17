// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AISearchResponseBodyIterator extends SSEResponseIterator<AISearchResponseBody> {

    AISearchResponseBodyIterator() {
    }

    public static AISearchResponseBodyIterator create() {
        return new AISearchResponseBodyIterator();
    }

    @Override
    protected AISearchResponseBody toModel(String data) {
        AISearchResponseBody result = AISearchResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
