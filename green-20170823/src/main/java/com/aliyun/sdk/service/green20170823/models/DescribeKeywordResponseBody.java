// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeywordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeywordResponseBody</p>
 */
public class DescribeKeywordResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("KeywordList")
    private java.util.List < KeywordList> keywordList;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKeywordResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.keywordList = builder.keywordList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeywordResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keywordList
     */
    public java.util.List < KeywordList> getKeywordList() {
        return this.keywordList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < KeywordList> keywordList; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * KeywordList.
         */
        public Builder keywordList(java.util.List < KeywordList> keywordList) {
            this.keywordList = keywordList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeKeywordResponseBody build() {
            return new DescribeKeywordResponseBody(this);
        } 

    } 

    public static class KeywordList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("HitCount")
        private Integer hitCount;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Keyword")
        private String keyword;

        private KeywordList(Builder builder) {
            this.createTime = builder.createTime;
            this.hitCount = builder.hitCount;
            this.id = builder.id;
            this.keyword = builder.keyword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hitCount
         */
        public Integer getHitCount() {
            return this.hitCount;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        public static final class Builder {
            private String createTime; 
            private Integer hitCount; 
            private Integer id; 
            private String keyword; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HitCount.
             */
            public Builder hitCount(Integer hitCount) {
                this.hitCount = hitCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            public KeywordList build() {
                return new KeywordList(this);
            } 

        } 

    }
}
