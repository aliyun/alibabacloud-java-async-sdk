// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRdUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRdUsersResponseBody</p>
 */
public class ListRdUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRdUsersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRdUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRdUsersResponseBody build() {
            return new ListRdUsersResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelegatedOrNot")
        private Boolean delegatedOrNot;

        @com.aliyun.core.annotation.NameInMap("Joined")
        private Boolean joined;

        @com.aliyun.core.annotation.NameInMap("JoinedTime")
        private String joinedTime;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.delegatedOrNot = builder.delegatedOrNot;
            this.joined = builder.joined;
            this.joinedTime = builder.joinedTime;
            this.mainUserId = builder.mainUserId;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return delegatedOrNot
         */
        public Boolean getDelegatedOrNot() {
            return this.delegatedOrNot;
        }

        /**
         * @return joined
         */
        public Boolean getJoined() {
            return this.joined;
        }

        /**
         * @return joinedTime
         */
        public String getJoinedTime() {
            return this.joinedTime;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private Boolean delegatedOrNot; 
            private Boolean joined; 
            private String joinedTime; 
            private Long mainUserId; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * Indicates whether the account can be used to view the logs and alerts within the account.
             */
            public Builder delegatedOrNot(Boolean delegatedOrNot) {
                this.delegatedOrNot = delegatedOrNot;
                return this;
            }

            /**
             * Indicates whether the account is added to the threat analysis feature for centralized management. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder joined(Boolean joined) {
                this.joined = joined;
                return this;
            }

            /**
             * The time when the account was added to the threat analysis feature.
             */
            public Builder joinedTime(String joinedTime) {
                this.joinedTime = joinedTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to perform operations supported by the threat analysis feature.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
