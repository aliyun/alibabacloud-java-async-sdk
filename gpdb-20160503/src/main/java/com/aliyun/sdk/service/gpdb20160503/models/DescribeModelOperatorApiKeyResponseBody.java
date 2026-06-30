// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeModelOperatorApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelOperatorApiKeyResponseBody</p>
 */
public class DescribeModelOperatorApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ApiKeyId")
    private Integer apiKeyId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeModelOperatorApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.apiKeyId = builder.apiKeyId;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return apiKeyId
     */
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private Integer apiKeyId; 
        private String createTime; 
        private String description; 
        private String endpoint; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeModelOperatorApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.apiKeyId = model.apiKeyId;
            this.createTime = model.createTime;
            this.description = model.description;
            this.endpoint = model.endpoint;
            this.requestId = model.requestId;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>API KEY ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModelOperatorApiKeyResponseBody build() {
            return new DescribeModelOperatorApiKeyResponseBody(this);
        } 

    } 

}
