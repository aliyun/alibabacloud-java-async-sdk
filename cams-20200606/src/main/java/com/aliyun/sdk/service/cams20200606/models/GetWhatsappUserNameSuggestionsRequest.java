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
 * {@link GetWhatsappUserNameSuggestionsRequest} extends {@link RequestModel}
 *
 * <p>GetWhatsappUserNameSuggestionsRequest</p>
 */
public class GetWhatsappUserNameSuggestionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    private GetWhatsappUserNameSuggestionsRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWhatsappUserNameSuggestionsRequest create() {
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

    public static final class Builder extends Request.Builder<GetWhatsappUserNameSuggestionsRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetWhatsappUserNameSuggestionsRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-dk**</p>
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
         * <p>8613800**</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public GetWhatsappUserNameSuggestionsRequest build() {
            return new GetWhatsappUserNameSuggestionsRequest(this);
        } 

    } 

}
