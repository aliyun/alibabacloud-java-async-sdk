// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableExpressConnectRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DisableExpressConnectRouterRouteEntriesRequest</p>
 */
public class DisableExpressConnectRouterRouteEntriesRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    private String destinationCidrBlock;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EcrId")
    @Validation(required = true)
    private String ecrId;

    @Body
    @NameInMap("NexthopInstanceId")
    @Validation(required = true)
    private String nexthopInstanceId;

    private DisableExpressConnectRouterRouteEntriesRequest(Builder builder) {
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

    public static DisableExpressConnectRouterRouteEntriesRequest create() {
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

    public static final class Builder extends Request.Builder<DisableExpressConnectRouterRouteEntriesRequest, Builder> {
        private String clientToken; 
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String ecrId; 
        private String nexthopInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableExpressConnectRouterRouteEntriesRequest request) {
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
        public DisableExpressConnectRouterRouteEntriesRequest build() {
            return new DisableExpressConnectRouterRouteEntriesRequest(this);
        } 

    } 

}
