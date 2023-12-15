// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelChaincodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelChaincodesResponseBody</p>
 */
public class DescribeChannelChaincodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeChannelChaincodesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelChaincodesResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
        public Builder result(java.util.List < Result> result) {
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

        public DescribeChannelChaincodesResponseBody build() {
            return new DescribeChannelChaincodesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Binding")
        private Boolean binding;

        @NameInMap("ChaincodeId")
        private String chaincodeId;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ChannelName")
        private String channelName;

        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeployTime")
        private String deployTime;

        @NameInMap("EndorsePolicy")
        private String endorsePolicy;

        @NameInMap("Installed")
        private String installed;

        @NameInMap("Management")
        private Boolean management;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
        private String state;

        @NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.binding = builder.binding;
            this.chaincodeId = builder.chaincodeId;
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.consortiumId = builder.consortiumId;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.deployTime = builder.deployTime;
            this.endorsePolicy = builder.endorsePolicy;
            this.installed = builder.installed;
            this.management = builder.management;
            this.message = builder.message;
            this.name = builder.name;
            this.state = builder.state;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return binding
         */
        public Boolean getBinding() {
            return this.binding;
        }

        /**
         * @return chaincodeId
         */
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return installed
         */
        public String getInstalled() {
            return this.installed;
        }

        /**
         * @return management
         */
        public Boolean getManagement() {
            return this.management;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean binding; 
            private String chaincodeId; 
            private String channelId; 
            private String channelName; 
            private String consortiumId; 
            private String createTime; 
            private String creator; 
            private String deployTime; 
            private String endorsePolicy; 
            private String installed; 
            private Boolean management; 
            private String message; 
            private String name; 
            private String state; 
            private String version; 

            /**
             * Binding.
             */
            public Builder binding(Boolean binding) {
                this.binding = binding;
                return this;
            }

            /**
             * ChaincodeId.
             */
            public Builder chaincodeId(String chaincodeId) {
                this.chaincodeId = chaincodeId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
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
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Installed.
             */
            public Builder installed(String installed) {
                this.installed = installed;
                return this;
            }

            /**
             * Management.
             */
            public Builder management(Boolean management) {
                this.management = management;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
