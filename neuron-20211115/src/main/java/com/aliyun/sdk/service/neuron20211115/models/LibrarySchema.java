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
 * {@link LibrarySchema} extends {@link TeaModel}
 *
 * <p>LibrarySchema</p>
 */
public class LibrarySchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gitGroup")
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("provider")
    private Provider provider;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LibrarySchema(Builder builder) {
        this.artifactId = builder.artifactId;
        this.companyId = builder.companyId;
        this.description = builder.description;
        this.gitGroup = builder.gitGroup;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.industry = builder.industry;
        this.libraryId = builder.libraryId;
        this.marketId = builder.marketId;
        this.name = builder.name;
        this.provider = builder.provider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibrarySchema create() {
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
     * @return gitGroup
     */
    public String getGitGroup() {
        return this.gitGroup;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
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
     * @return provider
     */
    public Provider getProvider() {
        return this.provider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String artifactId; 
        private Long companyId; 
        private String description; 
        private String gitGroup; 
        private String groupId; 
        private Long id; 
        private String industry; 
        private Long libraryId; 
        private Long marketId; 
        private String name; 
        private Provider provider; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LibrarySchema model) {
            this.artifactId = model.artifactId;
            this.companyId = model.companyId;
            this.description = model.description;
            this.gitGroup = model.gitGroup;
            this.groupId = model.groupId;
            this.id = model.id;
            this.industry = model.industry;
            this.libraryId = model.libraryId;
            this.marketId = model.marketId;
            this.name = model.name;
            this.provider = model.provider;
            this.requestId = model.requestId;
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
         * gitGroup.
         */
        public Builder gitGroup(String gitGroup) {
            this.gitGroup = gitGroup;
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.libraryId = libraryId;
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
         * provider.
         */
        public Builder provider(Provider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LibrarySchema build() {
            return new LibrarySchema(this);
        } 

    } 

}
