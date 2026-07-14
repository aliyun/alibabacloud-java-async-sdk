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
 * {@link UpdateWhatsappUserNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhatsappUserNameRequest</p>
 */
public class UpdateWhatsappUserNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferAction")
    private String transferAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private UpdateWhatsappUserNameRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
        this.transferAction = builder.transferAction;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhatsappUserNameRequest create() {
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
     * @return transferAction
     */
    public String getTransferAction() {
        return this.transferAction;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateWhatsappUserNameRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 
        private String transferAction; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhatsappUserNameRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
            this.transferAction = request.transferAction;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-kskd****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800***</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * TransferAction.
         */
        public Builder transferAction(String transferAction) {
            this.putQueryParameter("TransferAction", transferAction);
            this.transferAction = transferAction;
            return this;
        }

        /**
         * <p>Whatsapp user name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateWhatsappUserNameRequest build() {
            return new UpdateWhatsappUserNameRequest(this);
        } 

    } 

}
