// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeCheckJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckJobsResponseBody</p>
 */
public class DescribeCheckJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckJobs")
    private java.util.List<CheckJobs> checkJobs;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkJobs
     */
    public java.util.List<CheckJobs> getCheckJobs() {
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
        private java.util.List<CheckJobs> checkJobs; 
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

        private Builder() {
        } 

        private Builder(DescribeCheckJobsResponseBody model) {
            this.checkJobs = model.checkJobs;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>Item information check.</p>
         */
        public Builder checkJobs(java.util.List<CheckJobs> checkJobs) {
            this.checkJobs = checkJobs;
            return this;
        }

        /**
         * <p>Dynamic error code, this parameter will be deprecated soon.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>Dynamic error message, used to replace the <strong>%s</strong> in the <strong>errmessage</strong> return parameter. If <strong>errmessage</strong> returns <strong>thevalueofinputparameter%sisnotvalid</strong>, and <strong>dynamicmessage</strong> returns <em>[1,2,3]</em>, it indicates that the request parameter <strong>dtsjobid</strong> is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>present environment is not support,so skip.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>Error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of records that can be displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FC1D920B-AB89-52A9-AA5F-AA724C4205E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCheckJobsResponseBody build() {
            return new DescribeCheckJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCheckJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckJobsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CheckJobs model) {
                this.chargeType = model.chargeType;
                this.checkPoint = model.checkPoint;
                this.checkType = model.checkType;
                this.diffCount = model.diffCount;
                this.diffSum = model.diffSum;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobId = model.dtsJobId;
                this.finishCount = model.finishCount;
                this.groupId = model.groupId;
                this.instanceClass = model.instanceClass;
                this.jobName = model.jobName;
                this.jobStepId = model.jobStepId;
                this.parentJobType = model.parentJobType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Billing type, return values: - <strong>POSTPAY</strong>: Pay-as-you-go (postpaid). - <strong>PREPAY</strong>: Subscription (prepaid).</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>checkpoint</p>
             * 
             * <strong>example:</strong>
             * <p>1111****</p>
             */
            public Builder checkPoint(Long checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * <p>Data validation method, with values:</p>
             * <ul>
             * <li><strong>1</strong>: Full validation. - <strong>2</strong>: Incremental validation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>Number of rows with data inconsistency</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diffCount(Long diffCount) {
                this.diffCount = diffCount;
                return this;
            }

            /**
             * <p>Synchronization initialization progress, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diffSum(Long diffSum) {
                this.diffSum = diffSum;
                return this;
            }

            /**
             * <p>Migration, synchronization, or subscription instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsz8tc99sy2158b36</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>Migration, synchronization, or subscription task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n08o6si4q338b1x</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The number of data rows in the table that have completed validation.</p>
             * 
             * <strong>example:</strong>
             * <p>15094</p>
             */
            public Builder finishCount(Long finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>DTS task ID. In most cases, there is no need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>c3d12dii27t632g</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Instance specification.</p>
             * 
             * <strong>example:</strong>
             * <p>SMALL</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>Check the name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>as0e1ks426bq3z0</p>
             */
            public Builder jobStepId(String jobStepId) {
                this.jobStepId = jobStepId;
                return this;
            }

            /**
             * <p>This parameter will be deprecated.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder parentJobType(String parentJobType) {
                this.parentJobType = parentJobType;
                return this;
            }

            /**
             * <p>Region ID to which it belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Check result, return values: -<strong>0</strong>: Check passed -<strong>1</strong>: Check failed</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Verify the total number of rows in the data.</p>
             * 
             * <strong>example:</strong>
             * <p>159</p>
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
