// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEslDeviceRequest} extends {@link RequestModel}
 *
 * <p>BindEslDeviceRequest</p>
 */
public class BindEslDeviceRequest extends Request {
    @Body
    @NameInMap("Column")
    private String column;

    @Body
    @NameInMap("ContainerId")
    private String containerId;

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
    @NameInMap("LayoutId")
    private String layoutId;

    @Body
    @NameInMap("LayoutName")
    private String layoutName;

    @Body
    @NameInMap("Shelf")
    private String shelf;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private BindEslDeviceRequest(Builder builder) {
        super(builder);
        this.column = builder.column;
        this.containerId = builder.containerId;
        this.containerName = builder.containerName;
        this.eslBarCode = builder.eslBarCode;
        this.extraParams = builder.extraParams;
        this.itemBarCode = builder.itemBarCode;
        this.layer = builder.layer;
        this.layoutId = builder.layoutId;
        this.layoutName = builder.layoutName;
        this.shelf = builder.shelf;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindEslDeviceRequest create() {
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
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
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
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return layoutName
     */
    public String getLayoutName() {
        return this.layoutName;
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

    public static final class Builder extends Request.Builder<BindEslDeviceRequest, Builder> {
        private String column; 
        private String containerId; 
        private String containerName; 
        private String eslBarCode; 
        private String extraParams; 
        private String itemBarCode; 
        private Integer layer; 
        private String layoutId; 
        private String layoutName; 
        private String shelf; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(BindEslDeviceRequest request) {
            super(request);
            this.column = request.column;
            this.containerId = request.containerId;
            this.containerName = request.containerName;
            this.eslBarCode = request.eslBarCode;
            this.extraParams = request.extraParams;
            this.itemBarCode = request.itemBarCode;
            this.layer = request.layer;
            this.layoutId = request.layoutId;
            this.layoutName = request.layoutName;
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
         * ContainerId.
         */
        public Builder containerId(String containerId) {
            this.putBodyParameter("ContainerId", containerId);
            this.containerId = containerId;
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
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putBodyParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * LayoutName.
         */
        public Builder layoutName(String layoutName) {
            this.putBodyParameter("LayoutName", layoutName);
            this.layoutName = layoutName;
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
        public BindEslDeviceRequest build() {
            return new BindEslDeviceRequest(this);
        } 

    } 

}
