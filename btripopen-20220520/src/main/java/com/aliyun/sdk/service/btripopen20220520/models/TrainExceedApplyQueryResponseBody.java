// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainExceedApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainExceedApplyQueryResponseBody</p>
 */
public class TrainExceedApplyQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private Module module;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private TrainExceedApplyQueryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.module = builder.module;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainExceedApplyQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private String requestId; 
        private Module module; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * result_code.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainExceedApplyQueryResponseBody build() {
            return new TrainExceedApplyQueryResponseBody(this);
        } 

    } 

    public static class ApplyIntentionInfoDO extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_station")
        private String arrStation;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_station")
        private String depStation;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("price")
        private Long price;

        @NameInMap("seat_name")
        private String seatName;

        @NameInMap("train_no")
        private String trainNo;

        @NameInMap("train_type_desc")
        private String trainTypeDesc;

        @NameInMap("type")
        private Integer type;

        private ApplyIntentionInfoDO(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrCityName = builder.arrCityName;
            this.arrStation = builder.arrStation;
            this.arrTime = builder.arrTime;
            this.depCity = builder.depCity;
            this.depCityName = builder.depCityName;
            this.depStation = builder.depStation;
            this.depTime = builder.depTime;
            this.price = builder.price;
            this.seatName = builder.seatName;
            this.trainNo = builder.trainNo;
            this.trainTypeDesc = builder.trainTypeDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyIntentionInfoDO create() {
            return builder().build();
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrStation
         */
        public String getArrStation() {
            return this.arrStation;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return depStation
         */
        public String getDepStation() {
            return this.depStation;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
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
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return trainTypeDesc
         */
        public String getTrainTypeDesc() {
            return this.trainTypeDesc;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String arrCity; 
            private String arrCityName; 
            private String arrStation; 
            private String arrTime; 
            private String depCity; 
            private String depCityName; 
            private String depStation; 
            private String depTime; 
            private Long price; 
            private String seatName; 
            private String trainNo; 
            private String trainTypeDesc; 
            private Integer type; 

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * arr_station.
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
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
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * dep_station.
             */
            public Builder depStation(String depStation) {
                this.depStation = depStation;
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
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * train_type_desc.
             */
            public Builder trainTypeDesc(String trainTypeDesc) {
                this.trainTypeDesc = trainTypeDesc;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ApplyIntentionInfoDO build() {
                return new ApplyIntentionInfoDO(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private Long applyId;

        @NameInMap("apply_intention_info_d_o")
        private ApplyIntentionInfoDO applyIntentionInfoDO;

        @NameInMap("btrip_cause")
        private String btripCause;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("exceed_reason")
        private String exceedReason;

        @NameInMap("exceed_type")
        private Integer exceedType;

        @NameInMap("origin_standard")
        private String originStandard;

        @NameInMap("status")
        private Integer status;

        @NameInMap("submit_time")
        private String submitTime;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.applyIntentionInfoDO = builder.applyIntentionInfoDO;
            this.btripCause = builder.btripCause;
            this.corpId = builder.corpId;
            this.exceedReason = builder.exceedReason;
            this.exceedType = builder.exceedType;
            this.originStandard = builder.originStandard;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartCorpId = builder.thirdpartCorpId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return applyIntentionInfoDO
         */
        public ApplyIntentionInfoDO getApplyIntentionInfoDO() {
            return this.applyIntentionInfoDO;
        }

        /**
         * @return btripCause
         */
        public String getBtripCause() {
            return this.btripCause;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
        }

        /**
         * @return exceedType
         */
        public Integer getExceedType() {
            return this.exceedType;
        }

        /**
         * @return originStandard
         */
        public String getOriginStandard() {
            return this.originStandard;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartCorpId
         */
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long applyId; 
            private ApplyIntentionInfoDO applyIntentionInfoDO; 
            private String btripCause; 
            private String corpId; 
            private String exceedReason; 
            private Integer exceedType; 
            private String originStandard; 
            private Integer status; 
            private String submitTime; 
            private String thirdpartApplyId; 
            private String thirdpartCorpId; 
            private String userId; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * apply_intention_info_d_o.
             */
            public Builder applyIntentionInfoDO(ApplyIntentionInfoDO applyIntentionInfoDO) {
                this.applyIntentionInfoDO = applyIntentionInfoDO;
                return this;
            }

            /**
             * btrip_cause.
             */
            public Builder btripCause(String btripCause) {
                this.btripCause = btripCause;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
                return this;
            }

            /**
             * exceed_type.
             */
            public Builder exceedType(Integer exceedType) {
                this.exceedType = exceedType;
                return this;
            }

            /**
             * origin_standard.
             */
            public Builder originStandard(String originStandard) {
                this.originStandard = originStandard;
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
             * submit_time.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_corp_id.
             */
            public Builder thirdpartCorpId(String thirdpartCorpId) {
                this.thirdpartCorpId = thirdpartCorpId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
