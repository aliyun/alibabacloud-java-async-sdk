// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmAddressEnableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressEnableStatusRequest</p>
 */
public class UpdateCloudGtmAddressEnableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableStatus;

    private UpdateCloudGtmAddressEnableStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressId = builder.addressId;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressEnableStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressEnableStatusRequest, Builder> {
        private String acceptLanguage; 
        private String addressId; 
        private String clientToken; 
        private String enableStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressEnableStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressId = request.addressId;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AddressId.
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        @Override
        public UpdateCloudGtmAddressEnableStatusRequest build() {
            return new UpdateCloudGtmAddressEnableStatusRequest(this);
        } 

    } 

}
