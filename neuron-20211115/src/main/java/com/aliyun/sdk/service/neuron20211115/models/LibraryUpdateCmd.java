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
 * {@link LibraryUpdateCmd} extends {@link TeaModel}
 *
 * <p>LibraryUpdateCmd</p>
 */
public class LibraryUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    private String repoUrl;

    private LibraryUpdateCmd(Builder builder) {
        this.artifactId = builder.artifactId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.name = builder.name;
        this.repoUrl = builder.repoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryUpdateCmd create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
        private String description; 
        private String groupId; 
        private Long id; 
        private String name; 
        private String repoUrl; 

        private Builder() {
        } 

        private Builder(LibraryUpdateCmd model) {
            this.artifactId = model.artifactId;
            this.description = model.description;
            this.groupId = model.groupId;
            this.id = model.id;
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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

        public LibraryUpdateCmd build() {
            return new LibraryUpdateCmd(this);
        } 

    } 

}
