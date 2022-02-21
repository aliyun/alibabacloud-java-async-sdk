// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDiskRequest} extends {@link RequestModel}
 *
 * <p>AttachDiskRequest</p>
 */
public class AttachDiskRequest extends Request {
    @Query
    @NameInMap("DeleteWithInstance")
    private String deleteWithInstance;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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

        private Builder(AttachDiskRequest response) {
            super(response);
            this.deleteWithInstance = response.deleteWithInstance;
            this.diskId = response.diskId;
            this.instanceId = response.instanceId;
        } 

        /**
         * DeleteWithInstance.
         */
        public Builder deleteWithInstance(String deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * InstanceId.
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
