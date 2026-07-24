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
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        /**
         * Success.
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

        @com.aliyun.core.annotation.NameInMap("HistoryInfos")
        private String historyInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobConfig")
        private String jobConfig;

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
            this.historyInfos = builder.historyInfos;
            this.instanceId = builder.instanceId;
            this.jobConfig = builder.jobConfig;
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
         * @return historyInfos
         */
        public String getHistoryInfos() {
            return this.historyInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobConfig
         */
        public String getJobConfig() {
            return this.jobConfig;
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
            private String historyInfos; 
            private String instanceId; 
            private String jobConfig; 
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
                this.historyInfos = model.historyInfos;
                this.instanceId = model.instanceId;
                this.jobConfig = model.jobConfig;
                this.jobName = model.jobName;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.upgradeMode = model.upgradeMode;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CuLimit.
             */
            public Builder cuLimit(Double cuLimit) {
                this.cuLimit = cuLimit;
                return this;
            }

            /**
             * CuReserved.
             */
            public Builder cuReserved(Double cuReserved) {
                this.cuReserved = cuReserved;
                return this;
            }

            /**
             * CuUsed.
             */
            public Builder cuUsed(Double cuUsed) {
                this.cuUsed = cuUsed;
                return this;
            }

            /**
             * DebugMode.
             */
            public Builder debugMode(Integer debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * DeployedSql.
             */
            public Builder deployedSql(String deployedSql) {
                this.deployedSql = deployedSql;
                return this;
            }

            /**
             * DraftSql.
             */
            public Builder draftSql(String draftSql) {
                this.draftSql = draftSql;
                return this;
            }

            /**
             * HistoryInfos.
             */
            public Builder historyInfos(String historyInfos) {
                this.historyInfos = historyInfos;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobConfig.
             */
            public Builder jobConfig(String jobConfig) {
                this.jobConfig = jobConfig;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpgradeMode.
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
