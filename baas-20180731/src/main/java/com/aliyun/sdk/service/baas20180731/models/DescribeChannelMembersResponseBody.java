// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelMembersResponseBody</p>
 */
public class DescribeChannelMembersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeChannelMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelMembersResponseBody create() {
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

        public DescribeChannelMembersResponseBody build() {
            return new DescribeChannelMembersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AcceptTime")
        private String acceptTime;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("InviteTime")
        private String inviteTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("State")
        private String state;

        @NameInMap("WithPeer")
        private Boolean withPeer;

        private Result(Builder builder) {
            this.acceptTime = builder.acceptTime;
            this.channelId = builder.channelId;
            this.description = builder.description;
            this.domain = builder.domain;
            this.inviteTime = builder.inviteTime;
            this.name = builder.name;
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
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return inviteTime
         */
        public String getInviteTime() {
            return this.inviteTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String channelId; 
            private String description; 
            private String domain; 
            private String inviteTime; 
            private String name; 
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
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
