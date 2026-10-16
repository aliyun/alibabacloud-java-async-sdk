// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetUserPoolClientRequest} extends {@link RequestModel}
 *
 * <p>GetUserPoolClientRequest</p>
 */
public class GetUserPoolClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private GetUserPoolClientRequest(Builder builder) {
        super(builder);
        this.clientName = builder.clientName;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPoolClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<GetUserPoolClientRequest, Builder> {
        private String clientName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserPoolClientRequest request) {
            super(request);
            this.clientName = request.clientName;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>my-web-app</p>
         */
        public Builder clientName(String clientName) {
            this.putBodyParameter("ClientName", clientName);
            this.clientName = clientName;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public GetUserPoolClientRequest build() {
            return new GetUserPoolClientRequest(this);
        } 

    } 

}
