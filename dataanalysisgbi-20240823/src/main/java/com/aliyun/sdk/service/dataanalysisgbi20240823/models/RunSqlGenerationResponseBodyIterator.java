// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunSqlGenerationResponseBodyIterator extends SSEResponseIterator<RunSqlGenerationResponseBody> {

    RunSqlGenerationResponseBodyIterator() {
    }

    public static RunSqlGenerationResponseBodyIterator create() {
        return new RunSqlGenerationResponseBodyIterator();
    }

    @Override
    protected RunSqlGenerationResponseBody toModel(String data) {
        RunSqlGenerationResponseBody result = RunSqlGenerationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
