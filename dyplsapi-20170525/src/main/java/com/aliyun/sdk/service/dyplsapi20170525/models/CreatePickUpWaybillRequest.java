// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillRequest} extends {@link RequestModel}
 *
 * <p>CreatePickUpWaybillRequest</p>
 */
public class CreatePickUpWaybillRequest extends Request {
    @Query
    @NameInMap("AppointGotEndTime")
    private String appointGotEndTime;

    @Query
    @NameInMap("AppointGotStartTime")
    private String appointGotStartTime;

    @Query
    @NameInMap("BizType")
    private Integer bizType;

    @Query
    @NameInMap("ConsigneeAddress")
    @Validation(required = true)
    private ConsigneeAddress consigneeAddress;

    @Query
    @NameInMap("ConsigneeMobile")
    private String consigneeMobile;

    @Query
    @NameInMap("ConsigneeName")
    @Validation(required = true)
    private String consigneeName;

    @Query
    @NameInMap("ConsigneePhone")
    private String consigneePhone;

    @Header
    @NameInMap("Content-Type")
    private String contentType;

    @Query
    @NameInMap("CpCode")
    private String cpCode;

    @Query
    @NameInMap("GoodsInfos")
    private java.util.List < GoodsInfos> goodsInfos;

    @Query
    @NameInMap("OrderChannels")
    @Validation(required = true)
    private String orderChannels;

    @Query
    @NameInMap("OuterOrderCode")
    @Validation(required = true)
    private String outerOrderCode;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SendAddress")
    @Validation(required = true)
    private SendAddress sendAddress;

    @Query
    @NameInMap("SendMobile")
    private String sendMobile;

    @Query
    @NameInMap("SendName")
    @Validation(required = true)
    private String sendName;

    @Query
    @NameInMap("SendPhone")
    private String sendPhone;

