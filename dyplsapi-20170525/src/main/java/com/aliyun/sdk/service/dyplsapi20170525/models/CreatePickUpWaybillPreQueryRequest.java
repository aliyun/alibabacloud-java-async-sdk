// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillPreQueryRequest} extends {@link RequestModel}
 *
 * <p>CreatePickUpWaybillPreQueryRequest</p>
 */
public class CreatePickUpWaybillPreQueryRequest extends Request {
    @Query
    @NameInMap("ConsigneeInfo")
    @Validation(required = true)
    private ConsigneeInfo consigneeInfo;

    @Header
    @NameInMap("Content-Type")
    private String contentType;

    @Query
    @NameInMap("CpCode")
    private String cpCode;

    @Query
    @NameInMap("OrderChannels")
    @Validation(required = true)
    private String orderChannels;

    @Query
    @NameInMap("OuterOrderCode")
    private String outerOrderCode;

    @Query
    @NameInMap("PreWeight")
    private String preWeight;

    @Query
    @NameInMap("SenderInfo")
    @Validation(required = true)
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
         * ConsigneeInfo.
         */
        public Builder consigneeInfo(ConsigneeInfo consigneeInfo) {
            String consigneeInfoShrink = shrink(consigneeInfo, "ConsigneeInfo", "json");
            this.putQueryParameter("ConsigneeInfo", consigneeInfoShrink);
            this.consigneeInfo = consigneeInfo;
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
         * PreWeight.
         */
        public Builder preWeight(String preWeight) {
            this.putQueryParameter("PreWeight", preWeight);
            this.preWeight = preWeight;
            return this;
        }

        /**
         * SenderInfo.
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

    public static class AddressInfo extends TeaModel {
        @NameInMap("AddressDetail")
        private String addressDetail;

        @NameInMap("AreaName")
        private String areaName;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("ProvinceName")
        private String provinceName;

        @NameInMap("TownName")
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

            public AddressInfo build() {
                return new AddressInfo(this);
            } 

        } 

    }
    public static class ConsigneeInfo extends TeaModel {
        @NameInMap("AddressInfo")
        private AddressInfo addressInfo;

        @NameInMap("Mobile")
        @Validation(required = true)
        private String mobile;

        @NameInMap("Name")
        @Validation(required = true)
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
             * AddressInfo.
             */
            public Builder addressInfo(AddressInfo addressInfo) {
                this.addressInfo = addressInfo;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
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
    public static class SenderInfoAddressInfo extends TeaModel {
        @NameInMap("AddressDetail")
        private String addressDetail;

        @NameInMap("AreaName")
        private String areaName;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("ProvinceName")
        private String provinceName;

        @NameInMap("TownName")
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

            public SenderInfoAddressInfo build() {
                return new SenderInfoAddressInfo(this);
            } 

        } 

    }
    public static class SenderInfo extends TeaModel {
        @NameInMap("AddressInfo")
        private SenderInfoAddressInfo addressInfo;

        @NameInMap("Mobile")
        @Validation(required = true)
        private String mobile;

        @NameInMap("Name")
        @Validation(required = true)
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
             * AddressInfo.
             */
            public Builder addressInfo(SenderInfoAddressInfo addressInfo) {
                this.addressInfo = addressInfo;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
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
