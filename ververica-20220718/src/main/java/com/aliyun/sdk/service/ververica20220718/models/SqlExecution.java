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
 * {@link SqlExecution} extends {@link TeaModel}
 *
 * <p>SqlExecution</p>
 */
public class SqlExecution extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("batchMode")
    private Boolean batchMode;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    private String sessionClusterName;

    @com.aliyun.core.annotation.NameInMap("sqlExecutionId")
    private String sqlExecutionId;

    @com.aliyun.core.annotation.NameInMap("sqlFileId")
    private String sqlFileId;

    @com.aliyun.core.annotation.NameInMap("sqlScript")
    private String sqlScript;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("statements")
    private java.util.List<SqlStatement> statements;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private SqlExecution(Builder builder) {
        this.batchMode = builder.batchMode;
        this.description = builder.description;
        this.message = builder.message;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.sessionClusterName = builder.sessionClusterName;
        this.sqlExecutionId = builder.sqlExecutionId;
        this.sqlFileId = builder.sqlFileId;
        this.sqlScript = builder.sqlScript;
        this.state = builder.state;
        this.statements = builder.statements;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlExecution create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchMode
     */
    public Boolean getBatchMode() {
        return this.batchMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return sqlExecutionId
     */
    public String getSqlExecutionId() {
        return this.sqlExecutionId;
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return statements
     */
    public java.util.List<SqlStatement> getStatements() {
        return this.statements;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Boolean batchMode; 
        private String description; 
        private String message; 
        private String name; 
        private String namespace; 
        private String sessionClusterName; 
        private String sqlExecutionId; 
        private String sqlFileId; 
        private String sqlScript; 
        private String state; 
        private java.util.List<SqlStatement> statements; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(SqlExecution model) {
            this.batchMode = model.batchMode;
            this.description = model.description;
            this.message = model.message;
            this.name = model.name;
            this.namespace = model.namespace;
            this.sessionClusterName = model.sessionClusterName;
            this.sqlExecutionId = model.sqlExecutionId;
            this.sqlFileId = model.sqlFileId;
            this.sqlScript = model.sqlScript;
            this.state = model.state;
            this.statements = model.statements;
            this.workspace = model.workspace;
        } 

        /**
         * batchMode.
         */
        public Builder batchMode(Boolean batchMode) {
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * sessionClusterName.
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * sqlExecutionId.
         */
        public Builder sqlExecutionId(String sqlExecutionId) {
            this.sqlExecutionId = sqlExecutionId;
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
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * statements.
         */
        public Builder statements(java.util.List<SqlStatement> statements) {
            this.statements = statements;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public SqlExecution build() {
            return new SqlExecution(this);
        } 

    } 

}
