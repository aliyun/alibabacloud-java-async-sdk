// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ReportSampleConsistencyJobResponseBody} extends {@link TeaModel}
 *
 * <p>ReportSampleConsistencyJobResponseBody</p>
 */
public class ReportSampleConsistencyJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeaturesDifference")
    private java.util.List<FeaturesDifference> featuresDifference;

    @com.aliyun.core.annotation.NameInMap("ReplyTableFeatures")
    private Long replyTableFeatures;

    @com.aliyun.core.annotation.NameInMap("ReplyTableLostFeatures")
    private Long replyTableLostFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private Long requestId;

    @com.aliyun.core.annotation.NameInMap("SampleTableFeatures")
    private Long sampleTableFeatures;

    @com.aliyun.core.annotation.NameInMap("SampleTableLostFeatures")
    private Long sampleTableLostFeatures;

    private ReportSampleConsistencyJobResponseBody(Builder builder) {
        this.featuresDifference = builder.featuresDifference;
        this.replyTableFeatures = builder.replyTableFeatures;
        this.replyTableLostFeatures = builder.replyTableLostFeatures;
        this.requestId = builder.requestId;
        this.sampleTableFeatures = builder.sampleTableFeatures;
        this.sampleTableLostFeatures = builder.sampleTableLostFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportSampleConsistencyJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featuresDifference
     */
    public java.util.List<FeaturesDifference> getFeaturesDifference() {
        return this.featuresDifference;
    }

    /**
     * @return replyTableFeatures
     */
    public Long getReplyTableFeatures() {
        return this.replyTableFeatures;
    }

    /**
     * @return replyTableLostFeatures
     */
    public Long getReplyTableLostFeatures() {
        return this.replyTableLostFeatures;
    }

    /**
     * @return requestId
     */
    public Long getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleTableFeatures
     */
    public Long getSampleTableFeatures() {
        return this.sampleTableFeatures;
    }

    /**
     * @return sampleTableLostFeatures
     */
    public Long getSampleTableLostFeatures() {
        return this.sampleTableLostFeatures;
    }

    public static final class Builder {
        private java.util.List<FeaturesDifference> featuresDifference; 
        private Long replyTableFeatures; 
        private Long replyTableLostFeatures; 
        private Long requestId; 
        private Long sampleTableFeatures; 
        private Long sampleTableLostFeatures; 

        private Builder() {
        } 

        private Builder(ReportSampleConsistencyJobResponseBody model) {
            this.featuresDifference = model.featuresDifference;
            this.replyTableFeatures = model.replyTableFeatures;
            this.replyTableLostFeatures = model.replyTableLostFeatures;
            this.requestId = model.requestId;
            this.sampleTableFeatures = model.sampleTableFeatures;
            this.sampleTableLostFeatures = model.sampleTableLostFeatures;
        } 

        /**
         * FeaturesDifference.
         */
        public Builder featuresDifference(java.util.List<FeaturesDifference> featuresDifference) {
            this.featuresDifference = featuresDifference;
            return this;
        }

        /**
         * ReplyTableFeatures.
         */
        public Builder replyTableFeatures(Long replyTableFeatures) {
            this.replyTableFeatures = replyTableFeatures;
            return this;
        }

        /**
         * ReplyTableLostFeatures.
         */
        public Builder replyTableLostFeatures(Long replyTableLostFeatures) {
            this.replyTableLostFeatures = replyTableLostFeatures;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(Long requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SampleTableFeatures.
         */
        public Builder sampleTableFeatures(Long sampleTableFeatures) {
            this.sampleTableFeatures = sampleTableFeatures;
            return this;
        }

        /**
         * SampleTableLostFeatures.
         */
        public Builder sampleTableLostFeatures(Long sampleTableLostFeatures) {
            this.sampleTableLostFeatures = sampleTableLostFeatures;
            return this;
        }

        public ReportSampleConsistencyJobResponseBody build() {
            return new ReportSampleConsistencyJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReportSampleConsistencyJobResponseBody} extends {@link TeaModel}
     *
     * <p>ReportSampleConsistencyJobResponseBody</p>
     */
    public static class FeaturesDifference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        private FeaturesDifference(Builder builder) {
            this.count = builder.count;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeaturesDifference create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        public static final class Builder {
            private Long count; 
            private String featureName; 
            private String featureType; 
            private String ratio; 

            private Builder() {
            } 

            private Builder(FeaturesDifference model) {
                this.count = model.count;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.ratio = model.ratio;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureType.
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            public FeaturesDifference build() {
                return new FeaturesDifference(this);
            } 

        } 

    }
}
