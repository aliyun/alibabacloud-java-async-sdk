// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddressInfo model) {
            this.addressDetail = model.addressDetail;
            this.addressId = model.addressId;
            this.divisionCode = model.divisionCode;
            this.receiver = model.receiver;
            this.receiverPhone = model.receiverPhone;
            this.townDivisionCode = model.townDivisionCode;
        } 

        /**
         * <p>The detailed shipping address. Enter the full address in the format of province, city, district/county, street, and community.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>陕西省西安市新城区xx街道xxx大厦xx室</p>
         */
        public Builder addressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }

        /**
         * <p>The address ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder addressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>The level-4 address code for the district or county. This parameter is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>610102</p>
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>The recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>任先生</p>
         */
        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        /**
         * <p>The phone number of the recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>182***5674</p>
         */
        public Builder receiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }

        /**
         * <p>The level-5 address code for the town or street. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61010212</p>
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
