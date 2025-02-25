// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The end of the time range to query.</p>
         * <p>Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1653805225</p>
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>For more information about how to query the names of namespaces, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-aliyun</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The statistical period of the monitoring data.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * <blockquote>
         * <p> PromQL statements are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEcs_cpu_total</p>
         */
        public Builder promSQL(String promSQL) {
            this.putQueryParameter("PromSQL", promSQL);
            this.promSQL = promSQL;
            return this;
        }

        /**
         * <p>The start of the time range to query.</p>
         * <p>Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1653804865</p>
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
