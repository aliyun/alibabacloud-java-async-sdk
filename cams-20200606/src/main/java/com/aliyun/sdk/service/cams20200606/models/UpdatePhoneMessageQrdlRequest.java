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
 * {@link UpdatePhoneMessageQrdlRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhoneMessageQrdlRequest</p>
 */
public class UpdatePhoneMessageQrdlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateQrImage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String generateQrImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefilledMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefilledMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QrdlCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qrdlCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdatePhoneMessageQrdlRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.generateQrImage = builder.generateQrImage;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.prefilledMessage = builder.prefilledMessage;
        this.qrdlCode = builder.qrdlCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<UpdatePhoneMessageQrdlRequest, Builder> {
        private String custSpaceId; 
        private String generateQrImage; 
        private Long ownerId; 
        private String phoneNumber; 
        private String prefilledMessage; 
        private String qrdlCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePhoneMessageQrdlRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.generateQrImage = request.generateQrImage;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.prefilledMessage = request.prefilledMessage;
            this.qrdlCode = request.qrdlCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the Space ID on the
         * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-kei****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The type of the generated image. Valid values:</p>
         * <ul>
         * <li><p>PNG</p>
         * </li>
         * <li><p>SVG</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SVG</p>
         */
        public Builder generateQrImage(String generateQrImage) {
            this.putQueryParameter("GenerateQrImage", generateQrImage);
            this.generateQrImage = generateQrImage;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The phone number. You can view the phone number on the
         * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>&gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86158********</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The message content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        public Builder prefilledMessage(String prefilledMessage) {
            this.putQueryParameter("PrefilledMessage", prefilledMessage);
            this.prefilledMessage = prefilledMessage;
            return this;
        }

        /**
         * <p>The QR code encoding. This is the QrdlCode returned when you called the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>D9II3***</p>
         */
        public Builder qrdlCode(String qrdlCode) {
            this.putQueryParameter("QrdlCode", qrdlCode);
            this.qrdlCode = qrdlCode;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public UpdatePhoneMessageQrdlRequest build() {
            return new UpdatePhoneMessageQrdlRequest(this);
        } 

    } 

}
