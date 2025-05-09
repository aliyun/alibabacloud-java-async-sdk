// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link DeletePhoneMessageQrdlRequest} extends {@link RequestModel}
 *
 * <p>DeletePhoneMessageQrdlRequest</p>
 */
public class DeletePhoneMessageQrdlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QrdlCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qrdlCode;

    private DeletePhoneMessageQrdlRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
        this.qrdlCode = builder.qrdlCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePhoneMessageQrdlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return qrdlCode
     */
    public String getQrdlCode() {
        return this.qrdlCode;
    }

    public static final class Builder extends Request.Builder<DeletePhoneMessageQrdlRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 
        private String qrdlCode; 

        private Builder() {
            super();
        } 

        private Builder(DeletePhoneMessageQrdlRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
            this.qrdlCode = request.qrdlCode;
        } 

        /**
         * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
         * 
         * <strong>example:</strong>
         * <p>883873773</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The phone number. Add the country code before the phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861380000</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>QR code encoding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>29338838</p>
         */
        public Builder qrdlCode(String qrdlCode) {
            this.putBodyParameter("QrdlCode", qrdlCode);
            this.qrdlCode = qrdlCode;
            return this;
        }

        @Override
        public DeletePhoneMessageQrdlRequest build() {
            return new DeletePhoneMessageQrdlRequest(this);
        } 

    } 

}
