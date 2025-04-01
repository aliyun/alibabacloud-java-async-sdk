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
 * {@link SourceConfig} extends {@link TeaModel}
 *
 * <p>SourceConfig</p>
 */
public class SourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("oss")
    private OpenStructOssSourceConfig oss;

    @com.aliyun.core.annotation.NameInMap("repository")
    private RepositorySourceConfig repository;

    @com.aliyun.core.annotation.NameInMap("template")
    private TemplateSourceConfig template;

    private SourceConfig(Builder builder) {
        this.oss = builder.oss;
        this.repository = builder.repository;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oss
     */
    public OpenStructOssSourceConfig getOss() {
        return this.oss;
    }

    /**
     * @return repository
     */
    public RepositorySourceConfig getRepository() {
        return this.repository;
    }

    /**
     * @return template
     */
    public TemplateSourceConfig getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private OpenStructOssSourceConfig oss; 
        private RepositorySourceConfig repository; 
        private TemplateSourceConfig template; 

        private Builder() {
        } 

        private Builder(SourceConfig model) {
            this.oss = model.oss;
            this.repository = model.repository;
            this.template = model.template;
        } 

        /**
         * oss.
         */
        public Builder oss(OpenStructOssSourceConfig oss) {
            this.oss = oss;
            return this;
        }

        /**
         * repository.
         */
        public Builder repository(RepositorySourceConfig repository) {
            this.repository = repository;
            return this;
        }

        /**
         * template.
         */
        public Builder template(TemplateSourceConfig template) {
            this.template = template;
            return this;
        }

        public SourceConfig build() {
            return new SourceConfig(this);
        } 

    } 

}
