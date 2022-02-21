// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("InitLocalDisk")
    private Boolean initLocalDisk;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.initLocalDisk = builder.initLocalDisk;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Boolean initLocalDisk; 
        private Boolean dryRun; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.initLocalDisk = response.initLocalDisk;
            this.dryRun = response.dryRun;
            this.instanceId = response.instanceId;
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

        /**
         * The ID of the instance to be started.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

}
