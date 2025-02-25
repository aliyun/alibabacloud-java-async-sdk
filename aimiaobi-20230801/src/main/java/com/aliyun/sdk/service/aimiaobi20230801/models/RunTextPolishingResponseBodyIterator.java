// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunTextPolishingResponseBodyIterator extends SSEResponseIterator<RunTextPolishingResponseBody> {

    RunTextPolishingResponseBodyIterator() {
    }

    public static RunTextPolishingResponseBodyIterator create() {
        return new RunTextPolishingResponseBodyIterator();
    }

    @Override
    protected RunTextPolishingResponseBody toModel(String data) {
        RunTextPolishingResponseBody result = RunTextPolishingResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
