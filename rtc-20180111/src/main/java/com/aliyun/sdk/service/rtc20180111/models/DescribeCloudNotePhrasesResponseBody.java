// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCloudNotePhrasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudNotePhrasesResponseBody</p>
 */
public class DescribeCloudNotePhrasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Phrases")
    private java.util.List<Phrases> phrases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeCloudNotePhrasesResponseBody(Builder builder) {
        this.phrases = builder.phrases;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudNotePhrasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phrases
     */
    public java.util.List<Phrases> getPhrases() {
        return this.phrases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Phrases> phrases; 
        private String requestId; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeCloudNotePhrasesResponseBody model) {
            this.phrases = model.phrases;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The hotword lists.</p>
         */
        public Builder phrases(java.util.List<Phrases> phrases) {
            this.phrases = phrases;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3A26E1E3-3CBB-599E-AD68-CB78F5A42FA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeCloudNotePhrasesResponseBody build() {
            return new DescribeCloudNotePhrasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudNotePhrasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudNotePhrasesResponseBody</p>
     */
    public static class WordWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(maximum = 5)
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
        @com.aliyun.core.annotation.Validation(maxLength = 10, minLength = 1)
        private String word;

        private WordWeights(Builder builder) {
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordWeights create() {
            return builder().build();
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private Integer weight; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordWeights model) {
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * <p>The weight value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>The hotword.</p>
             * 
             * <strong>example:</strong>
             * <p>Apple</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordWeights build() {
                return new WordWeights(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudNotePhrasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudNotePhrasesResponseBody</p>
     */
    public static class Phrases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 200, minLength = 1)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(maxLength = 30, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("WordWeights")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<WordWeights> wordWeights;

        private Phrases(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.wordWeights = builder.wordWeights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrases create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return wordWeights
         */
        public java.util.List<WordWeights> getWordWeights() {
            return this.wordWeights;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String id; 
            private String name; 
            private java.util.List<WordWeights> wordWeights; 

            private Builder() {
            } 

            private Builder(Phrases model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.wordWeights = model.wordWeights;
            } 

            /**
             * <p>The creation time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-04T06:22:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Fruit description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The hotword list ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1qweadca332121212</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The hotword list name.</p>
             * 
             * <strong>example:</strong>
             * <p>Fruit</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The hotword weights.</p>
             * <p>This parameter is required.</p>
             */
            public Builder wordWeights(java.util.List<WordWeights> wordWeights) {
                this.wordWeights = wordWeights;
                return this;
            }

            public Phrases build() {
                return new Phrases(this);
            } 

        } 

    }
}
