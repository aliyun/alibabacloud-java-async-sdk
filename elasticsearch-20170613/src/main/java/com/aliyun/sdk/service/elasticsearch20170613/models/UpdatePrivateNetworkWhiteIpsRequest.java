// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdatePrivateNetworkWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateNetworkWhiteIpsRequest</p>
 */
public class UpdatePrivateNetworkWhiteIpsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modifyMode")
    private String modifyMode;

    private UpdatePrivateNetworkWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.modifyMode = builder.modifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateNetworkWhiteIpsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static final class Builder extends Request.Builder<UpdatePrivateNetworkWhiteIpsRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String clientToken; 
        private String modifyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateNetworkWhiteIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.modifyMode = request.modifyMode;
        } 

        /**
         * <p>Cover</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-tl329rbpc0001****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The results that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        @Override
        public UpdatePrivateNetworkWhiteIpsRequest build() {
            return new UpdatePrivateNetworkWhiteIpsRequest(this);
        } 

    } 

}
