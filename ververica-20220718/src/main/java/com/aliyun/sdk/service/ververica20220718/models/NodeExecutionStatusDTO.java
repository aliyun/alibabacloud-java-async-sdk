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
 * {@link NodeExecutionStatusDTO} extends {@link TeaModel}
 *
 * <p>NodeExecutionStatusDTO</p>
 */
public class NodeExecutionStatusDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("executionId")
    private String executionId;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private NodeExecutionStatusDTO(Builder builder) {
        this.executionId = builder.executionId;
        this.namespace = builder.namespace;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
        this.type = builder.type;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeExecutionStatusDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String executionId; 
        private String namespace; 
        private String resourceId; 
        private String status; 
        private String type; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(NodeExecutionStatusDTO model) {
            this.executionId = model.executionId;
            this.namespace = model.namespace;
            this.resourceId = model.resourceId;
            this.status = model.status;
            this.type = model.type;
            this.workspace = model.workspace;
        } 

        /**
         * executionId.
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
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
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public NodeExecutionStatusDTO build() {
            return new NodeExecutionStatusDTO(this);
        } 

    } 

}
