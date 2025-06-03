// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DescribeSecretRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecretRequest</p>
 */
public class DescribeSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchTags")
    private String fetchTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
         * <ul>
         * <li>true: The resource tags are returned.</li>
         * <li>false: The resource tags are not returned. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fetchTags(String fetchTags) {
            this.putQueryParameter("FetchTags", fetchTags);
            this.fetchTags = fetchTags;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
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
