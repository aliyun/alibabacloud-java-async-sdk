// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @Query
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InitLocalDisk")
    private Boolean initLocalDisk;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.initLocalDisk = builder.initLocalDisk;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return initLocalDisk
     */
    public Boolean getInitLocalDisk() {
        return this.initLocalDisk;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private Boolean initLocalDisk; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.initLocalDisk = request.initLocalDisk;
            this.dryRun = request.dryRun;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance to be started.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * This parameter is applicable to instances that contain local disks, such as d1, i1, or i2. When the local disk of d1, i1, or i2 fails, you can use this parameter to specify whether to restore the instance to its original health status when the instance is started. Valid values:
         * <p>
         * 
         * -true: restore the instance to its original health status, and the data in the original local disk of the instance will be lost.
         * -false: no processing is performed to maintain the status quo.
         * 
         * Default value: false.
         */
        public Builder initLocalDisk(Boolean initLocalDisk) {
            this.putQueryParameter("InitLocalDisk", initLocalDisk);
            this.initLocalDisk = initLocalDisk;
            return this;
        }

        /**
         * Indicates whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: only this request is checked and the instance is not started. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false: a normal request is sent. After the request passes the check, the HTTP status code 2XX is returned and the instance is started.
         * 
         * Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

}
