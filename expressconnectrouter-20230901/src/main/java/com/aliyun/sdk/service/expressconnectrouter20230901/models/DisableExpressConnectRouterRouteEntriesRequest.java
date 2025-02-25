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
 * {@link DisableExpressConnectRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>DisableExpressConnectRouterRouteEntriesRequest</p>
 */
public class DisableExpressConnectRouterRouteEntriesRequest extends Request {
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route entry in the route table of the ECR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.153.32.16/28</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The ID of the next-hop instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-hp3u4u5f03tfuljis****</p>
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
