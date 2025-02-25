// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AnalyzeImageResponseBodyIterator extends SSEResponseIterator<AnalyzeImageResponseBody> {

    AnalyzeImageResponseBodyIterator() {
    }

    public static AnalyzeImageResponseBodyIterator create() {
        return new AnalyzeImageResponseBodyIterator();
    }

    @Override
    protected AnalyzeImageResponseBody toModel(String data) {
        AnalyzeImageResponseBody result = AnalyzeImageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
