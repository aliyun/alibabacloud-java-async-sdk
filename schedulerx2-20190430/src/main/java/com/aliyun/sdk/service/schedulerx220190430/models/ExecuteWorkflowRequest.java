// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteWorkflowRequest} extends {@link RequestModel}
 *
 * <p>ExecuteWorkflowRequest</p>
 */
public class ExecuteWorkflowRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceParameters")
    private String instanceParameters;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("WorkflowId")
    @Validation(required = true)
    private Long workflowId;

    private ExecuteWorkflowRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceParameters = builder.instanceParameters;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteWorkflowRequest create() {
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
     * @return instanceParameters
     */
    public String getInstanceParameters() {
        return this.instanceParameters;
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
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<ExecuteWorkflowRequest, Builder> {
        private String groupId; 
        private String instanceParameters; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteWorkflowRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceParameters = request.instanceParameters;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.workflowId = request.workflowId;
        } 

        /**
         * The ID of the application. You can obtain the application ID on the Application Management page in Distributed Task Scheduling Platform.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The dynamic parameter of the workflow instance. The parameter must be 1 to 1,000 bytes in length.
         */
        public Builder instanceParameters(String instanceParameters) {
            this.putQueryParameter("InstanceParameters", instanceParameters);
            this.instanceParameters = instanceParameters;
            return this;
        }

        /**
         * The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in Distributed Task Scheduling Platform.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the workflow.
         */
        public Builder workflowId(Long workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public ExecuteWorkflowRequest build() {
            return new ExecuteWorkflowRequest(this);
        } 

    } 

}
