// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPodsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPodsResponseBody</p>
 */
public class ListPodsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListPodsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPodsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPodsResponseBody build() {
            return new ListPodsResponseBody(this);
        } 

    } 

    public static class DeploySteps extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("StepCode")
        private String stepCode;

        @NameInMap("StepName")
        private String stepName;

        private DeploySteps(Builder builder) {
            this.status = builder.status;
            this.stepCode = builder.stepCode;
            this.stepName = builder.stepName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploySteps create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepCode
         */
        public String getStepCode() {
            return this.stepCode;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        public static final class Builder {
            private String status; 
            private String stepCode; 
            private String stepName; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StepCode.
             */
            public Builder stepCode(String stepCode) {
                this.stepCode = stepCode;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            public DeploySteps build() {
                return new DeploySteps(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppInstanceId")
        private String appInstanceId;

        @NameInMap("DeployOrderId")
        private Long deployOrderId;

        @NameInMap("DeployPartitionNum")
        private Integer deployPartitionNum;

        @NameInMap("DeploySteps")
        private java.util.List < DeploySteps> deploySteps;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("PodIp")
        private String podIp;

        @NameInMap("Region")
        private String region;

        @NameInMap("Result")
        private Integer result;

        @NameInMap("ResultName")
        private String resultName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.appInstanceId = builder.appInstanceId;
            this.deployOrderId = builder.deployOrderId;
            this.deployPartitionNum = builder.deployPartitionNum;
            this.deploySteps = builder.deploySteps;
            this.groupName = builder.groupName;
            this.hostIp = builder.hostIp;
            this.hostName = builder.hostName;
            this.podIp = builder.podIp;
            this.region = builder.region;
            this.result = builder.result;
            this.resultName = builder.resultName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return deployOrderId
         */
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        /**
         * @return deployPartitionNum
         */
        public Integer getDeployPartitionNum() {
            return this.deployPartitionNum;
        }

        /**
         * @return deploySteps
         */
        public java.util.List < DeploySteps> getDeploySteps() {
            return this.deploySteps;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return podIp
         */
        public String getPodIp() {
            return this.podIp;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appInstanceId; 
            private Long deployOrderId; 
            private Integer deployPartitionNum; 
            private java.util.List < DeploySteps> deploySteps; 
            private String groupName; 
            private String hostIp; 
            private String hostName; 
            private String podIp; 
            private String region; 
            private Integer result; 
            private String resultName; 
            private String startTime; 
            private Integer status; 
            private String statusName; 
            private String updateTime; 

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
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
             * DeployPartitionNum.
             */
            public Builder deployPartitionNum(Integer deployPartitionNum) {
                this.deployPartitionNum = deployPartitionNum;
                return this;
            }

            /**
             * DeploySteps.
             */
            public Builder deploySteps(java.util.List < DeploySteps> deploySteps) {
                this.deploySteps = deploySteps;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HostIp.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * PodIp.
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
