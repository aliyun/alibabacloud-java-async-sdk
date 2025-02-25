// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricChannelMembersResponseBody</p>
 */
public class DescribeFabricChannelMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricChannelMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChannelMembersResponseBody create() {
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

        public DescribeFabricChannelMembersResponseBody build() {
            return new DescribeFabricChannelMembersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptTime")
        private String acceptTime;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("InviteTime")
        private String inviteTime;

        @com.aliyun.core.annotation.NameInMap("OrganizationDescription")
        private String organizationDescription;

        @com.aliyun.core.annotation.NameInMap("OrganizationDomain")
        private String organizationDomain;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("OrganizationName")
        private String organizationName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("WithPeer")
        private Boolean withPeer;

        private Result(Builder builder) {
            this.acceptTime = builder.acceptTime;
            this.channelId = builder.channelId;
            this.inviteTime = builder.inviteTime;
            this.organizationDescription = builder.organizationDescription;
            this.organizationDomain = builder.organizationDomain;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
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
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return inviteTime
         */
        public String getInviteTime() {
            return this.inviteTime;
        }

        /**
         * @return organizationDescription
         */
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        /**
         * @return organizationDomain
         */
        public String getOrganizationDomain() {
            return this.organizationDomain;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
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
            private String channelId; 
            private String inviteTime; 
            private String organizationDescription; 
            private String organizationDomain; 
            private String organizationId; 
            private String organizationName; 
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
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
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
             * OrganizationDescription.
             */
            public Builder organizationDescription(String organizationDescription) {
                this.organizationDescription = organizationDescription;
                return this;
            }

            /**
             * OrganizationDomain.
             */
            public Builder organizationDomain(String organizationDomain) {
                this.organizationDomain = organizationDomain;
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
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
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
