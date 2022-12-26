// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoListResponseBody</p>
 */
public class DescribeImageRepoListResponseBody extends TeaModel {
    @NameInMap("AddTargetCount")
    private Integer addTargetCount;

    @NameInMap("AllTargetCount")
    private Integer allTargetCount;

    @NameInMap("DelTargetCount")
    private Integer delTargetCount;

    @NameInMap("ImageRepoList")
    private java.util.List < ImageRepoList> imageRepoList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * AddTargetCount.
         */
        public Builder addTargetCount(Integer addTargetCount) {
            this.addTargetCount = addTargetCount;
            return this;
        }

        /**
         * AllTargetCount.
         */
        public Builder allTargetCount(Integer allTargetCount) {
            this.allTargetCount = allTargetCount;
            return this;
        }

        /**
         * DelTargetCount.
         */
        public Builder delTargetCount(Integer delTargetCount) {
            this.delTargetCount = delTargetCount;
            return this;
        }

        /**
         * ImageRepoList.
         */
        public Builder imageRepoList(java.util.List < ImageRepoList> imageRepoList) {
            this.imageRepoList = imageRepoList;
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

        public DescribeImageRepoListResponseBody build() {
            return new DescribeImageRepoListResponseBody(this);
        } 

    } 

    public static class ImageRepoList extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
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
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
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

            public ImageRepoList build() {
                return new ImageRepoList(this);
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
