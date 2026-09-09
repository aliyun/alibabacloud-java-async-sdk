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
 * {@link CreateTrustedOriginRequest} extends {@link RequestModel}
 *
 * <p>CreateTrustedOriginRequest</p>
 */
public class CreateTrustedOriginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustOriginName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String trustOriginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustedOriginScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> trustedOriginScene;

    private CreateTrustedOriginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.origin = builder.origin;
        this.trustOriginName = builder.trustOriginName;
        this.trustedOriginScene = builder.trustedOriginScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrustedOriginRequest create() {
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
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return trustOriginName
     */
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    /**
     * @return trustedOriginScene
     */
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

    public static final class Builder extends Request.Builder<CreateTrustedOriginRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private String origin; 
        private String trustOriginName; 
        private java.util.List<String> trustedOriginScene; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrustedOriginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.origin = request.origin;
            this.trustOriginName = request.trustOriginName;
            this.trustedOriginScene = request.trustedOriginScene;
        } 

        /**
         * <p>资源所属地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique among different requests. The value of ClientToken can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the IDaaS EIAM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The browser origin in the format of scheme://host[:port]. This value cannot be modified after creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The name of the trusted origin used for management, display, and auditing. If not specified, the value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Qoder Production Console</p>
         */
        public Builder trustOriginName(String trustOriginName) {
            this.putQueryParameter("TrustOriginName", trustOriginName);
            this.trustOriginName = trustOriginName;
            return this;
        }

        /**
         * <p>The trusted origin scenes. Only iframe_embed and cors are supported. At least one value is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iframe_embed</p>
         */
        public Builder trustedOriginScene(java.util.List<String> trustedOriginScene) {
            this.putQueryParameter("TrustedOriginScene", trustedOriginScene);
            this.trustedOriginScene = trustedOriginScene;
            return this;
        }

        @Override
        public CreateTrustedOriginRequest build() {
            return new CreateTrustedOriginRequest(this);
        } 

    } 

}
