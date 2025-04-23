// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
    private java.util.List<Addresses> addresses;

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
    public java.util.List<Addresses> getAddresses() {
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
        private java.util.List<Addresses> addresses; 
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US (default)</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the address pool for which you want to replace addresses. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89618921167339**24</p>
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
            return this;
        }

        /**
         * <p>The addresses.</p>
         */
        public Builder addresses(java.util.List<Addresses> addresses) {
            String addressesShrink = shrink(addresses, "Addresses", "json");
            this.putQueryParameter("Addresses", addressesShrink);
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
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

    /**
     * 
     * {@link ReplaceCloudGtmAddressPoolAddressRequest} extends {@link TeaModel}
     *
     * <p>ReplaceCloudGtmAddressPoolAddressRequest</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressId")
        private String addressId;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List<String> requestSource;

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
        public java.util.List<String> getRequestSource() {
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
            private java.util.List<String> requestSource; 
            private Integer serialNumber; 
            private Integer weightValue; 

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.addressId = model.addressId;
                this.requestSource = model.requestSource;
                this.serialNumber = model.serialNumber;
                this.weightValue = model.weightValue;
            } 

            /**
             * <p>The ID of the new address. This ID uniquely identifies the address.</p>
             * <ul>
             * <li>If you specify this parameter, the original addresses in the address pool will be deleted and replaced with new addresses.</li>
             * <li>If you do not specify this parameter, all addresses in the address pool will be deleted and the address pool will be left empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addr-89636516932803**44</p>
             */
            public Builder addressId(String addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * <p>The DNS request sources.</p>
             */
            public Builder requestSource(java.util.List<String> requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * <p>The sequence number that specifies the priority for returning the new address. A smaller sequence number specifies a higher priority. This setting takes effect for new addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The weight value of the new address. You can set a different weight value for each address. This way, addresses are returned based on the weight values for Domain Name System (DNS) requests. A weight value must be an integer that ranges from 1 to 100. This setting takes effect for new addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
