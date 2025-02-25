// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssCallbackSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssCallbackSettingRequest</p>
 */
public class DescribeOssCallbackSettingRequest extends Request {
    private DescribeOssCallbackSettingRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssCallbackSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeOssCallbackSettingRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeOssCallbackSettingRequest request) {
            super(request);
        } 

        @Override
        public DescribeOssCallbackSettingRequest build() {
            return new DescribeOssCallbackSettingRequest(this);
        } 

    } 

}
