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

    @com.aliyun.core.annotation.NameInMap("consumerRequestCheckService")
    private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService;

    @com.aliyun.core.annotation.NameInMap("consumerResponseCheckService")
    private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService;

    @com.aliyun.core.annotation.NameInMap("consumerRiskLevel")
    private java.util.List<ConsumerRiskLevel> consumerRiskLevel;

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
        this.consumerRequestCheckService = builder.consumerRequestCheckService;
        this.consumerResponseCheckService = builder.consumerResponseCheckService;
        this.consumerRiskLevel = builder.consumerRiskLevel;
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
        private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService; 
        private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService; 
        private java.util.List<ConsumerRiskLevel> consumerRiskLevel; 
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
            this.consumerRequestCheckService = model.consumerRequestCheckService;
            this.consumerResponseCheckService = model.consumerResponseCheckService;
            this.consumerRiskLevel = model.consumerRiskLevel;
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
         * bufferLimit.
         */
        public Builder bufferLimit(Integer bufferLimit) {
            this.bufferLimit = bufferLimit;
            return this;
        }

        /**
         * checkRequest.
         */
        public Builder checkRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }

        /**
         * checkRequestImage.
         */
        public Builder checkRequestImage(Boolean checkRequestImage) {
            this.checkRequestImage = checkRequestImage;
            return this;
        }

        /**
         * checkResponse.
         */
        public Builder checkResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }

        /**
         * checkResponseImage.
         */
        public Builder checkResponseImage(Boolean checkResponseImage) {
            this.checkResponseImage = checkResponseImage;
            return this;
        }

        /**
         * consumerRequestCheckService.
         */
        public Builder consumerRequestCheckService(java.util.List<ConsumerRequestCheckService> consumerRequestCheckService) {
            this.consumerRequestCheckService = consumerRequestCheckService;
            return this;
        }

        /**
         * consumerResponseCheckService.
         */
        public Builder consumerResponseCheckService(java.util.List<ConsumerResponseCheckService> consumerResponseCheckService) {
            this.consumerResponseCheckService = consumerResponseCheckService;
            return this;
        }

        /**
         * consumerRiskLevel.
         */
        public Builder consumerRiskLevel(java.util.List<ConsumerRiskLevel> consumerRiskLevel) {
            this.consumerRiskLevel = consumerRiskLevel;
            return this;
        }

        /**
         * pluginStatus.
         */
        public Builder pluginStatus(AiPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }

        /**
         * requestCheckService.
         */
        public Builder requestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }

        /**
         * requestImageCheckService.
         */
        public Builder requestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }

        /**
         * responseCheckService.
         */
        public Builder responseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }

        /**
         * responseImageCheckService.
         */
        public Builder responseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }

        /**
         * riskAlertLevel.
         */
        public Builder riskAlertLevel(String riskAlertLevel) {
            this.riskAlertLevel = riskAlertLevel;
            return this;
        }

        /**
         * riskConfig.
         */
        public Builder riskConfig(java.util.List<RiskConfig> riskConfig) {
            this.riskConfig = riskConfig;
            return this;
        }

        /**
         * serviceAddress.
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
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * requestCheckService.
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * requestImageCheckService.
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
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * responseCheckService.
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * responseImageCheckService.
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
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
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
             * type.
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
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * pattern.
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
             * consumerRules.
             */
            public Builder consumerRules(ConsumerRules consumerRules) {
                this.consumerRules = consumerRules;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * type.
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
