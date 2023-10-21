// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricMetaListRequest</p>
 */
public class DescribeMetricMetaListRequest extends Request {
    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeMetricMetaListRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMetricMetaListRequest, Builder> {
        private String labels; 
        private String metricName; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricMetaListRequest request) {
            super(request);
            this.labels = request.labels;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The tags for filtering metrics. Specify a JSON string.
         * <p>
         * 
         * Format:`[{"name":"tag name","value":"tag value"},{"name":"tag name","value":"tag value"}]`. The following tags are available:
         * 
         * *   metricCategory: the category of the metric.
         * *   alertEnable: specifies whether to report alerts for the metric.
         * *   alertUnit: the suggested unit of the metric value in alerts.
         * *   unitFactor: the factor for metric unit conversion.
         * *   minAlertPeriod: the minimum time interval to report a new alert.
         * *   productCategory: the category of the service.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the service.
         * <p>
         * 
         * For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The page to return. Default value: 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMetricMetaListRequest build() {
            return new DescribeMetricMetaListRequest(this);
        } 

    } 

}
