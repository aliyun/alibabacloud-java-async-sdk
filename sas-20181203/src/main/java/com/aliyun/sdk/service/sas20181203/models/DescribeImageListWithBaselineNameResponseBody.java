// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageListWithBaselineNameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageListWithBaselineNameResponseBody</p>
 */
public class DescribeImageListWithBaselineNameResponseBody extends TeaModel {
    @NameInMap("ImageInfos")
    private java.util.List < ImageInfos> imageInfos;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageListWithBaselineNameResponseBody(Builder builder) {
        this.imageInfos = builder.imageInfos;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListWithBaselineNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfos
     */
    public java.util.List < ImageInfos> getImageInfos() {
        return this.imageInfos;
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
        private java.util.List < ImageInfos> imageInfos; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * ImageInfos.
         */
        public Builder imageInfos(java.util.List < ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
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

        public DescribeImageListWithBaselineNameResponseBody build() {
            return new DescribeImageListWithBaselineNameResponseBody(this);
        } 

    } 

    public static class ImageInfos extends TeaModel {
        @NameInMap("Digest")
        private String digest;

        @NameInMap("HighRiskImage")
        private Integer highRiskImage;

        @NameInMap("ImageCreate")
        private Long imageCreate;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageSize")
        private Integer imageSize;

        @NameInMap("ImageUpdate")
        private Long imageUpdate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LowRiskImage")
        private Integer lowRiskImage;

        @NameInMap("MiddleRiskImage")
        private Integer middleRiskImage;

        @NameInMap("NoRiskImage")
        private Integer noRiskImage;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("RepoType")
        private String repoType;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TotalItemCount")
        private Integer totalItemCount;

        @NameInMap("Uuid")
        private String uuid;

        private ImageInfos(Builder builder) {
            this.digest = builder.digest;
            this.highRiskImage = builder.highRiskImage;
            this.imageCreate = builder.imageCreate;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.imageUpdate = builder.imageUpdate;
            this.instanceId = builder.instanceId;
            this.lowRiskImage = builder.lowRiskImage;
            this.middleRiskImage = builder.middleRiskImage;
            this.noRiskImage = builder.noRiskImage;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoType = builder.repoType;
            this.riskStatus = builder.riskStatus;
            this.tag = builder.tag;
            this.totalItemCount = builder.totalItemCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfos create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return highRiskImage
         */
        public Integer getHighRiskImage() {
            return this.highRiskImage;
        }

        /**
         * @return imageCreate
         */
        public Long getImageCreate() {
            return this.imageCreate;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public Integer getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageUpdate
         */
        public Long getImageUpdate() {
            return this.imageUpdate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lowRiskImage
         */
        public Integer getLowRiskImage() {
            return this.lowRiskImage;
        }

        /**
         * @return middleRiskImage
         */
        public Integer getMiddleRiskImage() {
            return this.middleRiskImage;
        }

        /**
         * @return noRiskImage
         */
        public Integer getNoRiskImage() {
            return this.noRiskImage;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return totalItemCount
         */
        public Integer getTotalItemCount() {
            return this.totalItemCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String digest; 
            private Integer highRiskImage; 
            private Long imageCreate; 
            private String imageId; 
            private Integer imageSize; 
            private Long imageUpdate; 
            private String instanceId; 
            private Integer lowRiskImage; 
            private Integer middleRiskImage; 
            private Integer noRiskImage; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoType; 
            private String riskStatus; 
            private String tag; 
            private Integer totalItemCount; 
            private String uuid; 

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * HighRiskImage.
             */
            public Builder highRiskImage(Integer highRiskImage) {
                this.highRiskImage = highRiskImage;
                return this;
            }

            /**
             * ImageCreate.
             */
            public Builder imageCreate(Long imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageSize.
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * ImageUpdate.
             */
            public Builder imageUpdate(Long imageUpdate) {
                this.imageUpdate = imageUpdate;
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
             * LowRiskImage.
             */
            public Builder lowRiskImage(Integer lowRiskImage) {
                this.lowRiskImage = lowRiskImage;
                return this;
            }

            /**
             * MiddleRiskImage.
             */
            public Builder middleRiskImage(Integer middleRiskImage) {
                this.middleRiskImage = middleRiskImage;
                return this;
            }

            /**
             * NoRiskImage.
             */
            public Builder noRiskImage(Integer noRiskImage) {
                this.noRiskImage = noRiskImage;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * RepoType.
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * RiskStatus.
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TotalItemCount.
             */
            public Builder totalItemCount(Integer totalItemCount) {
                this.totalItemCount = totalItemCount;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ImageInfos build() {
                return new ImageInfos(this);
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
