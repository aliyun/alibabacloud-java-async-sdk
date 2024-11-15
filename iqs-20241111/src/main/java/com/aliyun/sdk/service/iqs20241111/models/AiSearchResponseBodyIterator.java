// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AiSearchResponseBodyIterator extends SSEResponseIterator<AiSearchResponseBody> {

    AiSearchResponseBodyIterator() {
    }

    public static AiSearchResponseBodyIterator create() {
        return new AiSearchResponseBodyIterator();
    }

    @Override
    protected AiSearchResponseBody toModel(String data) {
        AiSearchResponseBody result = AiSearchResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
