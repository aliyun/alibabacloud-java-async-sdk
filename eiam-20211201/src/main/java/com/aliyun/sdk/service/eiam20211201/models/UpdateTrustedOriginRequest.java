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
 * {@link UpdateTrustedOriginRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrustedOriginRequest</p>
 */
public class UpdateTrustedOriginRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TrustOriginName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String trustOriginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String trustedOriginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustedOriginScene")
    private java.util.List<String> trustedOriginScene;

    private UpdateTrustedOriginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.trustOriginName = builder.trustOriginName;
        this.trustedOriginId = builder.trustedOriginId;
        this.trustedOriginScene = builder.trustedOriginScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrustedOriginRequest create() {
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
     * @return trustOriginName
     */
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    /**
     * @return trustedOriginId
     */
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

    /**
     * @return trustedOriginScene
     */
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

    public static final class Builder extends Request.Builder<UpdateTrustedOriginRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private String trustOriginName; 
        private String trustedOriginId; 
        private java.util.List<String> trustedOriginScene; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrustedOriginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.trustOriginName = request.trustOriginName;
            this.trustedOriginId = request.trustedOriginId;
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
         * <p>The idempotence token.</p>
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
         * <p>The instance ID.</p>
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
         * <p>The trusted origin name.</p>
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
         * <p>The trusted origin ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>to_example</p>
         */
        public Builder trustedOriginId(String trustedOriginId) {
            this.putQueryParameter("TrustedOriginId", trustedOriginId);
            this.trustedOriginId = trustedOriginId;
            return this;
        }

        /**
         * <p>The trusted origin scenario.</p>
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
        public UpdateTrustedOriginRequest build() {
            return new UpdateTrustedOriginRequest(this);
        } 

    } 

}
