// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeClusterPrometheusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterPrometheusResponseBody</p>
 */
public class DescribeClusterPrometheusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Prometheus")
    private String prometheus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterPrometheusResponseBody(Builder builder) {
        this.prometheus = builder.prometheus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterPrometheusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheus
     */
    public String getPrometheus() {
        return this.prometheus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prometheus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterPrometheusResponseBody model) {
            this.prometheus = model.prometheus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The public endpoint of the Prometheus service that is used to monitor a cluster in the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>p.com</p>
         */
        public Builder prometheus(String prometheus) {
            this.prometheus = prometheus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterPrometheusResponseBody build() {
            return new DescribeClusterPrometheusResponseBody(this);
        } 

    } 

}
