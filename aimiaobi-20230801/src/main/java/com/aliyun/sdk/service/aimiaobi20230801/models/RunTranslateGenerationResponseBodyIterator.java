// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunTranslateGenerationResponseBodyIterator extends SSEResponseIterator<RunTranslateGenerationResponseBody> {

    RunTranslateGenerationResponseBodyIterator() {
    }

    public static RunTranslateGenerationResponseBodyIterator create() {
        return new RunTranslateGenerationResponseBodyIterator();
    }

    @Override
    protected RunTranslateGenerationResponseBody toModel(String data) {
        RunTranslateGenerationResponseBody result = RunTranslateGenerationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
