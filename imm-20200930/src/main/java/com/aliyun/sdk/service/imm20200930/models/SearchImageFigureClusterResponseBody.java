// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchImageFigureClusterResponseBody} extends {@link TeaModel}
 *
 * <p>SearchImageFigureClusterResponseBody</p>
 */
public class SearchImageFigureClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchImageFigureClusterResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageFigureClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private String requestId; 

        /**
         * <p>The face clusters.</p>
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C2734912-E6D5-052C-AC67-6A9FD02*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchImageFigureClusterResponseBody build() {
            return new SearchImageFigureClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchImageFigureClusterResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageFigureClusterResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Boundary")
        private Boundary boundary;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Similarity")
        private Float similarity;

        private Clusters(Builder builder) {
            this.boundary = builder.boundary;
            this.clusterId = builder.clusterId;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return boundary
         */
        public Boundary getBoundary() {
            return this.boundary;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return similarity
         */
        public Float getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private Boundary boundary; 
            private String clusterId; 
            private Float similarity; 

            /**
             * <p>The bounding box of the face.</p>
             */
            public Builder boundary(Boundary boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * <p>The ID of the face cluster that contains faces similar to the face within the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster-ca730577-06b1-42c7-a25b-8f2c7******</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The similarity between the face within the bounding box and the face cluster. Valid value: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.87413794</p>
             */
            public Builder similarity(Float similarity) {
                this.similarity = similarity;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
