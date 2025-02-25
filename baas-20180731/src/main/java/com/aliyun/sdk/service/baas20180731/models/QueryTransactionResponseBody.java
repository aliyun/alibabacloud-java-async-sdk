// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransactionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTransactionResponseBody</p>
 */
public class QueryTransactionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private QueryTransactionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransactionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public QueryTransactionResponseBody build() {
            return new QueryTransactionResponseBody(this);
        } 

    } 

    public static class ReferenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private ReferenceList(Builder builder) {
            this.data = builder.data;
            this.length = builder.length;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private Integer length; 
            private Integer type; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ReferenceList build() {
                return new ReferenceList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockHeight")
        private Long blockHeight;

        @com.aliyun.core.annotation.NameInMap("BlockVersion")
        private Integer blockVersion;

        @com.aliyun.core.annotation.NameInMap("Category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentHash")
        private String contentHash;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyWrap")
        private String keyWrap;

        @com.aliyun.core.annotation.NameInMap("Nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("ReferenceList")
        private ReferenceList referenceList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Result(Builder builder) {
            this.blockHeight = builder.blockHeight;
            this.blockVersion = builder.blockVersion;
            this.category = builder.category;
            this.content = builder.content;
            this.contentHash = builder.contentHash;
            this.createTime = builder.createTime;
            this.hash = builder.hash;
            this.keyName = builder.keyName;
            this.keyWrap = builder.keyWrap;
            this.nonce = builder.nonce;
            this.referenceCount = builder.referenceCount;
            this.referenceList = builder.referenceList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return blockHeight
         */
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        /**
         * @return blockVersion
         */
        public Integer getBlockVersion() {
            return this.blockVersion;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentHash
         */
        public String getContentHash() {
            return this.contentHash;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyWrap
         */
        public String getKeyWrap() {
            return this.keyWrap;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return referenceList
         */
        public ReferenceList getReferenceList() {
            return this.referenceList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Long blockHeight; 
            private Integer blockVersion; 
            private Integer category; 
            private String content; 
            private String contentHash; 
            private Long createTime; 
            private String hash; 
            private String keyName; 
            private String keyWrap; 
            private String nonce; 
            private Integer referenceCount; 
            private ReferenceList referenceList; 
            private Integer type; 

            /**
             * BlockHeight.
             */
            public Builder blockHeight(Long blockHeight) {
                this.blockHeight = blockHeight;
                return this;
            }

            /**
             * BlockVersion.
             */
            public Builder blockVersion(Integer blockVersion) {
                this.blockVersion = blockVersion;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentHash.
             */
            public Builder contentHash(String contentHash) {
                this.contentHash = contentHash;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Hash.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyWrap.
             */
            public Builder keyWrap(String keyWrap) {
                this.keyWrap = keyWrap;
                return this;
            }

            /**
             * Nonce.
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * ReferenceCount.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * ReferenceList.
             */
            public Builder referenceList(ReferenceList referenceList) {
                this.referenceList = referenceList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
