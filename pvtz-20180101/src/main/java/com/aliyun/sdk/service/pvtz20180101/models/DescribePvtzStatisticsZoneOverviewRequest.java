// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link DescribePvtzStatisticsZoneOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribePvtzStatisticsZoneOverviewRequest</p>
 */
public class DescribePvtzStatisticsZoneOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkParams")
    private java.util.List<NetworkParams> networkParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverviewPeriod")
    private String overviewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    private DescribePvtzStatisticsZoneOverviewRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.module = builder.module;
        this.networkParams = builder.networkParams;
        this.overviewPeriod = builder.overviewPeriod;
        this.serverRegion = builder.serverRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsZoneOverviewRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return networkParams
     */
    public java.util.List<NetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    /**
     * @return overviewPeriod
     */
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    /**
     * @return serverRegion
     */
    public String getServerRegion() {
        return this.serverRegion;
    }

    public static final class Builder extends Request.Builder<DescribePvtzStatisticsZoneOverviewRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String module; 
        private java.util.List<NetworkParams> networkParams; 
        private String overviewPeriod; 
        private String serverRegion; 

        private Builder() {
            super();
        } 

        private Builder(DescribePvtzStatisticsZoneOverviewRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.module = request.module;
            this.networkParams = request.networkParams;
            this.overviewPeriod = request.overviewPeriod;
            this.serverRegion = request.serverRegion;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * NetworkParams.
         */
        public Builder networkParams(java.util.List<NetworkParams> networkParams) {
            this.putQueryParameter("NetworkParams", networkParams);
            this.networkParams = networkParams;
            return this;
        }

        /**
         * OverviewPeriod.
         */
        public Builder overviewPeriod(String overviewPeriod) {
            this.putQueryParameter("OverviewPeriod", overviewPeriod);
            this.overviewPeriod = overviewPeriod;
            return this;
        }

        /**
         * ServerRegion.
         */
        public Builder serverRegion(String serverRegion) {
            this.putQueryParameter("ServerRegion", serverRegion);
            this.serverRegion = serverRegion;
            return this;
        }

        @Override
        public DescribePvtzStatisticsZoneOverviewRequest build() {
            return new DescribePvtzStatisticsZoneOverviewRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsZoneOverviewRequest} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsZoneOverviewRequest</p>
     */
    public static class NetworkParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcOwner")
        private String vpcOwner;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        private NetworkParams(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.vpcOwner = builder.vpcOwner;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkParams create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcOwner
         */
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 
            private String vpcOwner; 
            private String vpcType; 

            private Builder() {
            } 

            private Builder(NetworkParams model) {
                this.regionId = model.regionId;
                this.vpcId = model.vpcId;
                this.vpcOwner = model.vpcOwner;
                this.vpcType = model.vpcType;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf68l2l04nqoyg7ie1kaw</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcOwner.
             */
            public Builder vpcOwner(String vpcOwner) {
                this.vpcOwner = vpcOwner;
                return this;
            }

            /**
             * VpcType.
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public NetworkParams build() {
                return new NetworkParams(this);
            } 

        } 

    }
}
