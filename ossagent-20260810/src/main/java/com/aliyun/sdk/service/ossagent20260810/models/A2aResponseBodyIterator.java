// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260810.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;

import java.util.*;

public class A2aResponseBodyIterator extends SSEResponseIterator<Object> {

    A2aResponseBodyIterator() {
    }

    public static A2aResponseBodyIterator create() {
        return new A2aResponseBodyIterator();
    }

    @Override
    protected Object toModel(String data) {
        return ParseUtil.parseJSON(data);
    }

}
