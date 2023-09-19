// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CursorRequest} extends {@link RequestModel}
 *
 * <p>CursorRequest</p>
 */
public class CursorRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("Matchers")
    private java.util.List < Matcher > matchers;

    @Body
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private CursorRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.matchers = builder.matchers;
        this.metric = builder.metric;
        this.namespace = builder.namespace;
        this.period = builder.period;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CursorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return matchers
     */
    public java.util.List < Matcher > getMatchers() {
        return this.matchers;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CursorRequest, Builder> {
        private String endTime; 
        private java.util.List < Matcher > matchers; 
        private String metric; 
        private String namespace; 
        private Integer period; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CursorRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.matchers = request.matchers;
            this.metric = request.metric;
            this.namespace = request.namespace;
            this.period = request.period;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Unit: milliseconds.
         * 
         * > 
         * 
         * *   This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For example, 2023-01-01T00:00:00Z indicates January 1, 2023, 00:00:00 UTC.
         * 
         * *   If you do not set the end time, the end time is infinite. You can leave this parameter empty in real-time export scenarios.
         * *   In CloudMonitor, the TTL of monitoring data varies with the time granularity. Specify a proper time interval based on the TTL corresponding to the value of the `Period` parameter.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The dimension information of the metric.
         */
        public Builder matchers(java.util.List < Matcher > matchers) {
            String matchersShrink = shrink(matchers, "Matchers", "json");
            this.putBodyParameter("Matchers", matchersShrink);
            this.matchers = matchers;
            return this;
        }

        /**
         * The metric that is used to monitor the cloud service.
         * <p>
         * 
         * For more information about the metrics of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The time interval based on which the metric value is measured.
         * <p>
         * 
         * Unit: seconds.
         * 
         * >  Generally, the time interval is 60 seconds. For more information about specific values, see the `Period` parameter in [Appendix 1: Metrics](~~163515~~).
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For example, 2023-01-01T00:00:00Z indicates January 1, 2023, 00:00:00 UTC.
         * 
         * >  In CloudMonitor, the TTL of monitoring data varies with the time granularity. Specify a proper time interval based on the TTL corresponding to the value of the `Period` parameter.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CursorRequest build() {
            return new CursorRequest(this);
        } 

    } 

}
