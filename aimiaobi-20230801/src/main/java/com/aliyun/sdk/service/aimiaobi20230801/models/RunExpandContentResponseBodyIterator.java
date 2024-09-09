// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunExpandContentResponseBodyIterator extends SSEResponseIterator<RunExpandContentResponseBody> {

    RunExpandContentResponseBodyIterator() {
    }

    public static RunExpandContentResponseBodyIterator create() {
        return new RunExpandContentResponseBodyIterator();
    }

    @Override
    protected RunExpandContentResponseBody toModel(String data) {
        RunExpandContentResponseBody result = RunExpandContentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
