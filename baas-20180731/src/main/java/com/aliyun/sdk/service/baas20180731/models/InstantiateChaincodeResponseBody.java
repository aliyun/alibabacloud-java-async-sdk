// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstantiateChaincodeResponseBody} extends {@link TeaModel}
 *
 * <p>InstantiateChaincodeResponseBody</p>
 */
public class InstantiateChaincodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private InstantiateChaincodeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstantiateChaincodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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

        public InstantiateChaincodeResponseBody build() {
            return new InstantiateChaincodeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ChaincodeId")
        private String chaincodeId;

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

        @NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.chaincodeId = builder.chaincodeId;
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
            this.version = builder.version;
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

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String chaincodeId; 
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
            private String version; 

            /**
             * ChaincodeId.
             */
            public Builder chaincodeId(String chaincodeId) {
                this.chaincodeId = chaincodeId;
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

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
