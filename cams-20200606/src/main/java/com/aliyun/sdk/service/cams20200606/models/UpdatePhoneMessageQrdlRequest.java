// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhoneMessageQrdlRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhoneMessageQrdlRequest</p>
 */
public class UpdatePhoneMessageQrdlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenerateQrImage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String generateQrImage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrefilledMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefilledMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QrdlCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qrdlCode;

    private UpdatePhoneMessageQrdlRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.generateQrImage = builder.generateQrImage;
        this.phoneNumber = builder.phoneNumber;
        this.prefilledMessage = builder.prefilledMessage;
        this.qrdlCode = builder.qrdlCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePhoneMessageQrdlRequest create() {
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
     * @return generateQrImage
     */
    public String getGenerateQrImage() {
        return this.generateQrImage;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return prefilledMessage
     */
    public String getPrefilledMessage() {
        return this.prefilledMessage;
    }

    /**
     * @return qrdlCode
     */
    public String getQrdlCode() {
        return this.qrdlCode;
    }

    public static final class Builder extends Request.Builder<UpdatePhoneMessageQrdlRequest, Builder> {
        private String custSpaceId; 
        private String generateQrImage; 
        private String phoneNumber; 
        private String prefilledMessage; 
        private String qrdlCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePhoneMessageQrdlRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.generateQrImage = request.generateQrImage;
            this.phoneNumber = request.phoneNumber;
            this.prefilledMessage = request.prefilledMessage;
            this.qrdlCode = request.qrdlCode;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * GenerateQrImage.
         */
        public Builder generateQrImage(String generateQrImage) {
            this.putBodyParameter("GenerateQrImage", generateQrImage);
            this.generateQrImage = generateQrImage;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * PrefilledMessage.
         */
        public Builder prefilledMessage(String prefilledMessage) {
            this.putBodyParameter("PrefilledMessage", prefilledMessage);
            this.prefilledMessage = prefilledMessage;
            return this;
        }

        /**
         * QrdlCode.
         */
        public Builder qrdlCode(String qrdlCode) {
            this.putBodyParameter("QrdlCode", qrdlCode);
            this.qrdlCode = qrdlCode;
            return this;
        }

        @Override
        public UpdatePhoneMessageQrdlRequest build() {
            return new UpdatePhoneMessageQrdlRequest(this);
        } 

    } 

}
