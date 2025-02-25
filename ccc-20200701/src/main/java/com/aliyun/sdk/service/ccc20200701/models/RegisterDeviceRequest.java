// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link RegisterDeviceRequest} extends {@link RequestModel}
 *
 * <p>RegisterDeviceRequest</p>
 */
public class RegisterDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private RegisterDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String password; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-device</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RegisterDeviceRequest build() {
            return new RegisterDeviceRequest(this);
        } 

    } 

}
