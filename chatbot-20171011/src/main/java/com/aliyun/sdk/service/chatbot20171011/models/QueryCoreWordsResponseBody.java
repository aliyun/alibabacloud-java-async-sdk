// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCoreWordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCoreWordsResponseBody</p>
 */
public class QueryCoreWordsResponseBody extends TeaModel {
    @NameInMap("CoreWords")
    private java.util.List < CoreWords> coreWords;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryCoreWordsResponseBody(Builder builder) {
        this.coreWords = builder.coreWords;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCoreWordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return coreWords
     */
    public java.util.List < CoreWords> getCoreWords() {
        return this.coreWords;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
        private java.util.List < CoreWords> coreWords; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CoreWords.
         */
        public Builder coreWords(java.util.List < CoreWords> coreWords) {
            this.coreWords = coreWords;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        public QueryCoreWordsResponseBody build() {
            return new QueryCoreWordsResponseBody(this);
        } 

    } 

    public static class CoreWords extends TeaModel {
        @NameInMap("CoreWordCode")
        private String coreWordCode;

        @NameInMap("CoreWordName")
        private String coreWordName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Synonyms")
        private java.util.List < String > synonyms;

        private CoreWords(Builder builder) {
            this.coreWordCode = builder.coreWordCode;
            this.coreWordName = builder.coreWordName;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.synonyms = builder.synonyms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoreWords create() {
            return builder().build();
        }

        /**
         * @return coreWordCode
         */
        public String getCoreWordCode() {
            return this.coreWordCode;
        }

        /**
         * @return coreWordName
         */
        public String getCoreWordName() {
            return this.coreWordName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return synonyms
         */
        public java.util.List < String > getSynonyms() {
            return this.synonyms;
        }

        public static final class Builder {
            private String coreWordCode; 
            private String coreWordName; 
            private String createTime; 
            private String modifyTime; 
            private java.util.List < String > synonyms; 

            /**
             * CoreWordCode.
             */
            public Builder coreWordCode(String coreWordCode) {
                this.coreWordCode = coreWordCode;
                return this;
            }

            /**
             * CoreWordName.
             */
            public Builder coreWordName(String coreWordName) {
                this.coreWordName = coreWordName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Synonyms.
             */
            public Builder synonyms(java.util.List < String > synonyms) {
                this.synonyms = synonyms;
                return this;
            }

            public CoreWords build() {
                return new CoreWords(this);
            } 

        } 

    }
}
