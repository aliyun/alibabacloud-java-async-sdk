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
 * {@link FlightRefundPreCalRequest} extends {@link RequestModel}
 *
 * <p>FlightRefundPreCalRequest</p>
 */
public class FlightRefundPreCalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("is_voluntary")
    private String isVoluntary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_segment_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
    public java.util.List<PassengerSegmentInfoList> getPassengerSegmentInfoList() {
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
        private java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dis123</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder passengerSegmentInfoList(java.util.List<PassengerSegmentInfoList> passengerSegmentInfoList) {
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

    /**
     * 
     * {@link FlightRefundPreCalRequest} extends {@link TeaModel}
     *
     * <p>FlightRefundPreCalRequest</p>
     */
    public static class PassengerSegmentInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CA1982</p>
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>23112</p>
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
