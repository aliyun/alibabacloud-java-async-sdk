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
 * {@link RepositorySourceConfig} extends {@link TeaModel}
 *
 * <p>RepositorySourceConfig</p>
 */
public class RepositorySourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeVersion")
    private CodeVersionReference codeVersion;

    @com.aliyun.core.annotation.NameInMap("filter")
    private EventFilterConfig filter;

    @com.aliyun.core.annotation.NameInMap("repositoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryName;

    private RepositorySourceConfig(Builder builder) {
        this.codeVersion = builder.codeVersion;
        this.filter = builder.filter;
        this.repositoryName = builder.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepositorySourceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersion
     */
    public CodeVersionReference getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return filter
     */
    public EventFilterConfig getFilter() {
        return this.filter;
    }

    /**
     * @return repositoryName
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public static final class Builder {
        private CodeVersionReference codeVersion; 
        private EventFilterConfig filter; 
        private String repositoryName; 

        private Builder() {
        } 

        private Builder(RepositorySourceConfig model) {
            this.codeVersion = model.codeVersion;
            this.filter = model.filter;
            this.repositoryName = model.repositoryName;
        } 

        /**
         * codeVersion.
         */
        public Builder codeVersion(CodeVersionReference codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(EventFilterConfig filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-repository</p>
         */
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public RepositorySourceConfig build() {
            return new RepositorySourceConfig(this);
        } 

    } 

}
