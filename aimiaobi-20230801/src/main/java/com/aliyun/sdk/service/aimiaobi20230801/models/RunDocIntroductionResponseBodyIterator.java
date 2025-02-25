// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunDocIntroductionResponseBodyIterator extends SSEResponseIterator<RunDocIntroductionResponseBody> {

    RunDocIntroductionResponseBodyIterator() {
    }

    public static RunDocIntroductionResponseBodyIterator create() {
        return new RunDocIntroductionResponseBodyIterator();
    }

    @Override
    protected RunDocIntroductionResponseBody toModel(String data) {
        RunDocIntroductionResponseBody result = RunDocIntroductionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
