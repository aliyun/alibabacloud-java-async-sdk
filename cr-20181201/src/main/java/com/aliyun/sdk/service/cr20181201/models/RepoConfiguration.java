// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link RepoConfiguration} extends {@link TeaModel}
 *
 * <p>RepoConfiguration</p>
 */
public class RepoConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildRuleParameters")
    private ArtifactBuildRuleParameters artifactBuildRuleParameters;

    @com.aliyun.core.annotation.NameInMap("RepoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoType;

    @com.aliyun.core.annotation.NameInMap("TagImmutability")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean tagImmutability;

    private RepoConfiguration(Builder builder) {
        this.artifactBuildRuleParameters = builder.artifactBuildRuleParameters;
        this.repoType = builder.repoType;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepoConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactBuildRuleParameters
     */
    public ArtifactBuildRuleParameters getArtifactBuildRuleParameters() {
        return this.artifactBuildRuleParameters;
    }

    /**
     * @return repoType
     */
    public String getRepoType() {
        return this.repoType;
    }

    /**
     * @return tagImmutability
     */
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    public static final class Builder {
        private ArtifactBuildRuleParameters artifactBuildRuleParameters; 
        private String repoType; 
        private Boolean tagImmutability; 

        private Builder() {
        } 

        private Builder(RepoConfiguration model) {
            this.artifactBuildRuleParameters = model.artifactBuildRuleParameters;
            this.repoType = model.repoType;
            this.tagImmutability = model.tagImmutability;
        } 

        /**
         * ArtifactBuildRuleParameters.
         */
        public Builder artifactBuildRuleParameters(ArtifactBuildRuleParameters artifactBuildRuleParameters) {
            this.artifactBuildRuleParameters = artifactBuildRuleParameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.tagImmutability = tagImmutability;
            return this;
        }

        public RepoConfiguration build() {
            return new RepoConfiguration(this);
        } 

    } 

    /**
     * 
     * {@link RepoConfiguration} extends {@link TeaModel}
     *
     * <p>RepoConfiguration</p>
     */
    public static class ArtifactBuildRuleParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageIndexOnly")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean imageIndexOnly;

        @com.aliyun.core.annotation.NameInMap("PriorityFile")
        private String priorityFile;

        private ArtifactBuildRuleParameters(Builder builder) {
            this.imageIndexOnly = builder.imageIndexOnly;
            this.priorityFile = builder.priorityFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactBuildRuleParameters create() {
            return builder().build();
        }

        /**
         * @return imageIndexOnly
         */
        public Boolean getImageIndexOnly() {
            return this.imageIndexOnly;
        }

        /**
         * @return priorityFile
         */
        public String getPriorityFile() {
            return this.priorityFile;
        }

        public static final class Builder {
            private Boolean imageIndexOnly; 
            private String priorityFile; 

            private Builder() {
            } 

            private Builder(ArtifactBuildRuleParameters model) {
                this.imageIndexOnly = model.imageIndexOnly;
                this.priorityFile = model.priorityFile;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder imageIndexOnly(Boolean imageIndexOnly) {
                this.imageIndexOnly = imageIndexOnly;
                return this;
            }

            /**
             * PriorityFile.
             */
            public Builder priorityFile(String priorityFile) {
                this.priorityFile = priorityFile;
                return this;
            }

            public ArtifactBuildRuleParameters build() {
                return new ArtifactBuildRuleParameters(this);
            } 

        } 

    }
}
