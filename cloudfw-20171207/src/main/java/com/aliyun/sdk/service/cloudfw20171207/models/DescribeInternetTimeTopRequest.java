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
 * {@link DescribeInternetTimeTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetTimeTopRequest</p>
 */
public class DescribeInternetTimeTopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPType")
    private String IPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIP")
    private String natIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    private String trafficTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficType")
    private String trafficType;

    private DescribeInternetTimeTopRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.IPType = builder.IPType;
        this.interval = builder.interval;
        this.lang = builder.lang;
        this.limit = builder.limit;
        this.natIP = builder.natIP;
        this.order = builder.order;
        this.sort = builder.sort;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.srcIP = builder.srcIP;
        this.startTime = builder.startTime;
        this.trafficTime = builder.trafficTime;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTimeTopRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return IPType
     */
    public String getIPType() {
        return this.IPType;
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
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return natIP
     */
    public String getNatIP() {
        return this.natIP;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficTime
     */
    public String getTrafficTime() {
        return this.trafficTime;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<DescribeInternetTimeTopRequest, Builder> {
        private String direction; 
        private String endTime; 
        private String IPType; 
        private Long interval; 
        private String lang; 
        private String limit; 
        private String natIP; 
        private String order; 
        private String sort; 
        private String sourceCode; 
        private String sourceIp; 
        private String srcIP; 
        private String startTime; 
        private String trafficTime; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetTimeTopRequest request) {
            super(request);
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.IPType = request.IPType;
            this.interval = request.interval;
            this.lang = request.lang;
            this.limit = request.limit;
            this.natIP = request.natIP;
            this.order = request.order;
            this.sort = request.sort;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.srcIP = request.srcIP;
            this.startTime = request.startTime;
            this.trafficTime = request.trafficTime;
            this.trafficType = request.trafficType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IPType.
         */
        public Builder IPType(String IPType) {
            this.putQueryParameter("IPType", IPType);
            this.IPType = IPType;
            return this;
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
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NatIP.
         */
        public Builder natIP(String natIP) {
            this.putQueryParameter("NatIP", natIP);
            this.natIP = natIP;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SrcIP.
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TrafficTime.
         */
        public Builder trafficTime(String trafficTime) {
            this.putQueryParameter("TrafficTime", trafficTime);
            this.trafficTime = trafficTime;
            return this;
        }

        /**
         * TrafficType.
         */
        public Builder trafficType(String trafficType) {
            this.putQueryParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public DescribeInternetTimeTopRequest build() {
            return new DescribeInternetTimeTopRequest(this);
        } 

    } 

}
