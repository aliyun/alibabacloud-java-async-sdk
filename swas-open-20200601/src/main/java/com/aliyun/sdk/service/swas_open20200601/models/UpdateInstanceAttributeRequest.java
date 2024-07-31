// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAttributeRequest</p>
 */
public class UpdateInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceAttributeRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String instanceName; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the simple application server. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`. The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The new password of the simple application server. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password can contain the following special characters:
         * <p>
         * 
         *     ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/
         * 
         * For Windows instances, the password cannot start with a forward slash (/).
         * 
         * >  For security reasons, we recommend that you use HTTPS to send requests if the `Password parameter` is specified.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID of the simple application server.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateInstanceAttributeRequest build() {
            return new UpdateInstanceAttributeRequest(this);
        } 

    } 

}
