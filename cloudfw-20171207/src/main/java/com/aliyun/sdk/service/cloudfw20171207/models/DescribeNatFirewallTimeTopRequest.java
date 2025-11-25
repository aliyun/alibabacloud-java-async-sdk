// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallTimeTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallTimeTopRequest</p>
 */
public class DescribeNatFirewallTimeTopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPrivateIP")
    private String srcPrivateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPublicIP")
    private String srcPublicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficTime;

    private DescribeNatFirewallTimeTopRequest(Builder builder) {
        super(builder);
        this.interval = builder.interval;
        this.lang = builder.lang;
        this.limit = builder.limit;
        this.natGatewayId = builder.natGatewayId;
        this.sort = builder.sort;
        this.srcPrivateIP = builder.srcPrivateIP;
        this.srcPublicIP = builder.srcPublicIP;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallTimeTopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return srcPrivateIP
     */
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    /**
     * @return srcPublicIP
     */
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    /**
     * @return trafficTime
     */
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallTimeTopRequest, Builder> {
        private Long interval; 
        private String lang; 
        private Long limit; 
        private String natGatewayId; 
        private String sort; 
        private String srcPrivateIP; 
        private String srcPublicIP; 
        private String trafficTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallTimeTopRequest request) {
            super(request);
            this.interval = request.interval;
            this.lang = request.lang;
            this.limit = request.limit;
            this.natGatewayId = request.natGatewayId;
            this.sort = request.sort;
            this.srcPrivateIP = request.srcPrivateIP;
            this.srcPublicIP = request.srcPublicIP;
            this.trafficTime = request.trafficTime;
        } 

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SrcPrivateIP.
         */
        public Builder srcPrivateIP(String srcPrivateIP) {
            this.putQueryParameter("SrcPrivateIP", srcPrivateIP);
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }

        /**
         * SrcPublicIP.
         */
        public Builder srcPublicIP(String srcPublicIP) {
            this.putQueryParameter("SrcPublicIP", srcPublicIP);
            this.srcPublicIP = srcPublicIP;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1749693960</p>
         */
        public Builder trafficTime(String trafficTime) {
            this.putQueryParameter("TrafficTime", trafficTime);
            this.trafficTime = trafficTime;
            return this;
        }

        @Override
        public DescribeNatFirewallTimeTopRequest build() {
            return new DescribeNatFirewallTimeTopRequest(this);
        } 

    } 

}
