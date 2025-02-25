// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MapPlanogramRailRequest} extends {@link RequestModel}
 *
 * <p>MapPlanogramRailRequest</p>
 */
public class MapPlanogramRailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Layer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RailCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String railCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Shelf")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shelf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private MapPlanogramRailRequest(Builder builder) {
        super(builder);
        this.layer = builder.layer;
        this.railCode = builder.railCode;
        this.shelf = builder.shelf;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MapPlanogramRailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layer
     */
    public String getLayer() {
        return this.layer;
    }

    /**
     * @return railCode
     */
    public String getRailCode() {
        return this.railCode;
    }

    /**
     * @return shelf
     */
    public String getShelf() {
        return this.shelf;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<MapPlanogramRailRequest, Builder> {
        private String layer; 
        private String railCode; 
        private String shelf; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(MapPlanogramRailRequest request) {
            super(request);
            this.layer = request.layer;
            this.railCode = request.railCode;
            this.shelf = request.shelf;
            this.storeId = request.storeId;
        } 

        /**
         * Layer.
         */
        public Builder layer(String layer) {
            this.putBodyParameter("Layer", layer);
            this.layer = layer;
            return this;
        }

        /**
         * RailCode.
         */
        public Builder railCode(String railCode) {
            this.putBodyParameter("RailCode", railCode);
            this.railCode = railCode;
            return this;
        }

        /**
         * Shelf.
         */
        public Builder shelf(String shelf) {
            this.putBodyParameter("Shelf", shelf);
            this.shelf = shelf;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public MapPlanogramRailRequest build() {
            return new MapPlanogramRailRequest(this);
        } 

    } 

}
