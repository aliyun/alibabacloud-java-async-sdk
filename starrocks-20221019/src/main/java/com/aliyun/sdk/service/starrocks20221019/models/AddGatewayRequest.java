// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddGatewayRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayRequest</p>
 */
public class AddGatewayRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeNodeNumber")
    private Integer feNodeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayName")
    private String gatewayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private AddGatewayRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.feNodeNumber = builder.feNodeNumber;
        this.gatewayName = builder.gatewayName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayRequest create() {
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
     * @return feNodeNumber
     */
    public Integer getFeNodeNumber() {
        return this.feNodeNumber;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AddGatewayRequest, Builder> {
        private String regionId; 
        private Integer feNodeNumber; 
        private String gatewayName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.feNodeNumber = request.feNodeNumber;
            this.gatewayName = request.gatewayName;
            this.instanceId = request.instanceId;
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
         * FeNodeNumber.
         */
        public Builder feNodeNumber(Integer feNodeNumber) {
            this.putQueryParameter("FeNodeNumber", feNodeNumber);
            this.feNodeNumber = feNodeNumber;
            return this;
        }

        /**
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.putQueryParameter("GatewayName", gatewayName);
            this.gatewayName = gatewayName;
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

        @Override
        public AddGatewayRequest build() {
            return new AddGatewayRequest(this);
        } 

    } 

}
