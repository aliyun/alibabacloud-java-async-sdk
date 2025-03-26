// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeInstanceKeywordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceKeywordsResponseBody</p>
 */
public class DescribeInstanceKeywordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Words")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceKeywordsResponseBody model) {
            this.key = model.key;
            this.requestId = model.requestId;
            this.words = model.words;
        } 

        /**
         * <p>The type of reserved keyword returned.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The reserved keywords.</p>
         */
        public Builder words(Words words) {
            this.words = words;
            return this;
        }

        public DescribeInstanceKeywordsResponseBody build() {
            return new DescribeInstanceKeywordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceKeywordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceKeywordsResponseBody</p>
     */
    public static class Words extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("word")
        private java.util.List<String> word;

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
        public java.util.List<String> getWord() {
            return this.word;
        }

        public static final class Builder {
            private java.util.List<String> word; 

            private Builder() {
            } 

            private Builder(Words model) {
                this.word = model.word;
            } 

            /**
             * word.
             */
            public Builder word(java.util.List<String> word) {
                this.word = word;
                return this;
            }

            public Words build() {
                return new Words(this);
            } 

        } 

    }
}
