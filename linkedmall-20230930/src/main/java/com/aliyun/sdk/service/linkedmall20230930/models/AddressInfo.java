// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddressInfo} extends {@link TeaModel}
 *
 * <p>AddressInfo</p>
 */
public class AddressInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addressDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressDetail;

    @com.aliyun.core.annotation.NameInMap("addressId")
    private Long addressId;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("receiver")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiver;

    @com.aliyun.core.annotation.NameInMap("receiverPhone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverPhone;

    @com.aliyun.core.annotation.NameInMap("townDivisionCode")
    private String townDivisionCode;

    private AddressInfo(Builder builder) {
        this.addressDetail = builder.addressDetail;
        this.addressId = builder.addressId;
        this.divisionCode = builder.divisionCode;
        this.receiver = builder.receiver;
        this.receiverPhone = builder.receiverPhone;
        this.townDivisionCode = builder.townDivisionCode;
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
     * @return addressId
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
    }

    /**
     * @return receiverPhone
     */
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    /**
     * @return townDivisionCode
     */
    public String getTownDivisionCode() {
        return this.townDivisionCode;
    }

    public static final class Builder {
        private String addressDetail; 
        private Long addressId; 
        private String divisionCode; 
        private String receiver; 
        private String receiverPhone; 
        private String townDivisionCode; 

        /**
         * addressDetail.
         */
        public Builder addressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }

        /**
         * addressId.
         */
        public Builder addressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * receiver.
         */
        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        /**
         * receiverPhone.
         */
        public Builder receiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }

        /**
         * townDivisionCode.
         */
        public Builder townDivisionCode(String townDivisionCode) {
            this.townDivisionCode = townDivisionCode;
            return this;
        }

        public AddressInfo build() {
            return new AddressInfo(this);
        } 

    } 

}
