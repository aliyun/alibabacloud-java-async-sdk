// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCompressFileDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCompressFileDetectResultResponseBody</p>
 */
public class ListCompressFileDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List < ResultList> resultList;

    private ListCompressFileDetectResultResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompressFileDetectResultResponseBody create() {
        return builder().build();
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

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < ResultList> resultList; 

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

        /**
         * ResultList.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public ListCompressFileDetectResultResponseBody build() {
            return new ListCompressFileDetectResultResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

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
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("HashKey")
        private String hashKey;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("VirusType")
        private String virusType;

        private ResultList(Builder builder) {
            this.ext = builder.ext;
            this.hashKey = builder.hashKey;
            this.path = builder.path;
            this.result = builder.result;
            this.score = builder.score;
            this.virusType = builder.virusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return virusType
         */
        public String getVirusType() {
            return this.virusType;
        }

        public static final class Builder {
            private String ext; 
            private String hashKey; 
            private String path; 
            private Integer result; 
            private Integer score; 
            private String virusType; 

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * HashKey.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * VirusType.
             */
            public Builder virusType(String virusType) {
                this.virusType = virusType;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
