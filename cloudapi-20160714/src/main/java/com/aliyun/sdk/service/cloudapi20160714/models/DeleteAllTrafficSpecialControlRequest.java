// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DeleteAllTrafficSpecialControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteAllTrafficSpecialControlRequest</p>
 */
public class DeleteAllTrafficSpecialControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlId;

    private DeleteAllTrafficSpecialControlRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAllTrafficSpecialControlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder extends Request.Builder<DeleteAllTrafficSpecialControlRequest, Builder> {
        private String securityToken; 
        private String trafficControlId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAllTrafficSpecialControlRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.trafficControlId = request.trafficControlId;
        } 

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the throttling policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf123456</p>
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        @Override
        public DeleteAllTrafficSpecialControlRequest build() {
            return new DeleteAllTrafficSpecialControlRequest(this);
        } 

    } 

}
