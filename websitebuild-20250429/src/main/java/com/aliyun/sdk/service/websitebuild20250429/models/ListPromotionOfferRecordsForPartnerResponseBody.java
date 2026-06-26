// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListPromotionOfferRecordsForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>ListPromotionOfferRecordsForPartnerResponseBody</p>
 */
public class ListPromotionOfferRecordsForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListPromotionOfferRecordsForPartnerResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromotionOfferRecordsForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListPromotionOfferRecordsForPartnerResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
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
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListPromotionOfferRecordsForPartnerResponseBody build() {
            return new ListPromotionOfferRecordsForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPromotionOfferRecordsForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromotionOfferRecordsForPartnerResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityCode")
        private String activityCode;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("EmployeeCode")
        private String employeeCode;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("IssuanceTime")
        private String issuanceTime;

        @com.aliyun.core.annotation.NameInMap("OfferSnapshot")
        private String offerSnapshot;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Records(Builder builder) {
            this.activityCode = builder.activityCode;
            this.activityName = builder.activityName;
            this.employeeCode = builder.employeeCode;
            this.failReason = builder.failReason;
            this.issuanceTime = builder.issuanceTime;
            this.offerSnapshot = builder.offerSnapshot;
            this.recordId = builder.recordId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return activityCode
         */
        public String getActivityCode() {
            return this.activityCode;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return employeeCode
         */
        public String getEmployeeCode() {
            return this.employeeCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return issuanceTime
         */
        public String getIssuanceTime() {
            return this.issuanceTime;
        }

        /**
         * @return offerSnapshot
         */
        public String getOfferSnapshot() {
            return this.offerSnapshot;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String activityCode; 
            private String activityName; 
            private String employeeCode; 
            private String failReason; 
            private String issuanceTime; 
            private String offerSnapshot; 
            private String recordId; 
            private String remark; 
            private String status; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.activityCode = model.activityCode;
                this.activityName = model.activityName;
                this.employeeCode = model.employeeCode;
                this.failReason = model.failReason;
                this.issuanceTime = model.issuanceTime;
                this.offerSnapshot = model.offerSnapshot;
                this.recordId = model.recordId;
                this.remark = model.remark;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * ActivityCode.
             */
            public Builder activityCode(String activityCode) {
                this.activityCode = activityCode;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * EmployeeCode.
             */
            public Builder employeeCode(String employeeCode) {
                this.employeeCode = employeeCode;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * IssuanceTime.
             */
            public Builder issuanceTime(String issuanceTime) {
                this.issuanceTime = issuanceTime;
                return this;
            }

            /**
             * OfferSnapshot.
             */
            public Builder offerSnapshot(String offerSnapshot) {
                this.offerSnapshot = offerSnapshot;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPromotionOfferRecordsForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromotionOfferRecordsForPartnerResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Module(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
