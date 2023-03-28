// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicIpAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleasePublicIpAddressRequest</p>
 */
public class ReleasePublicIpAddressRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    private String publicIpAddress;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ReleasePublicIpAddressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.publicIpAddress = builder.publicIpAddress;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicIpAddressRequest create() {
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

    /**
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReleasePublicIpAddressRequest, Builder> {
        private String sourceRegionId; 
        private Boolean dryRun; 
        private String instanceId; 
        private String publicIpAddress; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePublicIpAddressRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.publicIpAddress = request.publicIpAddress;
            this.regionId = request.regionId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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

        /**
         * PublicIpAddress.
         */
        public Builder publicIpAddress(String publicIpAddress) {
            this.putQueryParameter("PublicIpAddress", publicIpAddress);
            this.publicIpAddress = publicIpAddress;
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

        @Override
        public ReleasePublicIpAddressRequest build() {
            return new ReleasePublicIpAddressRequest(this);
        } 

    } 

}
