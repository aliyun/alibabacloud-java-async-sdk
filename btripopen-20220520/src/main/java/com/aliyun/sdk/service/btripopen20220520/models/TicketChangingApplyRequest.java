// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TicketChangingApplyRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingApplyRequest</p>
 */
public class TicketChangingApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_voluntary")
    private Integer isVoluntary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modify_flight_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ModifyFlightInfoList> modifyFlightInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("session_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whether_retry")
    private Boolean whetherRetry;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TicketChangingApplyRequest(Builder builder) {
        super(builder);
        this.disOrderId = builder.disOrderId;
        this.disSubOrderId = builder.disSubOrderId;
        this.isVoluntary = builder.isVoluntary;
        this.modifyFlightInfoList = builder.modifyFlightInfoList;
        this.otaItemId = builder.otaItemId;
        this.reason = builder.reason;
        this.sessionId = builder.sessionId;
        this.whetherRetry = builder.whetherRetry;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketChangingApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return disSubOrderId
     */
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    /**
     * @return isVoluntary
     */
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    /**
     * @return modifyFlightInfoList
     */
    public java.util.List < ModifyFlightInfoList> getModifyFlightInfoList() {
        return this.modifyFlightInfoList;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return whetherRetry
     */
    public Boolean getWhetherRetry() {
        return this.whetherRetry;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TicketChangingApplyRequest, Builder> {
        private String disOrderId; 
        private String disSubOrderId; 
        private Integer isVoluntary; 
        private java.util.List < ModifyFlightInfoList> modifyFlightInfoList; 
        private String otaItemId; 
        private String reason; 
        private String sessionId; 
        private Boolean whetherRetry; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TicketChangingApplyRequest request) {
            super(request);
            this.disOrderId = request.disOrderId;
            this.disSubOrderId = request.disSubOrderId;
            this.isVoluntary = request.isVoluntary;
            this.modifyFlightInfoList = request.modifyFlightInfoList;
            this.otaItemId = request.otaItemId;
            this.reason = request.reason;
            this.sessionId = request.sessionId;
            this.whetherRetry = request.whetherRetry;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dis1234</p>
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mid1243</p>
         */
        public Builder disSubOrderId(String disSubOrderId) {
            this.putBodyParameter("dis_sub_order_id", disSubOrderId);
            this.disSubOrderId = disSubOrderId;
            return this;
        }

        /**
         * is_voluntary.
         */
        public Builder isVoluntary(Integer isVoluntary) {
            this.putBodyParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifyFlightInfoList(java.util.List < ModifyFlightInfoList> modifyFlightInfoList) {
            String modifyFlightInfoListShrink = shrink(modifyFlightInfoList, "modify_flight_info_list", "json");
            this.putBodyParameter("modify_flight_info_list", modifyFlightInfoListShrink);
            this.modifyFlightInfoList = modifyFlightInfoList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1s8837sh991hsj92h</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putBodyParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>us88s2bsbin22hjusd8i</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("session_id", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * whether_retry.
         */
        public Builder whetherRetry(Boolean whetherRetry) {
            this.putBodyParameter("whether_retry", whetherRetry);
            this.whetherRetry = whetherRetry;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TicketChangingApplyRequest build() {
            return new TicketChangingApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link TicketChangingApplyRequest} extends {@link TeaModel}
     *
     * <p>TicketChangingApplyRequest</p>
     */
    public static class PassengerInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("origin_flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String originFlightNo;

        @com.aliyun.core.annotation.NameInMap("out_user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outUserId;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        private PassengerInfoList(Builder builder) {
            this.originFlightNo = builder.originFlightNo;
            this.outUserId = builder.outUserId;
            this.passengerName = builder.passengerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfoList create() {
            return builder().build();
        }

        /**
         * @return originFlightNo
         */
        public String getOriginFlightNo() {
            return this.originFlightNo;
        }

        /**
         * @return outUserId
         */
        public String getOutUserId() {
            return this.outUserId;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        public static final class Builder {
            private String originFlightNo; 
            private String outUserId; 
            private String passengerName; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CA1703</p>
             */
            public Builder originFlightNo(String originFlightNo) {
                this.originFlightNo = originFlightNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder outUserId(String outUserId) {
                this.outUserId = outUserId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            public PassengerInfoList build() {
                return new PassengerInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketChangingApplyRequest} extends {@link TeaModel}
     *
     * <p>TicketChangingApplyRequest</p>
     */
    public static class ModifyFlightInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("passenger_info_list")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < PassengerInfoList> passengerInfoList;

        private ModifyFlightInfoList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.cabin = builder.cabin;
            this.depCity = builder.depCity;
            this.depDate = builder.depDate;
            this.flightNo = builder.flightNo;
            this.passengerInfoList = builder.passengerInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyFlightInfoList create() {
            return builder().build();
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return passengerInfoList
         */
        public java.util.List < PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        public static final class Builder {
            private String arrCity; 
            private String cabin; 
            private String depCity; 
            private String depDate; 
            private String flightNo; 
            private java.util.List < PassengerInfoList> passengerInfoList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BJS</p>
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HGH</p>
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0000-00-00 00:00:00</p>
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CA1704</p>
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder passengerInfoList(java.util.List < PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
                return this;
            }

            public ModifyFlightInfoList build() {
                return new ModifyFlightInfoList(this);
            } 

        } 

    }
}
