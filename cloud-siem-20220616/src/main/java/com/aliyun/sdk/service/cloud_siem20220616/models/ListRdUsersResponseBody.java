// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListRdUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRdUsersResponseBody</p>
 */
public class ListRdUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRdUsersResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRdUsersResponseBody build() {
            return new ListRdUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRdUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRdUsersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.delegatedOrNot = model.delegatedOrNot;
                this.joined = model.joined;
                this.joinedTime = model.joinedTime;
                this.mainUserId = model.mainUserId;
                this.subUserId = model.subUserId;
                this.subUserName = model.subUserName;
            } 

            /**
             * <p>Indicates whether the account can be used to view the logs and alerts within the account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder delegatedOrNot(Boolean delegatedOrNot) {
                this.delegatedOrNot = delegatedOrNot;
                return this;
            }

            /**
             * <p>Indicates whether the account is added to the threat analysis feature for centralized management. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder joined(Boolean joined) {
                this.joined = joined;
                return this;
            }

            /**
             * <p>The time when the account was added to the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>2013-10-01 00:00:00</p>
             */
            public Builder joinedTime(String joinedTime) {
                this.joinedTime = joinedTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXXX</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to perform operations supported by the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
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
