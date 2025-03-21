// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageRepoDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoDetailListResponseBody</p>
 */
public class DescribeImageRepoDetailListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageRepoResponses")
    private java.util.List<ImageRepoResponses> imageRepoResponses;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageRepoDetailListResponseBody(Builder builder) {
        this.imageRepoResponses = builder.imageRepoResponses;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoDetailListResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageRepoResponses
     */
    public java.util.List<ImageRepoResponses> getImageRepoResponses() {
        return this.imageRepoResponses;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImageRepoResponses> imageRepoResponses; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about image repositories.</p>
         */
        public Builder imageRepoResponses(java.util.List<ImageRepoResponses> imageRepoResponses) {
            this.imageRepoResponses = imageRepoResponses;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageRepoDetailListResponseBody build() {
            return new DescribeImageRepoDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageRepoDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageRepoDetailListResponseBody</p>
     */
    public static class ImageRepoResponses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private String endpoints;

        @com.aliyun.core.annotation.NameInMap("HasRiskImageCount")
        private Integer hasRiskImageCount;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("HcStatus")
        private String hcStatus;

        @com.aliyun.core.annotation.NameInMap("ImageCount")
        private Integer imageCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        @com.aliyun.core.annotation.NameInMap("VulStatus")
        private String vulStatus;

        private ImageRepoResponses(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.endpoints = builder.endpoints;
            this.hasRiskImageCount = builder.hasRiskImageCount;
            this.hcCount = builder.hcCount;
            this.hcStatus = builder.hcStatus;
            this.imageCount = builder.imageCount;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.registryType = builder.registryType;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.riskStatus = builder.riskStatus;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRepoResponses create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return endpoints
         */
        public String getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return hasRiskImageCount
         */
        public Integer getHasRiskImageCount() {
            return this.hasRiskImageCount;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return hcStatus
         */
        public String getHcStatus() {
            return this.hcStatus;
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        /**
         * @return vulStatus
         */
        public String getVulStatus() {
            return this.vulStatus;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String alarmStatus; 
            private String endpoints; 
            private Integer hasRiskImageCount; 
            private Integer hcCount; 
            private String hcStatus; 
            private Integer imageCount; 
            private String instanceId; 
            private String regionId; 
            private String registryType; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String riskStatus; 
            private Integer vulCount; 
            private String vulStatus; 

            /**
             * <p>The number of alerts that are generated for the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>Indicates whether alerts are generated for the image repository. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The address of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;domains&quot;: [
             *                   &quot;<strong><strong>.cn-shenzhen.cr.aliyuncs.com&quot;
             *             ],
             *             &quot;type&quot;: &quot;internet&quot;
             *       },
             *       {
             *             &quot;domains&quot;: [
             *                   &quot;</strong></strong>.cn-shenzhen.cr.aliyuncs.com&quot;
             *             ],
             *             &quot;type&quot;: &quot;intranet&quot;
             *       },
             *       {
             *             &quot;domains&quot;: [
             *                   &quot;****.cn-shenzhen.cr.aliyuncs.com&quot;
             *             ],
             *             &quot;type&quot;: &quot;vpc&quot;
             *       }
             * ]</p>
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The number of the images on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hasRiskImageCount(Integer hasRiskImageCount) {
                this.hasRiskImageCount = hasRiskImageCount;
                return this;
            }

            /**
             * <p>The number of baseline risk items on the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>Indicates whether baseline risk items are detected on the image repository. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>The number of images.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6fsg6xlmorug5****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the image repository. Valid values:</p>
             * <ul>
             * <li><strong>acr</strong></li>
             * <li><strong>harbor</strong></li>
             * <li><strong>quay</strong></li>
             * <li><strong>CI/CD</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acr</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-2chlzf47w2rk****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>zeus</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test-dev</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>Indicates whether the image repository is at risk. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The number of vulnerabilities detected on the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities are detected on the image repository. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public ImageRepoResponses build() {
                return new ImageRepoResponses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageRepoDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageRepoDetailListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of image repositories.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
