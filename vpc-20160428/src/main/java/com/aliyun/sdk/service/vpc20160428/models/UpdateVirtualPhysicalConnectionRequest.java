// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVirtualPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirtualPhysicalConnectionRequest</p>
 */
public class UpdateVirtualPhysicalConnectionRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ExpectSpec")
    private String expectSpec;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VlanId")
    @Validation(required = true)
    private Long vlanId;

    private UpdateVirtualPhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.expectSpec = builder.expectSpec;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vlanId = builder.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualPhysicalConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return expectSpec
     */
    public String getExpectSpec() {
        return this.expectSpec;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vlanId
     */
    public Long getVlanId() {
        return this.vlanId;
    }

    public static final class Builder extends Request.Builder<UpdateVirtualPhysicalConnectionRequest, Builder> {
        private Boolean dryRun; 
        private String expectSpec; 
        private String instanceId; 
        private String regionId; 
        private String token; 
        private Long vlanId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirtualPhysicalConnectionRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.expectSpec = response.expectSpec;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.token = response.token;
            this.vlanId = response.vlanId;
        } 

        /**
         * DryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ExpectSpec
         */
        public Builder expectSpec(String expectSpec) {
            this.putQueryParameter("ExpectSpec", expectSpec);
            this.expectSpec = expectSpec;
            return this;
        }

        /**
         * Vpconn的实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * 幂等Token
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * vpconn的VlanID
         */
        public Builder vlanId(Long vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public UpdateVirtualPhysicalConnectionRequest build() {
            return new UpdateVirtualPhysicalConnectionRequest(this);
        } 

    } 

}
