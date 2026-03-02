// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link LibraryCreateCmd} extends {@link TeaModel}
 *
 * <p>LibraryCreateCmd</p>
 */
public class LibraryCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    private String repoUrl;

    private LibraryCreateCmd(Builder builder) {
        this.artifactId = builder.artifactId;
        this.companyId = builder.companyId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.marketId = builder.marketId;
        this.name = builder.name;
        this.repoUrl = builder.repoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return repoUrl
     */
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public static final class Builder {
        private String artifactId; 
        private Long companyId; 
        private String description; 
        private String groupId; 
        private Long marketId; 
        private String name; 
        private String repoUrl; 

        private Builder() {
        } 

        private Builder(LibraryCreateCmd model) {
            this.artifactId = model.artifactId;
            this.companyId = model.companyId;
            this.description = model.description;
            this.groupId = model.groupId;
            this.marketId = model.marketId;
            this.name = model.name;
            this.repoUrl = model.repoUrl;
        } 

        /**
         * artifactId.
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
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
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
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
         * repoUrl.
         */
        public Builder repoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        public LibraryCreateCmd build() {
            return new LibraryCreateCmd(this);
        } 

    } 

}