    private CreatePickUpWaybillRequest(Builder builder) {
        super(builder);
        this.appointGotEndTime = builder.appointGotEndTime;
        this.appointGotStartTime = builder.appointGotStartTime;
        this.bizType = builder.bizType;
        this.consigneeAddress = builder.consigneeAddress;
        this.consigneeMobile = builder.consigneeMobile;
        this.consigneeName = builder.consigneeName;
        this.consigneePhone = builder.consigneePhone;
        this.contentType = builder.contentType;
        this.cpCode = builder.cpCode;
        this.goodsInfos = builder.goodsInfos;
        this.orderChannels = builder.orderChannels;
        this.outerOrderCode = builder.outerOrderCode;
        this.remark = builder.remark;
        this.sendAddress = builder.sendAddress;
        this.sendMobile = builder.sendMobile;
        this.sendName = builder.sendName;
        this.sendPhone = builder.sendPhone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePickUpWaybillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appointGotEndTime
     */
    public String getAppointGotEndTime() {
        return this.appointGotEndTime;
    }

    /**
     * @return appointGotStartTime
     */
    public String getAppointGotStartTime() {
        return this.appointGotStartTime;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return consigneeAddress
     */
    public ConsigneeAddress getConsigneeAddress() {
        return this.consigneeAddress;
    }

    /**
     * @return consigneeMobile
     */
    public String getConsigneeMobile() {
        return this.consigneeMobile;
    }

    /**
     * @return consigneeName
     */
    public String getConsigneeName() {
        return this.consigneeName;
    }

    /**
     * @return consigneePhone
     */
    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return cpCode
     */
    public String getCpCode() {
        return this.cpCode;
    }

    /**
     * @return goodsInfos
     */
    public java.util.List < GoodsInfos> getGoodsInfos() {
        return this.goodsInfos;
    }

    /**
     * @return orderChannels
     */
    public String getOrderChannels() {
        return this.orderChannels;
    }

    /**
     * @return outerOrderCode
     */
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sendAddress
     */
    public SendAddress getSendAddress() {
        return this.sendAddress;
    }

    /**
     * @return sendMobile
     */
    public String getSendMobile() {
        return this.sendMobile;
    }

    /**
     * @return sendName
     */
    public String getSendName() {
        return this.sendName;
    }

    /**
     * @return sendPhone
     */
    public String getSendPhone() {
        return this.sendPhone;
    }

    public static final class Builder extends Request.Builder<CreatePickUpWaybillRequest, Builder> {
        private String appointGotEndTime; 
        private String appointGotStartTime; 
        private Integer bizType; 
        private ConsigneeAddress consigneeAddress; 
        private String consigneeMobile; 
        private String consigneeName; 
        private String consigneePhone; 
        private String contentType; 
        private String cpCode; 
        private java.util.List < GoodsInfos> goodsInfos; 
        private String orderChannels; 
        private String outerOrderCode; 
        private String remark; 
        private SendAddress sendAddress; 
        private String sendMobile; 
        private String sendName; 
        private String sendPhone; 

        private Builder() {
            super();
        } 

        private Builder(CreatePickUpWaybillRequest request) {
            super(request);
            this.appointGotEndTime = request.appointGotEndTime;
            this.appointGotStartTime = request.appointGotStartTime;
            this.bizType = request.bizType;
            this.consigneeAddress = request.consigneeAddress;
            this.consigneeMobile = request.consigneeMobile;
            this.consigneeName = request.consigneeName;
            this.consigneePhone = request.consigneePhone;
            this.contentType = request.contentType;
            this.cpCode = request.cpCode;
            this.goodsInfos = request.goodsInfos;
            this.orderChannels = request.orderChannels;
            this.outerOrderCode = request.outerOrderCode;
            this.remark = request.remark;
            this.sendAddress = request.sendAddress;
            this.sendMobile = request.sendMobile;
            this.sendName = request.sendName;
            this.sendPhone = request.sendPhone;
        } 

        /**
         * AppointGotEndTime.
         */
        public Builder appointGotEndTime(String appointGotEndTime) {
            this.putQueryParameter("AppointGotEndTime", appointGotEndTime);
            this.appointGotEndTime = appointGotEndTime;
            return this;
        }

        /**
         * AppointGotStartTime.
         */
        public Builder appointGotStartTime(String appointGotStartTime) {
            this.putQueryParameter("AppointGotStartTime", appointGotStartTime);
            this.appointGotStartTime = appointGotStartTime;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ConsigneeAddress.
         */
        public Builder consigneeAddress(ConsigneeAddress consigneeAddress) {
            String consigneeAddressShrink = shrink(consigneeAddress, "ConsigneeAddress", "json");
            this.putQueryParameter("ConsigneeAddress", consigneeAddressShrink);
            this.consigneeAddress = consigneeAddress;
            return this;
        }

        /**
         * ConsigneeMobile.
         */
        public Builder consigneeMobile(String consigneeMobile) {
            this.putQueryParameter("ConsigneeMobile", consigneeMobile);
            this.consigneeMobile = consigneeMobile;
            return this;
        }

        /**
         * ConsigneeName.
         */
        public Builder consigneeName(String consigneeName) {
            this.putQueryParameter("ConsigneeName", consigneeName);
            this.consigneeName = consigneeName;
            return this;
        }

        /**
         * ConsigneePhone.
         */
        public Builder consigneePhone(String consigneePhone) {
            this.putQueryParameter("ConsigneePhone", consigneePhone);
            this.consigneePhone = consigneePhone;
            return this;
        }

        /**
         * Content-Type.
         */
        public Builder contentType(String contentType) {
            this.putHeaderParameter("Content-Type", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * CpCode.
         */
        public Builder cpCode(String cpCode) {
            this.putQueryParameter("CpCode", cpCode);
            this.cpCode = cpCode;
            return this;
        }

        /**
         * GoodsInfos.
         */
        public Builder goodsInfos(java.util.List < GoodsInfos> goodsInfos) {
            String goodsInfosShrink = shrink(goodsInfos, "GoodsInfos", "json");
            this.putQueryParameter("GoodsInfos", goodsInfosShrink);
            this.goodsInfos = goodsInfos;
            return this;
        }

        /**
         * OrderChannels.
         */
        public Builder orderChannels(String orderChannels) {
            this.putQueryParameter("OrderChannels", orderChannels);
            this.orderChannels = orderChannels;
            return this;
        }

        /**
         * OuterOrderCode.
         */
        public Builder outerOrderCode(String outerOrderCode) {
            this.putQueryParameter("OuterOrderCode", outerOrderCode);
            this.outerOrderCode = outerOrderCode;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SendAddress.
         */
        public Builder sendAddress(SendAddress sendAddress) {
            String sendAddressShrink = shrink(sendAddress, "SendAddress", "json");
            this.putQueryParameter("SendAddress", sendAddressShrink);
            this.sendAddress = sendAddress;
            return this;
        }

        /**
         * SendMobile.
         */
        public Builder sendMobile(String sendMobile) {
            this.putQueryParameter("SendMobile", sendMobile);
            this.sendMobile = sendMobile;
            return this;
        }

        /**
         * SendName.
         */
        public Builder sendName(String sendName) {
            this.putQueryParameter("SendName", sendName);
            this.sendName = sendName;
            return this;
        }

        /**
         * SendPhone.
         */
        public Builder sendPhone(String sendPhone) {
            this.putQueryParameter("SendPhone", sendPhone);
            this.sendPhone = sendPhone;
            return this;
        }

        @Override
        public CreatePickUpWaybillRequest build() {
            return new CreatePickUpWaybillRequest(this);
        } 

    } 

    public static class ConsigneeAddress extends TeaModel {
        @NameInMap("AddressDetail")
        @Validation(required = true)
        private String addressDetail;

        @NameInMap("AreaName")
        @Validation(required = true)
        private String areaName;

        @NameInMap("CityName")
        @Validation(required = true)
        private String cityName;

        @NameInMap("ProvinceName")
        @Validation(required = true)
        private String provinceName;

        @NameInMap("TownName")
        private String townName;

        private ConsigneeAddress(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.areaName = builder.areaName;
            this.cityName = builder.cityName;
            this.provinceName = builder.provinceName;
            this.townName = builder.townName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsigneeAddress create() {
            return builder().build();
        }

        /**
         * @return addressDetail
         */
        public String getAddressDetail() {
            return this.addressDetail;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return townName
         */
        public String getTownName() {
            return this.townName;
        }

        public static final class Builder {
            private String addressDetail; 
            private String areaName; 
            private String cityName; 
            private String provinceName; 
            private String townName; 

            /**
             * AddressDetail.
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * AreaName.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * ProvinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * TownName.
             */
            public Builder townName(String townName) {
                this.townName = townName;
                return this;
            }

            public ConsigneeAddress build() {
                return new ConsigneeAddress(this);
            } 

        } 

    }
    public static class GoodsInfos extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Quantity")
        private String quantity;

        @NameInMap("Weight")
        private String weight;

        private GoodsInfos(Builder builder) {
            this.name = builder.name;
            this.quantity = builder.quantity;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GoodsInfos create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String name; 
            private String quantity; 
            private String weight; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public GoodsInfos build() {
                return new GoodsInfos(this);
            } 

        } 

    }
    public static class SendAddress extends TeaModel {
        @NameInMap("AddressDetail")
        @Validation(required = true)
        private String addressDetail;

        @NameInMap("AreaName")
        @Validation(required = true)
        private String areaName;

        @NameInMap("CityName")
        @Validation(required = true)
        private String cityName;

        @NameInMap("ProvinceName")
        @Validation(required = true)
        private String provinceName;

        @NameInMap("TownName")
        private String townName;

        private SendAddress(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.areaName = builder.areaName;
            this.cityName = builder.cityName;
            this.provinceName = builder.provinceName;
            this.townName = builder.townName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendAddress create() {
            return builder().build();
        }

        /**
         * @return addressDetail
         */
        public String getAddressDetail() {
            return this.addressDetail;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return townName
         */
        public String getTownName() {
            return this.townName;
        }

        public static final class Builder {
            private String addressDetail; 
            private String areaName; 
            private String cityName; 
            private String provinceName; 
            private String townName; 

            /**
             * AddressDetail.
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * AreaName.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * ProvinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * TownName.
             */
            public Builder townName(String townName) {
                this.townName = townName;
                return this;
            }

            public SendAddress build() {
                return new SendAddress(this);
            } 

        } 

    }
}
