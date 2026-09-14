// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetContextStoreAPIKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextStoreAPIKeyResponseBody</p>
 */
public class GetContextStoreAPIKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetContextStoreAPIKeyResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.apiKey = builder.apiKey;
        this.contextStoreName = builder.contextStoreName;
        this.createTime = builder.createTime;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextStoreAPIKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String agentSpace; 
        private String apiKey; 
        private String contextStoreName; 
        private String createTime; 
        private String name; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetContextStoreAPIKeyResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.apiKey = model.apiKey;
            this.contextStoreName = model.contextStoreName;
            this.createTime = model.createTime;
            this.name = model.name;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the AgentSpace to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The masked prefix of the API key (for example, sk-abcd****). For security purposes, the full plaintext is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-abcd****</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The name of the context store to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The creation time of the API key, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The display name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>my-api-key</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetContextStoreAPIKeyResponseBody build() {
            return new GetContextStoreAPIKeyResponseBody(this);
        } 

    } 

}
