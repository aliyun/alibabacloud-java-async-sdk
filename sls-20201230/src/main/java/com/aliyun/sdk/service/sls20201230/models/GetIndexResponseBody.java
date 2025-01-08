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
 * {@link GetIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexResponseBody</p>
 */
public class GetIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("index_mode")
    private String indexMode;

    @com.aliyun.core.annotation.NameInMap("keys")
    private java.util.Map<String, IndexKey> keys;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

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

    @com.aliyun.core.annotation.NameInMap("storage")
    private String storage;

    @com.aliyun.core.annotation.NameInMap("ttl")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.Map<String, IndexKey> getKeys() {
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
        private java.util.Map<String, IndexKey> keys; 
        private Long lastModifyTime; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List<String> logReduceBlackList; 
        private java.util.List<String> logReduceWhiteList; 
        private Integer maxTextLen; 
        private String storage; 
        private Integer ttl; 

        /**
         * <p>The type of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder indexMode(String indexMode) {
            this.indexMode = indexMode;
            return this;
        }

        /**
         * <p>The configurations of field indexes. A field index is in the key-value format in which the key specifies the name of the field and the value specifies the index configuration of the field.</p>
         */
        public Builder keys(java.util.Map<String, IndexKey> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * <p>The time when the index configurations were last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1524155379</p>
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * <p>The configurations of full-text indexes.</p>
         */
        public Builder line(Line line) {
            this.line = line;
            return this;
        }

        /**
         * <p>Indicates whether the log clustering feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logReduce(Boolean logReduce) {
            this.logReduce = logReduce;
            return this;
        }

        /**
         * <p>The fields in the blacklist that are used to cluster logs. This parameter is valid only if the log clustering feature is enabled.</p>
         */
        public Builder logReduceBlackList(java.util.List<String> logReduceBlackList) {
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * <p>The fields in the whitelist that are used to cluster logs. This parameter is valid only if the log clustering feature is enabled.</p>
         */
        public Builder logReduceWhiteList(java.util.List<String> logReduceWhiteList) {
            this.logReduceWhiteList = logReduceWhiteList;
            return this;
        }

        /**
         * <p>The maximum length of a field value that can be retained. Default value: 2048. Unit: bytes. The default value is equal to 2 KB. You can change the value of the max_text_len parameter. Valid values: 64 to 16384. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder maxTextLen(Integer maxTextLen) {
            this.maxTextLen = maxTextLen;
            return this;
        }

        /**
         * <p>The storage type. The value is fixed as pg.</p>
         * 
         * <strong>example:</strong>
         * <p>pg</p>
         */
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        /**
         * <p>The lifecycle of the index file. Valid values: 7, 30, and 90. Unit: day.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public GetIndexResponseBody build() {
            return new GetIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIndexResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexResponseBody</p>
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
             * <p>Indicates whether case sensitivity is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * <p>Indicates whether Chinese characters are included. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder chn(Boolean chn) {
                this.chn = chn;
                return this;
            }

            /**
             * <p>The excluded fields.</p>
             */
            public Builder excludeKeys(java.util.List<String> excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * <p>The included fields.</p>
             */
            public Builder includeKeys(java.util.List<String> includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * <p>The delimiters.</p>
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
