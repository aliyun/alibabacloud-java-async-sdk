// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindDataSourcesResponseBody</p>
 */
public class ListBindDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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

        public ListBindDataSourcesResponseBody build() {
            return new ListBindDataSourcesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        @NameInMap("DataSourceName")
        private String dataSourceName;

        @NameInMap("DataSourceRemark")
        private String dataSourceRemark;

        @NameInMap("DataSourceType")
        private String dataSourceType;

        @NameInMap("LogCount")
        private Integer logCount;

        @NameInMap("TaskCount")
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
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * DataSourceInstanceId.
             */
            public Builder dataSourceInstanceId(String dataSourceInstanceId) {
                this.dataSourceInstanceId = dataSourceInstanceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DataSourceRemark.
             */
            public Builder dataSourceRemark(String dataSourceRemark) {
                this.dataSourceRemark = dataSourceRemark;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * LogCount.
             */
            public Builder logCount(Integer logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * TaskCount.
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