// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunCompletionMessageResponseBodyIterator extends SSEResponseIterator<RunCompletionMessageResponseBody> {

    RunCompletionMessageResponseBodyIterator() {
    }

    public static RunCompletionMessageResponseBodyIterator create() {
        return new RunCompletionMessageResponseBodyIterator();
    }

    @Override
    protected RunCompletionMessageResponseBody toModel(String data) {
        RunCompletionMessageResponseBody result = RunCompletionMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
