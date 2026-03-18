// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ModelRouterChatCompletionsResponseBodyIterator extends SSEResponseIterator<ModelRouterChatCompletionsResponseBody> {

    ModelRouterChatCompletionsResponseBodyIterator() {
    }

    public static ModelRouterChatCompletionsResponseBodyIterator create() {
        return new ModelRouterChatCompletionsResponseBodyIterator();
    }

    @Override
    protected ModelRouterChatCompletionsResponseBody toModel(String data) {
        ModelRouterChatCompletionsResponseBody result = ModelRouterChatCompletionsResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
