// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckJobsResponseBody</p>
 */
public class DescribeCheckJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckJobs")
    private java.util.List < CheckJobs> checkJobs;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Long pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeCheckJobsResponseBody(Builder builder) {
        this.checkJobs = builder.checkJobs;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkJobs
     */
    public java.util.List < CheckJobs> getCheckJobs() {
        return this.checkJobs;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Long getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < CheckJobs> checkJobs; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private Boolean success; 
        private Long totalRecordCount; 

        /**
         * CheckJobs.
         */
        public Builder checkJobs(java.util.List < CheckJobs> checkJobs) {
            this.checkJobs = checkJobs;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCheckJobsResponseBody build() {
            return new DescribeCheckJobsResponseBody(this);
        } 

    } 

    public static class CheckJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CheckPoint")
        private Long checkPoint;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("DiffCount")
        private Long diffCount;

        @com.aliyun.core.annotation.NameInMap("DiffSum")
        private Long diffSum;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Long finishCount;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobStepId")
        private String jobStepId;

        @com.aliyun.core.annotation.NameInMap("ParentJobType")
        private String parentJobType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private CheckJobs(Builder builder) {
            this.chargeType = builder.chargeType;
            this.checkPoint = builder.checkPoint;
            this.checkType = builder.checkType;
            this.diffCount = builder.diffCount;
            this.diffSum = builder.diffSum;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobId = builder.dtsJobId;
            this.finishCount = builder.finishCount;
            this.groupId = builder.groupId;
            this.instanceClass = builder.instanceClass;
            this.jobName = builder.jobName;
            this.jobStepId = builder.jobStepId;
            this.parentJobType = builder.parentJobType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckJobs create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return checkPoint
         */
        public Long getCheckPoint() {
            return this.checkPoint;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return diffCount
         */
        public Long getDiffCount() {
            return this.diffCount;
        }

        /**
         * @return diffSum
         */
        public Long getDiffSum() {
            return this.diffSum;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return finishCount
         */
        public Long getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobStepId
         */
        public String getJobStepId() {
            return this.jobStepId;
        }

        /**
         * @return parentJobType
         */
        public String getParentJobType() {
            return this.parentJobType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String chargeType; 
            private Long checkPoint; 
            private Integer checkType; 
            private Long diffCount; 
            private Long diffSum; 
            private String dtsInstanceID; 
            private String dtsJobId; 
            private Long finishCount; 
            private String groupId; 
            private String instanceClass; 
            private String jobName; 
            private String jobStepId; 
            private String parentJobType; 
            private String regionId; 
            private Integer status; 
            private Long totalCount; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CheckPoint.
             */
            public Builder checkPoint(Long checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * DiffCount.
             */
            public Builder diffCount(Long diffCount) {
                this.diffCount = diffCount;
                return this;
            }

            /**
             * DiffSum.
             */
            public Builder diffSum(Long diffSum) {
                this.diffSum = diffSum;
                return this;
            }

            /**
             * DtsInstanceID.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * DtsJobId.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * FinishCount.
             */
            public Builder finishCount(Long finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
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
             * JobStepId.
             */
            public Builder jobStepId(String jobStepId) {
                this.jobStepId = jobStepId;
                return this;
            }

            /**
             * ParentJobType.
             */
            public Builder parentJobType(String parentJobType) {
                this.parentJobType = parentJobType;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CheckJobs build() {
                return new CheckJobs(this);
            } 

        } 

    }
}
