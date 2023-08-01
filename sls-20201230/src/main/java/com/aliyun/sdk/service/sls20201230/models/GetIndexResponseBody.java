// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexResponseBody</p>
 */
public class GetIndexResponseBody extends TeaModel {
    @NameInMap("index_mode")
    private String indexMode;

    @NameInMap("keys")
    private java.util.Map < String, KeysValue > keys;

    @NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @NameInMap("line")
    private Line line;

    @NameInMap("log_reduce")
    private Boolean logReduce;

    @NameInMap("log_reduce_black_list")
    private java.util.List < String > logReduceBlackList;

    @NameInMap("log_reduce_white_list")
    private java.util.List < String > logReduceWhiteList;

    @NameInMap("max_text_len")
    private Integer maxTextLen;

    @NameInMap("storage")
    private String storage;

    @NameInMap("ttl")
    private Integer ttl;

    private GetIndexResponseBody(Builder builder) {
        this.indexMode = builder.indexMode;
        this.keys = builder.keys;
        this.lastModifyTime = builder.lastModifyTime;
        this.line = builder.line;
        this.logReduce = builder.logReduce;
        this.logReduceBlackList = builder.logReduceBlackList;
        this.logReduceWhiteList = builder.logReduceWhiteList;
        this.maxTextLen = builder.maxTextLen;
        this.storage = builder.storage;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return indexMode
     */
    public String getIndexMode() {
        return this.indexMode;
    }

    /**
     * @return keys
     */
    public java.util.Map < String, KeysValue > getKeys() {
        return this.keys;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
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
    public java.util.List < String > getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    /**
     * @return logReduceWhiteList
     */
    public java.util.List < String > getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    /**
     * @return maxTextLen
     */
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder {
        private String indexMode; 
        private java.util.Map < String, KeysValue > keys; 
        private Long lastModifyTime; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List < String > logReduceBlackList; 
        private java.util.List < String > logReduceWhiteList; 
        private Integer maxTextLen; 
        private String storage; 
        private Integer ttl; 

        /**
         * index_mode.
         */
        public Builder indexMode(String indexMode) {
            this.indexMode = indexMode;
            return this;
        }

        /**
         * keys.
         */
        public Builder keys(java.util.Map < String, KeysValue > keys) {
            this.keys = keys;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
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
        public Builder logReduceBlackList(java.util.List < String > logReduceBlackList) {
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * log_reduce_white_list.
         */
        public Builder logReduceWhiteList(java.util.List < String > logReduceWhiteList) {
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

        /**
         * storage.
         */
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        /**
         * ttl.
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public GetIndexResponseBody build() {
            return new GetIndexResponseBody(this);
        } 

    } 

    public static class Line extends TeaModel {
        @NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @NameInMap("chn")
        private Boolean chn;

        @NameInMap("exclude_keys")
        private java.util.List < String > excludeKeys;

        @NameInMap("include_keys")
        private java.util.List < String > includeKeys;

        @NameInMap("token")
        private java.util.List < String > token;

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
        public java.util.List < String > getExcludeKeys() {
            return this.excludeKeys;
        }

        /**
         * @return includeKeys
         */
        public java.util.List < String > getIncludeKeys() {
            return this.includeKeys;
        }

        /**
         * @return token
         */
        public java.util.List < String > getToken() {
            return this.token;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private Boolean chn; 
            private java.util.List < String > excludeKeys; 
            private java.util.List < String > includeKeys; 
            private java.util.List < String > token; 

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
            public Builder excludeKeys(java.util.List < String > excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * include_keys.
             */
            public Builder includeKeys(java.util.List < String > includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * token.
             */
            public Builder token(java.util.List < String > token) {
                this.token = token;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
}
