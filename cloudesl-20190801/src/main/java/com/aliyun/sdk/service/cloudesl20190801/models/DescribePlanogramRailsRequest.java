// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlanogramRailsRequest} extends {@link RequestModel}
 *
 * <p>DescribePlanogramRailsRequest</p>
 */
public class DescribePlanogramRailsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Layer")
    private String layer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RailCode")
    private String railCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Shelf")
    private String shelf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DescribePlanogramRailsRequest(Builder builder) {
        super(builder);
        this.layer = builder.layer;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.railCode = builder.railCode;
        this.shelf = builder.shelf;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlanogramRailsRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribePlanogramRailsRequest, Builder> {
        private String layer; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String railCode; 
        private String shelf; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlanogramRailsRequest request) {
            super(request);
            this.layer = request.layer;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public DescribePlanogramRailsRequest build() {
            return new DescribePlanogramRailsRequest(this);
        } 

    } 

}
