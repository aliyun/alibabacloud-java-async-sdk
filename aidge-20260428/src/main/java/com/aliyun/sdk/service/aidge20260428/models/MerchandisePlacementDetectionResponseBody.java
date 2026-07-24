// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link MerchandisePlacementDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>MerchandisePlacementDetectionResponseBody</p>
 */
public class MerchandisePlacementDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MerchandisePlacementDetectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePlacementDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MerchandisePlacementDetectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MerchandisePlacementDetectionResponseBody build() {
            return new MerchandisePlacementDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MerchandisePlacementDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionResponseBody</p>
     */
    public static class Top1 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private Top1(Builder builder) {
            this.score = builder.score;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Top1 create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private Float score; 
            private String skuId; 
            private String skuName; 

            private Builder() {
            } 

            private Builder(Top1 model) {
                this.score = model.score;
                this.skuId = model.skuId;
                this.skuName = model.skuName;
            } 

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public Top1 build() {
                return new Top1(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionResponseBody</p>
     */
    public static class Topk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rank")
        private Integer rank;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private Topk(Builder builder) {
            this.rank = builder.rank;
            this.score = builder.score;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topk create() {
            return builder().build();
        }

        /**
         * @return rank
         */
        public Integer getRank() {
            return this.rank;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private Integer rank; 
            private Float score; 
            private String skuId; 
            private String skuName; 

            private Builder() {
            } 

            private Builder(Topk model) {
                this.rank = model.rank;
                this.score = model.score;
                this.skuId = model.skuId;
                this.skuName = model.skuName;
            } 

            /**
             * Rank.
             */
            public Builder rank(Integer rank) {
                this.rank = rank;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public Topk build() {
                return new Topk(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox")
        private java.util.List<Float> bbox;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Idx")
        private Integer idx;

        @com.aliyun.core.annotation.NameInMap("Top1")
        private Top1 top1;

        @com.aliyun.core.annotation.NameInMap("Topk")
        private java.util.List<Topk> topk;

        private DataData(Builder builder) {
            this.bbox = builder.bbox;
            this.error = builder.error;
            this.idx = builder.idx;
            this.top1 = builder.top1;
            this.topk = builder.topk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return bbox
         */
        public java.util.List<Float> getBbox() {
            return this.bbox;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return idx
         */
        public Integer getIdx() {
            return this.idx;
        }

        /**
         * @return top1
         */
        public Top1 getTop1() {
            return this.top1;
        }

        /**
         * @return topk
         */
        public java.util.List<Topk> getTopk() {
            return this.topk;
        }

        public static final class Builder {
            private java.util.List<Float> bbox; 
            private String error; 
            private Integer idx; 
            private Top1 top1; 
            private java.util.List<Topk> topk; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.bbox = model.bbox;
                this.error = model.error;
                this.idx = model.idx;
                this.top1 = model.top1;
                this.topk = model.topk;
            } 

            /**
             * Bbox.
             */
            public Builder bbox(java.util.List<Float> bbox) {
                this.bbox = bbox;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * Idx.
             */
            public Builder idx(Integer idx) {
                this.idx = idx;
                return this;
            }

            /**
             * Top1.
             */
            public Builder top1(Top1 top1) {
                this.top1 = top1;
                return this;
            }

            /**
             * Topk.
             */
            public Builder topk(java.util.List<Topk> topk) {
                this.topk = topk;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoxCount")
        private Integer boxCount;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.boxCount = builder.boxCount;
            this.data = builder.data;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boxCount
         */
        public Integer getBoxCount() {
            return this.boxCount;
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Integer boxCount; 
            private java.util.List<DataData> data; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boxCount = model.boxCount;
                this.data = model.data;
                this.usageMap = model.usageMap;
            } 

            /**
             * BoxCount.
             */
            public Builder boxCount(Integer boxCount) {
                this.boxCount = boxCount;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * UsageMap.
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
