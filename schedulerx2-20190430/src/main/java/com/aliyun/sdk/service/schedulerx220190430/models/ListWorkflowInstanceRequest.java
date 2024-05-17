// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowInstanceRequest</p>
 */
public class ListWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    private ListWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowInstanceRequest, Builder> {
        private String groupId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowInstanceRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.workflowId = request.workflowId;
        } 

        /**
         * The application group ID. You can obtain the ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The workflow ID.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public ListWorkflowInstanceRequest build() {
            return new ListWorkflowInstanceRequest(this);
        } 

    } 

}
