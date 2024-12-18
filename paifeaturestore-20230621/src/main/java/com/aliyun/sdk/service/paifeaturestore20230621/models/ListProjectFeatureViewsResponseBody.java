// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListProjectFeatureViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectFeatureViewsResponseBody</p>
 */
public class ListProjectFeatureViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureViews")
    private java.util.List<FeatureViews> featureViews;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectFeatureViewsResponseBody(Builder builder) {
        this.featureViews = builder.featureViews;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectFeatureViewsResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureViews
     */
    public java.util.List<FeatureViews> getFeatureViews() {
        return this.featureViews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<FeatureViews> featureViews; 
        private String requestId; 
        private Long totalCount; 

        /**
         * FeatureViews.
         */
        public Builder featureViews(java.util.List<FeatureViews> featureViews) {
            this.featureViews = featureViews;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectFeatureViewsResponseBody build() {
            return new ListProjectFeatureViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectFeatureViewsResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> attributes; 
            private String name; 
            private String type; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectFeatureViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectFeatureViewsResponseBody</p>
     */
    public static class FeatureViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<Features> features;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FeatureViews(Builder builder) {
            this.featureViewId = builder.featureViewId;
            this.features = builder.features;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureViews create() {
            return builder().build();
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return features
         */
        public java.util.List<Features> getFeatures() {
            return this.features;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String featureViewId; 
            private java.util.List<Features> features; 
            private String name; 
            private String type; 

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.List<Features> features) {
                this.features = features;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FeatureViews build() {
                return new FeatureViews(this);
            } 

        } 

    }
}
