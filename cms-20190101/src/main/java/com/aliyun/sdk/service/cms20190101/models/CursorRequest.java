// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link CursorRequest} extends {@link RequestModel}
 *
 * <p>CursorRequest</p>
 */
public class CursorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Matchers")
    private java.util.List<Matcher> matchers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Matcher> getMatchers() {
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
        private java.util.List<Matcher> matchers; 
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
         * <p>The end timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * <blockquote>
         * <ul>
         * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970. The format YYYY-MM-DDThh:mm:ssZ is supported. Example: 2023-01-01T00:00:00Z, which specifies 00:00:00 on January 1, 2023 (GMT).</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If you do not specify the end time, the end time is considered infinite. In real-time export scenarios, you can leave this parameter empty.</li>
         * <li>The TTL of monitoring data in CloudMonitor varies with the time granularity. Refer to the data TTL corresponding to the Period request parameter to set a reasonable time interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1641645000000</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The dimension information of the metric.</p>
         */
        public Builder matchers(java.util.List<Matcher> matchers) {
            String matchersShrink = shrink(matchers, "Matchers", "json");
            this.putBodyParameter("Matchers", matchersShrink);
            this.matchers = matchers;
            return this;
        }

        /**
         * <p>The name of the metric for the cloud service.</p>
         * <p>For more information about how to obtain the metric name of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_idle</p>
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The data namespace of the cloud service.</p>
         * <p>For more information about how to obtain the data namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The time interval of the metric.</p>
         * <p>Unit: seconds.</p>
         * <blockquote>
         * <p>The time interval of a metric is typically 60 seconds. For special values, see the Period parameter in <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The start timestamp.</p>
         * <p>The format YYYY-MM-DDThh:mm:ssZ is supported. Example: 2023-01-01T00:00:00Z, which specifies 00:00:00 on January 1, 2023 (GMT).</p>
         * <blockquote>
         * <p>The time-to-live (TTL) of monitoring data in CloudMonitor varies with the time granularity. Refer to the data TTL corresponding to the Period request parameter to set a reasonable time interval.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1641627000000</p>
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
