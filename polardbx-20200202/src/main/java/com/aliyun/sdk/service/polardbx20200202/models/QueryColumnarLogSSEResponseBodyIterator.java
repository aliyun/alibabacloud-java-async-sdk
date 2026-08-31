// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class QueryColumnarLogSSEResponseBodyIterator extends SSEResponseIterator<QueryColumnarLogSSEResponseBody> {

    QueryColumnarLogSSEResponseBodyIterator() {
    }

    public static QueryColumnarLogSSEResponseBodyIterator create() {
        return new QueryColumnarLogSSEResponseBodyIterator();
    }

    @Override
    protected QueryColumnarLogSSEResponseBody toModel(String data) {
        QueryColumnarLogSSEResponseBody result = QueryColumnarLogSSEResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
