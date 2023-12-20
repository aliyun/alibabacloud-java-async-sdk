// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRdUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRdUsersResponseBody</p>
 */
public class ListRdUsersResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DelegatedOrNot")
        private Boolean delegatedOrNot;

        @NameInMap("Joined")
        private Boolean joined;

        @NameInMap("JoinedTime")
        private String joinedTime;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
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
             * DelegatedOrNot.
             */
            public Builder delegatedOrNot(Boolean delegatedOrNot) {
                this.delegatedOrNot = delegatedOrNot;
                return this;
            }

            /**
             * Joined.
             */
            public Builder joined(Boolean joined) {
                this.joined = joined;
                return this;
            }

            /**
             * JoinedTime.
             */
            public Builder joinedTime(String joinedTime) {
                this.joinedTime = joinedTime;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
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