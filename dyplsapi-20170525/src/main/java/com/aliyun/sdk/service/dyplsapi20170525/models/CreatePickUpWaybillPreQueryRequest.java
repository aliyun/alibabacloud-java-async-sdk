// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePickUpWaybillPreQueryRequest} extends {@link RequestModel}
 *
 * <p>CreatePickUpWaybillPreQueryRequest</p>
 */
public class CreatePickUpWaybillPreQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsigneeInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConsigneeInfo consigneeInfo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Content-Type")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpCode")
    private String cpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderChannels")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderCode")
    private String outerOrderCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreWeight")
    private String preWeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private SenderInfo senderInfo;

    private CreatePickUpWaybillPreQueryRequest(Builder builder) {
        super(builder);
        this.consigneeInfo = builder.consigneeInfo;
        this.contentType = builder.contentType;
        this.cpCode = builder.cpCode;
        this.orderChannels = builder.orderChannels;
        this.outerOrderCode = builder.outerOrderCode;
        this.preWeight = builder.preWeight;
        this.senderInfo = builder.senderInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePickUpWaybillPreQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consigneeInfo
     */
    public ConsigneeInfo getConsigneeInfo() {
        return this.consigneeInfo;
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
     * @return preWeight
     */
    public String getPreWeight() {
        return this.preWeight;
    }

    /**
     * @return senderInfo
     */
    public SenderInfo getSenderInfo() {
        return this.senderInfo;
    }

    public static final class Builder extends Request.Builder<CreatePickUpWaybillPreQueryRequest, Builder> {
        private ConsigneeInfo consigneeInfo; 
        private String contentType; 
        private String cpCode; 
        private String orderChannels; 
        private String outerOrderCode; 
        private String preWeight; 
        private SenderInfo senderInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreatePickUpWaybillPreQueryRequest request) {
            super(request);
            this.consigneeInfo = request.consigneeInfo;
            this.contentType = request.contentType;
            this.cpCode = request.cpCode;
            this.orderChannels = request.orderChannels;
            this.outerOrderCode = request.outerOrderCode;
            this.preWeight = request.preWeight;
            this.senderInfo = request.senderInfo;
        } 

        /**
         * <p>The consignee information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder consigneeInfo(ConsigneeInfo consigneeInfo) {
            String consigneeInfoShrink = shrink(consigneeInfo, "ConsigneeInfo", "json");
            this.putQueryParameter("ConsigneeInfo", consigneeInfoShrink);
            this.consigneeInfo = consigneeInfo;
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
         * <p>The code of the courier company. If no courier company is specified, the system allocates a courier company.</p>
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
         * <p>The identifier of the external channel source. It cannot contain underscores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder orderChannels(String orderChannels) {
            this.putQueryParameter("OrderChannels", orderChannels);
            this.orderChannels = orderChannels;
            return this;
        }

        /**
         * <p>The order number of the access system.</p>
         * 
         * <strong>example:</strong>
         * <p>787DFHHDS989****</p>
         */
        public Builder outerOrderCode(String outerOrderCode) {
            this.putQueryParameter("OuterOrderCode", outerOrderCode);
            this.outerOrderCode = outerOrderCode;
            return this;
        }

        /**
         * <p>The estimated weight. Unit: gram.</p>
         * <blockquote>
         * <p> If you need to query the estimated price, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder preWeight(String preWeight) {
            this.putQueryParameter("PreWeight", preWeight);
            this.preWeight = preWeight;
            return this;
        }

        /**
         * <p>The sender information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder senderInfo(SenderInfo senderInfo) {
            String senderInfoShrink = shrink(senderInfo, "SenderInfo", "json");
            this.putQueryParameter("SenderInfo", senderInfoShrink);
            this.senderInfo = senderInfo;
            return this;
        }

        @Override
        public CreatePickUpWaybillPreQueryRequest build() {
            return new CreatePickUpWaybillPreQueryRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePickUpWaybillPreQueryRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryRequest</p>
     */
    public static class AddressInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("TownName")
        private String townName;

        private AddressInfo(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.areaName = builder.areaName;
            this.cityName = builder.cityName;
            this.provinceName = builder.provinceName;
            this.townName = builder.townName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressInfo create() {
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
             * <p>The detailed address of the consignee.</p>
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
             * 
             * <strong>example:</strong>
             * <p>chang,an</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The city where the consignee is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Xi,an</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The province where the consignee is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Shanxi</p>
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

            public AddressInfo build() {
                return new AddressInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryRequest</p>
     */
    public static class ConsigneeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressInfo")
        private AddressInfo addressInfo;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private ConsigneeInfo(Builder builder) {
            this.addressInfo = builder.addressInfo;
            this.mobile = builder.mobile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsigneeInfo create() {
            return builder().build();
        }

        /**
         * @return addressInfo
         */
        public AddressInfo getAddressInfo() {
            return this.addressInfo;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private AddressInfo addressInfo; 
            private String mobile; 
            private String name; 

            /**
             * <p>The address of the consignee.</p>
             */
            public Builder addressInfo(AddressInfo addressInfo) {
                this.addressInfo = addressInfo;
                return this;
            }

            /**
             * <p>The mobile phone number of the consignee.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The name of the consignee.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Li</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ConsigneeInfo build() {
                return new ConsigneeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryRequest</p>
     */
    public static class SenderInfoAddressInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("TownName")
        private String townName;

        private SenderInfoAddressInfo(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.areaName = builder.areaName;
            this.cityName = builder.cityName;
            this.provinceName = builder.provinceName;
            this.townName = builder.townName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SenderInfoAddressInfo create() {
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
             * <p>The detailed address of the sender.</p>
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
             * 
             * <strong>example:</strong>
             * <p>xihu</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The city where the sender is located.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The province where the sender is located.</p>
             * 
             * <strong>example:</strong>
             * <p>zhejiang</p>
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

            public SenderInfoAddressInfo build() {
                return new SenderInfoAddressInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryRequest} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryRequest</p>
     */
    public static class SenderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressInfo")
        private SenderInfoAddressInfo addressInfo;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private SenderInfo(Builder builder) {
            this.addressInfo = builder.addressInfo;
            this.mobile = builder.mobile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SenderInfo create() {
            return builder().build();
        }

        /**
         * @return addressInfo
         */
        public SenderInfoAddressInfo getAddressInfo() {
            return this.addressInfo;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private SenderInfoAddressInfo addressInfo; 
            private String mobile; 
            private String name; 

            /**
             * <p>The address of the sender.</p>
             */
            public Builder addressInfo(SenderInfoAddressInfo addressInfo) {
                this.addressInfo = addressInfo;
                return this;
            }

            /**
             * <p>The mobile phone number of the sender.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The name of the sender.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Wang</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SenderInfo build() {
                return new SenderInfo(this);
            } 

        } 

    }
}
