// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudResourceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudResourceStatusRequest</p>
 */
public class DescribeCloudResourceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    private String secretId;

    private DescribeCloudResourceStatusRequest(Builder builder) {
        super(builder);
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudResourceStatusRequest, Builder> {
        private String secretId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudResourceStatusRequest request) {
            super(request);
            this.secretId = request.secretId;
        } 

        /**
         * SecretId.
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public DescribeCloudResourceStatusRequest build() {
            return new DescribeCloudResourceStatusRequest(this);
        } 

    } 

}
