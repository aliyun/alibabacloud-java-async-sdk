// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TemplateParameterSchema} extends {@link TeaModel}
 *
 * <p>TemplateParameterSchema</p>
 */
public class TemplateParameterSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("default")
    private Object _default;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enum")
    private java.util.List<String> _enum;

    @com.aliyun.core.annotation.NameInMap("pattern")
    private String pattern;

    @com.aliyun.core.annotation.NameInMap("required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("roleExtension")
    private RoleExtension roleExtension;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private TemplateParameterSchema(Builder builder) {
        this._default = builder._default;
        this.description = builder.description;
        this._enum = builder._enum;
        this.pattern = builder.pattern;
        this.required = builder.required;
        this.roleExtension = builder.roleExtension;
        this.sensitive = builder.sensitive;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateParameterSchema create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _default
     */
    public Object get_default() {
        return this._default;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return _enum
     */
    public java.util.List<String> get_enum() {
        return this._enum;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return roleExtension
     */
    public RoleExtension getRoleExtension() {
        return this.roleExtension;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Object _default; 
        private String description; 
        private java.util.List<String> _enum; 
        private String pattern; 
        private Boolean required; 
        private RoleExtension roleExtension; 
        private Boolean sensitive; 
        private String title; 
        private String type; 

        private Builder() {
        } 

        private Builder(TemplateParameterSchema model) {
            this._default = model._default;
            this.description = model.description;
            this._enum = model._enum;
            this.pattern = model.pattern;
            this.required = model.required;
            this.roleExtension = model.roleExtension;
            this.sensitive = model.sensitive;
            this.title = model.title;
            this.type = model.type;
        } 

        /**
         * default.
         */
        public Builder _default(Object _default) {
            this._default = _default;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enum.
         */
        public Builder _enum(java.util.List<String> _enum) {
            this._enum = _enum;
            return this;
        }

        /**
         * pattern.
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * roleExtension.
         */
        public Builder roleExtension(RoleExtension roleExtension) {
            this.roleExtension = roleExtension;
            return this;
        }

        /**
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TemplateParameterSchema build() {
            return new TemplateParameterSchema(this);
        } 

    } 

    /**
     * 
     * {@link TemplateParameterSchema} extends {@link TeaModel}
     *
     * <p>TemplateParameterSchema</p>
     */
    public static class RoleExtension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorities")
        private java.util.List<String> authorities;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        private RoleExtension(Builder builder) {
            this.authorities = builder.authorities;
            this.name = builder.name;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleExtension create() {
            return builder().build();
        }

        /**
         * @return authorities
         */
        public java.util.List<String> getAuthorities() {
            return this.authorities;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List<String> authorities; 
            private String name; 
            private String service; 

            private Builder() {
            } 

            private Builder(RoleExtension model) {
                this.authorities = model.authorities;
                this.name = model.name;
                this.service = model.service;
            } 

            /**
             * authorities.
             */
            public Builder authorities(java.util.List<String> authorities) {
                this.authorities = authorities;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public RoleExtension build() {
                return new RoleExtension(this);
            } 

        } 

    }
}
