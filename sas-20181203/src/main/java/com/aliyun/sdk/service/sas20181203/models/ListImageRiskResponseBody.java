// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageRiskResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageRiskResponseBody</p>
 */
public class ListImageRiskResponseBody extends TeaModel {
    @NameInMap("ImageRiskList")
    private java.util.List < ImageRiskList> imageRiskList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListImageRiskResponseBody(Builder builder) {
        this.imageRiskList = builder.imageRiskList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageRiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageRiskList
     */
    public java.util.List < ImageRiskList> getImageRiskList() {
        return this.imageRiskList;
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
        private java.util.List < ImageRiskList> imageRiskList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of security information about the image.
         */
        public Builder imageRiskList(java.util.List < ImageRiskList> imageRiskList) {
            this.imageRiskList = imageRiskList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImageRiskResponseBody build() {
            return new ListImageRiskResponseBody(this);
        } 

    } 

    public static class EndPointList extends TeaModel {
        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("Type")
        private String type;

        private EndPointList(Builder builder) {
            this.domains = builder.domains;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndPointList create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > domains; 
            private String type; 

            /**
             * An array that consists the details of the domain name in the endpoint.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The type of the domain name in the endpoint. Valid values:
             * <p>
             * 
             * *   **internet**: Internet
             * *   **intranet**: internal network
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EndPointList build() {
                return new EndPointList(this);
            } 

        } 

    }
    public static class ImageRiskList extends TeaModel {
        @NameInMap("Digest")
        private String digest;

        @NameInMap("EndPointList")
        private java.util.List < EndPointList> endPointList;

        @NameInMap("Endpoints")
        private String endpoints;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImageAccessType")
        private String imageAccessType;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InternetURLs")
        private String internetURLs;

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

        @NameInMap("RepoType")
        private String repoType;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagImmutable")
        private Integer tagImmutable;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcURLs")
        private String vpcURLs;

        private ImageRiskList(Builder builder) {
            this.digest = builder.digest;
            this.endPointList = builder.endPointList;
            this.endpoints = builder.endpoints;
            this.image = builder.image;
            this.imageAccessType = builder.imageAccessType;
            this.imageId = builder.imageId;
            this.internetURLs = builder.internetURLs;
            this.regionId = builder.regionId;
            this.registryType = builder.registryType;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoType = builder.repoType;
            this.statistics = builder.statistics;
            this.tag = builder.tag;
            this.tagImmutable = builder.tagImmutable;
            this.uuid = builder.uuid;
            this.vpcURLs = builder.vpcURLs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRiskList create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return endPointList
         */
        public java.util.List < EndPointList> getEndPointList() {
            return this.endPointList;
        }

        /**
         * @return endpoints
         */
        public String getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageAccessType
         */
        public String getImageAccessType() {
            return this.imageAccessType;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return internetURLs
         */
        public String getInternetURLs() {
            return this.internetURLs;
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
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagImmutable
         */
        public Integer getTagImmutable() {
            return this.tagImmutable;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcURLs
         */
        public String getVpcURLs() {
            return this.vpcURLs;
        }

        public static final class Builder {
            private String digest; 
            private java.util.List < EndPointList> endPointList; 
            private String endpoints; 
            private String image; 
            private String imageAccessType; 
            private String imageId; 
            private String internetURLs; 
            private String regionId; 
            private String registryType; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoType; 
            private String statistics; 
            private String tag; 
            private Integer tagImmutable; 
            private String uuid; 
            private String vpcURLs; 

            /**
             * The digest value of the image.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * An array that consists of the details of the endpoint.
             */
            public Builder endPointList(java.util.List < EndPointList> endPointList) {
                this.endPointList = endPointList;
                return this;
            }

            /**
             * The endpoint of Container Registry.
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The registration status of the image repository. Valid values:
             * <p>
             * 
             * *   **IN_SAS**: The image repository is registered with Security Center.
             * *   **NOT_IN_SAS**: The image repository is not registered with Security Center.
             */
            public Builder imageAccessType(String imageAccessType) {
                this.imageAccessType = imageAccessType;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The public endpoint of the image repository.
             */
            public Builder internetURLs(String internetURLs) {
                this.internetURLs = internetURLs;
                return this;
            }

            /**
             * The region of the image repository.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the image repository. Valid values:
             * <p>
             * 
             * *   **acr**
             * *   **harbor**
             * *   **quay**
             * *   **CI/CD**: Jenkins
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace to which the repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The type of the repository. Valid values:
             * <p>
             * 
             * *   `PUBLIC`
             * *   `PRIVATE`
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * The statistics on a security event.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The tag that is added to the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Indicates whether the image version is immutable. If the image version is immutable, only the image of the latest version in the image repository can be overwritten. Valid values:
             * <p>
             * 
             * *   **0**: The image version is mutable.
             * *   **1**: The image version is immutable.
             */
            public Builder tagImmutable(Integer tagImmutable) {
                this.tagImmutable = tagImmutable;
                return this;
            }

            /**
             * The UUID of the image.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The endpoint of the image repository in the VPC.
             */
            public Builder vpcURLs(String vpcURLs) {
                this.vpcURLs = vpcURLs;
                return this;
            }

            public ImageRiskList build() {
                return new ImageRiskList(this);
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
