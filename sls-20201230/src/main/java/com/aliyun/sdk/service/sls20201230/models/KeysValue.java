// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link KeysValue} extends {@link TeaModel}
 *
 * <p>KeysValue</p>
 */
public class KeysValue extends TeaModel {
    @NameInMap("caseSensitive")
    private Boolean caseSensitive;

    @NameInMap("chn")
    private Boolean chn;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @NameInMap("alias")
    private String alias;

    @NameInMap("token")
    private java.util.List < String > token;

    @NameInMap("doc_value")
    private Boolean docValue;

    private KeysValue(Builder builder) {
        this.caseSensitive = builder.caseSensitive;
        this.chn = builder.chn;
        this.type = builder.type;
        this.alias = builder.alias;
        this.token = builder.token;
        this.docValue = builder.docValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KeysValue create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return token
     */
    public java.util.List < String > getToken() {
        return this.token;
    }

    /**
     * @return docValue
     */
    public Boolean getDocValue() {
        return this.docValue;
    }

    public static final class Builder {
        private Boolean caseSensitive; 
        private Boolean chn; 
        private String type; 
        private String alias; 
        private java.util.List < String > token; 
        private Boolean docValue; 

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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
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
         * token.
         */
        public Builder token(java.util.List < String > token) {
            this.token = token;
            return this;
        }

        /**
         * doc_value.
         */
        public Builder docValue(Boolean docValue) {
            this.docValue = docValue;
            return this;
        }

        public KeysValue build() {
            return new KeysValue(this);
        } 

    } 

}
