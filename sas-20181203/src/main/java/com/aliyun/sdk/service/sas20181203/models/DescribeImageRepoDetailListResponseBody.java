// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoDetailListResponseBody</p>
 */
public class DescribeImageRepoDetailListResponseBody extends TeaModel {
    @NameInMap("ImageRepoResponses")
    private java.util.List < ImageRepoResponses> imageRepoResponses;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
    public java.util.List < ImageRepoResponses> getImageRepoResponses() {
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
        private java.util.List < ImageRepoResponses> imageRepoResponses; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * Indicates whether the image repository is at risk. Valid values:
         * <p>
         * 
         * *   **YES**
         * *   **NO**
         */
        public Builder imageRepoResponses(java.util.List < ImageRepoResponses> imageRepoResponses) {
            this.imageRepoResponses = imageRepoResponses;
            return this;
        }

        /**
         * The total number of image repositories.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageRepoDetailListResponseBody build() {
            return new DescribeImageRepoDetailListResponseBody(this);
        } 

    } 

    public static class ImageRepoResponses extends TeaModel {
        @NameInMap("AlarmCount")
        private Integer alarmCount;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("Endpoints")
        private String endpoints;

        @NameInMap("HcCount")
        private Integer hcCount;

        @NameInMap("HcStatus")
        private String hcStatus;

        @NameInMap("ImageCount")
        private Integer imageCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("VulCount")
        private Integer vulCount;

        @NameInMap("VulStatus")
        private String vulStatus;

        private ImageRepoResponses(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.endpoints = builder.endpoints;
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
             * The number of images.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * The region ID of the image.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * Indicates whether alerts are generated for the image repository. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The number of alerts that are generated for the image repository.
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * The namespace to which the image repository belongs.
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * The number of baseline risk items on the image repository.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of vulnerabilities detected on the image repository.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * Indicates whether baseline risk items are detected on the image repository. Valid values:
             * <p>
             * 
             * *   **NO**
             * *   **YES**
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespace.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The type of the image repository. Valid values:
             * <p>
             * 
             * *   **acr**
             * *   **harbor**
             * *   **quay**
             * *   **CI/CD**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * The ID of the image.
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The address of the image repository.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * An array that consists of the information about image repositories.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The information about the image repository.
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
