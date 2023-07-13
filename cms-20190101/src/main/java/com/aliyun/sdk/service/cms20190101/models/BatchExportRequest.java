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
         * Cursor.
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Measurements.
         */
        public Builder measurements(java.util.List < String > measurements) {
            String measurementsShrink = shrink(measurements, "Measurements", "json");
            this.putBodyParameter("Measurements", measurementsShrink);
            this.measurements = measurements;
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

        @Override
        public BatchExportRequest build() {
            return new BatchExportRequest(this);
        } 

    } 

}
