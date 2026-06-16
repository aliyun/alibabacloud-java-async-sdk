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
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * contextStoreName.
         */
        public Builder contextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
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
