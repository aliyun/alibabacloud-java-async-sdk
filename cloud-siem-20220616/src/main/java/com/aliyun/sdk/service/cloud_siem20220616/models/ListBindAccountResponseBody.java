// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindAccountResponseBody</p>
 */
public class ListBindAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListBindAccountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindAccountResponseBody create() {
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

        public ListBindAccountResponseBody build() {
            return new ListBindAccountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("BindId")
        private Long bindId;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("DataSourceCount")
        private Long dataSourceCount;

        @NameInMap("ModifyTime")
        private String modifyTime;

        private Data(Builder builder) {
            this.accessId = builder.accessId;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.bindId = builder.bindId;
            this.cloudCode = builder.cloudCode;
            this.createUser = builder.createUser;
            this.dataSourceCount = builder.dataSourceCount;
            this.modifyTime = builder.modifyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return bindId
         */
        public Long getBindId() {
            return this.bindId;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSourceCount
         */
        public Long getDataSourceCount() {
            return this.dataSourceCount;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        public static final class Builder {
            private String accessId; 
            private String accountId; 
            private String accountName; 
            private Long bindId; 
            private String cloudCode; 
            private String createUser; 
            private Long dataSourceCount; 
            private String modifyTime; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * BindId.
             */
            public Builder bindId(Long bindId) {
                this.bindId = bindId;
                return this;
            }

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DataSourceCount.
             */
            public Builder dataSourceCount(Long dataSourceCount) {
                this.dataSourceCount = dataSourceCount;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
