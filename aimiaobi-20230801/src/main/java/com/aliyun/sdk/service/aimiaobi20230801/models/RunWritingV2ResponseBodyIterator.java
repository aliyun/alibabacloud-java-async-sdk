// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunWritingV2ResponseBodyIterator extends SSEResponseIterator<RunWritingV2ResponseBody> {

    RunWritingV2ResponseBodyIterator() {
    }

    public static RunWritingV2ResponseBodyIterator create() {
        return new RunWritingV2ResponseBodyIterator();
    }

    @Override
    protected RunWritingV2ResponseBody toModel(String data) {
        RunWritingV2ResponseBody result = RunWritingV2ResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
