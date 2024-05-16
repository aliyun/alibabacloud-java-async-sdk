// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * NodeType.
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
