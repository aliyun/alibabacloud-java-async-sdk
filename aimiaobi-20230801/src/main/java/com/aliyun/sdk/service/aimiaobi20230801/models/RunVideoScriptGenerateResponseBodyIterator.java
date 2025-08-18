// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunVideoScriptGenerateResponseBodyIterator extends SSEResponseIterator<RunVideoScriptGenerateResponseBody> {

    RunVideoScriptGenerateResponseBodyIterator() {
    }

    public static RunVideoScriptGenerateResponseBodyIterator create() {
        return new RunVideoScriptGenerateResponseBodyIterator();
    }

    @Override
    protected RunVideoScriptGenerateResponseBody toModel(String data) {
        RunVideoScriptGenerateResponseBody result = RunVideoScriptGenerateResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
