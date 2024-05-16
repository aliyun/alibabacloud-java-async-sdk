// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableExpressConnectRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>EnableExpressConnectRouterRouteEntriesRequest</p>
 */
public class EnableExpressConnectRouterRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NexthopInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nexthopInstanceId;

    private EnableExpressConnectRouterRouteEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.nexthopInstanceId = builder.nexthopInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableExpressConnectRouterRouteEntriesRequest create() {
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
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return nexthopInstanceId
     */
    public String getNexthopInstanceId() {
        return this.nexthopInstanceId;
    }

    public static final class Builder extends Request.Builder<EnableExpressConnectRouterRouteEntriesRequest, Builder> {
        private String clientToken; 
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String ecrId; 
        private String nexthopInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(EnableExpressConnectRouterRouteEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.nexthopInstanceId = request.nexthopInstanceId;
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
         * DestinationCidrBlock.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EcrId.
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * NexthopInstanceId.
         */
        public Builder nexthopInstanceId(String nexthopInstanceId) {
            this.putBodyParameter("NexthopInstanceId", nexthopInstanceId);
            this.nexthopInstanceId = nexthopInstanceId;
            return this;
        }

        @Override
        public EnableExpressConnectRouterRouteEntriesRequest build() {
            return new EnableExpressConnectRouterRouteEntriesRequest(this);
        } 

    } 

}
