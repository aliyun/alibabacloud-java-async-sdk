// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAffectedMaliciousFileImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAffectedMaliciousFileImagesResponseBody</p>
 */
public class DescribeAffectedMaliciousFileImagesResponseBody extends TeaModel {
    @NameInMap("AffectedMaliciousFileImagesResponse")
    private java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAffectedMaliciousFileImagesResponseBody(Builder builder) {
        this.affectedMaliciousFileImagesResponse = builder.affectedMaliciousFileImagesResponse;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAffectedMaliciousFileImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return affectedMaliciousFileImagesResponse
     */
    public java.util.List < AffectedMaliciousFileImagesResponse> getAffectedMaliciousFileImagesResponse() {
        return this.affectedMaliciousFileImagesResponse;
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
        private java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * AffectedMaliciousFileImagesResponse.
         */
        public Builder affectedMaliciousFileImagesResponse(java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse) {
            this.affectedMaliciousFileImagesResponse = affectedMaliciousFileImagesResponse;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAffectedMaliciousFileImagesResponseBody build() {
            return new DescribeAffectedMaliciousFileImagesResponseBody(this);
        } 

    } 

    public static class AffectedMaliciousFileImagesResponse extends TeaModel {
        @NameInMap("Digest")
        private String digest;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @NameInMap("HighLight")
        private String highLight;

        @NameInMap("ImageUuid")
        private String imageUuid;

        @NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @NameInMap("LatestVerifyTimestamp")
        private Long latestVerifyTimestamp;

        @NameInMap("Layer")
        private String layer;

        @NameInMap("Level")
        private String level;

        @NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoInstanceId")
        private String repoInstanceId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoRegionId")
        private String repoRegionId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tag")
        private String tag;

        private AffectedMaliciousFileImagesResponse(Builder builder) {
            this.digest = builder.digest;
            this.downloadUrl = builder.downloadUrl;
            this.filePath = builder.filePath;
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.highLight = builder.highLight;
            this.imageUuid = builder.imageUuid;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.latestVerifyTimestamp = builder.latestVerifyTimestamp;
            this.layer = builder.layer;
            this.level = builder.level;
            this.maliciousMd5 = builder.maliciousMd5;
            this.namespace = builder.namespace;
            this.repoId = builder.repoId;
            this.repoInstanceId = builder.repoInstanceId;
            this.repoName = builder.repoName;
            this.repoRegionId = builder.repoRegionId;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AffectedMaliciousFileImagesResponse create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTimestamp
         */
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        /**
         * @return highLight
         */
        public String getHighLight() {
            return this.highLight;
        }

        /**
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
        }

        /**
         * @return latestScanTimestamp
         */
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        /**
         * @return latestVerifyTimestamp
         */
        public Long getLatestVerifyTimestamp() {
            return this.latestVerifyTimestamp;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoInstanceId
         */
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoRegionId
         */
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String digest; 
            private String downloadUrl; 
            private String filePath; 
            private Long firstScanTimestamp; 
            private String highLight; 
            private String imageUuid; 
            private Long latestScanTimestamp; 
            private Long latestVerifyTimestamp; 
            private String layer; 
            private String level; 
            private String maliciousMd5; 
            private String namespace; 
            private String repoId; 
            private String repoInstanceId; 
            private String repoName; 
            private String repoRegionId; 
            private Integer status; 
            private String tag; 

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * FirstScanTimestamp.
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * HighLight.
             */
            public Builder highLight(String highLight) {
                this.highLight = highLight;
                return this;
            }

            /**
             * ImageUuid.
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * LatestScanTimestamp.
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * LatestVerifyTimestamp.
             */
            public Builder latestVerifyTimestamp(Long latestVerifyTimestamp) {
                this.latestVerifyTimestamp = latestVerifyTimestamp;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MaliciousMd5.
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * RepoInstanceId.
             */
            public Builder repoInstanceId(String repoInstanceId) {
                this.repoInstanceId = repoInstanceId;
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
             * RepoRegionId.
             */
            public Builder repoRegionId(String repoRegionId) {
                this.repoRegionId = repoRegionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public AffectedMaliciousFileImagesResponse build() {
                return new AffectedMaliciousFileImagesResponse(this);
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
