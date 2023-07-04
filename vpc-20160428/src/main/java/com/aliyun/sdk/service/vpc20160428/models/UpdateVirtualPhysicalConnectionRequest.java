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

        private Builder(UpdateVirtualPhysicalConnectionRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.expectSpec = request.expectSpec;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vlanId = request.vlanId;
        } 

        /**
         * The region ID of the hosted connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder expectSpec(String expectSpec) {
            this.putQueryParameter("ExpectSpec", expectSpec);
            this.expectSpec = expectSpec;
            return this;
        }

        /**
         * Specifies whether to check the request without performing the operation. Valid values:
         * <p>
         * 
         * *   **true**: checks the request without performing the operation. The VLAN ID of the hosted connection is not changed. The system checks the required parameters, request syntax, and instance status. If the check fails, the corresponding error message is returned. If the request passes the check, the system returns the ID of the request.
         * *   **false** (default): sends the request. If the request passes the check, the VLAN ID of the hosted connection is changed.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Indicates whether the VLAN ID of the hosted connection is changed. Valid values:
         * <p>
         * 
         * *   **true**: The VLAN ID of the hosted connection is changed.
         * *   **false**: The VLAN ID of the hosted connection is not changed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The estimated bandwidth value of the hosted connection. The estimated bandwidth value takes effect after the payment is completed.
         * <p>
         * 
         * Valid values: **50M**, **100M**, **200M**, **300M**, **400M**, **500M**, **1G**, **2G**, **5G**, **8G**, and **10G**.
         * 
         * >  By default, the values of **2G**, **5G**, **8G**, and **10G** are unavailable. If you want to specify these values, contact your customer manager.
         * 
         * **M** indicates Mbit/s and **G** indicates Gbit/s.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses **RequestId** as **ClientToken**. The value of **RequestId** in each API request may be different.
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
