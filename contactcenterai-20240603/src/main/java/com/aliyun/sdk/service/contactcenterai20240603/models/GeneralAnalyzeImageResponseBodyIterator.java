// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GeneralAnalyzeImageResponseBodyIterator extends SSEResponseIterator<GeneralAnalyzeImageResponseBody> {

    GeneralAnalyzeImageResponseBodyIterator() {
    }

    public static GeneralAnalyzeImageResponseBodyIterator create() {
        return new GeneralAnalyzeImageResponseBodyIterator();
    }

    @Override
    protected GeneralAnalyzeImageResponseBody toModel(String data) {
        GeneralAnalyzeImageResponseBody result = GeneralAnalyzeImageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
