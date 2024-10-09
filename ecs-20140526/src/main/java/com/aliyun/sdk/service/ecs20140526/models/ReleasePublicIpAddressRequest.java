// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleasePublicIpAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleasePublicIpAddressRequest</p>
 */
public class ReleasePublicIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <blockquote>
         * <p>This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The public IP address of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><code>121.40.**.**</code></p>
         */
        public Builder publicIpAddress(String publicIpAddress) {
            this.putQueryParameter("PublicIpAddress", publicIpAddress);
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
