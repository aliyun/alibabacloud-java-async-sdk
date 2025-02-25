// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunDataAnalysisResponseBodyIterator extends SSEResponseIterator<RunDataAnalysisResponseBody> {

    RunDataAnalysisResponseBodyIterator() {
    }

    public static RunDataAnalysisResponseBodyIterator create() {
        return new RunDataAnalysisResponseBodyIterator();
    }

    @Override
    protected RunDataAnalysisResponseBody toModel(String data) {
        RunDataAnalysisResponseBody result = RunDataAnalysisResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
