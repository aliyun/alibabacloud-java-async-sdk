// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunMultiDocIntroductionResponseBodyIterator extends SSEResponseIterator<RunMultiDocIntroductionResponseBody> {

    RunMultiDocIntroductionResponseBodyIterator() {
    }

    public static RunMultiDocIntroductionResponseBodyIterator create() {
        return new RunMultiDocIntroductionResponseBodyIterator();
    }

    @Override
    protected RunMultiDocIntroductionResponseBody toModel(String data) {
        RunMultiDocIntroductionResponseBody result = RunMultiDocIntroductionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
