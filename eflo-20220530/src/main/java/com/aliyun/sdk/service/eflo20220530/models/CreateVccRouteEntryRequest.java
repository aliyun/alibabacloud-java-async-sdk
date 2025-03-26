// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateVccRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateVccRouteEntryRequest</p>
 */
public class CreateVccRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    private CreateVccRouteEntryRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVccRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    public static final class Builder extends Request.Builder<CreateVccRouteEntryRequest, Builder> {
        private String destinationCidrBlock; 
        private String regionId; 
        private String vccId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVccRouteEntryRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.regionId = request.regionId;
            this.vccId = request.vccId;
        } 

        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.98.112/28</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        @Override
        public CreateVccRouteEntryRequest build() {
            return new CreateVccRouteEntryRequest(this);
        } 

    } 

}
