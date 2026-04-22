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
 * {@link DescribePvtzStatisticsGlobalOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribePvtzStatisticsGlobalOverviewRequest</p>
 */
public class DescribePvtzStatisticsGlobalOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkParams")
    private java.util.List<NetworkParams> networkParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverviewPeriod")
    private String overviewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    private DescribePvtzStatisticsGlobalOverviewRequest(Builder builder) {
        super(builder);
        this.networkParams = builder.networkParams;
        this.overviewPeriod = builder.overviewPeriod;
        this.serverRegion = builder.serverRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsGlobalOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribePvtzStatisticsGlobalOverviewRequest, Builder> {
        private java.util.List<NetworkParams> networkParams; 
        private String overviewPeriod; 
        private String serverRegion; 

        private Builder() {
            super();
        } 

        private Builder(DescribePvtzStatisticsGlobalOverviewRequest request) {
            super(request);
            this.networkParams = request.networkParams;
            this.overviewPeriod = request.overviewPeriod;
            this.serverRegion = request.serverRegion;
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
        public DescribePvtzStatisticsGlobalOverviewRequest build() {
            return new DescribePvtzStatisticsGlobalOverviewRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsGlobalOverviewRequest} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsGlobalOverviewRequest</p>
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
             * <p>vpc-bp1y5y4wk5810n50cx765</p>
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
