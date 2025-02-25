// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepositoryConfig} extends {@link TeaModel}
 *
 * <p>RepositoryConfig</p>
 */
public class RepositoryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.NameInMap("manifest")
    private String manifest;

    @com.aliyun.core.annotation.NameInMap("repositoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryName;

    private RepositoryConfig(Builder builder) {
        this.branchName = builder.branchName;
        this.manifest = builder.manifest;
        this.repositoryName = builder.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepositoryConfig create() {
        return builder().build();
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return manifest
     */
    public String getManifest() {
        return this.manifest;
    }

    /**
     * @return repositoryName
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public static final class Builder {
        private String branchName; 
        private String manifest; 
        private String repositoryName; 

        /**
         * branchName.
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * manifest.
         */
        public Builder manifest(String manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * repositoryName.
         */
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public RepositoryConfig build() {
            return new RepositoryConfig(this);
        } 

    } 

}
