// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link ListExpressConnectRouterSupportedRegionRequest} extends {@link RequestModel}
 *
 * <p>ListExpressConnectRouterSupportedRegionRequest</p>
 */
public class ListExpressConnectRouterSupportedRegionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeType;

    private ListExpressConnectRouterSupportedRegionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExpressConnectRouterSupportedRegionRequest create() {
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<ListExpressConnectRouterSupportedRegionRequest, Builder> {
        private String clientToken; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(ListExpressConnectRouterSupportedRegionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.nodeType = request.nodeType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>TR</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>VPC</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public ListExpressConnectRouterSupportedRegionRequest build() {
            return new ListExpressConnectRouterSupportedRegionRequest(this);
        } 

    } 

}
