// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkRulesRequest</p>
 */
public class CreateNetworkRulesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NetworkRules")
    @Validation(required = true)
    private String networkRules;

    private CreateNetworkRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkRules = builder.networkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return networkRules
     */
    public String getNetworkRules() {
        return this.networkRules;
    }

    public static final class Builder extends Request.Builder<CreateNetworkRulesRequest, Builder> {
        private String regionId; 
        private String networkRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.networkRules = request.networkRules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The details of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.
         * *   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.
         * *   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.
         * *   **BackendPort**: the port of the origin server. This field is required and must be of the INTEGER type.
         * *   **RealServers**: the IP addresses of the origin server. This field is required and must be a JSON array. You can specify up to 20 IP addresses.
         */
        public Builder networkRules(String networkRules) {
            this.putQueryParameter("NetworkRules", networkRules);
            this.networkRules = networkRules;
            return this;
        }

        @Override
        public CreateNetworkRulesRequest build() {
            return new CreateNetworkRulesRequest(this);
        } 

    } 

}
