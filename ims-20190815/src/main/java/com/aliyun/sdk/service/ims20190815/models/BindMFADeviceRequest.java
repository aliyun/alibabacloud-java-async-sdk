// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>BindMFADeviceRequest</p>
 */
public class BindMFADeviceRequest extends Request {
    @Query
    @NameInMap("AuthenticationCode1")
    private String authenticationCode1;

    @Query
    @NameInMap("AuthenticationCode2")
    private String authenticationCode2;

    @Query
    @NameInMap("SerialNumber")
    private String serialNumber;

    @Query
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
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
         * The first verification code.
         * <p>
         * 
         * >  You can call the [CreateVirtualMFADevice](~~186179~~) operation to create an MFA device and generate a key (value of `Base32StringSeed`). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.
         */
        public Builder authenticationCode1(String authenticationCode1) {
            this.putQueryParameter("AuthenticationCode1", authenticationCode1);
            this.authenticationCode1 = authenticationCode1;
            return this;
        }

        /**
         * The second verification code.
         * <p>
         * 
         * >  You can call the [CreateVirtualMFADevice](~~186179~~) operation to create an MFA device and generate a key (value of `Base32StringSeed`). Then, use the key on the Alibaba Cloud app to manually add an MFA device, and obtain the two consecutive verification codes.
         */
        public Builder authenticationCode2(String authenticationCode2) {
            this.putQueryParameter("AuthenticationCode2", authenticationCode2);
            this.authenticationCode2 = authenticationCode2;
            return this;
        }

        /**
         * The serial number of the MFA device.
         * <p>
         * 
         * >  You can call the [CreateVirtualMFADevice](~~186179~~) operation to obtain the serial number of the MFA device.
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * The logon name of the RAM user.
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
