// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDiskRequest} extends {@link RequestModel}
 *
 * <p>DetachDiskRequest</p>
 */
public class DetachDiskRequest extends Request {
    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DetachDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DetachDiskRequest, Builder> {
        private String diskId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DetachDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the disk.
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
        public DetachDiskRequest build() {
            return new DetachDiskRequest(this);
        } 

    } 

}
