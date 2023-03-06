// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcEndpointRequest</p>
 */
public class CreateVpcEndpointRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("serviceId")
    private String serviceId;

    @Body
    @NameInMap("zoneId")
    private String zoneId;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private CreateVpcEndpointRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.serviceId = builder.serviceId;
        this.zoneId = builder.zoneId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateVpcEndpointRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String serviceId; 
        private String zoneId; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcEndpointRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.serviceId = request.serviceId;
            this.zoneId = request.zoneId;
            this.dryRun = request.dryRun;
        } 

        /**
         * es-cn-2r429tctl000d\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 终端节点服务ID
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 可用区ID
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateVpcEndpointRequest build() {
            return new CreateVpcEndpointRequest(this);
        } 

    } 

}
