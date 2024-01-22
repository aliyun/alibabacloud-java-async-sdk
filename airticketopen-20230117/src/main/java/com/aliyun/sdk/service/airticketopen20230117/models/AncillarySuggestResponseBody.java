// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AncillarySuggestResponseBody} extends {@link TeaModel}
 *
 * <p>AncillarySuggestResponseBody</p>
 */
public class AncillarySuggestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    @NameInMap("error_code")
    private String errorCode;

    @NameInMap("error_data")
    private Object errorData;

    @NameInMap("error_msg")
    private String errorMsg;

    @NameInMap("status")
    private Integer status;

    @NameInMap("success")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AncillarySuggestResponseBody build() {
            return new AncillarySuggestResponseBody(this);
        } 

    } 

    public static class BaggageAncillary extends TeaModel {
        @NameInMap("baggage_amount")
        private Integer baggageAmount;

        @NameInMap("baggage_weight")
        private Integer baggageWeight;

        @NameInMap("baggage_weight_unit")
        private String baggageWeightUnit;

        @NameInMap("is_all_weight")
        private Boolean isAllWeight;

        @NameInMap("price")
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
             * 行李件数 取值如：3、2、1、0、-2。 -2 表示计重
             */
            public Builder baggageAmount(Integer baggageAmount) {
                this.baggageAmount = baggageAmount;
                return this;
            }

            /**
             * 行李重量，0-50。isAllWeght=true 时，表示所有件数总重量。
             */
            public Builder baggageWeight(Integer baggageWeight) {
                this.baggageWeight = baggageWeight;
                return this;
            }

            /**
             * 行李重量单位
             */
            public Builder baggageWeightUnit(String baggageWeightUnit) {
                this.baggageWeightUnit = baggageWeightUnit;
                return this;
            }

            /**
             * 是否所有行李重量
             */
            public Builder isAllWeight(Boolean isAllWeight) {
                this.isAllWeight = isAllWeight;
                return this;
            }

            /**
             * 总价
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
    public static class Ancillary extends TeaModel {
        @NameInMap("ancillary_id")
        private String ancillaryId;

        @NameInMap("ancillary_type")
        private Integer ancillaryType;

        @NameInMap("baggage_ancillary")
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
             * ancillary_id.
             */
            public Builder ancillaryId(String ancillaryId) {
                this.ancillaryId = ancillaryId;
                return this;
            }

            /**
             * ancillary_type.
             */
            public Builder ancillaryType(Integer ancillaryType) {
                this.ancillaryType = ancillaryType;
                return this;
            }

            /**
             * 行李辅营详情
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
    public static class SegAncillaryMapList extends TeaModel {
        @NameInMap("ancillary")
        private Ancillary ancillary;

        @NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

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
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private Ancillary ancillary; 
            private java.util.List < String > segmentIdList; 

            /**
             * ancillary.
             */
            public Builder ancillary(Ancillary ancillary) {
                this.ancillary = ancillary;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public SegAncillaryMapList build() {
                return new SegAncillaryMapList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("seg_ancillary_map_list")
        private java.util.List < SegAncillaryMapList> segAncillaryMapList;

        @NameInMap("solution_id")
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
        public java.util.List < SegAncillaryMapList> getSegAncillaryMapList() {
            return this.segAncillaryMapList;
        }

        /**
         * @return solutionId
         */
        public String getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private java.util.List < SegAncillaryMapList> segAncillaryMapList; 
            private String solutionId; 

            /**
             * seg_ancillary_map_list.
             */
            public Builder segAncillaryMapList(java.util.List < SegAncillaryMapList> segAncillaryMapList) {
                this.segAncillaryMapList = segAncillaryMapList;
                return this;
            }

            /**
             * solution_id.
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
