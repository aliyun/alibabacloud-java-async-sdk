// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticBandwidthSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticBandwidthSpecResponseBody</p>
 */
public class DescribeElasticBandwidthSpecResponseBody extends TeaModel {
    @NameInMap("ElasticBandwidthSpec")
    private java.util.List < String > elasticBandwidthSpec;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeElasticBandwidthSpecResponseBody(Builder builder) {
        this.elasticBandwidthSpec = builder.elasticBandwidthSpec;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticBandwidthSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticBandwidthSpec
     */
    public java.util.List < String > getElasticBandwidthSpec() {
        return this.elasticBandwidthSpec;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > elasticBandwidthSpec; 
        private String requestId; 

        /**
         * ElasticBandwidthSpec.
         */
        public Builder elasticBandwidthSpec(java.util.List < String > elasticBandwidthSpec) {
            this.elasticBandwidthSpec = elasticBandwidthSpec;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticBandwidthSpecResponseBody build() {
            return new DescribeElasticBandwidthSpecResponseBody(this);
        } 

    } 

}
