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
 * {@link MerchandisePlacementDetectionProResponseBody} extends {@link TeaModel}
 *
 * <p>MerchandisePlacementDetectionProResponseBody</p>
 */
public class MerchandisePlacementDetectionProResponseBody extends TeaModel {
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

    private MerchandisePlacementDetectionProResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePlacementDetectionProResponseBody create() {
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

        private Builder(MerchandisePlacementDetectionProResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detection result of product display detection Pro.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MerchandisePlacementDetectionProResponseBody build() {
            return new MerchandisePlacementDetectionProResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MerchandisePlacementDetectionProResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionProResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox2d")
        private java.util.List<Integer> bbox2d;

        @com.aliyun.core.annotation.NameInMap("DetectedSkuName")
        private String detectedSkuName;

        @com.aliyun.core.annotation.NameInMap("Idx")
        private Integer idx;

        private DataData(Builder builder) {
            this.bbox2d = builder.bbox2d;
            this.detectedSkuName = builder.detectedSkuName;
            this.idx = builder.idx;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return bbox2d
         */
        public java.util.List<Integer> getBbox2d() {
            return this.bbox2d;
        }

        /**
         * @return detectedSkuName
         */
        public String getDetectedSkuName() {
            return this.detectedSkuName;
        }

        /**
         * @return idx
         */
        public Integer getIdx() {
            return this.idx;
        }

        public static final class Builder {
            private java.util.List<Integer> bbox2d; 
            private String detectedSkuName; 
            private Integer idx; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.bbox2d = model.bbox2d;
                this.detectedSkuName = model.detectedSkuName;
                this.idx = model.idx;
            } 

            /**
             * <p>The normalized bounding box coordinates [x1,y1,x2,y2], with values in the range 0–1000.</p>
             */
            public Builder bbox2d(java.util.List<Integer> bbox2d) {
                this.bbox2d = bbox2d;
                return this;
            }

            /**
             * <p>The detected product name. The value is unknown if the name cannot be determined.</p>
             * 
             * <strong>example:</strong>
             * <p>unknown</p>
             */
            public Builder detectedSkuName(String detectedSkuName) {
                this.detectedSkuName = detectedSkuName;
                return this;
            }

            /**
             * <p>The bounding box index, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder idx(Integer idx) {
                this.idx = idx;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionProResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionProResponseBody</p>
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
             * <p>The number of valid bounding boxes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder boxCount(Integer boxCount) {
                this.boxCount = boxCount;
                return this;
            }

            /**
             * <p>The list of per-box detection details.</p>
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessingCount&quot;:1}</p>
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
