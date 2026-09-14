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
 * {@link ListBindDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindDataSourcesResponseBody</p>
 */
public class ListBindDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBindDataSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindDataSourcesResponseBody create() {
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

        private Builder(ListBindDataSourcesResponseBody model) {
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

        public ListBindDataSourcesResponseBody build() {
            return new ListBindDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBindDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindDataSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceRemark")
        private String dataSourceRemark;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("LogCount")
        private Integer logCount;

        @com.aliyun.core.annotation.NameInMap("TaskCount")
        private Integer taskCount;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.cloudCode = builder.cloudCode;
            this.dataSourceInstanceId = builder.dataSourceInstanceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceRemark = builder.dataSourceRemark;
            this.dataSourceType = builder.dataSourceType;
            this.logCount = builder.logCount;
            this.taskCount = builder.taskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return dataSourceInstanceId
         */
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceRemark
         */
        public String getDataSourceRemark() {
            return this.dataSourceRemark;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return logCount
         */
        public Integer getLogCount() {
            return this.logCount;
        }

        /**
         * @return taskCount
         */
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String cloudCode; 
            private String dataSourceInstanceId; 
            private String dataSourceName; 
            private String dataSourceRemark; 
            private String dataSourceType; 
            private Integer logCount; 
            private Integer taskCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.cloudCode = model.cloudCode;
                this.dataSourceInstanceId = model.dataSourceInstanceId;
                this.dataSourceName = model.dataSourceName;
                this.dataSourceRemark = model.dataSourceRemark;
                this.dataSourceType = model.dataSourceType;
                this.logCount = model.logCount;
                this.taskCount = model.taskCount;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the multicloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_tq_account_xxxx</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The code of the multicloud environment. Valid values:</p>
             * <ul>
             * <li><p>qcloud: Tencent Cloud.</p>
             * </li>
             * <li><p>aliyun: Alibaba Cloud.</p>
             * </li>
             * <li><p>hcloud: Huawei Cloud.</p>
             * </li>
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
             * <p>The ID of the data source. This ID is an MD5 hash value that is calculated by Threat Analysis based on specific parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
             */
            public Builder dataSourceInstanceId(String dataSourceInstanceId) {
                this.dataSourceInstanceId = dataSourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_kafka</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The remarks of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_kafka</p>
             */
            public Builder dataSourceRemark(String dataSourceRemark) {
                this.dataSourceRemark = dataSourceRemark;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><p>obs: Huawei Cloud OBS.</p>
             * </li>
             * <li><p>wafApi: Tencent Cloud WAF download API.</p>
             * </li>
             * <li><p>ckafka: Tencent Cloud CKafka.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>obs</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The number of logs added to the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder logCount(Integer logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * <p>The number of log collection tasks created for the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskCount(Integer taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
