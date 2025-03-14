// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCountScannedImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeCountScannedImageRequest</p>
 */
public class DescribeCountScannedImageRequest extends Request {
    private DescribeCountScannedImageRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCountScannedImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeCountScannedImageRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeCountScannedImageRequest request) {
            super(request);
        } 

        @Override
        public DescribeCountScannedImageRequest build() {
            return new DescribeCountScannedImageRequest(this);
        } 

    } 

}
