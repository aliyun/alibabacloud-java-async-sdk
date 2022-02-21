// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkFlowRequest} extends {@link RequestModel}
 *
 * <p>GetWorkFlowRequest</p>
 */
public class GetWorkFlowRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("WorkflowId")
    @Validation(required = true)
    private Long workflowId;

    private GetWorkFlowRequest(Builder builder) {
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

    public static GetWorkFlowRequest create() {
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
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<GetWorkFlowRequest, Builder> {
        private String groupId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkFlowRequest response) {
            super(response);
            this.groupId = response.groupId;
            this.namespace = response.namespace;
            this.namespaceSource = response.namespaceSource;
            this.regionId = response.regionId;
            this.workflowId = response.workflowId;
        } 

        /**
         * 应用分组ID
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 命名空间uid
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * 命名空间来源
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
         * 工作流ID
         */
        public Builder workflowId(Long workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public GetWorkFlowRequest build() {
            return new GetWorkFlowRequest(this);
        } 

    } 

}
