// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserRatePlanInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserRatePlanInstancesResponseBody</p>
 */
public class ListUserRatePlanInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private java.util.List < InstanceInfo> instanceInfo;

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

    private ListUserRatePlanInstancesResponseBody(Builder builder) {
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

    public static ListUserRatePlanInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfo
     */
    public java.util.List < InstanceInfo> getInstanceInfo() {
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
        private java.util.List < InstanceInfo> instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(java.util.List < InstanceInfo> instanceInfo) {
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
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
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

        public ListUserRatePlanInstancesResponseBody build() {
            return new ListUserRatePlanInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserRatePlanInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserRatePlanInstancesResponseBody</p>
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
     * {@link ListUserRatePlanInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserRatePlanInstancesResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("BotInstanceLevel")
        private String botInstanceLevel;

        @com.aliyun.core.annotation.NameInMap("Coverages")
        private String coverages;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CrossborderTraffic")
        private String crossborderTraffic;

        @com.aliyun.core.annotation.NameInMap("DdosBurstableDomesticProtection")
        private String ddosBurstableDomesticProtection;

        @com.aliyun.core.annotation.NameInMap("DdosBurstableOverseasProtection")
        private String ddosBurstableOverseasProtection;

        @com.aliyun.core.annotation.NameInMap("DdosInstanceLevel")
        private String ddosInstanceLevel;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EdgeRoutineRquest")
        private String edgeRoutineRquest;

        @com.aliyun.core.annotation.NameInMap("EdgeWafRequest")
        private String edgeWafRequest;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Layer4Traffic")
        private String layer4Traffic;

        @com.aliyun.core.annotation.NameInMap("Layer4TrafficIntl")
        private String layer4TrafficIntl;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanTraffic")
        private String planTraffic;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("SiteQuota")
        private String siteQuota;

        @com.aliyun.core.annotation.NameInMap("Sites")
        private java.util.List < Sites> sites;

        @com.aliyun.core.annotation.NameInMap("SmartRoutingRequest")
        private String smartRoutingRequest;

        @com.aliyun.core.annotation.NameInMap("StaticRequest")
        private String staticRequest;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceInfo(Builder builder) {
            this.billingMode = builder.billingMode;
            this.botInstanceLevel = builder.botInstanceLevel;
            this.coverages = builder.coverages;
            this.createTime = builder.createTime;
            this.crossborderTraffic = builder.crossborderTraffic;
            this.ddosBurstableDomesticProtection = builder.ddosBurstableDomesticProtection;
            this.ddosBurstableOverseasProtection = builder.ddosBurstableOverseasProtection;
            this.ddosInstanceLevel = builder.ddosInstanceLevel;
            this.duration = builder.duration;
            this.edgeRoutineRquest = builder.edgeRoutineRquest;
            this.edgeWafRequest = builder.edgeWafRequest;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.layer4Traffic = builder.layer4Traffic;
            this.layer4TrafficIntl = builder.layer4TrafficIntl;
            this.planName = builder.planName;
            this.planTraffic = builder.planTraffic;
            this.planType = builder.planType;
            this.siteQuota = builder.siteQuota;
            this.sites = builder.sites;
            this.smartRoutingRequest = builder.smartRoutingRequest;
            this.staticRequest = builder.staticRequest;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return botInstanceLevel
         */
        public String getBotInstanceLevel() {
            return this.botInstanceLevel;
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
         * @return crossborderTraffic
         */
        public String getCrossborderTraffic() {
            return this.crossborderTraffic;
        }

        /**
         * @return ddosBurstableDomesticProtection
         */
        public String getDdosBurstableDomesticProtection() {
            return this.ddosBurstableDomesticProtection;
        }

        /**
         * @return ddosBurstableOverseasProtection
         */
        public String getDdosBurstableOverseasProtection() {
            return this.ddosBurstableOverseasProtection;
        }

        /**
         * @return ddosInstanceLevel
         */
        public String getDdosInstanceLevel() {
            return this.ddosInstanceLevel;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return edgeRoutineRquest
         */
        public String getEdgeRoutineRquest() {
            return this.edgeRoutineRquest;
        }

        /**
         * @return edgeWafRequest
         */
        public String getEdgeWafRequest() {
            return this.edgeWafRequest;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return layer4Traffic
         */
        public String getLayer4Traffic() {
            return this.layer4Traffic;
        }

        /**
         * @return layer4TrafficIntl
         */
        public String getLayer4TrafficIntl() {
            return this.layer4TrafficIntl;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planTraffic
         */
        public String getPlanTraffic() {
            return this.planTraffic;
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
        public java.util.List < Sites> getSites() {
            return this.sites;
        }

        /**
         * @return smartRoutingRequest
         */
        public String getSmartRoutingRequest() {
            return this.smartRoutingRequest;
        }

        /**
         * @return staticRequest
         */
        public String getStaticRequest() {
            return this.staticRequest;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String billingMode; 
            private String botInstanceLevel; 
            private String coverages; 
            private String createTime; 
            private String crossborderTraffic; 
            private String ddosBurstableDomesticProtection; 
            private String ddosBurstableOverseasProtection; 
            private String ddosInstanceLevel; 
            private Integer duration; 
            private String edgeRoutineRquest; 
            private String edgeWafRequest; 
            private String expireTime; 
            private String instanceId; 
            private String layer4Traffic; 
            private String layer4TrafficIntl; 
            private String planName; 
            private String planTraffic; 
            private String planType; 
            private String siteQuota; 
            private java.util.List < Sites> sites; 
            private String smartRoutingRequest; 
            private String staticRequest; 
            private String status; 

            /**
             * BillingMode.
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * BotInstanceLevel.
             */
            public Builder botInstanceLevel(String botInstanceLevel) {
                this.botInstanceLevel = botInstanceLevel;
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
             * CrossborderTraffic.
             */
            public Builder crossborderTraffic(String crossborderTraffic) {
                this.crossborderTraffic = crossborderTraffic;
                return this;
            }

            /**
             * DdosBurstableDomesticProtection.
             */
            public Builder ddosBurstableDomesticProtection(String ddosBurstableDomesticProtection) {
                this.ddosBurstableDomesticProtection = ddosBurstableDomesticProtection;
                return this;
            }

            /**
             * DdosBurstableOverseasProtection.
             */
            public Builder ddosBurstableOverseasProtection(String ddosBurstableOverseasProtection) {
                this.ddosBurstableOverseasProtection = ddosBurstableOverseasProtection;
                return this;
            }

            /**
             * DdosInstanceLevel.
             */
            public Builder ddosInstanceLevel(String ddosInstanceLevel) {
                this.ddosInstanceLevel = ddosInstanceLevel;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EdgeRoutineRquest.
             */
            public Builder edgeRoutineRquest(String edgeRoutineRquest) {
                this.edgeRoutineRquest = edgeRoutineRquest;
                return this;
            }

            /**
             * EdgeWafRequest.
             */
            public Builder edgeWafRequest(String edgeWafRequest) {
                this.edgeWafRequest = edgeWafRequest;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * Layer4Traffic.
             */
            public Builder layer4Traffic(String layer4Traffic) {
                this.layer4Traffic = layer4Traffic;
                return this;
            }

            /**
             * Layer4TrafficIntl.
             */
            public Builder layer4TrafficIntl(String layer4TrafficIntl) {
                this.layer4TrafficIntl = layer4TrafficIntl;
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
             * PlanTraffic.
             */
            public Builder planTraffic(String planTraffic) {
                this.planTraffic = planTraffic;
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
            public Builder sites(java.util.List < Sites> sites) {
                this.sites = sites;
                return this;
            }

            /**
             * SmartRoutingRequest.
             */
            public Builder smartRoutingRequest(String smartRoutingRequest) {
                this.smartRoutingRequest = smartRoutingRequest;
                return this;
            }

            /**
             * StaticRequest.
             */
            public Builder staticRequest(String staticRequest) {
                this.staticRequest = staticRequest;
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
