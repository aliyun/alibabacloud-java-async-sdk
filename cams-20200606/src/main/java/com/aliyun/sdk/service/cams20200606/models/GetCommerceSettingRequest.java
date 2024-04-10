// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommerceSettingRequest} extends {@link RequestModel}
 *
 * <p>GetCommerceSettingRequest</p>
 */
public class GetCommerceSettingRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    private GetCommerceSettingRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommerceSettingRequest create() {
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

    public static final class Builder extends Request.Builder<GetCommerceSettingRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetCommerceSettingRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
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
        public GetCommerceSettingRequest build() {
            return new GetCommerceSettingRequest(this);
        } 

    } 

}
