// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunDataResultAnalysisResponseBodyIterator extends SSEResponseIterator<RunDataResultAnalysisResponseBody> {

    RunDataResultAnalysisResponseBodyIterator() {
    }

    public static RunDataResultAnalysisResponseBodyIterator create() {
        return new RunDataResultAnalysisResponseBodyIterator();
    }

    @Override
    protected RunDataResultAnalysisResponseBody toModel(String data) {
        RunDataResultAnalysisResponseBody result = RunDataResultAnalysisResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
