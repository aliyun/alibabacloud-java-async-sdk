// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link CreatePickUpWaybillRequest} extends {@link RequestModel}
 *
 * <p>CreatePickUpWaybillRequest</p>
 */
public class CreatePickUpWaybillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppointGotEndTime")
    private String appointGotEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppointGotStartTime")
    private String appointGotStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsigneeAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConsigneeAddress consigneeAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsigneeMobile")
    private String consigneeMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsigneeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consigneeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsigneePhone")
    private String consigneePhone;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Content-Type")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpCode")
    private String cpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GoodsInfos")
    private java.util.List<GoodsInfos> goodsInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderChannels")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerOrderCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private SendAddress sendAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendMobile")
    private String sendMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendPhone")
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
    public java.util.List<GoodsInfos> getGoodsInfos() {
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
        private java.util.List<GoodsInfos> goodsInfos; 
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
         * <p>The end time of the door-to-door pickup in the appointment. The value of <strong>AppointGotEndTime</strong> is the value of <strong>EndTime</strong> of <strong>AppointTimes</strong> in <strong>CpTimeSelectList</strong> returned by the <a href="~~CreatePickUpWaybillPreQuery~~#resultMapping">CreatePickUpWaybillPreQuery</a> operation.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>BizType</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01 12:00:00</p>
         */
        public Builder appointGotEndTime(String appointGotEndTime) {
            this.putQueryParameter("AppointGotEndTime", appointGotEndTime);
            this.appointGotEndTime = appointGotEndTime;
            return this;
        }

        /**
         * <p>The start time of the door-to-door pickup in the appointment. The value of <strong>AppointGotStartTime</strong> is the value of <strong>StartTime</strong> of <strong>AppointTimes</strong> in <strong>CpTimeSelectList</strong> returned by the <a href="~~CreatePickUpWaybillPreQuery~~#resultMapping">CreatePickUpWaybillPreQuery</a> operation.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>BizType</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01 10:00:00</p>
         */
        public Builder appointGotStartTime(String appointGotStartTime) {
            this.putQueryParameter("AppointGotStartTime", appointGotStartTime);
            this.appointGotStartTime = appointGotStartTime;
            return this;
        }

        /**
         * <p>The pickup mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): real-time order.</li>
         * <li><strong>1</strong>: appointment order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The address of the consignee.</p>
         * <p>This parameter is required.</p>
         */
        public Builder consigneeAddress(ConsigneeAddress consigneeAddress) {
            String consigneeAddressShrink = shrink(consigneeAddress, "ConsigneeAddress", "json");
            this.putQueryParameter("ConsigneeAddress", consigneeAddressShrink);
            this.consigneeAddress = consigneeAddress;
            return this;
        }

        /**
         * <p>The mobile phone number of the consignee.</p>
         * <blockquote>
         * <p> Either ConsigneeMobile or ConsigneePhone must be set.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1580000****</p>
         */
        public Builder consigneeMobile(String consigneeMobile) {
            this.putQueryParameter("ConsigneeMobile", consigneeMobile);
            this.consigneeMobile = consigneeMobile;
            return this;
        }

        /**
         * <p>The name of the consignee.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Li</p>
         */
        public Builder consigneeName(String consigneeName) {
            this.putQueryParameter("ConsigneeName", consigneeName);
            this.consigneeName = consigneeName;
            return this;
        }

        /**
         * <p>The landline phone number of the consignee.</p>
         * <blockquote>
         * <p> Either ConsigneeMobile or ConsigneePhone must be set.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0570000****</p>
         */
        public Builder consigneePhone(String consigneePhone) {
            this.putQueryParameter("ConsigneePhone", consigneePhone);
            this.consigneePhone = consigneePhone;
            return this;
        }

        /**
         * <p>The content type of the HTTP request. This parameter is optional. If you specify this parameter, enter application/json;chatset=UTF-8.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json;chatset=UTF-8</p>
         */
        public Builder contentType(String contentType) {
            this.putHeaderParameter("Content-Type", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The code of the courier company.</p>
         * 
         * <strong>example:</strong>
         * <p>YTO</p>
         */
        public Builder cpCode(String cpCode) {
            this.putQueryParameter("CpCode", cpCode);
            this.cpCode = cpCode;
            return this;
        }

        /**
         * <p>The items.</p>
         */
        public Builder goodsInfos(java.util.List<GoodsInfos> goodsInfos) {
            String goodsInfosShrink = shrink(goodsInfos, "GoodsInfos", "json");
            this.putQueryParameter("GoodsInfos", goodsInfosShrink);
            this.goodsInfos = goodsInfos;
            return this;
        }

        /**
         * <p>The external channel sources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YUN_DIAN_SHANG</p>
         */
        public Builder orderChannels(String orderChannels) {
            this.putQueryParameter("OrderChannels", orderChannels);
            this.orderChannels = orderChannels;
            return this;
        }

        /**
         * <p>The ID of the external order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>143234234266****</p>
         */
        public Builder outerOrderCode(String outerOrderCode) {
            this.putQueryParameter("OuterOrderCode", outerOrderCode);
            this.outerOrderCode = outerOrderCode;
            return this;
        }

        /**
         * <p>The additional information about the order. The additional information will be printed on the order.</p>
         * 
         * <strong>example:</strong>
         * <p>fragile</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The address of the sender.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sendAddress(SendAddress sendAddress) {
            String sendAddressShrink = shrink(sendAddress, "SendAddress", "json");
            this.putQueryParameter("SendAddress", sendAddressShrink);
            this.sendAddress = sendAddress;
            return this;
        }

        /**
         * <p>The mobile phone number of the sender.</p>
         * <blockquote>
         * <p> Either SendMobile or SendPhone must be set.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1596714****</p>
         */
        public Builder sendMobile(String sendMobile) {
            this.putQueryParameter("SendMobile", sendMobile);
            this.sendMobile = sendMobile;
            return this;
        }

        /**
         * <p>The name of the sender.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Wang</p>
         */
        public Builder sendName(String sendName) {
            this.putQueryParameter("SendName", sendName);
            this.sendName = sendName;
            return this;
        }

        /**
         * <p>The landline phone number of the sender.</p>
         * <blockquote>
         * <p> Either SendMobile or SendPhone must be set.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>05718845****</p>
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

    /**
     * 
     * {@link CreatePickUpWaybillRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillRequest</p>
     */
    public static class ConsigneeAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        @com.aliyun.core.annotation.Validation(required = true)
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CityName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("TownName")
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

            private Builder() {
            } 

            private Builder(ConsigneeAddress model) {
                this.addressDetail = model.addressDetail;
                this.areaName = model.areaName;
                this.cityName = model.cityName;
                this.provinceName = model.provinceName;
                this.townName = model.townName;
            } 

            /**
             * <p>The detailed address of the consignee.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>XX community</p>
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * <p>The district where the consignee is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xihu</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The city where the consignee is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The province where the consignee is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>zhejiang</p>
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * <p>The street where the consignee is located.</p>
             * 
             * <strong>example:</strong>
             * <p>XX Street</p>
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
    /**
     * 
     * {@link CreatePickUpWaybillRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillRequest</p>
     */
    public static class GoodsInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(GoodsInfos model) {
                this.name = model.name;
                this.quantity = model.quantity;
                this.weight = model.weight;
            } 

            /**
             * <p>The item name.</p>
             * 
             * <strong>example:</strong>
             * <p>zhang</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The item quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The item weight. Unit: gram.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link CreatePickUpWaybillRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillRequest</p>
     */
    public static class SendAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        @com.aliyun.core.annotation.Validation(required = true)
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CityName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("TownName")
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

            private Builder() {
            } 

            private Builder(SendAddress model) {
                this.addressDetail = model.addressDetail;
                this.areaName = model.areaName;
                this.cityName = model.cityName;
                this.provinceName = model.provinceName;
                this.townName = model.townName;
            } 

            /**
             * <p>The detailed address of the sender.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>XX community</p>
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * <p>The district where the sender is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>wenjiang</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The city where the sender is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>chengdu</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The province where the sender is located.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Sichuan</p>
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * <p>The street where the sender is located.</p>
             * 
             * <strong>example:</strong>
             * <p>XX Street</p>
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
