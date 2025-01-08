// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Index} extends {@link TeaModel}
 *
 * <p>Index</p>
 */
public class Index extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("keys")
    private java.util.Map<String, IndexKey> keys;

    @com.aliyun.core.annotation.NameInMap("line")
    private Line line;

    @com.aliyun.core.annotation.NameInMap("log_reduce")
    private Boolean logReduce;

    @com.aliyun.core.annotation.NameInMap("log_reduce_black_list")
    private java.util.List<String> logReduceBlackList;

    @com.aliyun.core.annotation.NameInMap("log_reduce_white_list")
    private java.util.List<String> logReduceWhiteList;

    @com.aliyun.core.annotation.NameInMap("max_text_len")
    private Integer maxTextLen;

    private Index(Builder builder) {
        this.keys = builder.keys;
        this.line = builder.line;
        this.logReduce = builder.logReduce;
        this.logReduceBlackList = builder.logReduceBlackList;
        this.logReduceWhiteList = builder.logReduceWhiteList;
        this.maxTextLen = builder.maxTextLen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Index create() {
        return builder().build();
    }

    /**
     * @return keys
     */
    public java.util.Map<String, IndexKey> getKeys() {
        return this.keys;
    }

    /**
     * @return line
     */
    public Line getLine() {
        return this.line;
    }

    /**
     * @return logReduce
     */
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    /**
     * @return logReduceBlackList
     */
    public java.util.List<String> getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    /**
     * @return logReduceWhiteList
     */
    public java.util.List<String> getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    /**
     * @return maxTextLen
     */
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    public static final class Builder {
        private java.util.Map<String, IndexKey> keys; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List<String> logReduceBlackList; 
        private java.util.List<String> logReduceWhiteList; 
        private Integer maxTextLen; 

        /**
         * keys.
         */
        public Builder keys(java.util.Map<String, IndexKey> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * line.
         */
        public Builder line(Line line) {
            this.line = line;
            return this;
        }

        /**
         * log_reduce.
         */
        public Builder logReduce(Boolean logReduce) {
            this.logReduce = logReduce;
            return this;
        }

        /**
         * log_reduce_black_list.
         */
        public Builder logReduceBlackList(java.util.List<String> logReduceBlackList) {
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * log_reduce_white_list.
         */
        public Builder logReduceWhiteList(java.util.List<String> logReduceWhiteList) {
            this.logReduceWhiteList = logReduceWhiteList;
            return this;
        }

        /**
         * max_text_len.
         */
        public Builder maxTextLen(Integer maxTextLen) {
            this.maxTextLen = maxTextLen;
            return this;
        }

        public Index build() {
            return new Index(this);
        } 

    } 

    /**
     * 
     * {@link Index} extends {@link TeaModel}
     *
     * <p>Index</p>
     */
    public static class Line extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("chn")
        private Boolean chn;

        @com.aliyun.core.annotation.NameInMap("exclude_keys")
        private java.util.List<String> excludeKeys;

        @com.aliyun.core.annotation.NameInMap("include_keys")
        private java.util.List<String> includeKeys;

        @com.aliyun.core.annotation.NameInMap("token")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> token;

        private Line(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.chn = builder.chn;
            this.excludeKeys = builder.excludeKeys;
            this.includeKeys = builder.includeKeys;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return chn
         */
        public Boolean getChn() {
            return this.chn;
        }

        /**
         * @return excludeKeys
         */
        public java.util.List<String> getExcludeKeys() {
            return this.excludeKeys;
        }

        /**
         * @return includeKeys
         */
        public java.util.List<String> getIncludeKeys() {
            return this.includeKeys;
        }

        /**
         * @return token
         */
        public java.util.List<String> getToken() {
            return this.token;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private Boolean chn; 
            private java.util.List<String> excludeKeys; 
            private java.util.List<String> includeKeys; 
            private java.util.List<String> token; 

            /**
             * caseSensitive.
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * chn.
             */
            public Builder chn(Boolean chn) {
                this.chn = chn;
                return this;
            }

            /**
             * exclude_keys.
             */
            public Builder excludeKeys(java.util.List<String> excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * include_keys.
             */
            public Builder includeKeys(java.util.List<String> includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder token(java.util.List<String> token) {
                this.token = token;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
}
