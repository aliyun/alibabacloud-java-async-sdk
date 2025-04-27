// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeHadoopClustersInSameNetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHadoopClustersInSameNetResponseBody</p>
 */
public class DescribeHadoopClustersInSameNetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<String> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHadoopClustersInSameNetResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHadoopClustersInSameNetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> clusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHadoopClustersInSameNetResponseBody model) {
            this.clusters = model.clusters;
            this.requestId = model.requestId;
        } 

        /**
         * Clusters.
         */
        public Builder clusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHadoopClustersInSameNetResponseBody build() {
            return new DescribeHadoopClustersInSameNetResponseBody(this);
        } 

    } 

}
