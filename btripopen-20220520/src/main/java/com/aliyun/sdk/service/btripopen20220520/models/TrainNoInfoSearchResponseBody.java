// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainNoInfoSearchResponseBody} extends {@link TeaModel}
 *
 * <p>TrainNoInfoSearchResponseBody</p>
 */
public class TrainNoInfoSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TrainNoInfoSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainNoInfoSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * requestId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainNoInfoSearchResponseBody build() {
            return new TrainNoInfoSearchResponseBody(this);
        } 

    } 

    public static class SeatInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("seat_name")
        private String seatName;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("stock")
        private String stock;

        private SeatInfos(Builder builder) {
            this.price = builder.price;
            this.seatName = builder.seatName;
            this.seatType = builder.seatType;
            this.stock = builder.stock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeatInfos create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return seatName
         */
        public String getSeatName() {
            return this.seatName;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return stock
         */
        public String getStock() {
            return this.stock;
        }

        public static final class Builder {
            private Long price; 
            private String seatName; 
            private String seatType; 
            private String stock; 

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * seat_name.
             */
            public Builder seatName(String seatName) {
                this.seatName = seatName;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * stock.
             */
            public Builder stock(String stock) {
                this.stock = stock;
                return this;
            }

            public SeatInfos build() {
                return new SeatInfos(this);
            } 

        } 

    }
    public static class TrainStationSearchVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_day_tag")
        private String arrDayTag;

        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("arr_station_name")
        private String arrStationName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cost_time")
        private String costTime;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_name")
        private String depStationName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("is_end_station")
        private Integer isEndStation;

        @com.aliyun.core.annotation.NameInMap("is_start_station")
        private Integer isStartStation;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("sale_flag")
        private String saleFlag;

        @com.aliyun.core.annotation.NameInMap("seat_infos")
        private java.util.List < SeatInfos> seatInfos;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        @com.aliyun.core.annotation.NameInMap("train_type")
        private String trainType;

        private TrainStationSearchVO(Builder builder) {
            this.arrDayTag = builder.arrDayTag;
            this.arrStationCode = builder.arrStationCode;
            this.arrStationName = builder.arrStationName;
            this.arrTime = builder.arrTime;
            this.costTime = builder.costTime;
            this.depStationCode = builder.depStationCode;
            this.depStationName = builder.depStationName;
            this.depTime = builder.depTime;
            this.isEndStation = builder.isEndStation;
            this.isStartStation = builder.isStartStation;
            this.price = builder.price;
            this.saleFlag = builder.saleFlag;
            this.seatInfos = builder.seatInfos;
            this.trainNo = builder.trainNo;
            this.trainType = builder.trainType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainStationSearchVO create() {
            return builder().build();
        }

        /**
         * @return arrDayTag
         */
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return arrStationName
         */
        public String getArrStationName() {
            return this.arrStationName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return costTime
         */
        public String getCostTime() {
            return this.costTime;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depStationName
         */
        public String getDepStationName() {
            return this.depStationName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return isEndStation
         */
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        /**
         * @return isStartStation
         */
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return saleFlag
         */
        public String getSaleFlag() {
            return this.saleFlag;
        }

        /**
         * @return seatInfos
         */
        public java.util.List < SeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return trainType
         */
        public String getTrainType() {
            return this.trainType;
        }

        public static final class Builder {
            private String arrDayTag; 
            private String arrStationCode; 
            private String arrStationName; 
            private String arrTime; 
            private String costTime; 
            private String depStationCode; 
            private String depStationName; 
            private String depTime; 
            private Integer isEndStation; 
            private Integer isStartStation; 
            private String price; 
            private String saleFlag; 
            private java.util.List < SeatInfos> seatInfos; 
            private String trainNo; 
            private String trainType; 

            /**
             * arr_day_tag.
             */
            public Builder arrDayTag(String arrDayTag) {
                this.arrDayTag = arrDayTag;
                return this;
            }

            /**
             * arr_station_code.
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * arr_station_name.
             */
            public Builder arrStationName(String arrStationName) {
                this.arrStationName = arrStationName;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cost_time.
             */
            public Builder costTime(String costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * dep_station_code.
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * dep_station_name.
             */
            public Builder depStationName(String depStationName) {
                this.depStationName = depStationName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * is_end_station.
             */
            public Builder isEndStation(Integer isEndStation) {
                this.isEndStation = isEndStation;
                return this;
            }

            /**
             * is_start_station.
             */
            public Builder isStartStation(Integer isStartStation) {
                this.isStartStation = isStartStation;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * sale_flag.
             */
            public Builder saleFlag(String saleFlag) {
                this.saleFlag = saleFlag;
                return this;
            }

            /**
             * seat_infos.
             */
            public Builder seatInfos(java.util.List < SeatInfos> seatInfos) {
                this.seatInfos = seatInfos;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * train_type.
             */
            public Builder trainType(String trainType) {
                this.trainType = trainType;
                return this;
            }

            public TrainStationSearchVO build() {
                return new TrainStationSearchVO(this);
            } 

        } 

    }
    public static class TransferDetailListSeatInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("seat_name")
        private String seatName;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("stock")
        private String stock;

        private TransferDetailListSeatInfos(Builder builder) {
            this.price = builder.price;
            this.seatName = builder.seatName;
            this.seatType = builder.seatType;
            this.stock = builder.stock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferDetailListSeatInfos create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return seatName
         */
        public String getSeatName() {
            return this.seatName;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return stock
         */
        public String getStock() {
            return this.stock;
        }

        public static final class Builder {
            private Long price; 
            private String seatName; 
            private String seatType; 
            private String stock; 

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * seat_name.
             */
            public Builder seatName(String seatName) {
                this.seatName = seatName;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * stock.
             */
            public Builder stock(String stock) {
                this.stock = stock;
                return this;
            }

            public TransferDetailListSeatInfos build() {
                return new TransferDetailListSeatInfos(this);
            } 

        } 

    }
    public static class TransferDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_day_tag")
        private String arrDayTag;

        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("arr_station_name")
        private String arrStationName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cost_time")
        private String costTime;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_name")
        private String depStationName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("is_end_station")
        private Integer isEndStation;

        @com.aliyun.core.annotation.NameInMap("is_start_station")
        private Integer isStartStation;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("sale_flag")
        private String saleFlag;

        @com.aliyun.core.annotation.NameInMap("seat_infos")
        private java.util.List < TransferDetailListSeatInfos> seatInfos;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        @com.aliyun.core.annotation.NameInMap("train_type")
        private String trainType;

        private TransferDetailList(Builder builder) {
            this.arrDayTag = builder.arrDayTag;
            this.arrStationCode = builder.arrStationCode;
            this.arrStationName = builder.arrStationName;
            this.arrTime = builder.arrTime;
            this.costTime = builder.costTime;
            this.depStationCode = builder.depStationCode;
            this.depStationName = builder.depStationName;
            this.depTime = builder.depTime;
            this.isEndStation = builder.isEndStation;
            this.isStartStation = builder.isStartStation;
            this.price = builder.price;
            this.saleFlag = builder.saleFlag;
            this.seatInfos = builder.seatInfos;
            this.trainNo = builder.trainNo;
            this.trainType = builder.trainType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferDetailList create() {
            return builder().build();
        }

        /**
         * @return arrDayTag
         */
        public String getArrDayTag() {
            return this.arrDayTag;
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return arrStationName
         */
        public String getArrStationName() {
            return this.arrStationName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return costTime
         */
        public String getCostTime() {
            return this.costTime;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depStationName
         */
        public String getDepStationName() {
            return this.depStationName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return isEndStation
         */
        public Integer getIsEndStation() {
            return this.isEndStation;
        }

        /**
         * @return isStartStation
         */
        public Integer getIsStartStation() {
            return this.isStartStation;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return saleFlag
         */
        public String getSaleFlag() {
            return this.saleFlag;
        }

        /**
         * @return seatInfos
         */
        public java.util.List < TransferDetailListSeatInfos> getSeatInfos() {
            return this.seatInfos;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return trainType
         */
        public String getTrainType() {
            return this.trainType;
        }

        public static final class Builder {
            private String arrDayTag; 
            private String arrStationCode; 
            private String arrStationName; 
            private String arrTime; 
            private String costTime; 
            private String depStationCode; 
            private String depStationName; 
            private String depTime; 
            private Integer isEndStation; 
            private Integer isStartStation; 
            private String price; 
            private String saleFlag; 
            private java.util.List < TransferDetailListSeatInfos> seatInfos; 
            private String trainNo; 
            private String trainType; 

            /**
             * arr_day_tag.
             */
            public Builder arrDayTag(String arrDayTag) {
                this.arrDayTag = arrDayTag;
                return this;
            }

            /**
             * arr_station_code.
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * arr_station_name.
             */
            public Builder arrStationName(String arrStationName) {
                this.arrStationName = arrStationName;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cost_time.
             */
            public Builder costTime(String costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * dep_station_code.
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * dep_station_name.
             */
            public Builder depStationName(String depStationName) {
                this.depStationName = depStationName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * is_end_station.
             */
            public Builder isEndStation(Integer isEndStation) {
                this.isEndStation = isEndStation;
                return this;
            }

            /**
             * is_start_station.
             */
            public Builder isStartStation(Integer isStartStation) {
                this.isStartStation = isStartStation;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * sale_flag.
             */
            public Builder saleFlag(String saleFlag) {
                this.saleFlag = saleFlag;
                return this;
            }

            /**
             * seat_infos.
             */
            public Builder seatInfos(java.util.List < TransferDetailListSeatInfos> seatInfos) {
                this.seatInfos = seatInfos;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * train_type.
             */
            public Builder trainType(String trainType) {
                this.trainType = trainType;
                return this;
            }

            public TransferDetailList build() {
                return new TransferDetailList(this);
            } 

        } 

    }
    public static class TrainTransferStationSearchVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("transfer_detail_list")
        private java.util.List < TransferDetailList> transferDetailList;

        @com.aliyun.core.annotation.NameInMap("transfer_type")
        private String transferType;

        private TrainTransferStationSearchVO(Builder builder) {
            this.transferDetailList = builder.transferDetailList;
            this.transferType = builder.transferType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainTransferStationSearchVO create() {
            return builder().build();
        }

        /**
         * @return transferDetailList
         */
        public java.util.List < TransferDetailList> getTransferDetailList() {
            return this.transferDetailList;
        }

        /**
         * @return transferType
         */
        public String getTransferType() {
            return this.transferType;
        }

        public static final class Builder {
            private java.util.List < TransferDetailList> transferDetailList; 
            private String transferType; 

            /**
             * transfer_detail_list.
             */
            public Builder transferDetailList(java.util.List < TransferDetailList> transferDetailList) {
                this.transferDetailList = transferDetailList;
                return this;
            }

            /**
             * transfer_type.
             */
            public Builder transferType(String transferType) {
                this.transferType = transferType;
                return this;
            }

            public TrainTransferStationSearchVO build() {
                return new TrainTransferStationSearchVO(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("train_station_search_v_o")
        private TrainStationSearchVO trainStationSearchVO;

        @com.aliyun.core.annotation.NameInMap("train_transfer_station_search_v_o")
        private TrainTransferStationSearchVO trainTransferStationSearchVO;

        private Module(Builder builder) {
            this.trainStationSearchVO = builder.trainStationSearchVO;
            this.trainTransferStationSearchVO = builder.trainTransferStationSearchVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return trainStationSearchVO
         */
        public TrainStationSearchVO getTrainStationSearchVO() {
            return this.trainStationSearchVO;
        }

        /**
         * @return trainTransferStationSearchVO
         */
        public TrainTransferStationSearchVO getTrainTransferStationSearchVO() {
            return this.trainTransferStationSearchVO;
        }

        public static final class Builder {
            private TrainStationSearchVO trainStationSearchVO; 
            private TrainTransferStationSearchVO trainTransferStationSearchVO; 

            /**
             * train_station_search_v_o.
             */
            public Builder trainStationSearchVO(TrainStationSearchVO trainStationSearchVO) {
                this.trainStationSearchVO = trainStationSearchVO;
                return this;
            }

            /**
             * train_transfer_station_search_v_o.
             */
            public Builder trainTransferStationSearchVO(TrainTransferStationSearchVO trainTransferStationSearchVO) {
                this.trainTransferStationSearchVO = trainTransferStationSearchVO;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
