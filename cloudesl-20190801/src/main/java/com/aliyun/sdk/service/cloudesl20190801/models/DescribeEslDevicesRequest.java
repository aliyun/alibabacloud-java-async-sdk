// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEslDevicesRequest</p>
 */
public class DescribeEslDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeBind")
    private Boolean beBind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslStatus")
    private String eslStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromBatteryLevel")
    private Integer fromBatteryLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShelfCode")
    private String shelfCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToBatteryLevel")
    private Integer toBatteryLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private DescribeEslDevicesRequest(Builder builder) {
        super(builder);
        this.beBind = builder.beBind;
        this.eslBarCode = builder.eslBarCode;
        this.eslStatus = builder.eslStatus;
        this.fromBatteryLevel = builder.fromBatteryLevel;
        this.itemBarCode = builder.itemBarCode;
        this.mac = builder.mac;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shelfCode = builder.shelfCode;
        this.storeId = builder.storeId;
        this.toBatteryLevel = builder.toBatteryLevel;
        this.type = builder.type;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beBind
     */
    public Boolean getBeBind() {
        return this.beBind;
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return eslStatus
     */
    public String getEslStatus() {
        return this.eslStatus;
    }

    /**
     * @return fromBatteryLevel
     */
    public Integer getFromBatteryLevel() {
        return this.fromBatteryLevel;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
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
     * @return shelfCode
     */
    public String getShelfCode() {
        return this.shelfCode;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return toBatteryLevel
     */
    public Integer getToBatteryLevel() {
        return this.toBatteryLevel;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<DescribeEslDevicesRequest, Builder> {
        private Boolean beBind; 
        private String eslBarCode; 
        private String eslStatus; 
        private Integer fromBatteryLevel; 
        private String itemBarCode; 
        private String mac; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String shelfCode; 
        private String storeId; 
        private Integer toBatteryLevel; 
        private String type; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEslDevicesRequest request) {
            super(request);
            this.beBind = request.beBind;
            this.eslBarCode = request.eslBarCode;
            this.eslStatus = request.eslStatus;
            this.fromBatteryLevel = request.fromBatteryLevel;
            this.itemBarCode = request.itemBarCode;
            this.mac = request.mac;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shelfCode = request.shelfCode;
            this.storeId = request.storeId;
            this.toBatteryLevel = request.toBatteryLevel;
            this.type = request.type;
            this.vendor = request.vendor;
        } 

        /**
         * BeBind.
         */
        public Builder beBind(Boolean beBind) {
            this.putBodyParameter("BeBind", beBind);
            this.beBind = beBind;
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
         * EslStatus.
         */
        public Builder eslStatus(String eslStatus) {
            this.putBodyParameter("EslStatus", eslStatus);
            this.eslStatus = eslStatus;
            return this;
        }

        /**
         * FromBatteryLevel.
         */
        public Builder fromBatteryLevel(Integer fromBatteryLevel) {
            this.putBodyParameter("FromBatteryLevel", fromBatteryLevel);
            this.fromBatteryLevel = fromBatteryLevel;
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
         * Mac.
         */
        public Builder mac(String mac) {
            this.putBodyParameter("Mac", mac);
            this.mac = mac;
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
         * ShelfCode.
         */
        public Builder shelfCode(String shelfCode) {
            this.putBodyParameter("ShelfCode", shelfCode);
            this.shelfCode = shelfCode;
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

        /**
         * ToBatteryLevel.
         */
        public Builder toBatteryLevel(Integer toBatteryLevel) {
            this.putBodyParameter("ToBatteryLevel", toBatteryLevel);
            this.toBatteryLevel = toBatteryLevel;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public DescribeEslDevicesRequest build() {
            return new DescribeEslDevicesRequest(this);
        } 

    } 

}
