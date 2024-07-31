// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachKeyPairRequest} extends {@link RequestModel}
 *
 * <p>DetachKeyPairRequest</p>
 */
public class DetachKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DetachKeyPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceIds = builder.instanceIds;
        this.keyPairName = builder.keyPairName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachKeyPairRequest create() {
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachKeyPairRequest, Builder> {
        private String clientToken; 
        private java.util.List < String > instanceIds; 
        private String keyPairName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachKeyPairRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceIds = request.instanceIds;
            this.keyPairName = request.keyPairName;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The IDs of the simple application servers from which you want to unbind SSH key pairs. You can specify a maximum of 50 IDs of simple application servers.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The name of the key pair. The name must be globally unique. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The region ID of the simple application servers.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachKeyPairRequest build() {
            return new DetachKeyPairRequest(this);
        } 

    } 

}
