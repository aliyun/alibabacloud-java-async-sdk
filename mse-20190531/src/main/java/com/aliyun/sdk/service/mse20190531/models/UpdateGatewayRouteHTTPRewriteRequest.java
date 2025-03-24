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
 * {@link UpdateGatewayRouteHTTPRewriteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteHTTPRewriteRequest</p>
 */
public class UpdateGatewayRouteHTTPRewriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpRewriteJSON")
    private String httpRewriteJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private UpdateGatewayRouteHTTPRewriteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.httpRewriteJSON = builder.httpRewriteJSON;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteHTTPRewriteRequest create() {
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
     * @return httpRewriteJSON
     */
    public String getHttpRewriteJSON() {
        return this.httpRewriteJSON;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteHTTPRewriteRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String httpRewriteJSON; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteHTTPRewriteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.httpRewriteJSON = request.httpRewriteJSON;
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
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>430</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-90392d768a3847a7b804c505254da96d</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The information about the rewrite policy. The JSON format is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pathType&quot;:&quot;PRE&quot;,&quot;path&quot;:&quot;/&quot;,&quot;status&quot;:&quot;off&quot;}</p>
         */
        public Builder httpRewriteJSON(String httpRewriteJSON) {
            this.putQueryParameter("HttpRewriteJSON", httpRewriteJSON);
            this.httpRewriteJSON = httpRewriteJSON;
            return this;
        }

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>238</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayRouteHTTPRewriteRequest build() {
            return new UpdateGatewayRouteHTTPRewriteRequest(this);
        } 

    } 

}
