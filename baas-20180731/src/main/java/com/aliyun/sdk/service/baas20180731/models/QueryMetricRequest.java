// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryMetricRequest</p>
 */
public class QueryMetricRequest extends Request {
    @Query
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("InnerIp")
    private String innerIp;

    @Body
    @NameInMap("Metric")
    private String metric;

    @Body
    @NameInMap("Period")
    private String period;

    @Body
    @NameInMap("Port")
    private String port;

    @Body
    @NameInMap("TimeArea")
    private String timeArea;

    private QueryMetricRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
        this.innerIp = builder.innerIp;
        this.metric = builder.metric;
        this.period = builder.period;
        this.port = builder.port;
        this.timeArea = builder.timeArea;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return innerIp
     */
    public String getInnerIp() {
        return this.innerIp;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return timeArea
     */
    public String getTimeArea() {
        return this.timeArea;
    }

    public static final class Builder extends Request.Builder<QueryMetricRequest, Builder> {
        private String bizid; 
        private String innerIp; 
        private String metric; 
        private String period; 
        private String port; 
        private String timeArea; 

        private Builder() {
            super();
        } 

        private Builder(QueryMetricRequest request) {
            super(request);
            this.bizid = request.bizid;
            this.innerIp = request.innerIp;
            this.metric = request.metric;
            this.period = request.period;
            this.port = request.port;
            this.timeArea = request.timeArea;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putQueryParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * InnerIp.
         */
        public Builder innerIp(String innerIp) {
            this.putBodyParameter("InnerIp", innerIp);
            this.innerIp = innerIp;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * TimeArea.
         */
        public Builder timeArea(String timeArea) {
            this.putBodyParameter("TimeArea", timeArea);
            this.timeArea = timeArea;
            return this;
        }

        @Override
        public QueryMetricRequest build() {
            return new QueryMetricRequest(this);
        } 

    } 

}
