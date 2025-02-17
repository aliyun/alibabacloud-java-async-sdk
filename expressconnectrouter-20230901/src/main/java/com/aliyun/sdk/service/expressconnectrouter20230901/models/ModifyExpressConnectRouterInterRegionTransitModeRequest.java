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
 * {@link ModifyExpressConnectRouterInterRegionTransitModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectRouterInterRegionTransitModeRequest</p>
 */
public class ModifyExpressConnectRouterInterRegionTransitModeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransitModeList")
    private java.util.List<TransitModeList> transitModeList;

    private ModifyExpressConnectRouterInterRegionTransitModeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.transitModeList = builder.transitModeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectRouterInterRegionTransitModeRequest create() {
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
     * @return transitModeList
     */
    public java.util.List<TransitModeList> getTransitModeList() {
        return this.transitModeList;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectRouterInterRegionTransitModeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private java.util.List<TransitModeList> transitModeList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectRouterInterRegionTransitModeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.transitModeList = request.transitModeList;
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
         * <p>The cross-region forwarding modes.</p>
         */
        public Builder transitModeList(java.util.List<TransitModeList> transitModeList) {
            this.putBodyParameter("TransitModeList", transitModeList);
            this.transitModeList = transitModeList;
            return this;
        }

        @Override
        public ModifyExpressConnectRouterInterRegionTransitModeRequest build() {
            return new ModifyExpressConnectRouterInterRegionTransitModeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyExpressConnectRouterInterRegionTransitModeRequest} extends {@link TeaModel}
     *
     * <p>ModifyExpressConnectRouterInterRegionTransitModeRequest</p>
     */
    public static class TransitModeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private TransitModeList(Builder builder) {
            this.mode = builder.mode;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitModeList create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String mode; 
            private String regionId; 

            /**
             * <p>The cross-domain forwarding mode of the ECR. Valid values:</p>
             * <ul>
             * <li><strong>ECMP</strong>: the load balancing mode.</li>
             * <li><strong>NearBy</strong>: the nearby forwarding mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECMP</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The region ID of the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public TransitModeList build() {
                return new TransitModeList(this);
            } 

        } 

    }
}
