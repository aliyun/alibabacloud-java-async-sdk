// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ContextualAnswerResponseBodyIterator extends SSEResponseIterator<ContextualAnswerResponseBody> {

    ContextualAnswerResponseBodyIterator() {
    }

    public static ContextualAnswerResponseBodyIterator create() {
        return new ContextualAnswerResponseBodyIterator();
    }

    @Override
    protected ContextualAnswerResponseBody toModel(String data) {
        ContextualAnswerResponseBody result = ContextualAnswerResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
