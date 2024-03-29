// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommerceSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommerceSettingRequest</p>
 */
public class UpdateCommerceSettingRequest extends Request {
    @Query
    @NameInMap("CartEnable")
    @Validation(required = true)
    private Boolean cartEnable;

    @Query
    @NameInMap("CatalogVisible")
    @Validation(required = true)
    private Boolean catalogVisible;

    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
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
         * CartEnable.
         */
        public Builder cartEnable(Boolean cartEnable) {
            this.putQueryParameter("CartEnable", cartEnable);
            this.cartEnable = cartEnable;
            return this;
        }

        /**
         * CatalogVisible.
         */
        public Builder catalogVisible(Boolean catalogVisible) {
            this.putQueryParameter("CatalogVisible", catalogVisible);
            this.catalogVisible = catalogVisible;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * PhoneNumber.
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
