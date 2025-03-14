// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ResetSystemRequest} extends {@link RequestModel}
 *
 * <p>ResetSystemRequest</p>
 */
public class ResetSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginCredentials")
    private LoginCredentials loginCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ResetSystemRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.loginCredentials = builder.loginCredentials;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSystemRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginCredentials
     */
    public LoginCredentials getLoginCredentials() {
        return this.loginCredentials;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetSystemRequest, Builder> {
        private String clientToken; 
        private String imageId; 
        private String instanceId; 
        private LoginCredentials loginCredentials; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetSystemRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.loginCredentials = request.loginCredentials;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that you want to use to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a></p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the destination image. If you do not specify this parameter, the current image is reset.</p>
         * 
         * <strong>example:</strong>
         * <p>794c230fd3e64ea19f83f4d7a0ad****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the simple application server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ace0706b2ac4454d984295a94213****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LoginCredentials.
         */
        public Builder loginCredentials(LoginCredentials loginCredentials) {
            this.putQueryParameter("LoginCredentials", loginCredentials);
            this.loginCredentials = loginCredentials;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetSystemRequest build() {
            return new ResetSystemRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResetSystemRequest} extends {@link TeaModel}
     *
     * <p>ResetSystemRequest</p>
     */
    public static class LoginCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        private LoginCredentials(Builder builder) {
            this.keyPairName = builder.keyPairName;
            this.password = builder.password;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginCredentials create() {
            return builder().build();
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String keyPairName; 
            private String password; 

            private Builder() {
            } 

            private Builder(LoginCredentials model) {
                this.keyPairName = model.keyPairName;
                this.password = model.password;
            } 

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public LoginCredentials build() {
                return new LoginCredentials(this);
            } 

        } 

    }
}
