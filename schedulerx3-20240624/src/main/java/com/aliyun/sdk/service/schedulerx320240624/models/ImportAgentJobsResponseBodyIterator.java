// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ImportAgentJobsResponseBodyIterator extends SSEResponseIterator<ImportAgentJobsResponseBody> {

    ImportAgentJobsResponseBodyIterator() {
    }

    public static ImportAgentJobsResponseBodyIterator create() {
        return new ImportAgentJobsResponseBodyIterator();
    }

    @Override
    protected ImportAgentJobsResponseBody toModel(String data) {
        ImportAgentJobsResponseBody result = ImportAgentJobsResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
