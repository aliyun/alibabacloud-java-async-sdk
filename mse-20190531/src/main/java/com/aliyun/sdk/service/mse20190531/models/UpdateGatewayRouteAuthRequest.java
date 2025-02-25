// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayRouteAuthRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteAuthRequest</p>
 */
public class UpdateGatewayRouteAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthJSON")
    @com.aliyun.core.annotation.Validation(required = true)
    private AuthJSON authJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private UpdateGatewayRouteAuthRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authJSON = builder.authJSON;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return authJSON
     */
    public AuthJSON getAuthJSON() {
        return this.authJSON;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteAuthRequest, Builder> {
        private String acceptLanguage; 
        private AuthJSON authJSON; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteAuthRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authJSON = request.authJSON;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The authentication configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder authJSON(AuthJSON authJSON) {
            String authJSONShrink = shrink(authJSON, "AuthJSON", "json");
            this.putQueryParameter("AuthJSON", authJSONShrink);
            this.authJSON = authJSON;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-0adf3ad751284cc69fcf9669fba*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The route ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayRouteAuthRequest build() {
            return new UpdateGatewayRouteAuthRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayRouteAuthRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayRouteAuthRequest</p>
     */
    public static class AuthJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AuthJSON(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthJSON create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * <p>The authentication type. If an empty string is passed, no authentication type is available. Valid values:</p>
             * <ul>
             * <li>JWT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JWT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AuthJSON build() {
                return new AuthJSON(this);
            } 

        } 

    }
}
