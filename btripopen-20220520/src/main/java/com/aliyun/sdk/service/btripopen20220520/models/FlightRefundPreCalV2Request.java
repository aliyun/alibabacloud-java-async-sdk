// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundPreCalV2Request} extends {@link RequestModel}
 *
 * <p>FlightRefundPreCalV2Request</p>
 */
public class FlightRefundPreCalV2Request extends Request {
    @Query
    @NameInMap("isv_name")
    private String isvName;

    @Query
    @NameInMap("order_id")
    private String orderId;

    @Query
    @NameInMap("out_order_id")
    private String outOrderId;

    @Query
    @NameInMap("passenger_segment_relations")
    private java.util.List < PassengerSegmentRelations> passengerSegmentRelations;

    @Query
    @NameInMap("pre_cal_type")
    private Integer preCalType;

    @Query
    @NameInMap("ticket_nos")
    private java.util.List < String > ticketNos;

    @Query
    @NameInMap("voluntary")
    private Boolean voluntary;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightRefundPreCalV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.passengerSegmentRelations = builder.passengerSegmentRelations;
        this.preCalType = builder.preCalType;
        this.ticketNos = builder.ticketNos;
        this.voluntary = builder.voluntary;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightRefundPreCalV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return passengerSegmentRelations
     */
    public java.util.List < PassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    /**
     * @return preCalType
     */
    public Integer getPreCalType() {
        return this.preCalType;
    }

    /**
     * @return ticketNos
     */
    public java.util.List < String > getTicketNos() {
        return this.ticketNos;
    }

    /**
     * @return voluntary
     */
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightRefundPreCalV2Request, Builder> {
        private String isvName; 
        private String orderId; 
        private String outOrderId; 
        private java.util.List < PassengerSegmentRelations> passengerSegmentRelations; 
        private Integer preCalType; 
        private java.util.List < String > ticketNos; 
        private Boolean voluntary; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightRefundPreCalV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.passengerSegmentRelations = request.passengerSegmentRelations;
            this.preCalType = request.preCalType;
            this.ticketNos = request.ticketNos;
            this.voluntary = request.voluntary;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putQueryParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * passenger_segment_relations.
         */
        public Builder passengerSegmentRelations(java.util.List < PassengerSegmentRelations> passengerSegmentRelations) {
            String passengerSegmentRelationsShrink = shrink(passengerSegmentRelations, "passenger_segment_relations", "json");
            this.putQueryParameter("passenger_segment_relations", passengerSegmentRelationsShrink);
            this.passengerSegmentRelations = passengerSegmentRelations;
            return this;
        }

        /**
         * pre_cal_type.
         */
        public Builder preCalType(Integer preCalType) {
            this.putQueryParameter("pre_cal_type", preCalType);
            this.preCalType = preCalType;
            return this;
        }

        /**
         * ticket_nos.
         */
        public Builder ticketNos(java.util.List < String > ticketNos) {
            String ticketNosShrink = shrink(ticketNos, "ticket_nos", "json");
            this.putQueryParameter("ticket_nos", ticketNosShrink);
            this.ticketNos = ticketNos;
            return this;
        }

        /**
         * voluntary.
         */
        public Builder voluntary(Boolean voluntary) {
            this.putQueryParameter("voluntary", voluntary);
            this.voluntary = voluntary;
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
        public FlightRefundPreCalV2Request build() {
            return new FlightRefundPreCalV2Request(this);
        } 

    } 

    public static class PassengerSegmentRelations extends TeaModel {
        @NameInMap("passenger_id")
        private String passengerId;

        @NameInMap("segment_id_list")
        private java.util.List < String > segmentIdList;

        private PassengerSegmentRelations(Builder builder) {
            this.passengerId = builder.passengerId;
            this.segmentIdList = builder.segmentIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerSegmentRelations create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return segmentIdList
         */
        public java.util.List < String > getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private String passengerId; 
            private java.util.List < String > segmentIdList; 

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * segment_id_list.
             */
            public Builder segmentIdList(java.util.List < String > segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public PassengerSegmentRelations build() {
                return new PassengerSegmentRelations(this);
            } 

        } 

    }
}
