// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDiskRequest} extends {@link RequestModel}
 *
 * <p>AttachDiskRequest</p>
 */
public class AttachDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
    private String deleteWithInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private AttachDiskRequest(Builder builder) {
        super(builder);
        this.deleteWithInstance = builder.deleteWithInstance;
        this.diskId = builder.diskId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteWithInstance
     */
    public String getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AttachDiskRequest, Builder> {
        private String deleteWithInstance; 
        private String diskId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDiskRequest request) {
            super(request);
            this.deleteWithInstance = request.deleteWithInstance;
            this.diskId = request.diskId;
            this.instanceId = request.instanceId;
        } 

        /**
         * Specifies whether the disk to be attached is released with the instance. Valid values:
         * <p>
         * 
         * *   true: The disk will be released when the ECS instance is released.
         * *   false: The disk will be retained when the ECS instance is released.
         * *   If you leave this parameter empty, the default value is used.
         */
        public Builder deleteWithInstance(String deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * The ID of the disk to be attached. The cloud disk and the instance must belong to the same node.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public AttachDiskRequest build() {
            return new AttachDiskRequest(this);
        } 

    } 

}
