// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link BindMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>BindMFADeviceRequest</p>
 */
public class BindMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationCode1")
    private String authenticationCode1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationCode2")
    private String authenticationCode2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrincipalName;

    private BindMFADeviceRequest(Builder builder) {
        super(builder);
        this.authenticationCode1 = builder.authenticationCode1;
        this.authenticationCode2 = builder.authenticationCode2;
        this.serialNumber = builder.serialNumber;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindMFADeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationCode1
     */
    public String getAuthenticationCode1() {
        return this.authenticationCode1;
    }

    /**
     * @return authenticationCode2
     */
    public String getAuthenticationCode2() {
        return this.authenticationCode2;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<BindMFADeviceRequest, Builder> {
        private String authenticationCode1; 
        private String authenticationCode2; 
        private String serialNumber; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(BindMFADeviceRequest request) {
            super(request);
            this.authenticationCode1 = request.authenticationCode1;
            this.authenticationCode2 = request.authenticationCode2;
            this.serialNumber = request.serialNumber;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The first verification code.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to create an MFA device and generate a key (value of <code>Base32StringSeed</code>). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder authenticationCode1(String authenticationCode1) {
            this.putQueryParameter("AuthenticationCode1", authenticationCode1);
            this.authenticationCode1 = authenticationCode1;
            return this;
        }

        /**
         * <p>The second verification code.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to create an MFA device and generate a key (value of <code>Base32StringSeed</code>). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>654321</p>
         */
        public Builder authenticationCode2(String authenticationCode2) {
            this.putQueryParameter("AuthenticationCode2", authenticationCode2);
            this.authenticationCode2 = authenticationCode2;
            return this;
        }

        /**
         * <p>The serial number of the MFA device.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/186179.html">CreateVirtualMFADevice</a> operation to obtain the serial number of the MFA device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:mfa/device001</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public BindMFADeviceRequest build() {
            return new BindMFADeviceRequest(this);
        } 

    } 

}
