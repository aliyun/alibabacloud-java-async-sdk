// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnsRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateEnsRouteEntryRequest</p>
 */
public class CreateEnsRouteEntryRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(maxLength = 256, minLength = 2)
    private String description;

    @Query
    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    private String destinationCidrBlock;

    @Query
    @NameInMap("NextHopId")
    @Validation(required = true)
    private String nextHopId;

    @Query
    @NameInMap("NextHopType")
    private String nextHopType;

    @Query
    @NameInMap("RouteEntryName")
    @Validation(maxLength = 128, minLength = 2)
    private String routeEntryName;

    @Query
    @NameInMap("RouteTableId")
    @Validation(required = true)
    private String routeTableId;

    private CreateEnsRouteEntryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.nextHopId = builder.nextHopId;
        this.nextHopType = builder.nextHopType;
        this.routeEntryName = builder.routeEntryName;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnsRouteEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return nextHopId
     */
    public String getNextHopId() {
        return this.nextHopId;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder extends Request.Builder<CreateEnsRouteEntryRequest, Builder> {
        private String description; 
        private String destinationCidrBlock; 
        private String nextHopId; 
        private String nextHopType; 
        private String routeEntryName; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnsRouteEntryRequest request) {
            super(request);
            this.description = request.description;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.nextHopId = request.nextHopId;
            this.nextHopType = request.nextHopType;
            this.routeEntryName = request.routeEntryName;
            this.routeTableId = request.routeTableId;
        } 

        /**
         * The description of the custom route entry.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination CIDR block of the custom route entry. Make sure that the destination CIDR block meets the following requirements:
         * <p>
         * 
         * *   The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.
         * *   The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.
         * *   0.0.0.0/0 indicates the default CIDR block.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * The ID of the next hop of the custom route entry.
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * The type of next hop of the custom route entry. Valid values:
         * <p>
         * 
         * *   Instance (default): an ENS instance.
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * The name of the custom route entry that you want to add. The name must be 1 to 128 characters in length. It cannot start with http:// or https://.
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * The ID of the route table to which you want to add a custom route entry.
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public CreateEnsRouteEntryRequest build() {
            return new CreateEnsRouteEntryRequest(this);
        } 

    } 

}
