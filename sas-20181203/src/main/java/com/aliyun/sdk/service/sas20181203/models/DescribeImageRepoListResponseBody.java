// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoListResponseBody</p>
 */
public class DescribeImageRepoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddTargetCount")
    private Integer addTargetCount;

    @com.aliyun.core.annotation.NameInMap("AllTargetCount")
    private Integer allTargetCount;

    @com.aliyun.core.annotation.NameInMap("DelTargetCount")
    private Integer delTargetCount;

    @com.aliyun.core.annotation.NameInMap("ImageRepoList")
    private java.util.List < ImageRepoList> imageRepoList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageRepoListResponseBody(Builder builder) {
        this.addTargetCount = builder.addTargetCount;
        this.allTargetCount = builder.allTargetCount;
        this.delTargetCount = builder.delTargetCount;
        this.imageRepoList = builder.imageRepoList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoListResponseBody create() {
        return builder().build();
    }

    /**
     * @return addTargetCount
     */
    public Integer getAddTargetCount() {
        return this.addTargetCount;
    }

    /**
     * @return allTargetCount
     */
    public Integer getAllTargetCount() {
        return this.allTargetCount;
    }

    /**
     * @return delTargetCount
     */
    public Integer getDelTargetCount() {
        return this.delTargetCount;
    }

    /**
     * @return imageRepoList
     */
    public java.util.List < ImageRepoList> getImageRepoList() {
        return this.imageRepoList;
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
        private Integer addTargetCount; 
        private Integer allTargetCount; 
        private Integer delTargetCount; 
        private java.util.List < ImageRepoList> imageRepoList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The number of image repositories that are added to Security Center.
         */
        public Builder addTargetCount(Integer addTargetCount) {
            this.addTargetCount = addTargetCount;
            return this;
        }

        /**
         * The total number of image repositories.
         */
        public Builder allTargetCount(Integer allTargetCount) {
            this.allTargetCount = allTargetCount;
            return this;
        }

        /**
         * The number of excluded image repositories.
         */
        public Builder delTargetCount(Integer delTargetCount) {
            this.delTargetCount = delTargetCount;
            return this;
        }

        /**
         * An array that consists of the information about image repositories.
         */
        public Builder imageRepoList(java.util.List < ImageRepoList> imageRepoList) {
            this.imageRepoList = imageRepoList;
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

        public DescribeImageRepoListResponseBody build() {
            return new DescribeImageRepoListResponseBody(this);
        } 

    } 

    public static class ImageRepoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        private ImageRepoList(Builder builder) {
            this.flag = builder.flag;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRepoList create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
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

        public static final class Builder {
            private String flag; 
            private String repoName; 
            private String repoNamespace; 

            /**
             * Indicates whether the feature takes effect on the image repository. Valid values:
             * <p>
             * 
             * *   **add**: yes
             * *   **del**: no
             */
            public Builder flag(String flag) {
                this.flag = flag;
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
             * The namespace to which the image repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            public ImageRepoList build() {
                return new ImageRepoList(this);
            } 

        } 

    }
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
             * The total number of image repositories.
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
