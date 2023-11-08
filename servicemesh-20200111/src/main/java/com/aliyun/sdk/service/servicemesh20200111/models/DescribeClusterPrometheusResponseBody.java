// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterPrometheusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterPrometheusResponseBody</p>
 */
public class DescribeClusterPrometheusResponseBody extends TeaModel {
    @NameInMap("Prometheus")
    private String prometheus;

    @NameInMap("RequestId")
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

        /**
         * The public endpoint of the Prometheus service that is used to monitor a cluster in the ASM instance.
         */
        public Builder prometheus(String prometheus) {
            this.prometheus = prometheus;
            return this;
        }

        /**
         * The request ID.
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
