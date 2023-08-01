// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link IndexKeysValue} extends {@link TeaModel}
 *
 * <p>IndexKeysValue</p>
 */
public class IndexKeysValue extends TeaModel {
    @NameInMap("chn")
    private Boolean chn;

    @NameInMap("caseSensitive")
    private Boolean caseSensitive;

    @NameInMap("token")
    private java.util.List < String > token;

    @NameInMap("alias")
    private String alias;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @NameInMap("doc_value")
    private Boolean docValue;

    private IndexKeysValue(Builder builder) {
        this.chn = builder.chn;
        this.caseSensitive = builder.caseSensitive;
        this.token = builder.token;
        this.alias = builder.alias;
        this.type = builder.type;
        this.docValue = builder.docValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexKeysValue create() {
        return builder().build();
    }

    /**
     * @return chn
     */
    public Boolean getChn() {
        return this.chn;
    }

    /**
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * @return token
     */
    public java.util.List < String > getToken() {
        return this.token;
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return docValue
     */
    public Boolean getDocValue() {
        return this.docValue;
    }

    public static final class Builder {
        private Boolean chn; 
        private Boolean caseSensitive; 
        private java.util.List < String > token; 
        private String alias; 
        private String type; 
        private Boolean docValue; 

        /**
         * chn.
         */
        public Builder chn(Boolean chn) {
            this.chn = chn;
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
         * token.
         */
        public Builder token(java.util.List < String > token) {
            this.token = token;
            return this;
        }

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * doc_value.
         */
        public Builder docValue(Boolean docValue) {
            this.docValue = docValue;
            return this;
        }

        public IndexKeysValue build() {
            return new IndexKeysValue(this);
        } 

    } 

}
