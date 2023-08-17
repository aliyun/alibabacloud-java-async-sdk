// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcPeerConnectionRequest</p>
 */
public class ModifyVpcPeerConnectionRequest extends Request {
    @Body
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Name")
    private String name;

    private ModifyVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcPeerConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyVpcPeerConnectionRequest, Builder> {
        private Integer bandwidth; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcPeerConnectionRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.name = request.name;
        } 

        /**
         * The new bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new description of the VPC peering connection.
         * <p>
         * 
         * The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to only precheck the request. Valid values:
         * <p>
         * 
         * *   **true**: checks the request without performing the operation. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the VPC peering connection whose name or description you want to modify.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new name of the VPC peering connection.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyVpcPeerConnectionRequest build() {
            return new ModifyVpcPeerConnectionRequest(this);
        } 

    } 

}
