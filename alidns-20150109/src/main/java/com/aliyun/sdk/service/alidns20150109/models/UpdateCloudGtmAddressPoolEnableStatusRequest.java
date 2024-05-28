// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmAddressPoolEnableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressPoolEnableStatusRequest</p>
 */
public class UpdateCloudGtmAddressPoolEnableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    private UpdateCloudGtmAddressPoolEnableStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolId = builder.addressPoolId;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressPoolEnableStatusRequest create() {
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
     * @return addressPoolId
     */
    public String getAddressPoolId() {
        return this.addressPoolId;
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

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressPoolEnableStatusRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolId; 
        private String clientToken; 
        private String enableStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressPoolEnableStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolId = request.addressPoolId;
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
         * AddressPoolId.
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
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
        public UpdateCloudGtmAddressPoolEnableStatusRequest build() {
            return new UpdateCloudGtmAddressPoolEnableStatusRequest(this);
        } 

    } 

}
