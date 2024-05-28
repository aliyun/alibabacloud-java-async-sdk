// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmAddressManualAvailableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressManualAvailableStatusRequest</p>
 */
public class UpdateCloudGtmAddressManualAvailableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableMode")
    private String availableMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManualAvailableStatus")
    private String manualAvailableStatus;

    private UpdateCloudGtmAddressManualAvailableStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressId = builder.addressId;
        this.availableMode = builder.availableMode;
        this.clientToken = builder.clientToken;
        this.manualAvailableStatus = builder.manualAvailableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressManualAvailableStatusRequest create() {
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
     * @return availableMode
     */
    public String getAvailableMode() {
        return this.availableMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return manualAvailableStatus
     */
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressManualAvailableStatusRequest, Builder> {
        private String acceptLanguage; 
        private String addressId; 
        private String availableMode; 
        private String clientToken; 
        private String manualAvailableStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressManualAvailableStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressId = request.addressId;
            this.availableMode = request.availableMode;
            this.clientToken = request.clientToken;
            this.manualAvailableStatus = request.manualAvailableStatus;
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
         * AvailableMode.
         */
        public Builder availableMode(String availableMode) {
            this.putQueryParameter("AvailableMode", availableMode);
            this.availableMode = availableMode;
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
         * ManualAvailableStatus.
         */
        public Builder manualAvailableStatus(String manualAvailableStatus) {
            this.putQueryParameter("ManualAvailableStatus", manualAvailableStatus);
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }

        @Override
        public UpdateCloudGtmAddressManualAvailableStatusRequest build() {
            return new UpdateCloudGtmAddressManualAvailableStatusRequest(this);
        } 

    } 

}
