// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatTopNRequest} extends {@link RequestModel}
 *
 * <p>GetNatTopNRequest</p>
 */
public class GetNatTopNRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TopN")
    private Integer topN;

    private GetNatTopNRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.ip = builder.ip;
        this.natGatewayId = builder.natGatewayId;
        this.orderBy = builder.orderBy;
        this.regionId = builder.regionId;
        this.topN = builder.topN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatTopNRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    public static final class Builder extends Request.Builder<GetNatTopNRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String ip; 
        private String natGatewayId; 
        private String orderBy; 
        private String regionId; 
        private Integer topN; 

        private Builder() {
            super();
        } 

        private Builder(GetNatTopNRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.ip = request.ip;
            this.natGatewayId = request.natGatewayId;
            this.orderBy = request.orderBy;
            this.regionId = request.regionId;
            this.topN = request.topN;
        } 

        /**
         * The beginning of the time range to query in milliseconds. If you do not specify **EndTime**, the point in time specified by **BeginTime** is queried.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end of the time range to query in milliseconds. The time range specified by **BeginTime** and **EndTime** cannot exceed **86400000** milliseconds (24 hours).
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Query ranking statistics for a specific IP address. If you specify this parameter, you do not need to specify **TopN** or **OrderBy**.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The metric that is used for real-time SNAT performance ranking. Valid values:
         * <p>
         * 
         * *   **InBps**: inbound data transfer. Unit: bit/s.
         * *   **OutBps**: outbound data transfer. Unit: bit/s.
         * *   **InPps**: inbound packet forwarding rate. Unit: packets per second.
         * *   **OutPps**: outbound packet forwarding rate. Unit: packets per second.
         * *   **NewSessionPerSecond**: new connection creation rate. Unit: connections per second.
         * *   **ActiveSessionCount**: number of concurrent connections. Unit: connections.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The ID of the region in which the NAT gateway is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return for real-time SNAT performance ranking. Valid values: **1 to 100**. Default value: **10**.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        @Override
        public GetNatTopNRequest build() {
            return new GetNatTopNRequest(this);
        } 

    } 

}
