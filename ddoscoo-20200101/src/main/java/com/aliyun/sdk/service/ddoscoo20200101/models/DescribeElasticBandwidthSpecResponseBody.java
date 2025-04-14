// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeElasticBandwidthSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticBandwidthSpecResponseBody</p>
 */
public class DescribeElasticBandwidthSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticBandwidthSpec")
    private java.util.List<String> elasticBandwidthSpec;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticBandwidthSpec
     */
    public java.util.List<String> getElasticBandwidthSpec() {
        return this.elasticBandwidthSpec;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> elasticBandwidthSpec; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeElasticBandwidthSpecResponseBody model) {
            this.elasticBandwidthSpec = model.elasticBandwidthSpec;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the available burstable protection bandwidths. Unit: Gbit/s.</p>
         */
        public Builder elasticBandwidthSpec(java.util.List<String> elasticBandwidthSpec) {
            this.elasticBandwidthSpec = elasticBandwidthSpec;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
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
