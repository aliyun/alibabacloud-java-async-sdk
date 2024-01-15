// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link TemplateConfiguration} extends {@link TeaModel}
 *
 * <p>TemplateConfiguration</p>
 */
public class TemplateConfiguration extends TeaModel {
    @NameInMap("aonotations")
    private java.util.Map < String, ? > aonotations;

    @NameInMap("id")
    @Validation(required = true)
    private String id;

    @NameInMap("lang")
    private String lang;

    @NameInMap("tokens")
    private java.util.Map < String, ? > tokens;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @NameInMap("version")
    private String version;

    private TemplateConfiguration(Builder builder) {
        this.aonotations = builder.aonotations;
        this.id = builder.id;
        this.lang = builder.lang;
        this.tokens = builder.tokens;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateConfiguration create() {
        return builder().build();
    }

    /**
     * @return aonotations
     */
    public java.util.Map < String, ? > getAonotations() {
        return this.aonotations;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return tokens
     */
    public java.util.Map < String, ? > getTokens() {
        return this.tokens;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.Map < String, ? > aonotations; 
        private String id; 
        private String lang; 
        private java.util.Map < String, ? > tokens; 
        private String type; 
        private String version; 

        /**
         * aonotations.
         */
        public Builder aonotations(java.util.Map < String, ? > aonotations) {
            this.aonotations = aonotations;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * tokens.
         */
        public Builder tokens(java.util.Map < String, ? > tokens) {
            this.tokens = tokens;
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
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public TemplateConfiguration build() {
            return new TemplateConfiguration(this);
        } 

    } 

}
