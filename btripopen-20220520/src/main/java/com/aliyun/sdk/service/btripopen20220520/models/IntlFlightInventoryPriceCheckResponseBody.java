// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IntlFlightInventoryPriceCheckResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightInventoryPriceCheckResponseBody</p>
 */
public class IntlFlightInventoryPriceCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result_code")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("result_msg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IntlFlightInventoryPriceCheckResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightInventoryPriceCheckResponseBody create() {
        return builder().build();
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
     * @return resultCode
     */
    public String getResultCode() {
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
        private Module module; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

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
         * result_code.
         */
        public Builder resultCode(String resultCode) {
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

        public IntlFlightInventoryPriceCheckResponseBody build() {
            return new IntlFlightInventoryPriceCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightInventoryPriceCheckResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckResponseBody</p>
     */
    public static class ChangedPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("build_price")
        private Long buildPrice;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Long oilPrice;

        @com.aliyun.core.annotation.NameInMap("tax_price")
        private Long taxPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        private ChangedPrice(Builder builder) {
            this.buildPrice = builder.buildPrice;
            this.oilPrice = builder.oilPrice;
            this.taxPrice = builder.taxPrice;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangedPrice create() {
            return builder().build();
        }

        /**
         * @return buildPrice
         */
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return oilPrice
         */
        public Long getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return taxPrice
         */
        public Long getTaxPrice() {
            return this.taxPrice;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Long buildPrice; 
            private Long oilPrice; 
            private Long taxPrice; 
            private Long ticketPrice; 

            /**
             * build_price.
             */
            public Builder buildPrice(Long buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Long oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * tax_price.
             */
            public Builder taxPrice(Long taxPrice) {
                this.taxPrice = taxPrice;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public ChangedPrice build() {
                return new ChangedPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckResponseBody</p>
     */
    public static class OriginalPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("build_price")
        private Long buildPrice;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Long oilPrice;

        @com.aliyun.core.annotation.NameInMap("tax_price")
        private Long taxPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        private OriginalPrice(Builder builder) {
            this.buildPrice = builder.buildPrice;
            this.oilPrice = builder.oilPrice;
            this.taxPrice = builder.taxPrice;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalPrice create() {
            return builder().build();
        }

        /**
         * @return buildPrice
         */
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return oilPrice
         */
        public Long getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return taxPrice
         */
        public Long getTaxPrice() {
            return this.taxPrice;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Long buildPrice; 
            private Long oilPrice; 
            private Long taxPrice; 
            private Long ticketPrice; 

            /**
             * build_price.
             */
            public Builder buildPrice(Long buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Long oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * tax_price.
             */
            public Builder taxPrice(Long taxPrice) {
                this.taxPrice = taxPrice;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public OriginalPrice build() {
                return new OriginalPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckResponseBody</p>
     */
    public static class PassengerChangedPriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changed")
        private Boolean changed;

        @com.aliyun.core.annotation.NameInMap("changed_price")
        private ChangedPrice changedPrice;

        @com.aliyun.core.annotation.NameInMap("original_price")
        private OriginalPrice originalPrice;

        @com.aliyun.core.annotation.NameInMap("passenger_type")
        private Integer passengerType;

        private PassengerChangedPriceInfoList(Builder builder) {
            this.changed = builder.changed;
            this.changedPrice = builder.changedPrice;
            this.originalPrice = builder.originalPrice;
            this.passengerType = builder.passengerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerChangedPriceInfoList create() {
            return builder().build();
        }

        /**
         * @return changed
         */
        public Boolean getChanged() {
            return this.changed;
        }

        /**
         * @return changedPrice
         */
        public ChangedPrice getChangedPrice() {
            return this.changedPrice;
        }

        /**
         * @return originalPrice
         */
        public OriginalPrice getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public static final class Builder {
            private Boolean changed; 
            private ChangedPrice changedPrice; 
            private OriginalPrice originalPrice; 
            private Integer passengerType; 

            /**
             * changed.
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
                return this;
            }

            /**
             * changed_price.
             */
            public Builder changedPrice(ChangedPrice changedPrice) {
                this.changedPrice = changedPrice;
                return this;
            }

            /**
             * original_price.
             */
            public Builder originalPrice(OriginalPrice originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            public PassengerChangedPriceInfoList build() {
                return new PassengerChangedPriceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_success")
        private Boolean checkSuccess;

        @com.aliyun.core.annotation.NameInMap("fail_type")
        private Integer failType;

        @com.aliyun.core.annotation.NameInMap("passenger_changed_price_info_list")
        private java.util.List < PassengerChangedPriceInfoList> passengerChangedPriceInfoList;

        @com.aliyun.core.annotation.NameInMap("render_key")
        private String renderKey;

        private Module(Builder builder) {
            this.checkSuccess = builder.checkSuccess;
            this.failType = builder.failType;
            this.passengerChangedPriceInfoList = builder.passengerChangedPriceInfoList;
            this.renderKey = builder.renderKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return checkSuccess
         */
        public Boolean getCheckSuccess() {
            return this.checkSuccess;
        }

        /**
         * @return failType
         */
        public Integer getFailType() {
            return this.failType;
        }

        /**
         * @return passengerChangedPriceInfoList
         */
        public java.util.List < PassengerChangedPriceInfoList> getPassengerChangedPriceInfoList() {
            return this.passengerChangedPriceInfoList;
        }

        /**
         * @return renderKey
         */
        public String getRenderKey() {
            return this.renderKey;
        }

        public static final class Builder {
            private Boolean checkSuccess; 
            private Integer failType; 
            private java.util.List < PassengerChangedPriceInfoList> passengerChangedPriceInfoList; 
            private String renderKey; 

            /**
             * check_success.
             */
            public Builder checkSuccess(Boolean checkSuccess) {
                this.checkSuccess = checkSuccess;
                return this;
            }

            /**
             * fail_type.
             */
            public Builder failType(Integer failType) {
                this.failType = failType;
                return this;
            }

            /**
             * passenger_changed_price_info_list.
             */
            public Builder passengerChangedPriceInfoList(java.util.List < PassengerChangedPriceInfoList> passengerChangedPriceInfoList) {
                this.passengerChangedPriceInfoList = passengerChangedPriceInfoList;
                return this;
            }

            /**
             * render_key.
             */
            public Builder renderKey(String renderKey) {
                this.renderKey = renderKey;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
