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
 * {@link DeleteTrustedOriginRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrustedOriginRequest</p>
 */
public class DeleteTrustedOriginRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String trustedOriginId;

    private DeleteTrustedOriginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.trustedOriginId = builder.trustedOriginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrustedOriginRequest create() {
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
     * @return trustedOriginId
     */
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

    public static final class Builder extends Request.Builder<DeleteTrustedOriginRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private String trustedOriginId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrustedOriginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.trustedOriginId = request.trustedOriginId;
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
         * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
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
         * <p>IDaaS EIAM实例的ID。</p>
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
         * <p>可信来源ID。</p>
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

        @Override
        public DeleteTrustedOriginRequest build() {
            return new DeleteTrustedOriginRequest(this);
        } 

    } 

}
