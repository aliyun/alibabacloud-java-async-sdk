// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>DescribeUploadTokenRequest</p>
 */
public class DescribeUploadTokenRequest extends Request {
    private DescribeUploadTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUploadTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeUploadTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeUploadTokenRequest request) {
            super(request);
        } 

        @Override
        public DescribeUploadTokenRequest build() {
            return new DescribeUploadTokenRequest(this);
        } 

    } 

}
