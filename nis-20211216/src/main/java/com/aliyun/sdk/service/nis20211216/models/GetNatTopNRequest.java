// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetNatTopNRequest} extends {@link RequestModel}
 *
 * <p>GetNatTopNRequest</p>
 */
public class GetNatTopNRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
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
         * <p>The beginning of the time range to query in milliseconds. If you do not specify <strong>EndTime</strong>, the point in time specified by <strong>BeginTime</strong> is queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1638239092000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query in milliseconds. The time range specified by <strong>BeginTime</strong> and <strong>EndTime</strong> cannot exceed <strong>86400000</strong> milliseconds (24 hours).</p>
         * 
         * <strong>example:</strong>
         * <p>1638239093000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Query ranking statistics for a specific IP address. If you specify this parameter, you do not need to specify <strong>TopN</strong> or <strong>OrderBy</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.156.101</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-sample***</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The metric that is used for real-time SNAT performance ranking. Valid values:</p>
         * <ul>
         * <li><strong>InBps</strong>: inbound data transfer. Unit: bit/s.</li>
         * <li><strong>OutBps</strong>: outbound data transfer. Unit: bit/s.</li>
         * <li><strong>InPps</strong>: inbound packet forwarding rate. Unit: packets per second.</li>
         * <li><strong>OutPps</strong>: outbound packet forwarding rate. Unit: packets per second.</li>
         * <li><strong>NewSessionPerSecond</strong>: new connection creation rate. Unit: connections per second.</li>
         * <li><strong>ActiveSessionCount</strong>: number of concurrent connections. Unit: connections.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InBps</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The ID of the region in which the NAT gateway is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of entries to return for real-time SNAT performance ranking. Valid values: <strong>1 to 100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
