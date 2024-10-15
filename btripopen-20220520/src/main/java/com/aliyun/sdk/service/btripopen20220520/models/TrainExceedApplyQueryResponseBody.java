// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainExceedApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainExceedApplyQueryResponseBody</p>
 */
public class TrainExceedApplyQueryResponseBody extends TeaModel {
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

    private TrainExceedApplyQueryResponseBody(Builder builder) {
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

    public static TrainExceedApplyQueryResponseBody create() {
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
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
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

    /**
     * 
     * {@link TrainExceedApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainExceedApplyQueryResponseBody</p>
     */
    public static class ApplyIntentionInfoDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_station")
        private String arrStation;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_station")
        private String depStation;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("seat_name")
        private String seatName;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        @com.aliyun.core.annotation.NameInMap("train_type_desc")
        private String trainTypeDesc;

        @com.aliyun.core.annotation.NameInMap("type")
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
    /**
     * 
     * {@link TrainExceedApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainExceedApplyQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("apply_intention_info_d_o")
        private ApplyIntentionInfoDO applyIntentionInfoDO;

        @com.aliyun.core.annotation.NameInMap("btrip_cause")
        private String btripCause;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("exceed_reason")
        private String exceedReason;

        @com.aliyun.core.annotation.NameInMap("exceed_type")
        private Integer exceedType;

        @com.aliyun.core.annotation.NameInMap("origin_standard")
        private String originStandard;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("submit_time")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

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
            this.userName = builder.userName;
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

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
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
            private String userName; 

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

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
