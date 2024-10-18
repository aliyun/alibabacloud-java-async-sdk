// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeRequest</p>
 */
public class CreateNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContainerId")
    private String containerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private CreateNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.containerId = builder.containerId;
        this.projectId = builder.projectId;
        this.scene = builder.scene;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<CreateNodeRequest, Builder> {
        private String regionId; 
        private String containerId; 
        private String projectId; 
        private String scene; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.containerId = request.containerId;
            this.projectId = request.projectId;
            this.scene = request.scene;
            this.spec = request.spec;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The container ID. If you want to create a node in a container, you must configure this parameter to specify the container. The container can be a workflow or a node in a container.</p>
         * <blockquote>
         * <p> If you configure this parameter, the path field defined in FlowSpec becomes invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
         */
        public Builder containerId(String containerId) {
            this.putBodyParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The scene of the node. This parameter determines the location (the DataStudio pane or the Manual pane) of the node. You can set this parameter to DATAWORKS_MANUAL_WORKFLOW only if the ContainerId parameter is configured and the container specified by ContainerId is a manually triggered workflow.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DATAWORKS_PROJECT</li>
         * <li>DATAWORKS_MANUAL_WORKFLOW</li>
         * <li>DATAWORKS_MANUAL_TASK</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATAWORKS_PROJECT</p>
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The FlowSpec field information about the node. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateNodeRequest build() {
            return new CreateNodeRequest(this);
        } 

    } 

}
