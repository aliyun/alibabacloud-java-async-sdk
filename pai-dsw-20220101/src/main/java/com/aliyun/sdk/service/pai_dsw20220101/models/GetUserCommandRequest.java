// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetUserCommandRequest} extends {@link RequestModel}
 *
 * <p>GetUserCommandRequest</p>
 */
public class GetUserCommandRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("UserCommandId")
    private String userCommandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetUserCommandRequest(Builder builder) {
        super(builder);
        this.userCommandId = builder.userCommandId;
        this.instanceId = builder.instanceId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userCommandId
     */
    public String getUserCommandId() {
        return this.userCommandId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetUserCommandRequest, Builder> {
        private String userCommandId; 
        private String instanceId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetUserCommandRequest request) {
            super(request);
            this.userCommandId = request.userCommandId;
            this.instanceId = request.instanceId;
            this.token = request.token;
        } 

        /**
         * UserCommandId.
         */
        public Builder userCommandId(String userCommandId) {
            this.putPathParameter("UserCommandId", userCommandId);
            this.userCommandId = userCommandId;
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
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetUserCommandRequest build() {
            return new GetUserCommandRequest(this);
        } 

    } 

}
