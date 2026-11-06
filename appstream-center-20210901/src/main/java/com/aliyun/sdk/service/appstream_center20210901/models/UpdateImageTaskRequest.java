// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateImageTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageTaskRequest</p>
 */
public class UpdateImageTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskStep")
    private String taskStep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private UpdateImageTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionId = builder.bizRegionId;
        this.code = builder.code;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskStep = builder.taskStep;
        this.taskType = builder.taskType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageTaskRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStep
     */
    public String getTaskStep() {
        return this.taskStep;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<UpdateImageTaskRequest, Builder> {
        private String regionId; 
        private String bizRegionId; 
        private String code; 
        private String status; 
        private String taskId; 
        private String taskStep; 
        private String taskType; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionId = request.bizRegionId;
            this.code = request.code;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskStep = request.taskStep;
            this.taskType = request.taskType;
            this.versionId = request.versionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> The task region is determined by the associated creation resource. This parameter is not used to switch regions.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not involved in task status updates.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The status identifier reported by the creation resource. It must match the task type and the current creation stage. You cannot directly use the overall task status from GetTask as a substitute.</p>
         * <p>Valid values for image creation tasks (IMAGE_MANUAL and IMAGE_MANUAL_RETRY):</p>
         * <ul>
         * <li><strong>BUILDER_INIT_SUCCESS</strong>: The creation environment is initialized.</li>
         * <li><strong>DOWNLOAD_SUCCESS</strong>: The creation resources are downloaded.</li>
         * <li><strong>DOWNLOAD_FAILED</strong>: The creation resources fail to be downloaded.</li>
         * <li><strong>BUILD_START</strong>: The image creation starts.</li>
         * <li><strong>BUILD_SUCCESS</strong>: The application installation and image configuration are successful.</li>
         * <li><strong>BUILD_FAILED</strong>: The application installation or image configuration fails.</li>
         * <li><strong>BUILD_COMPLETE</strong>: The creation is completed and the subsequent verification process starts.</li>
         * <li><strong>BUILD_COMPLETE_SKIP_VALIDATE</strong>: The creation is completed in compatibility mode. Whether subsequent verification is performed is subject to the task query result.</li>
         * </ul>
         * <p>Valid values for application adaptation tasks:</p>
         * <ul>
         * <li><strong>BUILDER_INIT_SUCCESS</strong>: The creation environment is initialized.</li>
         * <li><strong>DOWNLOAD_SUCCESS</strong>: The application resources are downloaded.</li>
         * <li><strong>DOWNLOAD_FAILED</strong>: The application resources fail to be downloaded.</li>
         * <li><strong>BUILD_START</strong>: The application recording starts.</li>
         * <li><strong>BUILD_SUCCESS</strong>: The application recording is successful.</li>
         * <li><strong>BUILD_FAILED</strong>: The application recording fails.</li>
         * <li><strong>NAS_DISPATCH_SUCCESS</strong>: The application files are distributed to NAS.</li>
         * <li><strong>NAS_DISPATCH_FAILED</strong>: The application files fail to be distributed to NAS.</li>
         * <li><strong>OSS_UPLOAD_SUCCESS</strong>: The application files are uploaded to OSS.</li>
         * <li><strong>OSS_UPLOAD_FAILED</strong>: The application files fail to be uploaded to OSS.</li>
         * <li><strong>UPLOAD_SUCCESS</strong>: The application files are uploaded.</li>
         * <li><strong>UPLOAD_FAILED</strong>: The application files fail to be uploaded.</li>
         * <li><strong>BUILD_COMPLETE</strong>: The application creation is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILD_START</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the task to be updated. The task and its creation resource must already exist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-bp1example****</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not supported for updating the task step.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder taskStep(String taskStep) {
            this.putBodyParameter("TaskStep", taskStep);
            this.taskStep = taskStep;
            return this;
        }

        /**
         * <p>The actual type of the task to be updated. It must match the task corresponding to TaskId. Status updates support the following application adaptation and manual image creation tasks:</p>
         * <ul>
         * <li><strong>ADAPT_AUTO</strong>: Creates an application adaptation automatically.</li>
         * <li><strong>ADAPT_AUTO_RETRY</strong>: Retries the automatic application adaptation.</li>
         * <li><strong>ADAPT_MANUAL</strong>: Creates an application adaptation manually.</li>
         * <li><strong>ADAPT_MANUAL_RETRY</strong>: Retries the manual application adaptation.</li>
         * <li><strong>IMAGE_MANUAL</strong>: Creates an image manually.</li>
         * <li><strong>IMAGE_MANUAL_RETRY</strong>: Retries the manual image creation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_MANUAL</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not supported for modifying the image version associated with the task.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public UpdateImageTaskRequest build() {
            return new UpdateImageTaskRequest(this);
        } 

    } 

}
