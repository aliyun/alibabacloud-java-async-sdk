// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinFabricChannelResponseBody} extends {@link TeaModel}
 *
 * <p>JoinFabricChannelResponseBody</p>
 */
public class JoinFabricChannelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private JoinFabricChannelResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinFabricChannelResponseBody create() {
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

        public JoinFabricChannelResponseBody build() {
            return new JoinFabricChannelResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AcceptTime")
        private String acceptTime;

        @NameInMap("ApproveTime")
        private String approveTime;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ConfirmTime")
        private String confirmTime;

        @NameInMap("DestroyTime")
        private String destroyTime;

        @NameInMap("InviteTime")
        private String inviteTime;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("State")
        private String state;

        @NameInMap("WithPeer")
        private Boolean withPeer;

        private Result(Builder builder) {
            this.acceptTime = builder.acceptTime;
            this.approveTime = builder.approveTime;
            this.channelId = builder.channelId;
            this.confirmTime = builder.confirmTime;
            this.destroyTime = builder.destroyTime;
            this.inviteTime = builder.inviteTime;
            this.organizationId = builder.organizationId;
            this.state = builder.state;
            this.withPeer = builder.withPeer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return acceptTime
         */
        public String getAcceptTime() {
            return this.acceptTime;
        }

        /**
         * @return approveTime
         */
        public String getApproveTime() {
            return this.approveTime;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return confirmTime
         */
        public String getConfirmTime() {
            return this.confirmTime;
        }

        /**
         * @return destroyTime
         */
        public String getDestroyTime() {
            return this.destroyTime;
        }

        /**
         * @return inviteTime
         */
        public String getInviteTime() {
            return this.inviteTime;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return withPeer
         */
        public Boolean getWithPeer() {
            return this.withPeer;
        }

        public static final class Builder {
            private String acceptTime; 
            private String approveTime; 
            private String channelId; 
            private String confirmTime; 
            private String destroyTime; 
            private String inviteTime; 
            private String organizationId; 
            private String state; 
            private Boolean withPeer; 

            /**
             * AcceptTime.
             */
            public Builder acceptTime(String acceptTime) {
                this.acceptTime = acceptTime;
                return this;
            }

            /**
             * ApproveTime.
             */
            public Builder approveTime(String approveTime) {
                this.approveTime = approveTime;
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
             * ConfirmTime.
             */
            public Builder confirmTime(String confirmTime) {
                this.confirmTime = confirmTime;
                return this;
            }

            /**
             * DestroyTime.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * InviteTime.
             */
            public Builder inviteTime(String inviteTime) {
                this.inviteTime = inviteTime;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
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
             * WithPeer.
             */
            public Builder withPeer(Boolean withPeer) {
                this.withPeer = withPeer;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
