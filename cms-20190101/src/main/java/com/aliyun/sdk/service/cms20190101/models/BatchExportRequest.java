// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchExportRequest} extends {@link RequestModel}
 *
 * <p>BatchExportRequest</p>
 */
public class BatchExportRequest extends Request {
    @Body
    @NameInMap("Cursor")
    @Validation(required = true)
    private String cursor;

    @Body
    @NameInMap("Length")
    @Validation(required = true)
    private Integer length;

    @Body
    @NameInMap("Measurements")
    private java.util.List < String > measurements;

    @Body
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private BatchExportRequest(Builder builder) {
        super(builder);
        this.cursor = builder.cursor;
        this.length = builder.length;
        this.measurements = builder.measurements;
        this.metric = builder.metric;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return measurements
     */
    public java.util.List < String > getMeasurements() {
        return this.measurements;
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

    public static final class Builder extends Request.Builder<BatchExportRequest, Builder> {
        private String cursor; 
        private Integer length; 
        private java.util.List < String > measurements; 
        private String metric; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(BatchExportRequest request) {
            super(request);
            this.cursor = request.cursor;
            this.length = request.length;
            this.measurements = request.measurements;
            this.metric = request.metric;
            this.namespace = request.namespace;
        } 

        /**
         * When you call this operation to export data, you must specify the `Cursor` parameter. You can obtain the value of the `Cursor` parameter by using one of the following methods:
         * <p>
         * 
         * *   When you call this operation for the first time, you must call the Cursor operation to obtain the `Cursor` value. For more information, see [Cursor](~~2330730~~).
         * *   When you call this operation again, you can obtain the `Cursor` value from the returned data of the last call.
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * The maximum number of data entries that can be returned in each response.
         * <p>
         * 
         * Valid values: 1 to 10000.
         */
        public Builder length(Integer length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * The statistical methods used to customize the returned data. By default, the measurements based on all statistical methods are returned.
         * <p>
         * 
         * For example, the `cpu_idle` metric of ECS (`acs_ecs_dashboard`) has three statistical methods: `Average`, `Maximum`, and `Minimum`. If you want to return only the measurements based on the `Average` and `Maximum` statistical methods, set this parameter to `["Average", "Maximum"]`.
         * 
         * The statistical methods of metrics are displayed in the `Statistics` column on the Metrics page of each cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder measurements(java.util.List < String > measurements) {
            String measurementsShrink = shrink(measurements, "Measurements", "json");
            this.putBodyParameter("Measurements", measurementsShrink);
            this.measurements = measurements;
            return this;
        }

        /**
         * The metric that is used to monitor the cloud service.
         * <p>
         * 
         * For more information about the metrics of cloud services, see [Appendix 1: Metrics](~~163515~~).
         * 
         * >  The value of this parameter must be the same as the value of the request parameter `Metric` in the Cursor operation.
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
         * 
         * >  The value of this parameter must be the same as the value of the request parameter `Namespace` in the Cursor operation.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public BatchExportRequest build() {
            return new BatchExportRequest(this);
        } 

    } 

}
