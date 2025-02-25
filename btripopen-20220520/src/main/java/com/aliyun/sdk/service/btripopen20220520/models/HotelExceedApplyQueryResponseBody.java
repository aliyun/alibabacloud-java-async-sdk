// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelExceedApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelExceedApplyQueryResponseBody</p>
 */
public class HotelExceedApplyQueryResponseBody extends TeaModel {
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

    private HotelExceedApplyQueryResponseBody(Builder builder) {
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

    public static HotelExceedApplyQueryResponseBody create() {
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

        public HotelExceedApplyQueryResponseBody build() {
            return new HotelExceedApplyQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelExceedApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelExceedApplyQueryResponseBody</p>
     */
    public static class ApplyIntentionInfoDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("check_out")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("together")
        private Boolean together;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private ApplyIntentionInfoDo(Builder builder) {
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.price = builder.price;
            this.together = builder.together;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyIntentionInfoDo create() {
            return builder().build();
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkOut
         */
        public String getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return together
         */
        public Boolean getTogether() {
            return this.together;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkIn; 
            private String checkOut; 
            private String cityCode; 
            private String cityName; 
            private Long price; 
            private Boolean together; 
            private Integer type; 

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * check_out.
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
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
             * together.
             */
            public Builder together(Boolean together) {
                this.together = together;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ApplyIntentionInfoDo build() {
                return new ApplyIntentionInfoDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelExceedApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelExceedApplyQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("apply_intention_info_do")
        private ApplyIntentionInfoDo applyIntentionInfoDo;

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
            this.applyIntentionInfoDo = builder.applyIntentionInfoDo;
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
         * @return applyIntentionInfoDo
         */
        public ApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
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
            private ApplyIntentionInfoDo applyIntentionInfoDo; 
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
             * apply_intention_info_do.
             */
            public Builder applyIntentionInfoDo(ApplyIntentionInfoDo applyIntentionInfoDo) {
                this.applyIntentionInfoDo = applyIntentionInfoDo;
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
