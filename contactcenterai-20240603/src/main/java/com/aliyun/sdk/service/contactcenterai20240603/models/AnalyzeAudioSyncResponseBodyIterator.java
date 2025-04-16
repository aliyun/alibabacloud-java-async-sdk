// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AnalyzeAudioSyncResponseBodyIterator extends SSEResponseIterator<AnalyzeAudioSyncResponseBody> {

    AnalyzeAudioSyncResponseBodyIterator() {
    }

    public static AnalyzeAudioSyncResponseBodyIterator create() {
        return new AnalyzeAudioSyncResponseBodyIterator();
    }

    @Override
    protected AnalyzeAudioSyncResponseBody toModel(String data) {
        AnalyzeAudioSyncResponseBody result = AnalyzeAudioSyncResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
