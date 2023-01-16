// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundPreCalRequest} extends {@link RequestModel}
 *
 * <p>FlightRefundPreCalRequest</p>
 */
public class FlightRefundPreCalRequest extends Request {
    @Query
    @NameInMap("dis_order_id")
    @Validation(required = true)
    private String disOrderId;

    @Query
    @NameInMap("is_voluntary")
    private String isVoluntary;

    @Query
    @NameInMap("passenger_segment_info_list")
    @Validation(required = true)
    private java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private FlightRefundPreCalRequest(Builder builder) {
        super(builder);
        this.disOrderId = builder.disOrderId;
        this.isVoluntary = builder.isVoluntary;
        this.passengerSegmentInfoList = builder.passengerSegmentInfoList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightRefundPreCalRequest create() {
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
     * @return isVoluntary
     */
    public String getIsVoluntary() {
        return this.isVoluntary;
    }

    /**
     * @return passengerSegmentInfoList
     */
    public java.util.List < PassengerSegmentInfoList> getPassengerSegmentInfoList() {
        return this.passengerSegmentInfoList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightRefundPreCalRequest, Builder> {
        private String disOrderId; 
        private String isVoluntary; 
        private java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightRefundPreCalRequest request) {
            super(request);
            this.disOrderId = request.disOrderId;
            this.isVoluntary = request.isVoluntary;
            this.passengerSegmentInfoList = request.passengerSegmentInfoList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * 分销外部订单号
         */
        public Builder disOrderId(String disOrderId) {
            this.putQueryParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * is_voluntary.
         */
        public Builder isVoluntary(String isVoluntary) {
            this.putQueryParameter("is_voluntary", isVoluntary);
            this.isVoluntary = isVoluntary;
            return this;
        }

        /**
         * 选择的要退票的乘客航段列表
         */
        public Builder passengerSegmentInfoList(java.util.List < PassengerSegmentInfoList> passengerSegmentInfoList) {
            String passengerSegmentInfoListShrink = shrink(passengerSegmentInfoList, "passenger_segment_info_list", "json");
            this.putQueryParameter("passenger_segment_info_list", passengerSegmentInfoListShrink);
            this.passengerSegmentInfoList = passengerSegmentInfoList;
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
        public FlightRefundPreCalRequest build() {
            return new FlightRefundPreCalRequest(this);
        } 

    } 

    public static class PassengerSegmentInfoList extends TeaModel {
        @NameInMap("flight_no")
        @Validation(required = true)
        private String flightNo;

        @NameInMap("passenger_name")
        @Validation(required = true)
        private String passengerName;

        @NameInMap("user_id")
        @Validation(required = true)
        private String userId;

        private PassengerSegmentInfoList(Builder builder) {
            this.flightNo = builder.flightNo;
            this.passengerName = builder.passengerName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerSegmentInfoList create() {
            return builder().build();
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String flightNo; 
            private String passengerName; 
            private String userId; 

            /**
             * 航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * 乘客姓名
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PassengerSegmentInfoList build() {
                return new PassengerSegmentInfoList(this);
            } 

        } 

    }
}
