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
 * {@link GetAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAuthCodeRequest</p>
 */
public class GetAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetAuthCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
        this.bizRegionId = builder.bizRegionId;
        this.resourceType = builder.resourceType;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetAuthCodeRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appVersionId; 
        private String bizRegionId; 
        private String resourceType; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appVersionId = request.appVersionId;
            this.bizRegionId = request.bizRegionId;
            this.resourceType = request.resourceType;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
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
         * <p>The ID of the application to connect to. When specifying this parameter, you must also provide the matching AppVersionId. If omitted, the application configured in the creation or validation environment is used.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the application version to connect to. This parameter is used together with AppId. This parameter is not the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * <p>The region compatibility parameter. The destination region of the current connection resource is determined by the execution region of the task. You cannot use this parameter to switch the task region. Omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The type of resource to connect to.</p>
         * <ul>
         * <li><strong>BUILDER</strong>: Connects to the creation environment.</li>
         * <li><strong>VALIDATE</strong>: Connects to the validation environment.</li>
         * </ul>
         * <p>The corresponding environment must be created and in a connectable state.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILDER</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the existing creation or validation task. Create the task and confirm that the corresponding resources are available before calling this operation.</p>
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
         * <p>The actual task type. It must match the creation or validation task corresponding to the TaskId. Use the TaskType returned by GetTask. The task must also have connectable creation or validation resources. You cannot obtain an authorization code for distribution or snapshot tasks that do not have connection resources.</p>
         * <p>Recognized task types:</p>
         * <ul>
         * <li><strong>AUTO_CREATE_IMAGE_VHD</strong>: Automatically creates a VHD image.</li>
         * <li><strong>RETRY_CREATE_IMAGE_VHD</strong>: Retries VHD image creation.</li>
         * <li><strong>AUTO_CREATE_VHD</strong>: Automatically creates a VHD.</li>
         * <li><strong>RETRY_VHD</strong>: Retries VHD creation.</li>
         * <li><strong>AUTO_VALIDATE_VHD</strong>: Automatically validates a VHD.</li>
         * <li><strong>RETRY_VALIDATE_VHD</strong>: Retries VHD validation.</li>
         * <li><strong>APPLY_VHD_BUILDER</strong>: Applies for a VHD application recording environment.</li>
         * <li><strong>ADAPT_AUTO</strong>: Automatically creates application adaptation.</li>
         * <li><strong>ADAPT_AUTO_RETRY</strong>: Retries automatic application adaptation creation.</li>
         * <li><strong>ADAPT_MANUAL</strong>: Manually creates application adaptation.</li>
         * <li><strong>ADAPT_MANUAL_RETRY</strong>: Retries manual application adaptation creation.</li>
         * <li><strong>DESKTOP_CUSTOM_IMAGE</strong>: Creates a custom image for cloud desktops.</li>
         * <li><strong>DESKTOP_CUSTOM_IMAGE_RETRY</strong>: Retries custom image creation for cloud desktops.</li>
         * <li><strong>IMAGE_MANUAL</strong>: Manually creates an image.</li>
         * <li><strong>IMAGE_MANUAL_RETRY</strong>: Retries manual image creation.</li>
         * <li><strong>IMAGE_FROM_INSTANCE</strong>: Creates an image based on an instance.</li>
         * <li><strong>IMAGE_FROM_INSTANCE_RETRY</strong>: Retries image creation based on an instance.</li>
         * <li><strong>IMAGE_DISTRIBUTE</strong>: Distributes an image to multiple regions.</li>
         * <li><strong>IMAGE_DISTRIBUTE_RETRY</strong>: Retries image distribution.</li>
         * <li><strong>SNAPSHOT_DISTRIBUTE</strong>: Distributes a snapshot to multiple regions.</li>
         * <li><strong>SNAPSHOT_DISTRIBUTE_RETRY</strong>: Retries snapshot distribution.</li>
         * <li><strong>SNAPSHOT_FROM_DISK</strong>: Creates a snapshot based on a disk.</li>
         * <li><strong>SNAPSHOT_FROM_DISK_RETRY</strong>: Retries snapshot creation based on a disk.</li>
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

        @Override
        public GetAuthCodeRequest build() {
            return new GetAuthCodeRequest(this);
        } 

    } 

}
