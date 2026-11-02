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
 * {@link AiSecurityGuardConfig} extends {@link TeaModel}
 *
 * <p>AiSecurityGuardConfig</p>
 */
public class AiSecurityGuardConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bufferLimit")
    private Integer bufferLimit;

    @com.aliyun.core.annotation.NameInMap("checkRequest")
    private Boolean checkRequest;

    @com.aliyun.core.annotation.NameInMap("checkRequestImage")
    private Boolean checkRequestImage;

    @com.aliyun.core.annotation.NameInMap("checkResponse")
    private Boolean checkResponse;

    @com.aliyun.core.annotation.NameInMap("checkResponseImage")
    private Boolean checkResponseImage;

    @com.aliyun.core.annotation.NameInMap("consumerConfigBindings")
    private java.util.List<ConsumerConfigBindings> consumerConfigBindings;

    @com.aliyun.core.annotation.NameInMap("consumerRequestCheckService")
    private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService;

    @com.aliyun.core.annotation.NameInMap("consumerResponseCheckService")
    private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService;

    @com.aliyun.core.annotation.NameInMap("consumerRiskLevel")
    private java.util.List<ConsumerRiskLevel> consumerRiskLevel;

    @com.aliyun.core.annotation.NameInMap("defaultGenerated")
    private Boolean defaultGenerated;

    @com.aliyun.core.annotation.NameInMap("longTermEnabled")
    private Boolean longTermEnabled;

    @com.aliyun.core.annotation.NameInMap("pluginStatus")
    private AiPluginStatus pluginStatus;

    @com.aliyun.core.annotation.NameInMap("requestCheckService")
    private String requestCheckService;

    @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
    private String requestImageCheckService;

    @com.aliyun.core.annotation.NameInMap("responseCheckService")
    private String responseCheckService;

    @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
    private String responseImageCheckService;

    @com.aliyun.core.annotation.NameInMap("riskAlertLevel")
    private String riskAlertLevel;

    @com.aliyun.core.annotation.NameInMap("riskConfig")
    private java.util.List<RiskConfig> riskConfig;

    @com.aliyun.core.annotation.NameInMap("serviceAddress")
    private String serviceAddress;

    private AiSecurityGuardConfig(Builder builder) {
        this.bufferLimit = builder.bufferLimit;
        this.checkRequest = builder.checkRequest;
        this.checkRequestImage = builder.checkRequestImage;
        this.checkResponse = builder.checkResponse;
        this.checkResponseImage = builder.checkResponseImage;
        this.consumerConfigBindings = builder.consumerConfigBindings;
        this.consumerRequestCheckService = builder.consumerRequestCheckService;
        this.consumerResponseCheckService = builder.consumerResponseCheckService;
        this.consumerRiskLevel = builder.consumerRiskLevel;
        this.defaultGenerated = builder.defaultGenerated;
        this.longTermEnabled = builder.longTermEnabled;
        this.pluginStatus = builder.pluginStatus;
        this.requestCheckService = builder.requestCheckService;
        this.requestImageCheckService = builder.requestImageCheckService;
        this.responseCheckService = builder.responseCheckService;
        this.responseImageCheckService = builder.responseImageCheckService;
        this.riskAlertLevel = builder.riskAlertLevel;
        this.riskConfig = builder.riskConfig;
        this.serviceAddress = builder.serviceAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiSecurityGuardConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bufferLimit
     */
    public Integer getBufferLimit() {
        return this.bufferLimit;
    }

    /**
     * @return checkRequest
     */
    public Boolean getCheckRequest() {
        return this.checkRequest;
    }

    /**
     * @return checkRequestImage
     */
    public Boolean getCheckRequestImage() {
        return this.checkRequestImage;
    }

    /**
     * @return checkResponse
     */
    public Boolean getCheckResponse() {
        return this.checkResponse;
    }

    /**
     * @return checkResponseImage
     */
    public Boolean getCheckResponseImage() {
        return this.checkResponseImage;
    }

    /**
     * @return consumerConfigBindings
     */
    public java.util.List<ConsumerConfigBindings> getConsumerConfigBindings() {
        return this.consumerConfigBindings;
    }

    /**
     * @return consumerRequestCheckService
     */
    public java.util.List<ConsumerRequestCheckService> getConsumerRequestCheckService() {
        return this.consumerRequestCheckService;
    }

    /**
     * @return consumerResponseCheckService
     */
    public java.util.List<ConsumerResponseCheckService> getConsumerResponseCheckService() {
        return this.consumerResponseCheckService;
    }

    /**
     * @return consumerRiskLevel
     */
    public java.util.List<ConsumerRiskLevel> getConsumerRiskLevel() {
        return this.consumerRiskLevel;
    }

    /**
     * @return defaultGenerated
     */
    public Boolean getDefaultGenerated() {
        return this.defaultGenerated;
    }

    /**
     * @return longTermEnabled
     */
    public Boolean getLongTermEnabled() {
        return this.longTermEnabled;
    }

    /**
     * @return pluginStatus
     */
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    /**
     * @return requestCheckService
     */
    public String getRequestCheckService() {
        return this.requestCheckService;
    }

    /**
     * @return requestImageCheckService
     */
    public String getRequestImageCheckService() {
        return this.requestImageCheckService;
    }

    /**
     * @return responseCheckService
     */
    public String getResponseCheckService() {
        return this.responseCheckService;
    }

    /**
     * @return responseImageCheckService
     */
    public String getResponseImageCheckService() {
        return this.responseImageCheckService;
    }

    /**
     * @return riskAlertLevel
     */
    public String getRiskAlertLevel() {
        return this.riskAlertLevel;
    }

    /**
     * @return riskConfig
     */
    public java.util.List<RiskConfig> getRiskConfig() {
        return this.riskConfig;
    }

    /**
     * @return serviceAddress
     */
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public static final class Builder {
        private Integer bufferLimit; 
        private Boolean checkRequest; 
        private Boolean checkRequestImage; 
        private Boolean checkResponse; 
        private Boolean checkResponseImage; 
        private java.util.List<ConsumerConfigBindings> consumerConfigBindings; 
        private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService; 
        private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService; 
        private java.util.List<ConsumerRiskLevel> consumerRiskLevel; 
        private Boolean defaultGenerated; 
        private Boolean longTermEnabled; 
        private AiPluginStatus pluginStatus; 
        private String requestCheckService; 
        private String requestImageCheckService; 
        private String responseCheckService; 
        private String responseImageCheckService; 
        private String riskAlertLevel; 
        private java.util.List<RiskConfig> riskConfig; 
        private String serviceAddress; 

        private Builder() {
        } 

        private Builder(AiSecurityGuardConfig model) {
            this.bufferLimit = model.bufferLimit;
            this.checkRequest = model.checkRequest;
            this.checkRequestImage = model.checkRequestImage;
            this.checkResponse = model.checkResponse;
            this.checkResponseImage = model.checkResponseImage;
            this.consumerConfigBindings = model.consumerConfigBindings;
            this.consumerRequestCheckService = model.consumerRequestCheckService;
            this.consumerResponseCheckService = model.consumerResponseCheckService;
            this.consumerRiskLevel = model.consumerRiskLevel;
            this.defaultGenerated = model.defaultGenerated;
            this.longTermEnabled = model.longTermEnabled;
            this.pluginStatus = model.pluginStatus;
            this.requestCheckService = model.requestCheckService;
            this.requestImageCheckService = model.requestImageCheckService;
            this.responseCheckService = model.responseCheckService;
            this.responseImageCheckService = model.responseImageCheckService;
            this.riskAlertLevel = model.riskAlertLevel;
            this.riskConfig = model.riskConfig;
            this.serviceAddress = model.serviceAddress;
        } 

        /**
         * <p>The size of the response buffer in KB. Default value: 1000. Valid values: 1 to 1500.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder bufferLimit(Integer bufferLimit) {
            this.bufferLimit = bufferLimit;
            return this;
        }

        /**
         * <p>Specifies whether to check the request content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }

        /**
         * <p>Specifies whether to check the request images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkRequestImage(Boolean checkRequestImage) {
            this.checkRequestImage = checkRequestImage;
            return this;
        }

        /**
         * <p>Specifies whether to check the response content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }

        /**
         * <p>Specifies whether to check the response images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkResponseImage(Boolean checkResponseImage) {
            this.checkResponseImage = checkResponseImage;
            return this;
        }

        /**
         * <p>The bindings between consumers and security guardrail configurations. An empty array explicitly clears the pending configurations.</p>
         */
        public Builder consumerConfigBindings(java.util.List<ConsumerConfigBindings> consumerConfigBindings) {
            this.consumerConfigBindings = consumerConfigBindings;
            return this;
        }

        /**
         * <p>The consumer-level request check service configuration.</p>
         */
        public Builder consumerRequestCheckService(java.util.List<ConsumerRequestCheckService> consumerRequestCheckService) {
            this.consumerRequestCheckService = consumerRequestCheckService;
            return this;
        }

        /**
         * <p>The consumer-level response check service configuration.</p>
         */
        public Builder consumerResponseCheckService(java.util.List<ConsumerResponseCheckService> consumerResponseCheckService) {
            this.consumerResponseCheckService = consumerResponseCheckService;
            return this;
        }

        /**
         * <p>The consumer-level risk level configuration.</p>
         */
        public Builder consumerRiskLevel(java.util.List<ConsumerRiskLevel> consumerRiskLevel) {
            this.consumerRiskLevel = consumerRiskLevel;
            return this;
        }

        /**
         * <p>Specifies whether the entire security guardrail policy is populated by default for this query. Returns true only for synthesized policies. For existing policies, returns false or is not returned. This is a read-only field. It is ignored upon submission, is not saved, and does not affect the start or stop status.</p>
         */
        public Builder defaultGenerated(Boolean defaultGenerated) {
            this.defaultGenerated = defaultGenerated;
            return this;
        }

        /**
         * <p>Specifies whether to use the long-term solution. If omitted or set to null, the original value is retained during an update.</p>
         */
        public Builder longTermEnabled(Boolean longTermEnabled) {
            this.longTermEnabled = longTermEnabled;
            return this;
        }

        /**
         * <p>The running status of the plug-in.</p>
         */
        public Builder pluginStatus(AiPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }

        /**
         * <p>The ServiceCode of the request text check service. The system injects the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        public Builder requestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }

        /**
         * <p>The ServiceCode of the request image check service. The system injects the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>img_query_guard</p>
         */
        public Builder requestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }

        /**
         * <p>The ServiceCode of the response text check service. The system injects the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>response_security_check</p>
         */
        public Builder responseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }

        /**
         * <p>The ServiceCode of the response image check service. The system injects the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>img_response_guard</p>
         */
        public Builder responseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }

        /**
         * <p>The global risk alert level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder riskAlertLevel(String riskAlertLevel) {
            this.riskAlertLevel = riskAlertLevel;
            return this;
        }

        /**
         * <p>The list of risk dimension configurations. The system injects this list, which is generated by normalizing ConsumerRiskLevel.</p>
         */
        public Builder riskConfig(java.util.List<RiskConfig> riskConfig) {
            this.riskConfig = riskConfig;
            return this;
        }

        /**
         * <p>The address of the security guardrail service, which is the green-cip endpoint. If the gateway and the security guardrail are in the same region, use the VPC internal network address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://green-cip-vpc.cn-shanghai.aliyuncs.com">https://green-cip-vpc.cn-shanghai.aliyuncs.com</a></p>
         */
        public Builder serviceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }

        public AiSecurityGuardConfig build() {
            return new AiSecurityGuardConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class ConsumerConfigBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private ConsumerConfigBindings(Builder builder) {
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerConfigBindings create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String matchType; 
            private String name; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ConsumerConfigBindings model) {
                this.matchType = model.matchType;
                this.name = model.name;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The match type for consumer names. Valid values: exact (exact match), prefix (prefix match), regexp (regular expression match), and all (matches any consumer). Rules of the all type must be placed at the end of the binding list.</p>
             * 
             * <strong>example:</strong>
             * <p>exact</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The match condition for the consumer name. If matchType is exact, enter the full consumer name. If matchType is prefix, enter the name prefix. If matchType is regexp, enter a regular expression. The value cannot be empty for these three types. If matchType is all, the value must be an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>example-consumer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the bound security guardrail configuration. This parameter cannot be empty. You can query the ID by calling the ListAiSecurityGuardConfigs operation and use the returned templateId.</p>
             * 
             * <strong>example:</strong>
             * <p>apig_0123456789abcdef</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public ConsumerConfigBindings build() {
                return new ConsumerConfigBindings(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class ConsumerRequestCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("requestCheckService")
        private String requestCheckService;

        @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
        private String requestImageCheckService;

        private ConsumerRequestCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.requestCheckService = builder.requestCheckService;
            this.requestImageCheckService = builder.requestImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRequestCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requestCheckService
         */
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        /**
         * @return requestImageCheckService
         */
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String requestCheckService; 
            private String requestImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerRequestCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.requestCheckService = model.requestCheckService;
                this.requestImageCheckService = model.requestImageCheckService;
            } 

            /**
             * <p>The consumer match type.</p>
             * 
             * <strong>example:</strong>
             * <p>exact</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The modality type.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
                return this;
            }

            /**
             * <p>The consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The check service.</p>
             * 
             * <strong>example:</strong>
             * <p>query_security_check</p>
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * <p>The image check service.</p>
             * 
             * <strong>example:</strong>
             * <p>img_query_guard</p>
             */
            public Builder requestImageCheckService(String requestImageCheckService) {
                this.requestImageCheckService = requestImageCheckService;
                return this;
            }

            public ConsumerRequestCheckService build() {
                return new ConsumerRequestCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class ConsumerResponseCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("responseCheckService")
        private String responseCheckService;

        @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
        private String responseImageCheckService;

        private ConsumerResponseCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.responseCheckService = builder.responseCheckService;
            this.responseImageCheckService = builder.responseImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerResponseCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return responseCheckService
         */
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        /**
         * @return responseImageCheckService
         */
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String responseCheckService; 
            private String responseImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerResponseCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.responseCheckService = model.responseCheckService;
                this.responseImageCheckService = model.responseImageCheckService;
            } 

            /**
             * <p>The consumer match type.</p>
             * 
             * <strong>example:</strong>
             * <p>exact</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The modality type.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
                return this;
            }

            /**
             * <p>The consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The check service.</p>
             * 
             * <strong>example:</strong>
             * <p>query_security_check</p>
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * <p>The image check service.</p>
             * 
             * <strong>example:</strong>
             * <p>img_query_guard</p>
             */
            public Builder responseImageCheckService(String responseImageCheckService) {
                this.responseImageCheckService = responseImageCheckService;
                return this;
            }

            public ConsumerResponseCheckService build() {
                return new ConsumerResponseCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class ConsumerRiskLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ConsumerRiskLevel(Builder builder) {
            this.level = builder.level;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRiskLevel create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private String matchType; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ConsumerRiskLevel model) {
                this.level = model.level;
                this.matchType = model.matchType;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The consumer match type.</p>
             * 
             * <strong>example:</strong>
             * <p>exact</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The risk dimension type.</p>
             * 
             * <strong>example:</strong>
             * <p>ContentModeration</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConsumerRiskLevel build() {
                return new ConsumerRiskLevel(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class ConsumerRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("pattern")
        private String pattern;

        private ConsumerRules(Builder builder) {
            this.matchType = builder.matchType;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRules create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String matchType; 
            private String pattern; 

            private Builder() {
            } 

            private Builder(ConsumerRules model) {
                this.matchType = model.matchType;
                this.pattern = model.pattern;
            } 

            /**
             * <p>The match type.</p>
             * 
             * <strong>example:</strong>
             * <p>Exact</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The consumer match pattern value.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public ConsumerRules build() {
                return new ConsumerRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSecurityGuardConfig} extends {@link TeaModel}
     *
     * <p>AiSecurityGuardConfig</p>
     */
    public static class RiskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerRules")
        private ConsumerRules consumerRules;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private RiskConfig(Builder builder) {
            this.consumerRules = builder.consumerRules;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskConfig create() {
            return builder().build();
        }

        /**
         * @return consumerRules
         */
        public ConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ConsumerRules consumerRules; 
            private String level; 
            private String type; 

            private Builder() {
            } 

            private Builder(RiskConfig model) {
                this.consumerRules = model.consumerRules;
                this.level = model.level;
                this.type = model.type;
            } 

            /**
             * <p>The consumer-level match rules.</p>
             */
            public Builder consumerRules(ConsumerRules consumerRules) {
                this.consumerRules = consumerRules;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The risk dimension type.</p>
             * 
             * <strong>example:</strong>
             * <p>ContentModeration</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskConfig build() {
                return new RiskConfig(this);
            } 

        } 

    }
}
