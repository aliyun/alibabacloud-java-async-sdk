// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEslDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindEslDeviceRequest</p>
 */
public class UnbindEslDeviceRequest extends Request {
    @Body
    @NameInMap("Column")
    private String column;

    @Body
    @NameInMap("ContainerName")
    private String containerName;

    @Body
    @NameInMap("EslBarCode")
    @Validation(required = true)
    private String eslBarCode;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("ItemBarCode")
    private String itemBarCode;

    @Body
    @NameInMap("Layer")
    private Integer layer;

    @Body
    @NameInMap("Shelf")
    private String shelf;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private UnbindEslDeviceRequest(Builder builder) {
        super(builder);
        this.column = builder.column;
        this.containerName = builder.containerName;
        this.eslBarCode = builder.eslBarCode;
        this.extraParams = builder.extraParams;
        this.itemBarCode = builder.itemBarCode;
        this.layer = builder.layer;
        this.shelf = builder.shelf;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEslDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return column
     */
    public String getColumn() {
        return this.column;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return layer
     */
    public Integer getLayer() {
        return this.layer;
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

    public static final class Builder extends Request.Builder<UnbindEslDeviceRequest, Builder> {
        private String column; 
        private String containerName; 
        private String eslBarCode; 
        private String extraParams; 
        private String itemBarCode; 
        private Integer layer; 
        private String shelf; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindEslDeviceRequest request) {
            super(request);
            this.column = request.column;
            this.containerName = request.containerName;
            this.eslBarCode = request.eslBarCode;
            this.extraParams = request.extraParams;
            this.itemBarCode = request.itemBarCode;
            this.layer = request.layer;
            this.shelf = request.shelf;
            this.storeId = request.storeId;
        } 

        /**
         * Column.
         */
        public Builder column(String column) {
            this.putBodyParameter("Column", column);
            this.column = column;
            return this;
        }

        /**
         * ContainerName.
         */
        public Builder containerName(String containerName) {
            this.putBodyParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
            return this;
        }

        /**
         * Layer.
         */
        public Builder layer(Integer layer) {
            this.putBodyParameter("Layer", layer);
            this.layer = layer;
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
        public UnbindEslDeviceRequest build() {
            return new UnbindEslDeviceRequest(this);
        } 

    } 

}
