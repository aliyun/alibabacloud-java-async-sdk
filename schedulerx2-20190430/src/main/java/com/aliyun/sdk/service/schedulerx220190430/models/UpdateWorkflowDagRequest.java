// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWorkflowDagRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowDagRequest</p>
 */
public class UpdateWorkflowDagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dagJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    private UpdateWorkflowDagRequest(Builder builder) {
        super(builder);
        this.dagJson = builder.dagJson;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowDagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dagJson
     */
    public String getDagJson() {
        return this.dagJson;
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

    public static final class Builder extends Request.Builder<UpdateWorkflowDagRequest, Builder> {
        private String dagJson; 
        private String groupId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowDagRequest request) {
            super(request);
            this.dagJson = request.dagJson;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>The directed acyclic graph (DAG) of the workflow, including the information about the nodes and the edges. Specify the value of this parameter in the JSON format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nodes&quot;:[{&quot;id&quot;:2300691},{&quot;id&quot;:10518089},{&quot;id&quot;:1758851}],&quot;edges&quot;:[{&quot;source&quot;:10518089,&quot;target&quot;:1758851},{&quot;source&quot;:10518089,&quot;target&quot;:2300691}]}</p>
         */
        public Builder dagJson(String dagJson) {
            this.putBodyParameter("DagJson", dagJson);
            this.dagJson = dagJson;
            return this;
        }

        /**
         * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace. This parameter is required only for a special third party.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workflowId(String workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public UpdateWorkflowDagRequest build() {
            return new UpdateWorkflowDagRequest(this);
        } 

    } 

}
