// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < TransitModeList> transitModeList;

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
    public java.util.List < TransitModeList> getTransitModeList() {
        return this.transitModeList;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectRouterInterRegionTransitModeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private java.util.List < TransitModeList> transitModeList; 

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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * TransitModeList.
         */
        public Builder transitModeList(java.util.List < TransitModeList> transitModeList) {
            this.putBodyParameter("TransitModeList", transitModeList);
            this.transitModeList = transitModeList;
            return this;
        }

        @Override
        public ModifyExpressConnectRouterInterRegionTransitModeRequest build() {
            return new ModifyExpressConnectRouterInterRegionTransitModeRequest(this);
        } 

    } 

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
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * RegionId.
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
