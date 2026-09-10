// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaDataComponentPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaDataComponentPageResponseBody</p>
 */
public class ListMetaDataComponentPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMetaDataComponentPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaDataComponentPageResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaDataComponentPageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data list returned by the operation. For the structure of each element, see the child parameters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size, which is the number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed. Check errCode and errMessage for details.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions. This parameter is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaDataComponentPageResponseBody build() {
            return new ListMetaDataComponentPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaDataComponentPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaDataComponentPageResponseBody</p>
     */
    public static class ProfilingJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentId")
        private Long componentId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("jobDesc")
        private String jobDesc;

        @com.aliyun.core.annotation.NameInMap("jobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("lastBatchId")
        private String lastBatchId;

        @com.aliyun.core.annotation.NameInMap("profilingEnable")
        private Integer profilingEnable;

        @com.aliyun.core.annotation.NameInMap("profilingPermission")
        private Integer profilingPermission;

        @com.aliyun.core.annotation.NameInMap("profilingRule")
        private String profilingRule;

        @com.aliyun.core.annotation.NameInMap("profilingType")
        private Integer profilingType;

        @com.aliyun.core.annotation.NameInMap("schedulerToken")
        private String schedulerToken;

        private ProfilingJob(Builder builder) {
            this.componentId = builder.componentId;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.jobDesc = builder.jobDesc;
            this.jobName = builder.jobName;
            this.lastBatchId = builder.lastBatchId;
            this.profilingEnable = builder.profilingEnable;
            this.profilingPermission = builder.profilingPermission;
            this.profilingRule = builder.profilingRule;
            this.profilingType = builder.profilingType;
            this.schedulerToken = builder.schedulerToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfilingJob create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public Long getComponentId() {
            return this.componentId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobDesc
         */
        public String getJobDesc() {
            return this.jobDesc;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return lastBatchId
         */
        public String getLastBatchId() {
            return this.lastBatchId;
        }

        /**
         * @return profilingEnable
         */
        public Integer getProfilingEnable() {
            return this.profilingEnable;
        }

        /**
         * @return profilingPermission
         */
        public Integer getProfilingPermission() {
            return this.profilingPermission;
        }

        /**
         * @return profilingRule
         */
        public String getProfilingRule() {
            return this.profilingRule;
        }

        /**
         * @return profilingType
         */
        public Integer getProfilingType() {
            return this.profilingType;
        }

        /**
         * @return schedulerToken
         */
        public String getSchedulerToken() {
            return this.schedulerToken;
        }

        public static final class Builder {
            private Long componentId; 
            private String createTime; 
            private Long id; 
            private String jobDesc; 
            private String jobName; 
            private String lastBatchId; 
            private Integer profilingEnable; 
            private Integer profilingPermission; 
            private String profilingRule; 
            private Integer profilingType; 
            private String schedulerToken; 

            private Builder() {
            } 

            private Builder(ProfilingJob model) {
                this.componentId = model.componentId;
                this.createTime = model.createTime;
                this.id = model.id;
                this.jobDesc = model.jobDesc;
                this.jobName = model.jobName;
                this.lastBatchId = model.lastBatchId;
                this.profilingEnable = model.profilingEnable;
                this.profilingPermission = model.profilingPermission;
                this.profilingRule = model.profilingRule;
                this.profilingType = model.profilingType;
                this.schedulerToken = model.schedulerToken;
            } 

            /**
             * <p>The component ID, which is the primary key of the data source component.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder componentId(Long componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The creation time of the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The primary key ID that uniquely identifies a record.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the profiling task.</p>
             * 
             * <strong>example:</strong>
             * <p>Profiling task description</p>
             */
            public Builder jobDesc(String jobDesc) {
                this.jobDesc = jobDesc;
                return this;
            }

            /**
             * <p>The name of the profiling task.</p>
             * 
             * <strong>example:</strong>
             * <p>job_name</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The ID of the most recent profiling task batch.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder lastBatchId(String lastBatchId) {
                this.lastBatchId = lastBatchId;
                return this;
            }

            /**
             * <p>The profiling task status. Valid values:</p>
             * <ul>
             * <li>0: Not started.</li>
             * <li>1: Running.</li>
             * <li>2: Stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder profilingEnable(Integer profilingEnable) {
                this.profilingEnable = profilingEnable;
                return this;
            }

            /**
             * <p>The profiling permission. Valid values:</p>
             * <ul>
             * <li>0: read-only link</li>
             * <li>1: client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder profilingPermission(Integer profilingPermission) {
                this.profilingPermission = profilingPermission;
                return this;
            }

            /**
             * <p>The cron expression for scheduled profiling. This parameter takes effect only when profilingType is set to CRON.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder profilingRule(String profilingRule) {
                this.profilingRule = profilingRule;
                return this;
            }

            /**
             * <p>The profiling policy (scheduling type). Valid values:</p>
             * <ul>
             * <li>0: daily</li>
             * <li>1: CRON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder profilingType(Integer profilingType) {
                this.profilingType = profilingType;
                return this;
            }

            /**
             * <p>The scheduling ID, which uniquely identifies the profiling task on the scheduling side.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder schedulerToken(String schedulerToken) {
                this.schedulerToken = schedulerToken;
                return this;
            }

            public ProfilingJob build() {
                return new ProfilingJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMetaDataComponentPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaDataComponentPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentType")
        private Long componentType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dsConfig")
        private String dsConfig;

        @com.aliyun.core.annotation.NameInMap("dsDesc")
        private String dsDesc;

        @com.aliyun.core.annotation.NameInMap("dsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("dsName")
        private String dsName;

        @com.aliyun.core.annotation.NameInMap("dsStatus")
        private Integer dsStatus;

        @com.aliyun.core.annotation.NameInMap("dsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("dsVersion")
        private String dsVersion;

        @com.aliyun.core.annotation.NameInMap("expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("profilingJob")
        private ProfilingJob profilingJob;

        private Data(Builder builder) {
            this.componentType = builder.componentType;
            this.createTime = builder.createTime;
            this.dsConfig = builder.dsConfig;
            this.dsDesc = builder.dsDesc;
            this.dsId = builder.dsId;
            this.dsName = builder.dsName;
            this.dsStatus = builder.dsStatus;
            this.dsType = builder.dsType;
            this.dsVersion = builder.dsVersion;
            this.expired = builder.expired;
            this.id = builder.id;
            this.profilingJob = builder.profilingJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public Long getComponentType() {
            return this.componentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dsConfig
         */
        public String getDsConfig() {
            return this.dsConfig;
        }

        /**
         * @return dsDesc
         */
        public String getDsDesc() {
            return this.dsDesc;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return dsName
         */
        public String getDsName() {
            return this.dsName;
        }

        /**
         * @return dsStatus
         */
        public Integer getDsStatus() {
            return this.dsStatus;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return dsVersion
         */
        public String getDsVersion() {
            return this.dsVersion;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return profilingJob
         */
        public ProfilingJob getProfilingJob() {
            return this.profilingJob;
        }

        public static final class Builder {
            private Long componentType; 
            private String createTime; 
            private String dsConfig; 
            private String dsDesc; 
            private String dsId; 
            private String dsName; 
            private Integer dsStatus; 
            private String dsType; 
            private String dsVersion; 
            private Boolean expired; 
            private Long id; 
            private ProfilingJob profilingJob; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.componentType = model.componentType;
                this.createTime = model.createTime;
                this.dsConfig = model.dsConfig;
                this.dsDesc = model.dsDesc;
                this.dsId = model.dsId;
                this.dsName = model.dsName;
                this.dsStatus = model.dsStatus;
                this.dsType = model.dsType;
                this.dsVersion = model.dsVersion;
                this.expired = model.expired;
                this.id = model.id;
                this.profilingJob = model.profilingJob;
            } 

            /**
             * <p>The entry component type. In some operations, this parameter is used as a backward compatible field for version 1.1.0. Valid values:</p>
             * <ul>
             * <li>0: source</li>
             * <li>1: destination</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder componentType(Long componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The creation time of the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The datasource config in JSON string format. The structure is defined by each dsType. Parse the JSON string before use. Sensitive fields such as tokens are masked in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
             */
            public Builder dsConfig(String dsConfig) {
                this.dsConfig = dsConfig;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>Data source description</p>
             */
            public Builder dsDesc(String dsDesc) {
                this.dsDesc = dsDesc;
                return this;
            }

            /**
             * <p>The business ID of the data source (external ID, which may be the same as the primary key ID).</p>
             * 
             * <strong>example:</strong>
             * <p>290</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>The data source name. Exact match and fuzzy match are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>test_ds318_hangzhou_0428</p>
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * <p>The connectivity status of the data source. Valid values:</p>
             * <ul>
             * <li>0: Not tested.</li>
             * <li>1: Connected.</li>
             * <li>2: Connection failed.</li>
             * <li>-1: Connectivity test not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dsStatus(Integer dsStatus) {
                this.dsStatus = dsStatus;
                return this;
            }

            /**
             * <p>The data source type, such as Hive or MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>The version number of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.0</p>
             */
            public Builder dsVersion(String dsVersion) {
                this.dsVersion = dsVersion;
                return this;
            }

            /**
             * <p>Indicates whether the data source has expired. Valid values:</p>
             * <ul>
             * <li>true: Expired.</li>
             * <li>false: Not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The primary key ID that uniquely identifies a record.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The profiling task information, including the task status, scheduling ID, profiling rule, and profiling type. This field is empty if the data source is not associated with a profiling task.</p>
             */
            public Builder profilingJob(ProfilingJob profilingJob) {
                this.profilingJob = profilingJob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
