// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployOrderDetailResponseBody</p>
 */
public class DescribeDeployOrderDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDeployOrderDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeployOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDeployOrderDetailResponseBody build() {
            return new DescribeDeployOrderDetailResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppInstanceType")
        private String appInstanceType;

        @NameInMap("CurrentPartitionNum")
        private Integer currentPartitionNum;

        @NameInMap("DeployOrderId")
        private Long deployOrderId;

        @NameInMap("DeployPauseType")
        private String deployPauseType;

        @NameInMap("DeployPauseTypeName")
        private String deployPauseTypeName;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DeployTypeName")
        private String deployTypeName;

        @NameInMap("Description")
        private String description;

        @NameInMap("ElapsedTime")
        private Integer elapsedTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EnvId")
        private Long envId;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("FailureRate")
        private String failureRate;

        @NameInMap("FinishAppInstanceCt")
        private Integer finishAppInstanceCt;

        @NameInMap("Name")
        private String name;

        @NameInMap("PartitionType")
        private String partitionType;

        @NameInMap("PartitionTypeName")
        private String partitionTypeName;

        @NameInMap("Result")
        private Integer result;

        @NameInMap("ResultName")
        private String resultName;

        @NameInMap("SchemaId")
        private Long schemaId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("TotalAppInstanceCt")
        private Integer totalAppInstanceCt;

        @NameInMap("TotalPartitions")
        private Integer totalPartitions;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNick")
        private String userNick;

        private Result(Builder builder) {
            this.appInstanceType = builder.appInstanceType;
            this.currentPartitionNum = builder.currentPartitionNum;
            this.deployOrderId = builder.deployOrderId;
            this.deployPauseType = builder.deployPauseType;
            this.deployPauseTypeName = builder.deployPauseTypeName;
            this.deployType = builder.deployType;
            this.deployTypeName = builder.deployTypeName;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.endTime = builder.endTime;
            this.envId = builder.envId;
            this.envType = builder.envType;
            this.failureRate = builder.failureRate;
            this.finishAppInstanceCt = builder.finishAppInstanceCt;
            this.name = builder.name;
            this.partitionType = builder.partitionType;
            this.partitionTypeName = builder.partitionTypeName;
            this.result = builder.result;
            this.resultName = builder.resultName;
            this.schemaId = builder.schemaId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.totalAppInstanceCt = builder.totalAppInstanceCt;
            this.totalPartitions = builder.totalPartitions;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appInstanceType
         */
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        /**
         * @return currentPartitionNum
         */
        public Integer getCurrentPartitionNum() {
            return this.currentPartitionNum;
        }

        /**
         * @return deployOrderId
         */
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        /**
         * @return deployPauseType
         */
        public String getDeployPauseType() {
            return this.deployPauseType;
        }

        /**
         * @return deployPauseTypeName
         */
        public String getDeployPauseTypeName() {
            return this.deployPauseTypeName;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return deployTypeName
         */
        public String getDeployTypeName() {
            return this.deployTypeName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elapsedTime
         */
        public Integer getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return failureRate
         */
        public String getFailureRate() {
            return this.failureRate;
        }

        /**
         * @return finishAppInstanceCt
         */
        public Integer getFinishAppInstanceCt() {
            return this.finishAppInstanceCt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return partitionTypeName
         */
        public String getPartitionTypeName() {
            return this.partitionTypeName;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return resultName
         */
        public String getResultName() {
            return this.resultName;
        }

        /**
         * @return schemaId
         */
        public Long getSchemaId() {
            return this.schemaId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return totalAppInstanceCt
         */
        public Integer getTotalAppInstanceCt() {
            return this.totalAppInstanceCt;
        }

        /**
         * @return totalPartitions
         */
        public Integer getTotalPartitions() {
            return this.totalPartitions;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String appInstanceType; 
            private Integer currentPartitionNum; 
            private Long deployOrderId; 
            private String deployPauseType; 
            private String deployPauseTypeName; 
            private String deployType; 
            private String deployTypeName; 
            private String description; 
            private Integer elapsedTime; 
            private String endTime; 
            private Long envId; 
            private String envType; 
            private String failureRate; 
            private Integer finishAppInstanceCt; 
            private String name; 
            private String partitionType; 
            private String partitionTypeName; 
            private Integer result; 
            private String resultName; 
            private Long schemaId; 
            private String startTime; 
            private Integer status; 
            private String statusName; 
            private Integer totalAppInstanceCt; 
            private Integer totalPartitions; 
            private String userId; 
            private String userNick; 

            /**
             * AppInstanceType.
             */
            public Builder appInstanceType(String appInstanceType) {
                this.appInstanceType = appInstanceType;
                return this;
            }

            /**
             * CurrentPartitionNum.
             */
            public Builder currentPartitionNum(Integer currentPartitionNum) {
                this.currentPartitionNum = currentPartitionNum;
                return this;
            }

            /**
             * DeployOrderId.
             */
            public Builder deployOrderId(Long deployOrderId) {
                this.deployOrderId = deployOrderId;
                return this;
            }

            /**
             * DeployPauseType.
             */
            public Builder deployPauseType(String deployPauseType) {
                this.deployPauseType = deployPauseType;
                return this;
            }

            /**
             * DeployPauseTypeName.
             */
            public Builder deployPauseTypeName(String deployPauseTypeName) {
                this.deployPauseTypeName = deployPauseTypeName;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DeployTypeName.
             */
            public Builder deployTypeName(String deployTypeName) {
                this.deployTypeName = deployTypeName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ElapsedTime.
             */
            public Builder elapsedTime(Integer elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * FailureRate.
             */
            public Builder failureRate(String failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * FinishAppInstanceCt.
             */
            public Builder finishAppInstanceCt(Integer finishAppInstanceCt) {
                this.finishAppInstanceCt = finishAppInstanceCt;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * PartitionTypeName.
             */
            public Builder partitionTypeName(String partitionTypeName) {
                this.partitionTypeName = partitionTypeName;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * ResultName.
             */
            public Builder resultName(String resultName) {
                this.resultName = resultName;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(Long schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * TotalAppInstanceCt.
             */
            public Builder totalAppInstanceCt(Integer totalAppInstanceCt) {
                this.totalAppInstanceCt = totalAppInstanceCt;
                return this;
            }

            /**
             * TotalPartitions.
             */
            public Builder totalPartitions(Integer totalPartitions) {
                this.totalPartitions = totalPartitions;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
