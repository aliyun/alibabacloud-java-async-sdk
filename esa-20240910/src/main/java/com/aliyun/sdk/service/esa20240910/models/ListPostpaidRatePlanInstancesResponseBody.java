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
         * <p>The list of instance information.</p>
         */
        public Builder instanceInfo(java.util.List<InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * <p>The current page number, which is the same as the PageNumber request parameter.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The site name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The site status. Valid values:</p>
             * <ul>
             * <li>pending: The site is pending configuration.</li>
             * <li>active: The site is activated.</li>
             * <li>offline: The site is offline.</li>
             * <li>moved: The site has been superseded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
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

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanNameCn")
        private String planNameCn;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

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
            this.ownerId = builder.ownerId;
            this.planName = builder.planName;
            this.planNameCn = builder.planNameCn;
            this.planType = builder.planType;
            this.shareType = builder.shareType;
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
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
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
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
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
            private String ownerId; 
            private String planName; 
            private String planNameCn; 
            private String planType; 
            private String shareType; 
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
                this.ownerId = model.ownerId;
                this.planName = model.planName;
                this.planNameCn = model.planNameCn;
                this.planType = model.planType;
                this.shareType = model.shareType;
                this.siteQuota = model.siteQuota;
                this.sites = model.sites;
                this.status = model.status;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>dps_month95: Monthly 95th Percentile.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUBSCRIBE</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The billing mode. Valid values:</p>
             * <ul>
             * <li>POSTPAY: Pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * <p>The acceleration regions to which the instance can bindable sites. Multiple values are separated by commas (,). Valid values:</p>
             * <ul>
             * <li>domestic: The Chinese mainland.</li>
             * <li>overseas: Global (excluding the Chinese mainland).</li>
             * <li>global: Global (including the Chinese mainland).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder coverages(String coverages) {
                this.coverages = coverages;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-19T11:15:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The scheduled specification change time. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-19T11:15:20Z</p>
             */
            public Builder expectedUpdateTime(String expectedUpdateTime) {
                this.expectedUpdateTime = expectedUpdateTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-xcdn-96wblslz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The English name of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The Chinese name of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>test-plan</p>
             */
            public Builder planNameCn(String planNameCn) {
                this.planNameCn = planNameCn;
                return this;
            }

            /**
             * <p>The plan type of the instance. Valid values:</p>
             * <ul>
             * <li>normal: Fixed edition plan.</li>
             * <li>enterprise: Enterprise edition plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * ShareType.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The site quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder siteQuota(String siteQuota) {
                this.siteQuota = siteQuota;
                return this;
            }

            /**
             * <p>The list of sites.</p>
             */
            public Builder sites(java.util.List<Sites> sites) {
                this.sites = sites;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
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
