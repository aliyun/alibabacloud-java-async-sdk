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
 * {@link DescribePvtzStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribePvtzStatisticsSummaryRequest</p>
 */
public class DescribePvtzStatisticsSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private String endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrowType")
    private String growType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkParams")
    private java.util.List<NetworkParams> networkParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rcode")
    private String rcode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    private String startTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticalType")
    private String statisticalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private DescribePvtzStatisticsSummaryRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.domainName = builder.domainName;
        this.endTimestamp = builder.endTimestamp;
        this.growType = builder.growType;
        this.module = builder.module;
        this.networkParams = builder.networkParams;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.period = builder.period;
        this.rcode = builder.rcode;
        this.serverRegion = builder.serverRegion;
        this.startTimestamp = builder.startTimestamp;
        this.statisticalType = builder.statisticalType;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return growType
     */
    public String getGrowType() {
        return this.growType;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return rcode
     */
    public String getRcode() {
        return this.rcode;
    }

    /**
     * @return serverRegion
     */
    public String getServerRegion() {
        return this.serverRegion;
    }

    /**
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return statisticalType
     */
    public String getStatisticalType() {
        return this.statisticalType;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<DescribePvtzStatisticsSummaryRequest, Builder> {
        private String direction; 
        private String domainName; 
        private String endTimestamp; 
        private String growType; 
        private String module; 
        private java.util.List<NetworkParams> networkParams; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String period; 
        private String rcode; 
        private String serverRegion; 
        private String startTimestamp; 
        private String statisticalType; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePvtzStatisticsSummaryRequest request) {
            super(request);
            this.direction = request.direction;
            this.domainName = request.domainName;
            this.endTimestamp = request.endTimestamp;
            this.growType = request.growType;
            this.module = request.module;
            this.networkParams = request.networkParams;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.period = request.period;
            this.rcode = request.rcode;
            this.serverRegion = request.serverRegion;
            this.startTimestamp = request.startTimestamp;
            this.statisticalType = request.statisticalType;
            this.zoneName = request.zoneName;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * GrowType.
         */
        public Builder growType(String growType) {
            this.putQueryParameter("GrowType", growType);
            this.growType = growType;
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
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Rcode.
         */
        public Builder rcode(String rcode) {
            this.putQueryParameter("Rcode", rcode);
            this.rcode = rcode;
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

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(String startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * StatisticalType.
         */
        public Builder statisticalType(String statisticalType) {
            this.putQueryParameter("StatisticalType", statisticalType);
            this.statisticalType = statisticalType;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public DescribePvtzStatisticsSummaryRequest build() {
            return new DescribePvtzStatisticsSummaryRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsSummaryRequest} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsSummaryRequest</p>
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
             * <p>vpc-bp1uvv79h1t8unnzdh3nq</p>
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
