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
 * {@link ListSitesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSitesResponseBody</p>
 */
public class ListSitesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sites")
    private java.util.List<Sites> sites;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSitesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sites = builder.sites;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSitesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sites
     */
    public java.util.List<Sites> getSites() {
        return this.sites;
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
        private String requestId; 
        private java.util.List<Sites> sites; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSitesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sites = model.sites;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of sites per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of queried site information.</p>
         */
        public Builder sites(java.util.List<Sites> sites) {
            this.sites = sites;
            return this;
        }

        /**
         * <p>Total number of sites.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSitesResponseBody build() {
            return new ListSitesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSitesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSitesResponseBody</p>
     */
    public static class Sites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("CnameZone")
        private String cnameZone;

        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NameServerList")
        private String nameServerList;

        @com.aliyun.core.annotation.NameInMap("OfflineReason")
        private String offlineReason;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanSpecName")
        private String planSpecName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        @com.aliyun.core.annotation.NameInMap("VisitTime")
        private String visitTime;

        private Sites(Builder builder) {
            this.accessType = builder.accessType;
            this.cnameZone = builder.cnameZone;
            this.coverage = builder.coverage;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.nameServerList = builder.nameServerList;
            this.offlineReason = builder.offlineReason;
            this.planName = builder.planName;
            this.planSpecName = builder.planSpecName;
            this.resourceGroupId = builder.resourceGroupId;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
            this.verifyCode = builder.verifyCode;
            this.visitTime = builder.visitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sites create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return cnameZone
         */
        public String getCnameZone() {
            return this.cnameZone;
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nameServerList
         */
        public String getNameServerList() {
            return this.nameServerList;
        }

        /**
         * @return offlineReason
         */
        public String getOfflineReason() {
            return this.offlineReason;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planSpecName
         */
        public String getPlanSpecName() {
            return this.planSpecName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        /**
         * @return visitTime
         */
        public String getVisitTime() {
            return this.visitTime;
        }

        public static final class Builder {
            private String accessType; 
            private String cnameZone; 
            private String coverage; 
            private String createTime; 
            private String instanceId; 
            private String nameServerList; 
            private String offlineReason; 
            private String planName; 
            private String planSpecName; 
            private String resourceGroupId; 
            private Long siteId; 
            private String siteName; 
            private String status; 
            private java.util.Map<String, ?> tags; 
            private String updateTime; 
            private String verifyCode; 
            private String visitTime; 

            private Builder() {
            } 

            private Builder(Sites model) {
                this.accessType = model.accessType;
                this.cnameZone = model.cnameZone;
                this.coverage = model.coverage;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.nameServerList = model.nameServerList;
                this.offlineReason = model.offlineReason;
                this.planName = model.planName;
                this.planSpecName = model.planSpecName;
                this.resourceGroupId = model.resourceGroupId;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.status = model.status;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
                this.verifyCode = model.verifyCode;
                this.visitTime = model.visitTime;
            } 

            /**
             * <p>Site access type. Values:</p>
             * <ul>
             * <li><strong>NS</strong>: Access through NS.</li>
             * <li><strong>CNAME</strong>: Access through CNAME.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NS</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>CNAME suffix of the site. For sites accessed via CNAME, this is the CNAME suffix that needs to be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>example.cname.com</p>
             */
            public Builder cnameZone(String cnameZone) {
                this.cnameZone = cnameZone;
                return this;
            }

            /**
             * <p>Site acceleration region. Values:</p>
             * <ul>
             * <li><strong>domestic</strong>: China mainland only.</li>
             * <li><strong>global</strong>: Global.</li>
             * <li><strong>overseas</strong>: Global (excluding China mainland).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>Site creation time, in ISO8601 format and using UTC time, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the plan instance bound to the site.</p>
             * 
             * <strong>example:</strong>
             * <p>onBvtlmIyeXLbiDw81F9</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The list of NS (Name Servers) assigned to the site. Separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
             */
            public Builder nameServerList(String nameServerList) {
                this.nameServerList = nameServerList;
                return this;
            }

            /**
             * OfflineReason.
             */
            public Builder offlineReason(String offlineReason) {
                this.offlineReason = offlineReason;
                return this;
            }

            /**
             * <p>The name of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-168656498****</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The specification name of the site&quot;s plan.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder planSpecName(String planSpecName) {
                this.planSpecName = planSpecName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek26g6i6se6pna</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789****</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The name of the site.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The status of the site. Possible values:</p>
             * <ul>
             * <li><strong>pending</strong>: The site is pending configuration.</li>
             * <li><strong>active</strong>: The site is active.</li>
             * <li><strong>offline</strong>: The site is offline.</li>
             * <li><strong>moved</strong>: The site has been replaced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the site.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The update time of the site, represented in ISO8601 format and using UTC, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The verification code for site ownership. When the site is accessed via CNAME, this TXT verification code needs to be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * <p>The visit time of the site, formatted according to ISO8601 and using UTC, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder visitTime(String visitTime) {
                this.visitTime = visitTime;
                return this;
            }

            public Sites build() {
                return new Sites(this);
            } 

        } 

    }
}
