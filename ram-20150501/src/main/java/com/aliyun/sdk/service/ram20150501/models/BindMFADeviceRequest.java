// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private BindMFADeviceRequest(Builder builder) {
        super(builder);
        this.authenticationCode1 = builder.authenticationCode1;
        this.authenticationCode2 = builder.authenticationCode2;
        this.serialNumber = builder.serialNumber;
        this.userName = builder.userName;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<BindMFADeviceRequest, Builder> {
        private String authenticationCode1; 
        private String authenticationCode2; 
        private String serialNumber; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(BindMFADeviceRequest request) {
            super(request);
            this.authenticationCode1 = request.authenticationCode1;
            this.authenticationCode2 = request.authenticationCode2;
            this.serialNumber = request.serialNumber;
            this.userName = request.userName;
        } 

        /**
         * <p>The first authentication code.</p>
         * 
         * <strong>example:</strong>
         * <p>11****</p>
         */
        public Builder authenticationCode1(String authenticationCode1) {
            this.putQueryParameter("AuthenticationCode1", authenticationCode1);
            this.authenticationCode1 = authenticationCode1;
            return this;
        }

        /**
         * <p>The second authentication code.</p>
         * 
         * <strong>example:</strong>
         * <p>33****</p>
         */
        public Builder authenticationCode2(String authenticationCode2) {
            this.putQueryParameter("AuthenticationCode2", authenticationCode2);
            this.authenticationCode2 = authenticationCode2;
            return this;
        }

        /**
         * <p>The serial number of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:mfa/device002</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangq****</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public BindMFADeviceRequest build() {
            return new BindMFADeviceRequest(this);
        } 

    } 

}
