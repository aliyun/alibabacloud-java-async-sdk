// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeLayer4RulePolicyRequest</p>
 */
public class DescribeLayer4RulePolicyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    private DescribeLayer4RulePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulePolicyRequest create() {
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
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<DescribeLayer4RulePolicyRequest, Builder> {
        private String regionId; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLayer4RulePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
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
         * The port forwarding rule that you want to query.
         * <p>
         * 
         * This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can query only one port forwarding rule at a time.
         * 
         * > You can call the [DescribeNetworkRules](~~157484~~) to query existing port forwarding rules.
         * 
         * Each port forwarding rule contains the following fields:
         * 
         * *   **InstanceId**: the ID of the instance. This field is required and must be of the string type.
         * *   **Protocol**: the forwarding protocol. This field is required and must be of the string type. Valid values: **tcp** and **udp**.
         * *   **FrontendPort**: the forwarding port. This field is required and must be of the integer type.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public DescribeLayer4RulePolicyRequest build() {
            return new DescribeLayer4RulePolicyRequest(this);
        } 

    } 

}
