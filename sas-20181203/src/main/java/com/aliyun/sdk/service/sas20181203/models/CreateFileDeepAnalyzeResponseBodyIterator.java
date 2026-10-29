// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CreateFileDeepAnalyzeResponseBodyIterator extends SSEResponseIterator<CreateFileDeepAnalyzeResponseBody> {

    CreateFileDeepAnalyzeResponseBodyIterator() {
    }

    public static CreateFileDeepAnalyzeResponseBodyIterator create() {
        return new CreateFileDeepAnalyzeResponseBodyIterator();
    }

    @Override
    protected CreateFileDeepAnalyzeResponseBody toModel(String data) {
        CreateFileDeepAnalyzeResponseBody result = CreateFileDeepAnalyzeResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
