// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListPostpaidRatePlanInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPostpaidRatePlanInstancesResponseBody</p>
 */
public class ListPostpaidRatePlanInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private java.util.List<InstanceInfo> instanceInfo;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListPostpaidRatePlanInstancesResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPostpaidRatePlanInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceInfo
     */
    public java.util.List<InstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<InstanceInfo> instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListPostpaidRatePlanInstancesResponseBody model) {
            this.instanceInfo = model.instanceInfo;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(java.util.List<InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListPostpaidRatePlanInstancesResponseBody build() {
            return new ListPostpaidRatePlanInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPostpaidRatePlanInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPostpaidRatePlanInstancesResponseBody</p>
     */
    public static class Sites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SiteStatus")
        private String siteStatus;

        private Sites(Builder builder) {
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.siteStatus = builder.siteStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sites create() {
            return builder().build();
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return siteStatus
         */
        public String getSiteStatus() {
            return this.siteStatus;
        }

        public static final class Builder {
            private Long siteId; 
            private String siteName; 
            private String siteStatus; 

            private Builder() {
            } 

            private Builder(Sites model) {
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.siteStatus = model.siteStatus;
            } 

            /**
             * SiteId.
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * SiteName.
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * SiteStatus.
             */
            public Builder siteStatus(String siteStatus) {
                this.siteStatus = siteStatus;
                return this;
            }

            public Sites build() {
                return new Sites(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPostpaidRatePlanInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPostpaidRatePlanInstancesResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("BillingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("Coverages")
        private String coverages;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpectedUpdateTime")
        private String expectedUpdateTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanNameCn")
        private String planNameCn;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("SiteQuota")
        private String siteQuota;

        @com.aliyun.core.annotation.NameInMap("Sites")
        private java.util.List<Sites> sites;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceInfo(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.billingMode = builder.billingMode;
            this.coverages = builder.coverages;
            this.createTime = builder.createTime;
            this.expectedUpdateTime = builder.expectedUpdateTime;
            this.instanceId = builder.instanceId;
            this.planName = builder.planName;
            this.planNameCn = builder.planNameCn;
            this.planType = builder.planType;
            this.siteQuota = builder.siteQuota;
            this.sites = builder.sites;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return coverages
         */
        public String getCoverages() {
            return this.coverages;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expectedUpdateTime
         */
        public String getExpectedUpdateTime() {
            return this.expectedUpdateTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planNameCn
         */
        public String getPlanNameCn() {
            return this.planNameCn;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return siteQuota
         */
        public String getSiteQuota() {
            return this.siteQuota;
        }

        /**
         * @return sites
         */
        public java.util.List<Sites> getSites() {
            return this.sites;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String billingMethod; 
            private String billingMode; 
            private String coverages; 
            private String createTime; 
            private String expectedUpdateTime; 
            private String instanceId; 
            private String planName; 
            private String planNameCn; 
            private String planType; 
            private String siteQuota; 
            private java.util.List<Sites> sites; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.billingMethod = model.billingMethod;
                this.billingMode = model.billingMode;
                this.coverages = model.coverages;
                this.createTime = model.createTime;
                this.expectedUpdateTime = model.expectedUpdateTime;
                this.instanceId = model.instanceId;
                this.planName = model.planName;
                this.planNameCn = model.planNameCn;
                this.planType = model.planType;
                this.siteQuota = model.siteQuota;
                this.sites = model.sites;
                this.status = model.status;
            } 

            /**
             * BillingMethod.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * BillingMode.
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * Coverages.
             */
            public Builder coverages(String coverages) {
                this.coverages = coverages;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpectedUpdateTime.
             */
            public Builder expectedUpdateTime(String expectedUpdateTime) {
                this.expectedUpdateTime = expectedUpdateTime;
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
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * PlanNameCn.
             */
            public Builder planNameCn(String planNameCn) {
                this.planNameCn = planNameCn;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * SiteQuota.
             */
            public Builder siteQuota(String siteQuota) {
                this.siteQuota = siteQuota;
                return this;
            }

            /**
             * Sites.
             */
            public Builder sites(java.util.List<Sites> sites) {
                this.sites = sites;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
