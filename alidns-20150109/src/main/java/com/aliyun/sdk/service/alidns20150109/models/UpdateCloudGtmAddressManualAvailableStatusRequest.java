// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the address. This ID uniquely identifies the address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
         * <ul>
         * <li>auto: the automatic mode. The system determines whether to return an address based on health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
         * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder availableMode(String availableMode) {
            this.putQueryParameter("AvailableMode", availableMode);
            this.availableMode = availableMode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The availability state of the address when AvailableMode is set to manual. Valid values:</p>
         * <ul>
         * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
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
