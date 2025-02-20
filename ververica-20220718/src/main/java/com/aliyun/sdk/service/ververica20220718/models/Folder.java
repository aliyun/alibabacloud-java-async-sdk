// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Folder} extends {@link TeaModel}
 *
 * <p>Folder</p>
 */
public class Folder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.NameInMap("subFolder")
    private java.util.List<SubFolder> subFolder;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private Folder(Builder builder) {
        this.createdAt = builder.createdAt;
        this.folderId = builder.folderId;
        this.modifiedAt = builder.modifiedAt;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentId = builder.parentId;
        this.subFolder = builder.subFolder;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Folder create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return subFolder
     */
    public java.util.List<SubFolder> getSubFolder() {
        return this.subFolder;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Long createdAt; 
        private String folderId; 
        private Long modifiedAt; 
        private String name; 
        private String namespace; 
        private String parentId; 
        private java.util.List<SubFolder> subFolder; 
        private String workspace; 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * subFolder.
         */
        public Builder subFolder(java.util.List<SubFolder> subFolder) {
            this.subFolder = subFolder;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public Folder build() {
            return new Folder(this);
        } 

    } 

}
