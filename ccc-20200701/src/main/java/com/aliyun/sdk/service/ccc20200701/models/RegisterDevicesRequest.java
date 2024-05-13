// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDevicesRequest} extends {@link RequestModel}
 *
 * <p>RegisterDevicesRequest</p>
 */
public class RegisterDevicesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserIdListJson")
    private String userIdListJson;

    private RegisterDevicesRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.userIdListJson = builder.userIdListJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDevicesRequest create() {
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
     * @return userIdListJson
     */
    public String getUserIdListJson() {
        return this.userIdListJson;
    }

    public static final class Builder extends Request.Builder<RegisterDevicesRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String password; 
        private String userIdListJson; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDevicesRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.userIdListJson = request.userIdListJson;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * UserIdListJson.
         */
        public Builder userIdListJson(String userIdListJson) {
            this.putQueryParameter("UserIdListJson", userIdListJson);
            this.userIdListJson = userIdListJson;
            return this;
        }

        @Override
        public RegisterDevicesRequest build() {
            return new RegisterDevicesRequest(this);
        } 

    } 

}
