// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < Sites> sites;

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
    public java.util.List < Sites> getSites() {
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
        private java.util.List < Sites> sites; 
        private Integer totalCount; 

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
         * <p>The number of websites per page.</p>
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
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried websites.</p>
         */
        public Builder sites(java.util.List < Sites> sites) {
            this.sites = sites;
            return this;
        }

        /**
         * <p>The total number of websites.</p>
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
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        private Sites(Builder builder) {
            this.accessType = builder.accessType;
            this.cnameZone = builder.cnameZone;
            this.coverage = builder.coverage;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.nameServerList = builder.nameServerList;
            this.planName = builder.planName;
            this.planSpecName = builder.planSpecName;
            this.resourceGroupId = builder.resourceGroupId;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
            this.verifyCode = builder.verifyCode;
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
        public java.util.Map < String, ? > getTags() {
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

        public static final class Builder {
            private String accessType; 
            private String cnameZone; 
            private String coverage; 
            private String createTime; 
            private String instanceId; 
            private String nameServerList; 
            private String planName; 
            private String planSpecName; 
            private String resourceGroupId; 
            private Long siteId; 
            private String siteName; 
            private String status; 
            private java.util.Map < String, ? > tags; 
            private String updateTime; 
            private String verifyCode; 

            /**
             * <p>The DNS setup for the website. Valid values:</p>
             * <ul>
             * <li><strong>NS</strong></li>
             * <li><strong>CNAME</strong></li>
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
             * <p>The CNAME of the website domain. If you use CNAME setup when you add your website to ESA, the value is the CNAME that you configured then.</p>
             * 
             * <strong>example:</strong>
             * <p>example.cname.com</p>
             */
            public Builder cnameZone(String cnameZone) {
                this.cnameZone = cnameZone;
                return this;
            }

            /**
             * <p>The service location for the website. Valid values:</p>
             * <ul>
             * <li><strong>domestic</strong>: the Chinese mainland</li>
             * <li><strong>global</strong>: global</li>
             * <li><strong>overseas</strong>: outside the Chinese mainland</li>
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
             * <p>The time when the website was added. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the plan associated with the website.</p>
             * 
             * <strong>example:</strong>
             * <p>onBvtlmIyeXLbiDw81F9</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The nameservers assigned to the website domain, which are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
             */
            public Builder nameServerList(String nameServerList) {
                this.nameServerList = nameServerList;
                return this;
            }

            /**
             * <p>The plan name.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-168656498****</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The plan associated with the website.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder planSpecName(String planSpecName) {
                this.planSpecName = planSpecName;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek26g6i6se6pna</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789****</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The website status. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong>: The website is to be configured.</li>
             * <li><strong>active</strong>: The website is active.</li>
             * <li><strong>offline</strong>: The website is suspended.</li>
             * <li><strong>moved</strong>: The website has been added and verified by another Alibaba Cloud account.</li>
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
             * <p>The tags of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the website was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The code that is used to verify the website domain ownership. As part of the verification TXT record, this parameter is returned for websites that use CNAME setup.</p>
             * 
             * <strong>example:</strong>
             * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            public Sites build() {
                return new Sites(this);
            } 

        } 

    }
}
