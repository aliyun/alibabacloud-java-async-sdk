// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("workspaces")
    private java.util.List<Workspaces> workspaces;

    private ListWorkspacesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaces
     */
    public java.util.List<Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Workspaces> workspaces; 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The workspaces.</p>
         */
        public Builder workspaces(java.util.List<Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class StateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateChangeReason create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public StateChangeReason build() {
                return new StateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Workspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriodUnit")
        private String autoRenewPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("dlfCatalogId")
        private String dlfCatalogId;

        @com.aliyun.core.annotation.NameInMap("dlfType")
        private String dlfType;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("failReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
        private String paymentDurationUnit;

        @com.aliyun.core.annotation.NameInMap("paymentStatus")
        private String paymentStatus;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("releaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("resourceSpec")
        private String resourceSpec;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("storage")
        private String storage;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("workspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("workspaceStatus")
        private String workspaceStatus;

        private Workspaces(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.autoRenewPeriodUnit = builder.autoRenewPeriodUnit;
            this.createTime = builder.createTime;
            this.dlfCatalogId = builder.dlfCatalogId;
            this.dlfType = builder.dlfType;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failReason = builder.failReason;
            this.paymentDurationUnit = builder.paymentDurationUnit;
            this.paymentStatus = builder.paymentStatus;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.releaseType = builder.releaseType;
            this.resourceSpec = builder.resourceSpec;
            this.stateChangeReason = builder.stateChangeReason;
            this.storage = builder.storage;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.workspaceStatus = builder.workspaceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return autoRenewPeriodUnit
         */
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dlfCatalogId
         */
        public String getDlfCatalogId() {
            return this.dlfCatalogId;
        }

        /**
         * @return dlfType
         */
        public String getDlfType() {
            return this.dlfType;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return paymentDurationUnit
         */
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        /**
         * @return paymentStatus
         */
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return resourceSpec
         */
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return stateChangeReason
         */
        public StateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        /**
         * @return workspaceStatus
         */
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String autoRenewPeriodUnit; 
            private Long createTime; 
            private String dlfCatalogId; 
            private String dlfType; 
            private Integer duration; 
            private Long endTime; 
            private String failReason; 
            private String paymentDurationUnit; 
            private String paymentStatus; 
            private String paymentType; 
            private String regionId; 
            private String releaseType; 
            private String resourceSpec; 
            private StateChangeReason stateChangeReason; 
            private String storage; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            /**
             * <p>Indicates whether auto-renewal is enabled. This parameter is required only if the paymentType parameter is set to Subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal duration. This parameter is required only if the paymentType parameter is set to Subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal duration. This parameter is required only if the paymentType parameter is set to Subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
             */
            public Builder autoRenewPeriodUnit(String autoRenewPeriodUnit) {
                this.autoRenewPeriodUnit = autoRenewPeriodUnit;
                return this;
            }

            /**
             * <p>The time when the workspace was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1684115879955</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information of the Data Lake Formation (DLF) catalog.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dlfCatalogId(String dlfCatalogId) {
                this.dlfCatalogId = dlfCatalogId;
                return this;
            }

            /**
             * dlfType.
             */
            public Builder dlfType(String dlfType) {
                this.dlfType = dlfType;
                return this;
            }

            /**
             * <p>The subscription period. This parameter is required only if the paymentType parameter is set to Subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the workspace was released.</p>
             * 
             * <strong>example:</strong>
             * <p>1687103999999</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>out of stock</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The unit of the subscription duration. This parameter is required only if the paymentType parameter is set to Subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
             */
            public Builder paymentDurationUnit(String paymentDurationUnit) {
                this.paymentDurationUnit = paymentDurationUnit;
                return this;
            }

            /**
             * <p>The status of the payment.</p>
             * 
             * <strong>example:</strong>
             * <p>PAID/UNPAID</p>
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * <p>The payment type.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo or Subscription</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The reason why the workspace is released.</p>
             * 
             * <strong>example:</strong>
             * <p>SERVICE_RELEASE</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The resource specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>100cu</p>
             */
            public Builder resourceSpec(String resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * <p>The information about the workspace status change.</p>
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) path.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-result</p>
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-******</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>spark批作业空间-1</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * <p>The workspace status.</p>
             * 
             * <strong>example:</strong>
             * <p>STARTING,RUNNING,TERMINATED</p>
             */
            public Builder workspaceStatus(String workspaceStatus) {
                this.workspaceStatus = workspaceStatus;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
