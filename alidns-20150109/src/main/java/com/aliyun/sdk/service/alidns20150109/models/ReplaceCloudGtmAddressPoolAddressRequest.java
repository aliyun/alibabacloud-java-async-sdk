// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceCloudGtmAddressPoolAddressRequest} extends {@link RequestModel}
 *
 * <p>ReplaceCloudGtmAddressPoolAddressRequest</p>
 */
public class ReplaceCloudGtmAddressPoolAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List < Addresses> addresses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private ReplaceCloudGtmAddressPoolAddressRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolId = builder.addressPoolId;
        this.addresses = builder.addresses;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceCloudGtmAddressPoolAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return addressPoolId
     */
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    /**
     * @return addresses
     */
    public java.util.List < Addresses> getAddresses() {
        return this.addresses;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<ReplaceCloudGtmAddressPoolAddressRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolId; 
        private java.util.List < Addresses> addresses; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceCloudGtmAddressPoolAddressRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolId = request.addressPoolId;
            this.addresses = request.addresses;
            this.clientToken = request.clientToken;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AddressPoolId.
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
            return this;
        }

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < Addresses> addresses) {
            String addressesShrink = shrink(addresses, "Addresses", "json");
            this.putQueryParameter("Addresses", addressesShrink);
            this.addresses = addresses;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ReplaceCloudGtmAddressPoolAddressRequest build() {
            return new ReplaceCloudGtmAddressPoolAddressRequest(this);
        } 

    } 

    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressId")
        private String addressId;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List < String > requestSource;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private Addresses(Builder builder) {
            this.addressId = builder.addressId;
            this.requestSource = builder.requestSource;
            this.serialNumber = builder.serialNumber;
            this.weightValue = builder.weightValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return addressId
         */
        public String getAddressId() {
            return this.addressId;
        }

        /**
         * @return requestSource
         */
        public java.util.List < String > getRequestSource() {
            return this.requestSource;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return weightValue
         */
        public Integer getWeightValue() {
            return this.weightValue;
        }

        public static final class Builder {
            private String addressId; 
            private java.util.List < String > requestSource; 
            private Integer serialNumber; 
            private Integer weightValue; 

            /**
             * AddressId.
             */
            public Builder addressId(String addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * RequestSource.
             */
            public Builder requestSource(java.util.List < String > requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * WeightValue.
             */
            public Builder weightValue(Integer weightValue) {
                this.weightValue = weightValue;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
}
