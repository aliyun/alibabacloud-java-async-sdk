// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEslDevicesResponseBody</p>
 */
public class DescribeEslDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("EslDevices")
    private EslDevices eslDevices;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEslDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.eslDevices = builder.eslDevices;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return eslDevices
     */
    public EslDevices getEslDevices() {
        return this.eslDevices;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private EslDevices eslDevices; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * EslDevices.
         */
        public Builder eslDevices(EslDevices eslDevices) {
            this.eslDevices = eslDevices;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEslDevicesResponseBody build() {
            return new DescribeEslDevicesResponseBody(this);
        } 

    } 

    public static class EslDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatteryLevel")
        private Integer batteryLevel;

        @com.aliyun.core.annotation.NameInMap("BeBind")
        private Boolean beBind;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private String companyId;

        @com.aliyun.core.annotation.NameInMap("ConnectAp")
        private String connectAp;

        @com.aliyun.core.annotation.NameInMap("EslBarCode")
        private String eslBarCode;

        @com.aliyun.core.annotation.NameInMap("EslStatus")
        private String eslStatus;

        @com.aliyun.core.annotation.NameInMap("ItemActionPrice")
        private Integer itemActionPrice;

        @com.aliyun.core.annotation.NameInMap("ItemBarCode")
        private String itemBarCode;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemPriceUnit")
        private String itemPriceUnit;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("LastCommunicateTime")
        private String lastCommunicateTime;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("PositionCode")
        private String positionCode;

        @com.aliyun.core.annotation.NameInMap("ScreenHeight")
        private Integer screenHeight;

        @com.aliyun.core.annotation.NameInMap("ScreenWidth")
        private Integer screenWidth;

        @com.aliyun.core.annotation.NameInMap("ShelfCode")
        private String shelfCode;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        private String storeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private EslDeviceInfo(Builder builder) {
            this.batteryLevel = builder.batteryLevel;
            this.beBind = builder.beBind;
            this.companyId = builder.companyId;
            this.connectAp = builder.connectAp;
            this.eslBarCode = builder.eslBarCode;
            this.eslStatus = builder.eslStatus;
            this.itemActionPrice = builder.itemActionPrice;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemPriceUnit = builder.itemPriceUnit;
            this.itemTitle = builder.itemTitle;
            this.lastCommunicateTime = builder.lastCommunicateTime;
            this.mac = builder.mac;
            this.model = builder.model;
            this.positionCode = builder.positionCode;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
            this.shelfCode = builder.shelfCode;
            this.storeId = builder.storeId;
            this.type = builder.type;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return batteryLevel
         */
        public Integer getBatteryLevel() {
            return this.batteryLevel;
        }

        /**
         * @return beBind
         */
        public Boolean getBeBind() {
            return this.beBind;
        }

        /**
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
        }

        /**
         * @return connectAp
         */
        public String getConnectAp() {
            return this.connectAp;
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
         * @return itemActionPrice
         */
        public Integer getItemActionPrice() {
            return this.itemActionPrice;
        }

        /**
         * @return itemBarCode
         */
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemPriceUnit
         */
        public String getItemPriceUnit() {
            return this.itemPriceUnit;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return lastCommunicateTime
         */
        public String getLastCommunicateTime() {
            return this.lastCommunicateTime;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return positionCode
         */
        public String getPositionCode() {
            return this.positionCode;
        }

        /**
         * @return screenHeight
         */
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Integer getScreenWidth() {
            return this.screenWidth;
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

        public static final class Builder {
            private Integer batteryLevel; 
            private Boolean beBind; 
            private String companyId; 
            private String connectAp; 
            private String eslBarCode; 
            private String eslStatus; 
            private Integer itemActionPrice; 
            private String itemBarCode; 
            private Long itemId; 
            private String itemPriceUnit; 
            private String itemTitle; 
            private String lastCommunicateTime; 
            private String mac; 
            private String model; 
            private String positionCode; 
            private Integer screenHeight; 
            private Integer screenWidth; 
            private String shelfCode; 
            private String storeId; 
            private String type; 
            private String vendor; 

            /**
             * BatteryLevel.
             */
            public Builder batteryLevel(Integer batteryLevel) {
                this.batteryLevel = batteryLevel;
                return this;
            }

            /**
             * BeBind.
             */
            public Builder beBind(Boolean beBind) {
                this.beBind = beBind;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * ConnectAp.
             */
            public Builder connectAp(String connectAp) {
                this.connectAp = connectAp;
                return this;
            }

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * EslStatus.
             */
            public Builder eslStatus(String eslStatus) {
                this.eslStatus = eslStatus;
                return this;
            }

            /**
             * ItemActionPrice.
             */
            public Builder itemActionPrice(Integer itemActionPrice) {
                this.itemActionPrice = itemActionPrice;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemPriceUnit.
             */
            public Builder itemPriceUnit(String itemPriceUnit) {
                this.itemPriceUnit = itemPriceUnit;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * LastCommunicateTime.
             */
            public Builder lastCommunicateTime(String lastCommunicateTime) {
                this.lastCommunicateTime = lastCommunicateTime;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * PositionCode.
             */
            public Builder positionCode(String positionCode) {
                this.positionCode = positionCode;
                return this;
            }

            /**
             * ScreenHeight.
             */
            public Builder screenHeight(Integer screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * ScreenWidth.
             */
            public Builder screenWidth(Integer screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            /**
             * ShelfCode.
             */
            public Builder shelfCode(String shelfCode) {
                this.shelfCode = shelfCode;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public EslDeviceInfo build() {
                return new EslDeviceInfo(this);
            } 

        } 

    }
    public static class EslDevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EslDeviceInfo")
        private java.util.List < EslDeviceInfo> eslDeviceInfo;

        private EslDevices(Builder builder) {
            this.eslDeviceInfo = builder.eslDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslDevices create() {
            return builder().build();
        }

        /**
         * @return eslDeviceInfo
         */
        public java.util.List < EslDeviceInfo> getEslDeviceInfo() {
            return this.eslDeviceInfo;
        }

        public static final class Builder {
            private java.util.List < EslDeviceInfo> eslDeviceInfo; 

            /**
             * EslDeviceInfo.
             */
            public Builder eslDeviceInfo(java.util.List < EslDeviceInfo> eslDeviceInfo) {
                this.eslDeviceInfo = eslDeviceInfo;
                return this;
            }

            public EslDevices build() {
                return new EslDevices(this);
            } 

        } 

    }
}
