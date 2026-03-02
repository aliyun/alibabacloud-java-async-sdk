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
 * {@link SqlFile} extends {@link TeaModel}
 *
 * <p>SqlFile</p>
 */
public class SqlFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("batchMode")
    private String batchMode;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    private String sessionClusterName;

    @com.aliyun.core.annotation.NameInMap("sqlFileId")
    private String sqlFileId;

    @com.aliyun.core.annotation.NameInMap("sqlScript")
    private String sqlScript;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private SqlFile(Builder builder) {
        this.batchMode = builder.batchMode;
        this.description = builder.description;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentId = builder.parentId;
        this.sessionClusterName = builder.sessionClusterName;
        this.sqlFileId = builder.sqlFileId;
        this.sqlScript = builder.sqlScript;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchMode
     */
    public String getBatchMode() {
        return this.batchMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return sqlFileId
     */
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    /**
     * @return sqlScript
     */
    public String getSqlScript() {
        return this.sqlScript;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String batchMode; 
        private String description; 
        private String name; 
        private String namespace; 
        private String parentId; 
        private String sessionClusterName; 
        private String sqlFileId; 
        private String sqlScript; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(SqlFile model) {
            this.batchMode = model.batchMode;
            this.description = model.description;
            this.name = model.name;
            this.namespace = model.namespace;
            this.parentId = model.parentId;
            this.sessionClusterName = model.sessionClusterName;
            this.sqlFileId = model.sqlFileId;
            this.sqlScript = model.sqlScript;
            this.workspace = model.workspace;
        } 

        /**
         * batchMode.
         */
        public Builder batchMode(String batchMode) {
            this.batchMode = batchMode;
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
         * sessionClusterName.
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * sqlFileId.
         */
        public Builder sqlFileId(String sqlFileId) {
            this.sqlFileId = sqlFileId;
            return this;
        }

        /**
         * sqlScript.
         */
        public Builder sqlScript(String sqlScript) {
            this.sqlScript = sqlScript;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SqlFile build() {
            return new SqlFile(this);
        } 

    } 

}
