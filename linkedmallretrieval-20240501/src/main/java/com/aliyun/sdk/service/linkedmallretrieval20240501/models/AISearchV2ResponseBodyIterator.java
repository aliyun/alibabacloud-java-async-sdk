// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AISearchV2ResponseBodyIterator extends SSEResponseIterator<AISearchV2ResponseBody> {

    AISearchV2ResponseBodyIterator() {
    }

    public static AISearchV2ResponseBodyIterator create() {
        return new AISearchV2ResponseBodyIterator();
    }

    @Override
    protected AISearchV2ResponseBody toModel(String data) {
        AISearchV2ResponseBody result = AISearchV2ResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
