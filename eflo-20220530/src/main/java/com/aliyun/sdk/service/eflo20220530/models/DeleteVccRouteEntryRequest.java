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
 * {@link DeleteVccRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteVccRouteEntryRequest</p>
 */
public class DeleteVccRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccRouteEntryId")
    private String vccRouteEntryId;

    private DeleteVccRouteEntryRequest(Builder builder) {
        super(builder);
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
        this.vccRouteEntryId = builder.vccRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVccRouteEntryRequest create() {
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

    /**
     * @return vccRouteEntryId
     */
    public String getVccRouteEntryId() {
        return this.vccRouteEntryId;
    }

    public static final class Builder extends Request.Builder<DeleteVccRouteEntryRequest, Builder> {
        private String destinationCidrBlock; 
        private String regionId; 
        private String vccId; 
        private String vccRouteEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVccRouteEntryRequest request) {
            super(request);
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.regionId = request.regionId;
            this.vccId = request.vccId;
            this.vccRouteEntryId = request.vccRouteEntryId;
        } 

        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.199.128/25</p>
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

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-rte-5cey1sap</p>
         */
        public Builder vccRouteEntryId(String vccRouteEntryId) {
            this.putBodyParameter("VccRouteEntryId", vccRouteEntryId);
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }

        @Override
        public DeleteVccRouteEntryRequest build() {
            return new DeleteVccRouteEntryRequest(this);
        } 

    } 

}
