// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link GetComputeJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeJobResponseBody</p>
 */
public class GetComputeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetComputeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetComputeJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>062D8E8B-8D47-5DCC-BB12-5A1D93C3A66B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetComputeJobResponseBody build() {
            return new GetComputeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CuLimit")
        private Double cuLimit;

        @com.aliyun.core.annotation.NameInMap("CuReserved")
        private Double cuReserved;

        @com.aliyun.core.annotation.NameInMap("CuUsed")
        private Double cuUsed;

        @com.aliyun.core.annotation.NameInMap("DebugMode")
        private Integer debugMode;

        @com.aliyun.core.annotation.NameInMap("DeployedSql")
        private String deployedSql;

        @com.aliyun.core.annotation.NameInMap("DraftSql")
        private String draftSql;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpgradeMode")
        private String upgradeMode;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.cuLimit = builder.cuLimit;
            this.cuReserved = builder.cuReserved;
            this.cuUsed = builder.cuUsed;
            this.debugMode = builder.debugMode;
            this.deployedSql = builder.deployedSql;
            this.draftSql = builder.draftSql;
            this.errorMsg = builder.errorMsg;
            this.expirationTime = builder.expirationTime;
            this.instanceId = builder.instanceId;
            this.jobName = builder.jobName;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.upgradeMode = builder.upgradeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cuLimit
         */
        public Double getCuLimit() {
            return this.cuLimit;
        }

        /**
         * @return cuReserved
         */
        public Double getCuReserved() {
            return this.cuReserved;
        }

        /**
         * @return cuUsed
         */
        public Double getCuUsed() {
            return this.cuUsed;
        }

        /**
         * @return debugMode
         */
        public Integer getDebugMode() {
            return this.debugMode;
        }

        /**
         * @return deployedSql
         */
        public String getDeployedSql() {
            return this.deployedSql;
        }

        /**
         * @return draftSql
         */
        public String getDraftSql() {
            return this.draftSql;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return upgradeMode
         */
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        public static final class Builder {
            private String createTime; 
            private Double cuLimit; 
            private Double cuReserved; 
            private Double cuUsed; 
            private Integer debugMode; 
            private String deployedSql; 
            private String draftSql; 
            private String errorMsg; 
            private String expirationTime; 
            private String instanceId; 
            private String jobName; 
            private String owner; 
            private String regionId; 
            private String remark; 
            private String status; 
            private String upgradeMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.cuLimit = model.cuLimit;
                this.cuReserved = model.cuReserved;
                this.cuUsed = model.cuUsed;
                this.debugMode = model.debugMode;
                this.deployedSql = model.deployedSql;
                this.draftSql = model.draftSql;
                this.errorMsg = model.errorMsg;
                this.expirationTime = model.expirationTime;
                this.instanceId = model.instanceId;
                this.jobName = model.jobName;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.upgradeMode = model.upgradeMode;
            } 

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-02T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The CU limit for the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder cuLimit(Double cuLimit) {
                this.cuLimit = cuLimit;
                return this;
            }

            /**
             * <p>The reserved CUs for the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder cuReserved(Double cuReserved) {
                this.cuReserved = cuReserved;
                return this;
            }

            /**
             * <p>The used CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder cuUsed(Double cuUsed) {
                this.cuUsed = cuUsed;
                return this;
            }

            /**
             * <p>Indicates whether the job is a debug job. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder debugMode(Integer debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * <p>The currently deployed SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
             */
            public Builder deployedSql(String deployedSql) {
                this.deployedSql = deployedSql;
                return this;
            }

            /**
             * <p>The Flink SQL draft.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
             */
            public Builder draftSql(String draftSql) {
                this.draftSql = draftSql;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL validation or compilation failed: Column \&quot;xxx\&quot; not found</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-11T04:33:03Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The compute instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_streaming-cn-hangzhou-a1b2c3d4</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the compute job.</p>
             * 
             * <strong>example:</strong>
             * <p>order_enrichment</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The owner of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remark for the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Real-time order stream cleansing</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The startup mode, such as savepoint or stateless.</p>
             * 
             * <strong>example:</strong>
             * <p>savepoint</p>
             */
            public Builder upgradeMode(String upgradeMode) {
                this.upgradeMode = upgradeMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
