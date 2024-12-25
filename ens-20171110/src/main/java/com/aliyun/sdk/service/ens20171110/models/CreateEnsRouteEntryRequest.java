// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateEnsRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateEnsRouteEntryRequest</p>
 */
public class CreateEnsRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String routeEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description of the custom route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block of the custom route entry. Make sure that the destination CIDR block meets the following requirements:</p>
         * <ul>
         * <li>The destination CIDR block is not 100.64.0.0/10 or a subset of 100.64.0.0/10.</li>
         * <li>The destination CIDR block of the custom route entry is different from the destination CIDR blocks of other route entries in the same route table.</li>
         * <li>0.0.0.0/0 indicates the default CIDR block.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the next hop of the custom route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5vb7leks9z4mxy1ay258</p>
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * <p>The type of next hop of the custom route entry. Valid values:</p>
         * <ul>
         * <li>Instance (default): an ENS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * <p>The name of the custom route entry that you want to add. The name must be 1 to 128 characters in length. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * <p>The ID of the route table to which you want to add a custom route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1cifr72dioje82lse2j</p>
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
