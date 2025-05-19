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
 * {@link QuerySampleConsistencyJobDifferenceResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySampleConsistencyJobDifferenceResponseBody</p>
 */
public class QuerySampleConsistencyJobDifferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DifferenceHistogram")
    private java.util.List<DifferenceHistogram> differenceHistogram;

    @com.aliyun.core.annotation.NameInMap("NumberFeatureDifferences")
    private java.util.List<NumberFeatureDifferences> numberFeatureDifferences;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StringFeatureDifferences")
    private java.util.List<StringFeatureDifferences> stringFeatureDifferences;

    private QuerySampleConsistencyJobDifferenceResponseBody(Builder builder) {
        this.differenceHistogram = builder.differenceHistogram;
        this.numberFeatureDifferences = builder.numberFeatureDifferences;
        this.requestId = builder.requestId;
        this.stringFeatureDifferences = builder.stringFeatureDifferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySampleConsistencyJobDifferenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return differenceHistogram
     */
    public java.util.List<DifferenceHistogram> getDifferenceHistogram() {
        return this.differenceHistogram;
    }

    /**
     * @return numberFeatureDifferences
     */
    public java.util.List<NumberFeatureDifferences> getNumberFeatureDifferences() {
        return this.numberFeatureDifferences;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stringFeatureDifferences
     */
    public java.util.List<StringFeatureDifferences> getStringFeatureDifferences() {
        return this.stringFeatureDifferences;
    }

    public static final class Builder {
        private java.util.List<DifferenceHistogram> differenceHistogram; 
        private java.util.List<NumberFeatureDifferences> numberFeatureDifferences; 
        private String requestId; 
        private java.util.List<StringFeatureDifferences> stringFeatureDifferences; 

        private Builder() {
        } 

        private Builder(QuerySampleConsistencyJobDifferenceResponseBody model) {
            this.differenceHistogram = model.differenceHistogram;
            this.numberFeatureDifferences = model.numberFeatureDifferences;
            this.requestId = model.requestId;
            this.stringFeatureDifferences = model.stringFeatureDifferences;
        } 

        /**
         * DifferenceHistogram.
         */
        public Builder differenceHistogram(java.util.List<DifferenceHistogram> differenceHistogram) {
            this.differenceHistogram = differenceHistogram;
            return this;
        }

        /**
         * NumberFeatureDifferences.
         */
        public Builder numberFeatureDifferences(java.util.List<NumberFeatureDifferences> numberFeatureDifferences) {
            this.numberFeatureDifferences = numberFeatureDifferences;
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
         * StringFeatureDifferences.
         */
        public Builder stringFeatureDifferences(java.util.List<StringFeatureDifferences> stringFeatureDifferences) {
            this.stringFeatureDifferences = stringFeatureDifferences;
            return this;
        }

        public QuerySampleConsistencyJobDifferenceResponseBody build() {
            return new QuerySampleConsistencyJobDifferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySampleConsistencyJobDifferenceResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySampleConsistencyJobDifferenceResponseBody</p>
     */
    public static class DifferenceHistogram extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abscissa")
        private String abscissa;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private DifferenceHistogram(Builder builder) {
            this.abscissa = builder.abscissa;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DifferenceHistogram create() {
            return builder().build();
        }

        /**
         * @return abscissa
         */
        public String getAbscissa() {
            return this.abscissa;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String abscissa; 
            private Long value; 

            private Builder() {
            } 

            private Builder(DifferenceHistogram model) {
                this.abscissa = model.abscissa;
                this.value = model.value;
            } 

            /**
             * Abscissa.
             */
            public Builder abscissa(String abscissa) {
                this.abscissa = abscissa;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DifferenceHistogram build() {
                return new DifferenceHistogram(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySampleConsistencyJobDifferenceResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySampleConsistencyJobDifferenceResponseBody</p>
     */
    public static class NumberFeatureDifferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiffValue")
        private Double diffValue;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ReplyTableFeatureValue")
        private Double replyTableFeatureValue;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SampleTableFeatureValue")
        private Double sampleTableFeatureValue;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private NumberFeatureDifferences(Builder builder) {
            this.diffValue = builder.diffValue;
            this.itemId = builder.itemId;
            this.replyTableFeatureValue = builder.replyTableFeatureValue;
            this.requestId = builder.requestId;
            this.sampleTableFeatureValue = builder.sampleTableFeatureValue;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumberFeatureDifferences create() {
            return builder().build();
        }

        /**
         * @return diffValue
         */
        public Double getDiffValue() {
            return this.diffValue;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return replyTableFeatureValue
         */
        public Double getReplyTableFeatureValue() {
            return this.replyTableFeatureValue;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sampleTableFeatureValue
         */
        public Double getSampleTableFeatureValue() {
            return this.sampleTableFeatureValue;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double diffValue; 
            private String itemId; 
            private Double replyTableFeatureValue; 
            private String requestId; 
            private Double sampleTableFeatureValue; 
            private String userId; 

            private Builder() {
            } 

            private Builder(NumberFeatureDifferences model) {
                this.diffValue = model.diffValue;
                this.itemId = model.itemId;
                this.replyTableFeatureValue = model.replyTableFeatureValue;
                this.requestId = model.requestId;
                this.sampleTableFeatureValue = model.sampleTableFeatureValue;
                this.userId = model.userId;
            } 

            /**
             * DiffValue.
             */
            public Builder diffValue(Double diffValue) {
                this.diffValue = diffValue;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ReplyTableFeatureValue.
             */
            public Builder replyTableFeatureValue(Double replyTableFeatureValue) {
                this.replyTableFeatureValue = replyTableFeatureValue;
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
             * SampleTableFeatureValue.
             */
            public Builder sampleTableFeatureValue(Double sampleTableFeatureValue) {
                this.sampleTableFeatureValue = sampleTableFeatureValue;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public NumberFeatureDifferences build() {
                return new NumberFeatureDifferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySampleConsistencyJobDifferenceResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySampleConsistencyJobDifferenceResponseBody</p>
     */
    public static class StringFeatureDifferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ReplyTableFeatureValue")
        private String replyTableFeatureValue;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SampleTableFeatureValue")
        private String sampleTableFeatureValue;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private StringFeatureDifferences(Builder builder) {
            this.itemId = builder.itemId;
            this.replyTableFeatureValue = builder.replyTableFeatureValue;
            this.requestId = builder.requestId;
            this.sampleTableFeatureValue = builder.sampleTableFeatureValue;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StringFeatureDifferences create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return replyTableFeatureValue
         */
        public String getReplyTableFeatureValue() {
            return this.replyTableFeatureValue;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sampleTableFeatureValue
         */
        public String getSampleTableFeatureValue() {
            return this.sampleTableFeatureValue;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String itemId; 
            private String replyTableFeatureValue; 
            private String requestId; 
            private String sampleTableFeatureValue; 
            private String userId; 

            private Builder() {
            } 

            private Builder(StringFeatureDifferences model) {
                this.itemId = model.itemId;
                this.replyTableFeatureValue = model.replyTableFeatureValue;
                this.requestId = model.requestId;
                this.sampleTableFeatureValue = model.sampleTableFeatureValue;
                this.userId = model.userId;
            } 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ReplyTableFeatureValue.
             */
            public Builder replyTableFeatureValue(String replyTableFeatureValue) {
                this.replyTableFeatureValue = replyTableFeatureValue;
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
             * SampleTableFeatureValue.
             */
            public Builder sampleTableFeatureValue(String sampleTableFeatureValue) {
                this.sampleTableFeatureValue = sampleTableFeatureValue;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public StringFeatureDifferences build() {
                return new StringFeatureDifferences(this);
            } 

        } 

    }
}
