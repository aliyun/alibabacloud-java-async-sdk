// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceCloudGtmInstanceConfigAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>ReplaceCloudGtmInstanceConfigAddressPoolRequest</p>
 */
public class ReplaceCloudGtmInstanceConfigAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPools")
    private java.util.List < AddressPools> addressPools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private ReplaceCloudGtmInstanceConfigAddressPoolRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPools = builder.addressPools;
        this.clientToken = builder.clientToken;
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceCloudGtmInstanceConfigAddressPoolRequest create() {
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
     * @return addressPools
     */
    public java.util.List < AddressPools> getAddressPools() {
        return this.addressPools;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ReplaceCloudGtmInstanceConfigAddressPoolRequest, Builder> {
        private String acceptLanguage; 
        private java.util.List < AddressPools> addressPools; 
        private String clientToken; 
        private String configId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceCloudGtmInstanceConfigAddressPoolRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPools = request.addressPools;
            this.clientToken = request.clientToken;
            this.configId = request.configId;
            this.instanceId = request.instanceId;
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
         * AddressPools.
         */
        public Builder addressPools(java.util.List < AddressPools> addressPools) {
            String addressPoolsShrink = shrink(addressPools, "AddressPools", "json");
            this.putQueryParameter("AddressPools", addressPoolsShrink);
            this.addressPools = addressPools;
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

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ReplaceCloudGtmInstanceConfigAddressPoolRequest build() {
            return new ReplaceCloudGtmInstanceConfigAddressPoolRequest(this);
        } 

    } 

    public static class AddressPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPoolId")
        private String addressPoolId;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List < String > requestSource;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private AddressPools(Builder builder) {
            this.addressPoolId = builder.addressPoolId;
            this.requestSource = builder.requestSource;
            this.serialNumber = builder.serialNumber;
            this.weightValue = builder.weightValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPools create() {
            return builder().build();
        }

        /**
         * @return addressPoolId
         */
        public String getAddressPoolId() {
            return this.addressPoolId;
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
            private String addressPoolId; 
            private java.util.List < String > requestSource; 
            private Integer serialNumber; 
            private Integer weightValue; 

            /**
             * AddressPoolId.
             */
            public Builder addressPoolId(String addressPoolId) {
                this.addressPoolId = addressPoolId;
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

            public AddressPools build() {
                return new AddressPools(this);
            } 

        } 

    }
}
