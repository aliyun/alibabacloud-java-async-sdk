// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceKeywordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceKeywordsResponseBody</p>
 */
public class DescribeInstanceKeywordsResponseBody extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Words")
    private Words words;

    private DescribeInstanceKeywordsResponseBody(Builder builder) {
        this.key = builder.key;
        this.requestId = builder.requestId;
        this.words = builder.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceKeywordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return words
     */
    public Words getWords() {
        return this.words;
    }

    public static final class Builder {
        private String key; 
        private String requestId; 
        private Words words; 

        /**
         * The type of reserved keyword returned.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The reserved keywords.
         */
        public Builder words(Words words) {
            this.words = words;
            return this;
        }

        public DescribeInstanceKeywordsResponseBody build() {
            return new DescribeInstanceKeywordsResponseBody(this);
        } 

    } 

    public static class Words extends TeaModel {
        @NameInMap("word")
        private java.util.List < String > word;

        private Words(Builder builder) {
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Words create() {
            return builder().build();
        }

        /**
         * @return word
         */
        public java.util.List < String > getWord() {
            return this.word;
        }

        public static final class Builder {
            private java.util.List < String > word; 

            /**
             * word.
             */
            public Builder word(java.util.List < String > word) {
                this.word = word;
                return this;
            }

            public Words build() {
                return new Words(this);
            } 

        } 

    }
}
