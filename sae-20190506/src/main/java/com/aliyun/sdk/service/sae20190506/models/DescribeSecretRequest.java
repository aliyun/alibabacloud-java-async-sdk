// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecretRequest</p>
 */
public class DescribeSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000000000, minimum = 1)
    private Long secretId;

    private DescribeSecretRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return secretId
     */
    public Long getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<DescribeSecretRequest, Builder> {
        private String namespaceId; 
        private Long secretId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecretRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.secretId = request.secretId;
        } 

        /**
         * The ID of the namespace in which the Secret instance resides. By default, the namespace ID is the same as the region ID.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The ID of the Secret instance to be queried. You can call the [ListSecrets](~~466929~~) operation to view the IDs of Secrete instances.
         */
        public Builder secretId(Long secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public DescribeSecretRequest build() {
            return new DescribeSecretRequest(this);
        } 

    } 

}
