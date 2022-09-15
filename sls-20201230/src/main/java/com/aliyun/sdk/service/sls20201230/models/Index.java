// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Index} extends {@link TeaModel}
 *
 * <p>Index</p>
 */
public class Index extends TeaModel {
    @NameInMap("keys")
    private java.util.Map < String, IndexKeysValue > keys;

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

    @NameInMap("ttl")
    @Validation(required = true)
    private Integer ttl;

    private Index(Builder builder) {
        this.keys = builder.keys;
        this.lastModifyTime = builder.lastModifyTime;
        this.line = builder.line;
        this.logReduce = builder.logReduce;
        this.logReduceBlackList = builder.logReduceBlackList;
        this.logReduceWhiteList = builder.logReduceWhiteList;
        this.maxTextLen = builder.maxTextLen;
        this.ttl = builder.ttl;
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
    public java.util.Map < String, IndexKeysValue > getKeys() {
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
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder {
        private java.util.Map < String, IndexKeysValue > keys; 
        private Long lastModifyTime; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List < String > logReduceBlackList; 
        private java.util.List < String > logReduceWhiteList; 
        private Integer maxTextLen; 
        private Integer ttl; 

        /**
         * 字段索引
         */
        public Builder keys(java.util.Map < String, IndexKeysValue > keys) {
            this.keys = keys;
            return this;
        }

        /**
         * 上次修改时间
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * 全文索引
         */
        public Builder line(Line line) {
            this.line = line;
            return this;
        }

        /**
         * 是否开启日志聚类
         */
        public Builder logReduce(Boolean logReduce) {
            this.logReduce = logReduce;
            return this;
        }

        /**
         * 日志聚类的聚类字段过滤黑名单，仅当日志聚类开启时有效
         */
        public Builder logReduceBlackList(java.util.List < String > logReduceBlackList) {
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * 日志聚类的聚类字段过滤白名单，仅当日志聚类开启时有效
         */
        public Builder logReduceWhiteList(java.util.List < String > logReduceWhiteList) {
            this.logReduceWhiteList = logReduceWhiteList;
            return this;
        }

        /**
         * 统计字段最大长度
         */
        public Builder maxTextLen(Integer maxTextLen) {
            this.maxTextLen = maxTextLen;
            return this;
        }

        /**
         * ttl
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public Index build() {
            return new Index(this);
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
        @Validation(required = true)
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
             * 大小写敏感
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * 包含中文
             */
            public Builder chn(Boolean chn) {
                this.chn = chn;
                return this;
            }

            /**
             * 排除的字段列表，不能与include_keys同时指定。
             */
            public Builder excludeKeys(java.util.List < String > excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * 包含的字段列表，不能与exclude_keys同时指定。
             */
            public Builder includeKeys(java.util.List < String > includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * 分词符
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
