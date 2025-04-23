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
         * <p>返回结果显示的语言。取值：</p>
         * <ul>
         * <li><p>zh-CN：中文</p>
         * </li>
         * <li><p>en-US：英文</p>
         * </li>
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
         * <p>The enabling state of the address. Valid values:</p>
         * <ul>
         * <li>enable: The address is enabled and the address can be used for Domain Name System (DNS) resolution if the address passes health checks.</li>
         * <li>disable: The address is disabled and the address cannot be used for DNS resolution regardless of whether the address passes health checks or not.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
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
