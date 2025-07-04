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
 * {@link ListDataSourceLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceLogsResponseBody</p>
 */
public class ListDataSourceLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourceLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataSourceLogsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
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

        public ListDataSourceLogsResponseBody build() {
            return new ListDataSourceLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceLogsResponseBody</p>
     */
    public static class LogParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParaCode")
        private String paraCode;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        private LogParams(Builder builder) {
            this.paraCode = builder.paraCode;
            this.paraValue = builder.paraValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogParams create() {
            return builder().build();
        }

        /**
         * @return paraCode
         */
        public String getParaCode() {
            return this.paraCode;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        public static final class Builder {
            private String paraCode; 
            private String paraValue; 

            private Builder() {
            } 

            private Builder(LogParams model) {
                this.paraCode = model.paraCode;
                this.paraValue = model.paraValue;
            } 

            /**
             * <p>The parameter code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>region_code</p>
             */
            public Builder paraCode(String paraCode) {
                this.paraCode = paraCode;
                return this;
            }

            /**
             * <p>The parameter value of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-guangzhou</p>
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            public LogParams build() {
                return new LogParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceLogsResponseBody</p>
     */
    public static class DataSourceInstanceLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("LogInstanceId")
        private String logInstanceId;

        @com.aliyun.core.annotation.NameInMap("LogMdsCode")
        private String logMdsCode;

        @com.aliyun.core.annotation.NameInMap("LogParams")
        private java.util.List<LogParams> logParams;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        private DataSourceInstanceLogs(Builder builder) {
            this.logCode = builder.logCode;
            this.logInstanceId = builder.logInstanceId;
            this.logMdsCode = builder.logMdsCode;
            this.logParams = builder.logParams;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInstanceLogs create() {
            return builder().build();
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logInstanceId
         */
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

        /**
         * @return logMdsCode
         */
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        /**
         * @return logParams
         */
        public java.util.List<LogParams> getLogParams() {
            return this.logParams;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String logCode; 
            private String logInstanceId; 
            private String logMdsCode; 
            private java.util.List<LogParams> logParams; 
            private Integer taskStatus; 

            private Builder() {
            } 

            private Builder(DataSourceInstanceLogs model) {
                this.logCode = model.logCode;
                this.logInstanceId = model.logInstanceId;
                this.logMdsCode = model.logMdsCode;
                this.logParams = model.logParams;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_waf_xxxxx</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>The ID of the log. The value is obtained after the threat analysis feature calculates the MD5 hash value of a parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
             */
            public Builder logInstanceId(String logInstanceId) {
                this.logInstanceId = logInstanceId;
                return this;
            }

            /**
             * <p>The display code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>${siem.prod.cloud_siem_waf_xxxxx}</p>
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * <p>The parameters of the log.</p>
             */
            public Builder logParams(java.util.List<LogParams> logParams) {
                this.logParams = logParams;
                return this;
            }

            /**
             * <p>Indicates whether the task for which logs are collected is enabled. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public DataSourceInstanceLogs build() {
                return new DataSourceInstanceLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceLogs")
        private java.util.List<DataSourceInstanceLogs> dataSourceInstanceLogs;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceName")
        private String dataSourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceRemark")
        private String dataSourceInstanceRemark;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.cloudCode = builder.cloudCode;
            this.dataSourceInstanceId = builder.dataSourceInstanceId;
            this.dataSourceInstanceLogs = builder.dataSourceInstanceLogs;
            this.dataSourceInstanceName = builder.dataSourceInstanceName;
            this.dataSourceInstanceRemark = builder.dataSourceInstanceRemark;
            this.subUserId = builder.subUserId;
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
         * @return dataSourceInstanceLogs
         */
        public java.util.List<DataSourceInstanceLogs> getDataSourceInstanceLogs() {
            return this.dataSourceInstanceLogs;
        }

        /**
         * @return dataSourceInstanceName
         */
        public String getDataSourceInstanceName() {
            return this.dataSourceInstanceName;
        }

        /**
         * @return dataSourceInstanceRemark
         */
        public String getDataSourceInstanceRemark() {
            return this.dataSourceInstanceRemark;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String accountId; 
            private String cloudCode; 
            private String dataSourceInstanceId; 
            private java.util.List<DataSourceInstanceLogs> dataSourceInstanceLogs; 
            private String dataSourceInstanceName; 
            private String dataSourceInstanceRemark; 
            private Long subUserId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.cloudCode = model.cloudCode;
                this.dataSourceInstanceId = model.dataSourceInstanceId;
                this.dataSourceInstanceLogs = model.dataSourceInstanceLogs;
                this.dataSourceInstanceName = model.dataSourceInstanceName;
                this.dataSourceInstanceRemark = model.dataSourceInstanceRemark;
                this.subUserId = model.subUserId;
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
             * <p>The code that is used for multi-cloud environments. Valid values:</p>
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
             * <p>The ID of the data source. The value is obtained after the threat analysis feature calculates the MD5 hash value of a parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
             */
            public Builder dataSourceInstanceId(String dataSourceInstanceId) {
                this.dataSourceInstanceId = dataSourceInstanceId;
                return this;
            }

            /**
             * <p>The logs of the data source.</p>
             */
            public Builder dataSourceInstanceLogs(java.util.List<DataSourceInstanceLogs> dataSourceInstanceLogs) {
                this.dataSourceInstanceLogs = dataSourceInstanceLogs;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf kafka</p>
             */
            public Builder dataSourceInstanceName(String dataSourceInstanceName) {
                this.dataSourceInstanceName = dataSourceInstanceName;
                return this;
            }

            /**
             * <p>The remarks of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf kafka</p>
             */
            public Builder dataSourceInstanceRemark(String dataSourceInstanceRemark) {
                this.dataSourceInstanceRemark = dataSourceInstanceRemark;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
