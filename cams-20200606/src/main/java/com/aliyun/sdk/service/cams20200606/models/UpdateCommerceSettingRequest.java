// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommerceSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommerceSettingRequest</p>
 */
public class UpdateCommerceSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CartEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean cartEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogVisible")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean catalogVisible;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    private UpdateCommerceSettingRequest(Builder builder) {
        super(builder);
        this.cartEnable = builder.cartEnable;
        this.catalogVisible = builder.catalogVisible;
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommerceSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cartEnable
     */
    public Boolean getCartEnable() {
        return this.cartEnable;
    }

    /**
     * @return catalogVisible
     */
    public Boolean getCatalogVisible() {
        return this.catalogVisible;
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

    public static final class Builder extends Request.Builder<UpdateCommerceSettingRequest, Builder> {
        private Boolean cartEnable; 
        private Boolean catalogVisible; 
        private String custSpaceId; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommerceSettingRequest request) {
            super(request);
            this.cartEnable = request.cartEnable;
            this.catalogVisible = request.catalogVisible;
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * Specifies whether to display the shopping cart button.
         */
        public Builder cartEnable(Boolean cartEnable) {
            this.putQueryParameter("CartEnable", cartEnable);
            this.cartEnable = cartEnable;
            return this;
        }

        /**
         * Specifies whether to display the catalog button.
         */
        public Builder catalogVisible(Boolean catalogVisible) {
            this.putQueryParameter("CatalogVisible", catalogVisible);
            this.catalogVisible = catalogVisible;
            return this;
        }

        /**
         * The space ID of the user within the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public UpdateCommerceSettingRequest build() {
            return new UpdateCommerceSettingRequest(this);
        } 

    } 

}
