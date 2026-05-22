// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class QaChatResponseBodyIterator extends SSEResponseIterator<QaChatResponseBody> {

    QaChatResponseBodyIterator() {
    }

    public static QaChatResponseBodyIterator create() {
        return new QaChatResponseBodyIterator();
    }

    @Override
    protected QaChatResponseBody toModel(String data) {
        QaChatResponseBody result = QaChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
