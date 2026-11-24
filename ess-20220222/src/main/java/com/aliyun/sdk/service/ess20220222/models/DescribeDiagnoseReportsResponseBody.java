// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeDiagnoseReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseReportsResponseBody</p>
 */
public class DescribeDiagnoseReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnoseReportsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reports
     */
    public java.util.List<Reports> getReports() {
        return this.reports;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Reports> reports; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDiagnoseReportsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reports = model.reports;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of diagnostic reports.</p>
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECA123C6-107B-5F70-A177-740A7224C996</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of diagnostic reports.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnoseReportsResponseBody build() {
            return new DescribeDiagnoseReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnoseReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Details(Builder builder) {
            this.diagnoseType = builder.diagnoseType;
            this.errorCode = builder.errorCode;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String diagnoseType; 
            private String errorCode; 
            private String resourceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.diagnoseType = model.diagnoseType;
                this.errorCode = model.errorCode;
                this.resourceId = model.resourceId;
                this.status = model.status;
            } 

            /**
             * <p>The type of the diagnostic item. Valid values:</p>
             * <ul>
             * <li><p>AccountArrearage: account overdue payment. Checks whether the user account has overdue payments.</p>
             * </li>
             * <li><p>AccountNotEnoughBalance: insufficient account balance. Checks whether the balance of a user account on the China site is greater than or equal to CNY 100.</p>
             * </li>
             * <li><p>ElasticStrength: inventory health. Checks the inventory health of the instance type configured for the scaling group.</p>
             * </li>
             * <li><p>VSwitch: vSwitch status. Checks whether the vSwitch is active, such as whether it is deleted.</p>
             * </li>
             * <li><p>SecurityGroup: security group status. Checks whether the security group is active, such as whether it is deleted.</p>
             * </li>
             * <li><p>KeyPair: key pair status. Checks whether the key pair is active, such as whether it is deleted.</p>
             * </li>
             * <li><p>SlbBackendServerQuota: number of instances mounted to the SLB instance in the scaling group. Checks whether the number of ECS instances mounted to the default server group and virtual service groups of the SLB instance exceeds the quota.</p>
             * </li>
             * <li><p>AlbBackendServerQuota: number of instances mounted to the ALB instance in the scaling group. Checks whether the number of ECS instances mounted to the server groups of the ALB instance exceeds the quota.</p>
             * </li>
             * <li><p>NlbBackendServerQuota: number of instances mounted to the NLB instance in the scaling group. Checks whether the number of ECS instances mounted to the server groups of the NLB instance exceeds the quota.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountArrearage</p>
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * <p>The error code of the diagnostic item. Valid values:</p>
             * <ul>
             * <li><p>VSwitchIdNotFound: the vSwitch does not exist.</p>
             * </li>
             * <li><p>SecurityGroupNotFound: the security group does not exist.</p>
             * </li>
             * <li><p>KeyPairNotFound: the key pair does not exist.</p>
             * </li>
             * <li><p>SlbBackendServerQuotaExceeded: the number of ECS instances mounted to the default server group and virtual service groups of the SLB instance exceeds the quota.</p>
             * </li>
             * <li><p>AlbBackendServerQuotaExceeded: the number of ECS instances mounted to the server groups of the ALB instance exceeds the quota.</p>
             * </li>
             * <li><p>NlbBackendServerQuotaExceeded: the number of ECS instances mounted to the server groups of the NLB instance exceeds the quota.</p>
             * </li>
             * <li><p>AccountArrearage: the account has overdue payments.</p>
             * </li>
             * <li><p>AccountNotEnoughBalance: the account balance is insufficient (less than CNY 100).</p>
             * </li>
             * <li><p>ElasticStrengthAlert: the inventory health is poor.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VSwitchIdNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-280ih****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The diagnostic status of the diagnostic item. Valid values:</p>
             * <ul>
             * <li><p>Normal: the diagnostic result is normal.</p>
             * </li>
             * <li><p>Warn: the diagnostic result is a warning.</p>
             * </li>
             * <li><p>Critical: the diagnostic result is critical.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDiagnoseReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("DiagnoseStatus")
        private String diagnoseStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private String processStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Reports(Builder builder) {
            this.creationTime = builder.creationTime;
            this.details = builder.details;
            this.diagnoseStatus = builder.diagnoseStatus;
            this.processStatus = builder.processStatus;
            this.regionId = builder.regionId;
            this.reportId = builder.reportId;
            this.scalingGroupId = builder.scalingGroupId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return diagnoseStatus
         */
        public String getDiagnoseStatus() {
            return this.diagnoseStatus;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String creationTime; 
            private java.util.List<Details> details; 
            private String diagnoseStatus; 
            private String processStatus; 
            private String regionId; 
            private String reportId; 
            private String scalingGroupId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.creationTime = model.creationTime;
                this.details = model.details;
                this.diagnoseStatus = model.diagnoseStatus;
                this.processStatus = model.processStatus;
                this.regionId = model.regionId;
                this.reportId = model.reportId;
                this.scalingGroupId = model.scalingGroupId;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the diagnostic report was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-23T02:22:30Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The details of the diagnostic report.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The diagnostic status. The value is the most severe status among the diagnostic details. Valid values:</p>
             * <ul>
             * <li><p>Normal: the diagnostic result is normal.</p>
             * </li>
             * <li><p>Warn: the diagnostic result is a warning.</p>
             * </li>
             * <li><p>Critical: the diagnostic result is critical.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder diagnoseStatus(String diagnoseStatus) {
                this.diagnoseStatus = diagnoseStatus;
                return this;
            }

            /**
             * <p>The status of the diagnostic report. Valid values:</p>
             * <ul>
             * <li><p>Processing: in progress.</p>
             * </li>
             * <li><p>Finished: completed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>dr-bp14p0cjp7wvjob5l6hk</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp124uve5iph3*****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The user ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>161456884*******</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
