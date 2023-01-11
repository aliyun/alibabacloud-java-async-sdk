// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPhoneBusinessProfileRequest} extends {@link RequestModel}
 *
 * <p>QueryPhoneBusinessProfileRequest</p>
 */
public class QueryPhoneBusinessProfileRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    private QueryPhoneBusinessProfileRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPhoneBusinessProfileRequest create() {
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

    public static final class Builder extends Request.Builder<QueryPhoneBusinessProfileRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryPhoneBusinessProfileRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * ISV子客户的SpaceId
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
        public QueryPhoneBusinessProfileRequest build() {
            return new QueryPhoneBusinessProfileRequest(this);
        } 

    } 

}
