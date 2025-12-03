// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScreenOssUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenOssUploadInfoRequest</p>
 */
public class DescribeScreenOssUploadInfoRequest extends Request {
    private DescribeScreenOssUploadInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenOssUploadInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeScreenOssUploadInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenOssUploadInfoRequest request) {
            super(request);
        } 

        @Override
        public DescribeScreenOssUploadInfoRequest build() {
            return new DescribeScreenOssUploadInfoRequest(this);
        } 

    } 

}
