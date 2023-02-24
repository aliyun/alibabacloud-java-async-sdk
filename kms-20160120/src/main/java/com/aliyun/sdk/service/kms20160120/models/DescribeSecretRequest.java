// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecretRequest</p>
 */
public class DescribeSecretRequest extends Request {
    @Query
    @NameInMap("FetchTags")
    private String fetchTags;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private DescribeSecretRequest(Builder builder) {
        super(builder);
        this.fetchTags = builder.fetchTags;
        this.secretName = builder.secretName;
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
     * @return fetchTags
     */
    public String getFetchTags() {
        return this.fetchTags;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<DescribeSecretRequest, Builder> {
        private String fetchTags; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecretRequest request) {
            super(request);
            this.fetchTags = request.fetchTags;
            this.secretName = request.secretName;
        } 

        /**
         * Specifies whether to return the resource tags of the secret. Valid values:
         * <p>
         * 
         * *   true: The resource tags are returned.
         * *   false: The resource tags are not returned. This is the default value.
         */
        public Builder fetchTags(String fetchTags) {
            this.putQueryParameter("FetchTags", fetchTags);
            this.fetchTags = fetchTags;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public DescribeSecretRequest build() {
            return new DescribeSecretRequest(this);
        } 

    } 

}
