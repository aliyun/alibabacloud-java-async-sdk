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
 * {@link TemplateSpec} extends {@link TeaModel}
 *
 * <p>TemplateSpec</p>
 */
public class TemplateSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("author")
    @com.aliyun.core.annotation.Validation(required = true)
    private String author;

    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.NameInMap("license")
    private String license;

    @com.aliyun.core.annotation.NameInMap("packageName")
    private String packageName;

    @com.aliyun.core.annotation.NameInMap("readme")
    @com.aliyun.core.annotation.Validation(required = true)
    private String readme;

    @com.aliyun.core.annotation.NameInMap("registryToken")
    private String registryToken;

    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.Map<String, TemplateServiceConfig> services;

    @com.aliyun.core.annotation.NameInMap("source")
    private Source source;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, TemplateParameterSchema> variables;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private TemplateSpec(Builder builder) {
        this.author = builder.author;
        this.category = builder.category;
        this.license = builder.license;
        this.packageName = builder.packageName;
        this.readme = builder.readme;
        this.registryToken = builder.registryToken;
        this.services = builder.services;
        this.source = builder.source;
        this.variables = builder.variables;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    /**
     * @return registryToken
     */
    public String getRegistryToken() {
        return this.registryToken;
    }

    /**
     * @return services
     */
    public java.util.Map<String, TemplateServiceConfig> getServices() {
        return this.services;
    }

    /**
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, TemplateParameterSchema> getVariables() {
        return this.variables;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String author; 
        private String category; 
        private String license; 
        private String packageName; 
        private String readme; 
        private String registryToken; 
        private java.util.Map<String, TemplateServiceConfig> services; 
        private Source source; 
        private java.util.Map<String, TemplateParameterSchema> variables; 
        private String version; 

        private Builder() {
        } 

        private Builder(TemplateSpec model) {
            this.author = model.author;
            this.category = model.category;
            this.license = model.license;
            this.packageName = model.packageName;
            this.readme = model.readme;
            this.registryToken = model.registryToken;
            this.services = model.services;
            this.source = model.source;
            this.variables = model.variables;
            this.version = model.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CAP</p>
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * license.
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * packageName.
         */
        public Builder packageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder readme(String readme) {
            this.readme = readme;
            return this;
        }

        /**
         * registryToken.
         */
        public Builder registryToken(String registryToken) {
            this.registryToken = registryToken;
            return this;
        }

        /**
         * services.
         */
        public Builder services(java.util.Map<String, TemplateServiceConfig> services) {
            this.services = services;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Source source) {
            this.source = source;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, TemplateParameterSchema> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public TemplateSpec build() {
            return new TemplateSpec(this);
        } 

    } 

    /**
     * 
     * {@link TemplateSpec} extends {@link TeaModel}
     *
     * <p>TemplateSpec</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("repository")
        private RepositorySourceConfig repository;

        private Source(Builder builder) {
            this.repository = builder.repository;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return repository
         */
        public RepositorySourceConfig getRepository() {
            return this.repository;
        }

        public static final class Builder {
            private RepositorySourceConfig repository; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.repository = model.repository;
            } 

            /**
             * repository.
             */
            public Builder repository(RepositorySourceConfig repository) {
                this.repository = repository;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
}
