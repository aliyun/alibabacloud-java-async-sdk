// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
 *
 * <p>AncillarySuggestResponseBody</p>
 */
public class AncillarySuggestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AncillarySuggestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AncillarySuggestResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Properly processed return data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Data carried in error handling</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>http request successful, status value is always 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true represents success, false represents failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AncillarySuggestResponseBody build() {
            return new AncillarySuggestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
     *
     * <p>AncillarySuggestResponseBody</p>
     */
    public static class BaggageAncillary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_amount")
        private Integer baggageAmount;

        @com.aliyun.core.annotation.NameInMap("baggage_weight")
        private Integer baggageWeight;

        @com.aliyun.core.annotation.NameInMap("baggage_weight_unit")
        private String baggageWeightUnit;

        @com.aliyun.core.annotation.NameInMap("is_all_weight")
        private Boolean isAllWeight;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        private BaggageAncillary(Builder builder) {
            this.baggageAmount = builder.baggageAmount;
            this.baggageWeight = builder.baggageWeight;
            this.baggageWeightUnit = builder.baggageWeightUnit;
            this.isAllWeight = builder.isAllWeight;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageAncillary create() {
            return builder().build();
        }

        /**
         * @return baggageAmount
         */
        public Integer getBaggageAmount() {
            return this.baggageAmount;
        }

        /**
         * @return baggageWeight
         */
        public Integer getBaggageWeight() {
            return this.baggageWeight;
        }

        /**
         * @return baggageWeightUnit
         */
        public String getBaggageWeightUnit() {
            return this.baggageWeightUnit;
        }

        /**
         * @return isAllWeight
         */
        public Boolean getIsAllWeight() {
            return this.isAllWeight;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        public static final class Builder {
            private Integer baggageAmount; 
            private Integer baggageWeight; 
            private String baggageWeightUnit; 
            private Boolean isAllWeight; 
            private Double price; 

            /**
             * <p>baggage quantity, values such as: 3, 2, 1, 0, -2.     -2 indicates weight-based</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder baggageAmount(Integer baggageAmount) {
                this.baggageAmount = baggageAmount;
                return this;
            }

            /**
             * <p>Baggage weight, 0-50. When isAllWeight=true, it represents the total weight of all baggages.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder baggageWeight(Integer baggageWeight) {
                this.baggageWeight = baggageWeight;
                return this;
            }

            /**
             * <p>Unit of baggage weight</p>
             * 
             * <strong>example:</strong>
             * <p>KG</p>
             */
            public Builder baggageWeightUnit(String baggageWeightUnit) {
                this.baggageWeightUnit = baggageWeightUnit;
                return this;
            }

            /**
             * <p>Whether the weight is for all baggages</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAllWeight(Boolean isAllWeight) {
                this.isAllWeight = isAllWeight;
                return this;
            }

            /**
             * <p>Total price</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            public BaggageAncillary build() {
                return new BaggageAncillary(this);
            } 

        } 

    }
    /**
     * 
     * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
     *
     * <p>AncillarySuggestResponseBody</p>
     */
    public static class Ancillary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary_id")
        private String ancillaryId;

        @com.aliyun.core.annotation.NameInMap("ancillary_type")
        private Integer ancillaryType;

        @com.aliyun.core.annotation.NameInMap("baggage_ancillary")
        private BaggageAncillary baggageAncillary;

        private Ancillary(Builder builder) {
            this.ancillaryId = builder.ancillaryId;
            this.ancillaryType = builder.ancillaryType;
            this.baggageAncillary = builder.baggageAncillary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ancillary create() {
            return builder().build();
        }

        /**
         * @return ancillaryId
         */
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        /**
         * @return ancillaryType
         */
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

        /**
         * @return baggageAncillary
         */
        public BaggageAncillary getBaggageAncillary() {
            return this.baggageAncillary;
        }

        public static final class Builder {
            private String ancillaryId; 
            private Integer ancillaryType; 
            private BaggageAncillary baggageAncillary; 

            /**
             * <p>Ancillary product ID</p>
             * 
             * <strong>example:</strong>
             * <p>eJwz8DeySEo0NjQ01TU3TU</p>
             */
            public Builder ancillaryId(String ancillaryId) {
                this.ancillaryId = ancillaryId;
                return this;
            }

            /**
             * <p>Ancillary product type. currently supports 4: paid luggage</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ancillaryType(Integer ancillaryType) {
                this.ancillaryType = ancillaryType;
                return this;
            }

            /**
             * <p>Baggage details</p>
             */
            public Builder baggageAncillary(BaggageAncillary baggageAncillary) {
                this.baggageAncillary = baggageAncillary;
                return this;
            }

            public Ancillary build() {
                return new Ancillary(this);
            } 

        } 

    }
    /**
     * 
     * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
     *
     * <p>AncillarySuggestResponseBody</p>
     */
    public static class SegAncillaryMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ancillary")
        private Ancillary ancillary;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List<String> segmentIdList;

        private SegAncillaryMapList(Builder builder) {
            this.ancillary = builder.ancillary;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegAncillaryMapList create() {
            return builder().build();
        }

        /**
         * @return ancillary
         */
        public Ancillary getAncillary() {
            return this.ancillary;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private Ancillary ancillary; 
            private java.util.List<String> segmentIdList; 

            /**
             * <p>Ancillary product</p>
             */
            public Builder ancillary(Ancillary ancillary) {
                this.ancillary = ancillary;
                return this;
            }

            /**
             * <p>Segment ID list, these segments share the same ancillary</p>
             */
            public Builder segmentIdList(java.util.List<String> segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegAncillaryMapList build() {
                return new SegAncillaryMapList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
     *
     * <p>AncillarySuggestResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("seg_ancillary_map_list")
        private java.util.List<SegAncillaryMapList> segAncillaryMapList;

        @com.aliyun.core.annotation.NameInMap("solution_id")
        private String solutionId;

        private Data(Builder builder) {
            this.segAncillaryMapList = builder.segAncillaryMapList;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return segAncillaryMapList
         */
        public java.util.List<SegAncillaryMapList> getSegAncillaryMapList() {
            return this.segAncillaryMapList;
        }

        /**
         * @return solutionId
         */
        public String getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private java.util.List<SegAncillaryMapList> segAncillaryMapList; 
            private String solutionId; 

            /**
             * <p>ancillary detail list</p>
             */
            public Builder segAncillaryMapList(java.util.List<SegAncillaryMapList> segAncillaryMapList) {
                this.segAncillaryMapList = segAncillaryMapList;
                return this;
            }

            /**
             * <p>solution_id, equals to solution_id in request</p>
             * 
             * <strong>example:</strong>
             * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
             */
            public Builder solutionId(String solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
