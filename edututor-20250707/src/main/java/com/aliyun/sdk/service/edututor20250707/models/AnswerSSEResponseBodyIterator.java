// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edututor20250707.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AnswerSSEResponseBodyIterator extends SSEResponseIterator<AnswerSSEResponseBody> {

    AnswerSSEResponseBodyIterator() {
    }

    public static AnswerSSEResponseBodyIterator create() {
        return new AnswerSSEResponseBodyIterator();
    }

    @Override
    protected AnswerSSEResponseBody toModel(String data) {
        AnswerSSEResponseBody result = AnswerSSEResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
