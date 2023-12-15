// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeFabricChaincodeDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeFabricChaincodeDefinitionResponseBody</p>
 */
public class UpgradeFabricChaincodeDefinitionResponseBody extends TeaModel {
    @NameInMap("ChaincodeDefinitionId")
    private String chaincodeDefinitionId;

    @NameInMap("ChaincodePackageId")
    private String chaincodePackageId;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("InitRequired")
    private Boolean initRequired;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private UpgradeFabricChaincodeDefinitionResponseBody(Builder builder) {
        this.chaincodeDefinitionId = builder.chaincodeDefinitionId;
        this.chaincodePackageId = builder.chaincodePackageId;
        this.errorCode = builder.errorCode;
        this.initRequired = builder.initRequired;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeFabricChaincodeDefinitionResponseBody create() {
        return builder().build();
    }

    /**
     * @return chaincodeDefinitionId
     */
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    /**
     * @return chaincodePackageId
     */
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return initRequired
     */
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String chaincodeDefinitionId; 
        private String chaincodePackageId; 
        private Integer errorCode; 
        private Boolean initRequired; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ChaincodeDefinitionId.
         */
        public Builder chaincodeDefinitionId(String chaincodeDefinitionId) {
            this.chaincodeDefinitionId = chaincodeDefinitionId;
            return this;
        }

        /**
         * ChaincodePackageId.
         */
        public Builder chaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * InitRequired.
         */
        public Builder initRequired(Boolean initRequired) {
            this.initRequired = initRequired;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpgradeFabricChaincodeDefinitionResponseBody build() {
            return new UpgradeFabricChaincodeDefinitionResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ChaincodeId")
        private String chaincodeId;

        @NameInMap("ChaincodeVersion")
        private String chaincodeVersion;

        @NameInMap("ChannelName")
        private String channelName;

        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployTime")
        private String deployTime;

        @NameInMap("EndorsePolicy")
        private String endorsePolicy;

        @NameInMap("Input")
        private String input;

        @NameInMap("Install")
        private Boolean install;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("ProviderId")
        private String providerId;

        @NameInMap("ProviderName")
        private String providerName;

        @NameInMap("State")
        private String state;

        @NameInMap("Type")
        private Integer type;

        private Result(Builder builder) {
            this.chaincodeId = builder.chaincodeId;
            this.chaincodeVersion = builder.chaincodeVersion;
            this.channelName = builder.channelName;
            this.consortiumId = builder.consortiumId;
            this.createTime = builder.createTime;
            this.deployTime = builder.deployTime;
            this.endorsePolicy = builder.endorsePolicy;
            this.input = builder.input;
            this.install = builder.install;
            this.message = builder.message;
            this.name = builder.name;
            this.path = builder.path;
            this.providerId = builder.providerId;
            this.providerName = builder.providerName;
            this.state = builder.state;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chaincodeId
         */
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        /**
         * @return chaincodeVersion
         */
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployTime
         */
        public String getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return endorsePolicy
         */
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return install
         */
        public Boolean getInstall() {
            return this.install;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return providerId
         */
        public String getProviderId() {
            return this.providerId;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String chaincodeId; 
            private String chaincodeVersion; 
            private String channelName; 
            private String consortiumId; 
            private String createTime; 
            private String deployTime; 
            private String endorsePolicy; 
            private String input; 
            private Boolean install; 
            private String message; 
            private String name; 
            private String path; 
            private String providerId; 
            private String providerName; 
            private String state; 
            private Integer type; 

            /**
             * ChaincodeId.
             */
            public Builder chaincodeId(String chaincodeId) {
                this.chaincodeId = chaincodeId;
                return this;
            }

            /**
             * ChaincodeVersion.
             */
            public Builder chaincodeVersion(String chaincodeVersion) {
                this.chaincodeVersion = chaincodeVersion;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
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
             * DeployTime.
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * EndorsePolicy.
             */
            public Builder endorsePolicy(String endorsePolicy) {
                this.endorsePolicy = endorsePolicy;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * Install.
             */
            public Builder install(Boolean install) {
                this.install = install;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * ProviderId.
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
