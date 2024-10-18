// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteRequest</p>
 */
public class CreateRouteRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long networkId;

    private CreateRouteRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationCidr = builder.destinationCidr;
        this.networkId = builder.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteRequest create() {
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
     * @return destinationCidr
     */
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    /**
     * @return networkId
     */
    public Long getNetworkId() {
        return this.networkId;
    }

    public static final class Builder extends Request.Builder<CreateRouteRequest, Builder> {
        private String regionId; 
        private String destinationCidr; 
        private Long networkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationCidr = request.destinationCidr;
            this.networkId = request.networkId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder destinationCidr(String destinationCidr) {
            this.putBodyParameter("DestinationCidr", destinationCidr);
            this.destinationCidr = destinationCidr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder networkId(Long networkId) {
            this.putBodyParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        @Override
        public CreateRouteRequest build() {
            return new CreateRouteRequest(this);
        } 

    } 

}
