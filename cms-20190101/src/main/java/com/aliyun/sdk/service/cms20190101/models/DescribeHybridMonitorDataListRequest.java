// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorDataListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorDataListRequest</p>
 */
public class DescribeHybridMonitorDataListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromSQL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promSQL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    private DescribeHybridMonitorDataListRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.namespace = builder.namespace;
        this.period = builder.period;
        this.promSQL = builder.promSQL;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorDataListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
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
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return promSQL
     */
    public String getPromSQL() {
        return this.promSQL;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeHybridMonitorDataListRequest, Builder> {
        private Long end; 
        private String namespace; 
        private String period; 
        private String promSQL; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridMonitorDataListRequest request) {
            super(request);
            this.end = request.end;
            this.namespace = request.namespace;
            this.period = request.period;
            this.promSQL = request.promSQL;
            this.start = request.start;
        } 

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Unit: seconds.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * The name of the namespace.
         * <p>
         * 
         * For more information about how to query the names of namespaces, see [DescribeHybridMonitorNamespaceList](~~428880~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The statistical period of the monitoring data.
         * <p>
         * 
         * Unit: seconds.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The metric name.
         * <p>
         * 
         * >  PromQL statements are supported.
         */
        public Builder promSQL(String promSQL) {
            this.putQueryParameter("PromSQL", promSQL);
            this.promSQL = promSQL;
            return this;
        }

        /**
         * The start of the time range to query.
         * <p>
         * 
         * Unit: seconds.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeHybridMonitorDataListRequest build() {
            return new DescribeHybridMonitorDataListRequest(this);
        } 

    } 

}
