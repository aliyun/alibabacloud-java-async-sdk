// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewAppGroupRequest} extends {@link RequestModel}
 *
 * <p>RenewAppGroupRequest</p>
 */
public class RenewAppGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PrepayOrderInfo body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private RenewAppGroupRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return body
     */
    public PrepayOrderInfo getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<RenewAppGroupRequest, Builder> {
        private String appGroupIdentity; 
        private PrepayOrderInfo body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(RenewAppGroupRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The renewal request body.
         */
        public Builder body(PrepayOrderInfo body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public RenewAppGroupRequest build() {
            return new RenewAppGroupRequest(this);
        } 

    } 

}
