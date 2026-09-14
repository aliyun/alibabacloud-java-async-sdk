// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
    private Long projectId;

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
    public Long getProjectId() {
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
        private Long projectId; 
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
         * <p>The unique identifier of a container in which you want to create the node. The container can be a workflow or a container node. Specify this parameter when you need to create the node inside a container.</p>
         * <blockquote>
         * <p>Notice: If this parameter is specified, the path field defined in FlowSpec becomes invalid.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. Only when you upgrade across SDK version 8.0.0, the type change may cause project compilation failures, and you need to manually correct the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23451286945488XXXX</p>
         */
        public Builder containerId(String containerId) {
            this.putBodyParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API call operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The scenario in which the node is created. This parameter determines whether the node is created in the manual node area or the data development area. DATAWORKS_MANUAL_WORKFLOW can be used only when ContainerId is specified and the container is a manual workflow.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DATAWORKS_PROJECT: project directory.</li>
         * <li>DATAWORKS_MANUAL_WORKFLOW: manual workflow.</li>
         * <li>DATAWORKS_MANUAL_TASK: manual task.</li>
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
         * <p>The FlowSpec information that describes the node. For more information about the specification, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
         * <blockquote>
         * <p>How to quickly obtain a FlowSpec template?</p>
         * <ul>
         * <li>In DataStudio, open a node, click Versions on the right side, view the latest version, and then view the scheduling configuration. This provides the FlowSpec description for the current node. You can use the FlowSpec description in the version to quickly build a template that meets your requirements.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>How to specify the node content?</p>
         * <ul>
         * <li>Specify the node content in the $.spec.nodes[*].script.content field.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>How to configure the content of a batch synchronization node?</p>
         * <ul>
         * <li>Write a script by following Step 4 in <a href="https://www.alibabacloud.com/help/en/dataworks/user-guide/configure-a-batch-synchronization-node-by-using-the-code-editor">Configure a batch synchronization node by using the code editor</a>, and specify the content in the $.spec.nodes[*].script.content field. Alternatively, create a batch synchronization node on the page and obtain the script content by viewing the version.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;kind&quot;: &quot;Node&quot;,
         *     &quot;spec&quot;: {
         *         &quot;nodes&quot;: [
         *             {
         *                 &quot;recurrence&quot;: &quot;Normal&quot;,
         *                 &quot;timeout&quot;: 0,
         *                 &quot;instanceMode&quot;: &quot;T+1&quot;,
         *                 &quot;rerunMode&quot;: &quot;Allowed&quot;,
         *                 &quot;rerunTimes&quot;: 3,
         *                 &quot;rerunInterval&quot;: 180000,
         *                 &quot;datasource&quot;: {
         *                     &quot;name&quot;: &quot;odps_test&quot;
         *                 },
         *                 &quot;script&quot;: {
         *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/odpsSQL_Test&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;ODPS_SQL&quot;
         *                     },
         *                     &quot;content&quot;: &quot;select now();&quot;
         *                 },
         *                 &quot;trigger&quot;: {
         *                     &quot;type&quot;: &quot;Scheduler&quot;,
         *                     &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
         *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
         *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
         *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
         *                     &quot;delaySeconds&quot;: 0
         *                 },
         *                 &quot;runtimeResource&quot;: {
         *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
         *                 },
         *                 &quot;name&quot;: &quot;odpsSQL_Test&quot;,
         *                 &quot;inputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;project_root&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;
         *                         }
         *                     ]
         *                 },
         *                 &quot;outputs&quot;: {
         *                     &quot;nodeOutputs&quot;: [
         *                         {
         *                             &quot;data&quot;: &quot;output_data&quot;,
         *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
         *                             &quot;refTableName&quot;: &quot;odpsSQL_Test&quot;
         *                         }
         *                     ]
         *                 }
         *             }
         *         ]
         *     }
         * }</p>
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
