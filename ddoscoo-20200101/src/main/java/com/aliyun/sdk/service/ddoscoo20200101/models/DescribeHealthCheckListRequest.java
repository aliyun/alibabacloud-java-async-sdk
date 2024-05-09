// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHealthCheckListRequest</p>
 */
public class DescribeHealthCheckListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkRules;

    private DescribeHealthCheckListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkRules = builder.networkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHealthCheckListRequest, Builder> {
        private String regionId; 
        private String networkRules; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHealthCheckListRequest request) {
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
         * The information about the port forwarding rule. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.
         * *   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.
         * *   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.
         */
        public Builder networkRules(String networkRules) {
            this.putQueryParameter("NetworkRules", networkRules);
            this.networkRules = networkRules;
            return this;
        }

        @Override
        public DescribeHealthCheckListRequest build() {
            return new DescribeHealthCheckListRequest(this);
        } 

    } 

}
