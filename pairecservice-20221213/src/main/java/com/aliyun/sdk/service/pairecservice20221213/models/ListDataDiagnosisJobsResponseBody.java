// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListDataDiagnosisJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataDiagnosisJobsResponseBody</p>
 */
public class ListDataDiagnosisJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisJobs")
    private java.util.List<DataDiagnosisJobs> dataDiagnosisJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDataDiagnosisJobsResponseBody(Builder builder) {
        this.dataDiagnosisJobs = builder.dataDiagnosisJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnosisJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnosisJobs
     */
    public java.util.List<DataDiagnosisJobs> getDataDiagnosisJobs() {
        return this.dataDiagnosisJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataDiagnosisJobs> dataDiagnosisJobs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDataDiagnosisJobsResponseBody model) {
            this.dataDiagnosisJobs = model.dataDiagnosisJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of data diagnostic tasks.</p>
         */
        public Builder dataDiagnosisJobs(java.util.List<DataDiagnosisJobs> dataDiagnosisJobs) {
            this.dataDiagnosisJobs = dataDiagnosisJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataDiagnosisJobsResponseBody build() {
            return new ListDataDiagnosisJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataDiagnosisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosisJobsResponseBody</p>
     */
    public static class DataDiagnosisJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("DataDiagnosisConfigId")
        private String dataDiagnosisConfigId;

        @com.aliyun.core.annotation.NameInMap("DataDiagnosisConfigName")
        private String dataDiagnosisConfigName;

        @com.aliyun.core.annotation.NameInMap("DataDiagnosisJobId")
        private String dataDiagnosisJobId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("JobSource")
        private String jobSource;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<String> logs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataDiagnosisJobs(Builder builder) {
            this.bizDate = builder.bizDate;
            this.config = builder.config;
            this.dataDiagnosisConfigId = builder.dataDiagnosisConfigId;
            this.dataDiagnosisConfigName = builder.dataDiagnosisConfigName;
            this.dataDiagnosisJobId = builder.dataDiagnosisJobId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.jobSource = builder.jobSource;
            this.logs = builder.logs;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiagnosisJobs create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return dataDiagnosisConfigId
         */
        public String getDataDiagnosisConfigId() {
            return this.dataDiagnosisConfigId;
        }

        /**
         * @return dataDiagnosisConfigName
         */
        public String getDataDiagnosisConfigName() {
            return this.dataDiagnosisConfigName;
        }

        /**
         * @return dataDiagnosisJobId
         */
        public String getDataDiagnosisJobId() {
            return this.dataDiagnosisJobId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return jobSource
         */
        public String getJobSource() {
            return this.jobSource;
        }

        /**
         * @return logs
         */
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizDate; 
            private String config; 
            private String dataDiagnosisConfigId; 
            private String dataDiagnosisConfigName; 
            private String dataDiagnosisJobId; 
            private String gmtCreateTime; 
            private String gmtStartTime; 
            private String jobSource; 
            private java.util.List<String> logs; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataDiagnosisJobs model) {
                this.bizDate = model.bizDate;
                this.config = model.config;
                this.dataDiagnosisConfigId = model.dataDiagnosisConfigId;
                this.dataDiagnosisConfigName = model.dataDiagnosisConfigName;
                this.dataDiagnosisJobId = model.dataDiagnosisJobId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtStartTime = model.gmtStartTime;
                this.jobSource = model.jobSource;
                this.logs = model.logs;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The business date. The format is YYYY-MM-DD.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-28</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The task configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The ID of the data diagnostic configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dataDiagnosisConfigId(String dataDiagnosisConfigId) {
                this.dataDiagnosisConfigId = dataDiagnosisConfigId;
                return this;
            }

            /**
             * <p>The name of the data diagnostic configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>Abnormal behavior analysis-xxx</p>
             */
            public Builder dataDiagnosisConfigName(String dataDiagnosisConfigName) {
                this.dataDiagnosisConfigName = dataDiagnosisConfigName;
                return this;
            }

            /**
             * <p>The ID of the data diagnostic task.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dataDiagnosisJobId(String dataDiagnosisJobId) {
                this.dataDiagnosisJobId = dataDiagnosisJobId;
                return this;
            }

            /**
             * <p>The creation time. The format is ISO 8601 and includes the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The execution time. The format is ISO 8601 and includes the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>The task source. Valid values:</p>
             * <ul>
             * <li><p>Rerun: Manual rerun.</p>
             * </li>
             * <li><p>Cycle: Periodic generation.</p>
             * </li>
             * <li><p>ByInitializing: Initialization generation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cycle</p>
             */
            public Builder jobSource(String jobSource) {
                this.jobSource = jobSource;
                return this;
            }

            /**
             * <p>The list of log information.</p>
             */
            public Builder logs(java.util.List<String> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Initializing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The data diagnostic type.</p>
             * 
             * <strong>example:</strong>
             * <p>ChangeRate</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataDiagnosisJobs build() {
                return new DataDiagnosisJobs(this);
            } 

        } 

    }
}
