// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarImageClustersResponseBody} extends {@link TeaModel}
 *
 * <p>SearchSimilarImageClustersResponseBody</p>
 */
public class SearchSimilarImageClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("similar_image_clusters")
    private java.util.List < SimilarImageClusters> similarImageClusters;

    private SearchSimilarImageClustersResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.similarImageClusters = builder.similarImageClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarImageClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return similarImageClusters
     */
    public java.util.List < SimilarImageClusters> getSimilarImageClusters() {
        return this.similarImageClusters;
    }

    public static final class Builder {
        private String nextMarker; 
        private java.util.List < SimilarImageClusters> similarImageClusters; 

        /**
         * next_marker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * similar_image_clusters.
         */
        public Builder similarImageClusters(java.util.List < SimilarImageClusters> similarImageClusters) {
            this.similarImageClusters = similarImageClusters;
            return this;
        }

        public SearchSimilarImageClustersResponseBody build() {
            return new SearchSimilarImageClustersResponseBody(this);
        } 

    } 

    public static class SimilarImageClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List < File > files;

        private SimilarImageClusters(Builder builder) {
            this.files = builder.files;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarImageClusters create() {
            return builder().build();
        }

        /**
         * @return files
         */
        public java.util.List < File > getFiles() {
            return this.files;
        }

        public static final class Builder {
            private java.util.List < File > files; 

            /**
             * files.
             */
            public Builder files(java.util.List < File > files) {
                this.files = files;
                return this;
            }

            public SimilarImageClusters build() {
                return new SimilarImageClusters(this);
            } 

        } 

    }
}
