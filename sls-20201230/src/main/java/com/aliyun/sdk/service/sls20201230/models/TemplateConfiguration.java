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
 * {@link TemplateConfiguration} extends {@link TeaModel}
 *
 * <p>TemplateConfiguration</p>
 */
public class TemplateConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aonotations")
    private java.util.Map<String, ?> aonotations;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("tokens")
    private java.util.Map<String, ?> tokens;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aonotations
     */
    public java.util.Map<String, ?> getAonotations() {
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
    public java.util.Map<String, ?> getTokens() {
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
        private java.util.Map<String, ?> aonotations; 
        private String id; 
        private String lang; 
        private java.util.Map<String, ?> tokens; 
        private String type; 
        private String version; 

        private Builder() {
        } 

        private Builder(TemplateConfiguration model) {
            this.aonotations = model.aonotations;
            this.id = model.id;
            this.lang = model.lang;
            this.tokens = model.tokens;
            this.type = model.type;
            this.version = model.version;
        } 

        /**
         * aonotations.
         */
        public Builder aonotations(java.util.Map<String, ?> aonotations) {
            this.aonotations = aonotations;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls.app.ack.ip.not_enough</p>
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
        public Builder tokens(java.util.Map<String, ?> tokens) {
            this.tokens = tokens;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sys</p>
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
