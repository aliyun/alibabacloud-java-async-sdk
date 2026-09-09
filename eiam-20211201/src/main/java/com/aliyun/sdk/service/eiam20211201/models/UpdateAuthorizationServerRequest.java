// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateAuthorizationServerRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationServerRequest</p>
 */
public class UpdateAuthorizationServerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationServerId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationServerName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String authorizationServerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuerDomain")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String issuerDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuerMode")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String issuerMode;

    private UpdateAuthorizationServerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationServerId = builder.authorizationServerId;
        this.authorizationServerName = builder.authorizationServerName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.issuerDomain = builder.issuerDomain;
        this.issuerMode = builder.issuerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authorizationServerId
     */
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    /**
     * @return authorizationServerName
     */
    public String getAuthorizationServerName() {
        return this.authorizationServerName;
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
     * @return issuerDomain
     */
    public String getIssuerDomain() {
        return this.issuerDomain;
    }

    /**
     * @return issuerMode
     */
    public String getIssuerMode() {
        return this.issuerMode;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationServerRequest, Builder> {
        private String regionId; 
        private String authorizationServerId; 
        private String authorizationServerName; 
        private String clientToken; 
        private String instanceId; 
        private String issuerDomain; 
        private String issuerMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationServerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationServerId = request.authorizationServerId;
            this.authorizationServerName = request.authorizationServerName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.issuerDomain = request.issuerDomain;
            this.issuerMode = request.issuerMode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The authorization server ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        public Builder authorizationServerId(String authorizationServerId) {
            this.putQueryParameter("AuthorizationServerId", authorizationServerId);
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        /**
         * <p>The name of the authorization server.</p>
         * 
         * <strong>example:</strong>
         * <p>my_authorization_server</p>
         */
        public Builder authorizationServerName(String authorizationServerName) {
            this.putQueryParameter("AuthorizationServerName", authorizationServerName);
            this.authorizationServerName = authorizationServerName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123xyz</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The domain name used by the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.aliyunidaas.com</p>
         */
        public Builder issuerDomain(String issuerDomain) {
            this.putQueryParameter("IssuerDomain", issuerDomain);
            this.issuerDomain = issuerDomain;
            return this;
        }

        /**
         * <p>The issuer mode.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic</p>
         */
        public Builder issuerMode(String issuerMode) {
            this.putQueryParameter("IssuerMode", issuerMode);
            this.issuerMode = issuerMode;
            return this;
        }

        @Override
        public UpdateAuthorizationServerRequest build() {
            return new UpdateAuthorizationServerRequest(this);
        } 

    } 

}
