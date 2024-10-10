// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListImageRiskResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageRiskResponseBody</p>
 */
public class ListImageRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageRiskList")
    private java.util.List < ImageRiskList> imageRiskList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of security information about the image.</p>
         */
        public Builder imageRiskList(java.util.List < ImageRiskList> imageRiskList) {
            this.imageRiskList = imageRiskList;
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
         * <p>050ACC7A-D4FD-55C6-B861-BA9569C1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImageRiskResponseBody build() {
            return new ListImageRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageRiskResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageRiskResponseBody</p>
     */
    public static class EndPointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List < String > domains;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>An array that consists the details of the domain name in the endpoint.</p>
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The type of the domain name in the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: Internet</li>
             * <li><strong>intranet</strong>: internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
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
    /**
     * 
     * {@link ListImageRiskResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageRiskResponseBody</p>
     */
    public static class ImageRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("EndPointList")
        private java.util.List < EndPointList> endPointList;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private String endpoints;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageAccessType")
        private String imageAccessType;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InternetURLs")
        private String internetURLs;

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

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TagImmutable")
        private Integer tagImmutable;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcURLs")
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
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>3f8efc2184cf1d24936b49c27286a284714b77be34c80c9ee38ca6bf322445****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>An array that consists of the details of the endpoint.</p>
             */
            public Builder endPointList(java.util.List < EndPointList> endPointList) {
                this.endPointList = endPointList;
                return this;
            }

            /**
             * <p>The endpoint of Container Registry.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://172.20.XXX.XXX/test">https://172.20.XXX.XXX/test</a></p>
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The image of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>.aliyuncs.com/sas_test/baseline:exploit</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The registration status of the image repository. Valid values:</p>
             * <ul>
             * <li><strong>IN_SAS</strong>: The image repository is registered with Security Center.</li>
             * <li><strong>NOT_IN_SAS</strong>: The image repository is not registered with Security Center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_SAS</p>
             */
            public Builder imageAccessType(String imageAccessType) {
                this.imageAccessType = imageAccessType;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>f922bfeb6960436fe3f0e7b62fc6b9a0b47980986669c367c22433269404****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The public endpoint of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>registry-registry.cn-shenzhen-finance-1.cr.aliyuncs.com/xxxx/docker-</strong></strong></p>
             */
            public Builder internetURLs(String internetURLs) {
                this.internetURLs = internetURLs;
                return this;
            }

            /**
             * <p>The region of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
             * <li><strong>CI/CD</strong>: Jenkins</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>harbor</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-bk2l746eyxca1****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>scan_test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The name of the namespace to which the repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vultar***</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The type of the repository. Valid values:</p>
             * <ul>
             * <li><code>PUBLIC</code></li>
             * <li><code>PRIVATE</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>The statistics on a security event.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;baselineNum&quot;: 0,
             *     &quot;newSuspicious&quot;: 0,
             *     &quot;vul&quot;: 0
             * }</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Indicates whether the image version is immutable. If the image version is immutable, only the image of the latest version in the image repository can be overwritten. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The image version is mutable.</li>
             * <li><strong>1</strong>: The image version is immutable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tagImmutable(Integer tagImmutable) {
                this.tagImmutable = tagImmutable;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>624778f3-5bf2-423c-ac0c-47a62c05****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The endpoint of the image repository in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>-registry-registry-vpc.cn-shenzhen-finance-1.cr.aliyuncs.com/xxxx/docker-</strong></strong></p>
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
    /**
     * 
     * {@link ListImageRiskResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageRiskResponseBody</p>
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
             * <p>3</p>
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
