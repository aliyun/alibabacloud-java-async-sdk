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
 * {@link ListBindAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindAccountResponseBody</p>
 */
public class ListBindAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(ListBindAccountResponseBody model) {
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

        public ListBindAccountResponseBody build() {
            return new ListBindAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBindAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindAccountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("BindId")
        private Long bindId;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSourceCount")
        private Long dataSourceCount;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessId = model.accessId;
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.bindId = model.bindId;
                this.cloudCode = model.cloudCode;
                this.createUser = model.createUser;
                this.dataSourceCount = model.dataSourceCount;
                this.modifyTime = model.modifyTime;
            } 

            /**
             * <p>The AccessKey ID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>ABCXXXXXXXX</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>The ID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The username of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The ID that is generated when the cloud account is added.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder bindId(Long bindId) {
                this.bindId = bindId;
                return this;
            }

            /**
             * <p>The code of the cloud service provider. Valid values:</p>
             * <ul>
             * <li>qcloud: Tencent Cloud</li>
             * <li>aliyun: Alibaba Cloud</li>
             * <li>hcloud: Huawei Cloud</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The ID of the account that is used to add the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The number of data sources that are added to the threat analysis feature within the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dataSourceCount(Long dataSourceCount) {
                this.dataSourceCount = dataSourceCount;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-10 12:20:35</p>
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
