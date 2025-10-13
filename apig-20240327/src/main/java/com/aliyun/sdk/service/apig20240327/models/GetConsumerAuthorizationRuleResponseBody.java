// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetConsumerAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerAuthorizationRuleResponseBody</p>
 */
public class GetConsumerAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiInfo")
    private HttpApiApiInfo apiInfo;

    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("deployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("environmentInfo")
    private EnvironmentInfo environmentInfo;

    @com.aliyun.core.annotation.NameInMap("expireMode")
    private String expireMode;

    @com.aliyun.core.annotation.NameInMap("expireStatus")
    private String expireStatus;

    @com.aliyun.core.annotation.NameInMap("expireTimestamp")
    private Long expireTimestamp;

    @com.aliyun.core.annotation.NameInMap("gatewayInfo")
    private GatewayInfo gatewayInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private GetConsumerAuthorizationRuleResponseBody(Builder builder) {
        this.apiInfo = builder.apiInfo;
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.consumerId = builder.consumerId;
        this.createTimestamp = builder.createTimestamp;
        this.deployStatus = builder.deployStatus;
        this.environmentInfo = builder.environmentInfo;
        this.expireMode = builder.expireMode;
        this.expireStatus = builder.expireStatus;
        this.expireTimestamp = builder.expireTimestamp;
        this.gatewayInfo = builder.gatewayInfo;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerAuthorizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiInfo
     */
    public HttpApiApiInfo getApiInfo() {
        return this.apiInfo;
    }

    /**
     * @return consumerAuthorizationRuleId
     */
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return environmentInfo
     */
    public EnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    /**
     * @return expireMode
     */
    public String getExpireMode() {
        return this.expireMode;
    }

    /**
     * @return expireStatus
     */
    public String getExpireStatus() {
        return this.expireStatus;
    }

    /**
     * @return expireTimestamp
     */
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /**
     * @return gatewayInfo
     */
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private HttpApiApiInfo apiInfo; 
        private String consumerAuthorizationRuleId; 
        private String consumerId; 
        private Long createTimestamp; 
        private String deployStatus; 
        private EnvironmentInfo environmentInfo; 
        private String expireMode; 
        private String expireStatus; 
        private Long expireTimestamp; 
        private GatewayInfo gatewayInfo; 
        private String requestId; 
        private String resourceType; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(GetConsumerAuthorizationRuleResponseBody model) {
            this.apiInfo = model.apiInfo;
            this.consumerAuthorizationRuleId = model.consumerAuthorizationRuleId;
            this.consumerId = model.consumerId;
            this.createTimestamp = model.createTimestamp;
            this.deployStatus = model.deployStatus;
            this.environmentInfo = model.environmentInfo;
            this.expireMode = model.expireMode;
            this.expireStatus = model.expireStatus;
            this.expireTimestamp = model.expireTimestamp;
            this.gatewayInfo = model.gatewayInfo;
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * apiInfo.
         */
        public Builder apiInfo(HttpApiApiInfo apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }

        /**
         * consumerAuthorizationRuleId.
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * deployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * environmentInfo.
         */
        public Builder environmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }

        /**
         * expireMode.
         */
        public Builder expireMode(String expireMode) {
            this.expireMode = expireMode;
            return this;
        }

        /**
         * expireStatus.
         */
        public Builder expireStatus(String expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }

        /**
         * expireTimestamp.
         */
        public Builder expireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }

        /**
         * gatewayInfo.
         */
        public Builder gatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>53102737-1E4E-5A8B-8E0A-4184B0959B84</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public GetConsumerAuthorizationRuleResponseBody build() {
            return new GetConsumerAuthorizationRuleResponseBody(this);
        } 

    } 

}
