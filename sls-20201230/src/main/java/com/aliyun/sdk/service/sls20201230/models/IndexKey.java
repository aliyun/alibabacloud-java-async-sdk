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
 * {@link IndexKey} extends {@link TeaModel}
 *
 * <p>IndexKey</p>
 */
public class IndexKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("caseSensitive")
    private Boolean caseSensitive;

    @com.aliyun.core.annotation.NameInMap("chn")
    private Boolean chn;

    @com.aliyun.core.annotation.NameInMap("doc_value")
    private Boolean docValue;

    @com.aliyun.core.annotation.NameInMap("index_all")
    private Boolean indexAll;

    @com.aliyun.core.annotation.NameInMap("json_keys")
    private java.util.Map<String, IndexJsonKey> jsonKeys;

    @com.aliyun.core.annotation.NameInMap("max_depth")
    private Long maxDepth;

    @com.aliyun.core.annotation.NameInMap("token")
    private java.util.List<String> token;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private IndexKey(Builder builder) {
        this.alias = builder.alias;
        this.caseSensitive = builder.caseSensitive;
        this.chn = builder.chn;
        this.docValue = builder.docValue;
        this.indexAll = builder.indexAll;
        this.jsonKeys = builder.jsonKeys;
        this.maxDepth = builder.maxDepth;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexKey create() {
        return builder().build();
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
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
     * @return docValue
     */
    public Boolean getDocValue() {
        return this.docValue;
    }

    /**
     * @return indexAll
     */
    public Boolean getIndexAll() {
        return this.indexAll;
    }

    /**
     * @return jsonKeys
     */
    public java.util.Map<String, IndexJsonKey> getJsonKeys() {
        return this.jsonKeys;
    }

    /**
     * @return maxDepth
     */
    public Long getMaxDepth() {
        return this.maxDepth;
    }

    /**
     * @return token
     */
    public java.util.List<String> getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alias; 
        private Boolean caseSensitive; 
        private Boolean chn; 
        private Boolean docValue; 
        private Boolean indexAll; 
        private java.util.Map<String, IndexJsonKey> jsonKeys; 
        private Long maxDepth; 
        private java.util.List<String> token; 
        private String type; 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

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
         * doc_value.
         */
        public Builder docValue(Boolean docValue) {
            this.docValue = docValue;
            return this;
        }

        /**
         * index_all.
         */
        public Builder indexAll(Boolean indexAll) {
            this.indexAll = indexAll;
            return this;
        }

        /**
         * json_keys.
         */
        public Builder jsonKeys(java.util.Map<String, IndexJsonKey> jsonKeys) {
            this.jsonKeys = jsonKeys;
            return this;
        }

        /**
         * max_depth.
         */
        public Builder maxDepth(Long maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        /**
         * token.
         */
        public Builder token(java.util.List<String> token) {
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IndexKey build() {
            return new IndexKey(this);
        } 

    } 

}
