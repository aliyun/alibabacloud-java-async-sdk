// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchExportRequest} extends {@link RequestModel}
 *
 * <p>BatchExportRequest</p>
 */
public class BatchExportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cursor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cursor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Length")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Measurements")
    private java.util.List < String > measurements;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>When you call this operation to export data, you must specify the <code>Cursor</code> parameter. You can obtain the value of the <code>Cursor</code> parameter by using one of the following methods:</p>
         * <ul>
         * <li>When you call this operation for the first time, you must call the Cursor operation to obtain the <code>Cursor</code> value. For more information, see <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a>.</li>
         * <li>When you call this operation again, you can obtain the <code>Cursor</code> value from the returned data of the last call.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJidWNrZXRzIjo0LCJjdXJzb3IiOiIxNjQxNDU0MzIwMDAwMWUxY2YxNWY0NTU0MTliZjllYTY4OWQ2ODI1OTU1Yzc1NmZjMDQ2OTMxMzczMzM2MzUzMTMxMzEzMzM0MzMzODM5MzEzMTMwMjQyYzY5MmQ3NTY2MzYzMjY3NmI2ZjM5MzU2YjY4MzAzMTYyNzg3MTcwNjkzMTM3MjQyYyIsImN1cnNvclZlcnNpb24iOiJxdWVyeSIsImVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydEVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydFN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywiZXhwcmVzc1JhbmdlIjpmYWxzZSwiaGFzTmV4dCI6dHJ1ZSwiaW5wdXRNZXRyaWMiOiJDUFVVdGlsaXphdGlvbiIsImlucHV0TmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJsaW1pdCI6MTAwMCwibG9nVGltZU1vZGUiOnRydWUsIm1hdGNoZXJzIjp7ImNoYWluIjpbeyJsYWJlbCI6InVzZXJJZCIsIm9wZXJhdG9yIjoiRVFVQUxTIiwidmFsdWUiOiIxNzM2NTExMTM0Mzg5MTEwIn1dfSwibWV0cmljIjoiQ1BVVXRpbGl6YXRpb24iLCJtZXRyaWNUeXBlIjoiTUVUUklDIiwibmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJuZXh0UGtBZGFwdGVyIjp7fSwib2Zmc2V0IjowLCJwYXJlbnRVaWQiOjEyNzA2NzY2Nzk1NDY3MDQsInN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywic3RlcCI6LTEsInRpbWVvdXQiOjEyMCwid2luZG93Ijo2****</p>
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The maximum number of data entries that can be returned in each response.</p>
         * <p>Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder length(Integer length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>The statistical methods used to customize the returned data. By default, the measurements based on all statistical methods are returned.</p>
         * <p>For example, the <code>cpu_idle</code> metric of ECS (<code>acs_ecs_dashboard</code>) has three statistical methods: <code>Average</code>, <code>Maximum</code>, and <code>Minimum</code>. If you want to return only the measurements based on the <code>Average</code> and <code>Maximum</code> statistical methods, set this parameter to <code>[&quot;Average&quot;, &quot;Maximum&quot;]</code>.</p>
         * <p>The statistical methods of metrics are displayed in the <code>Statistics</code> column on the Metrics page of each cloud service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         */
        public Builder measurements(java.util.List < String > measurements) {
            String measurementsShrink = shrink(measurements, "Measurements", "json");
            this.putBodyParameter("Measurements", measurementsShrink);
            this.measurements = measurements;
            return this;
        }

        /**
         * <p>The metric that is used to monitor the cloud service.</p>
         * <p>For more information about the metrics of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <blockquote>
         * <p> The value of this parameter must be the same as the value of the request parameter <code>Metric</code> in the Cursor operation.</p>
         * </blockquote>
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
         * <p>The namespace of the cloud service.</p>
         * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <blockquote>
         * <p> The value of this parameter must be the same as the value of the request parameter <code>Namespace</code> in the Cursor operation.</p>
         * </blockquote>
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

        @Override
        public BatchExportRequest build() {
            return new BatchExportRequest(this);
        } 

    } 

}
