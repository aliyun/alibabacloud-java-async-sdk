// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms_export20211101.models;

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
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("Matchers")
    private java.util.List < Matchers> matchers;

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
    private Long startTime;

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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return matchers
     */
    public java.util.List < Matchers> getMatchers() {
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
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CursorRequest, Builder> {
        private Long endTime; 
        private java.util.List < Matchers> matchers; 
        private String metric; 
        private String namespace; 
        private Integer period; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CursorRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.matchers = response.matchers;
            this.metric = response.metric;
            this.namespace = response.namespace;
            this.period = response.period;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Matchers.
         */
        public Builder matchers(java.util.List < Matchers> matchers) {
            this.putBodyParameter("Matchers", matchers);
            this.matchers = matchers;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CursorRequest build() {
            return new CursorRequest(this);
        } 

    } 

    public static class Matchers extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private Matchers(Builder builder) {
            this.label = builder.label;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matchers create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String operator; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Matchers build() {
                return new Matchers(this);
            } 

        } 

    }
}
