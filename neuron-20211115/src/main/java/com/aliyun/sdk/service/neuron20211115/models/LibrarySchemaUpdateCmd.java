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
 * {@link LibrarySchemaUpdateCmd} extends {@link TeaModel}
 *
 * <p>LibrarySchemaUpdateCmd</p>
 */
public class LibrarySchemaUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gitGroup")
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    private LibrarySchemaUpdateCmd(Builder builder) {
        this.artifactId = builder.artifactId;
        this.description = builder.description;
        this.gitGroup = builder.gitGroup;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibrarySchemaUpdateCmd create() {
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
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
    }

    public static final class Builder {
        private String artifactId; 
        private String description; 
        private String gitGroup; 
        private String groupId; 
        private Long id; 
        private Long libraryId; 

        private Builder() {
        } 

        private Builder(LibrarySchemaUpdateCmd model) {
            this.artifactId = model.artifactId;
            this.description = model.description;
            this.gitGroup = model.gitGroup;
            this.groupId = model.groupId;
            this.id = model.id;
            this.libraryId = model.libraryId;
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
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.libraryId = libraryId;
            return this;
        }

        public LibrarySchemaUpdateCmd build() {
            return new LibrarySchemaUpdateCmd(this);
        } 

    } 

}
