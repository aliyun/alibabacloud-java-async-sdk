// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightRefundApplyV2Request} extends {@link RequestModel}
 *
 * <p>FlightRefundApplyV2Request</p>
 */
public class FlightRefundApplyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
    private String outSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_segment_relations")
    private java.util.List < PassengerSegmentRelations> passengerSegmentRelations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pre_cal_type")
    private Integer preCalType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_reason")
    private String refundReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_reason_type")
    private Integer refundReasonType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ticket_nos")
    private java.util.List < String > ticketNos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_refund_price")
    private Long totalRefundPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("upload_pict_urls")
    private String uploadPictUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voluntary")
    private Boolean voluntary;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightRefundApplyV2Request(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.passengerSegmentRelations = builder.passengerSegmentRelations;
        this.preCalType = builder.preCalType;
        this.refundReason = builder.refundReason;
        this.refundReasonType = builder.refundReasonType;
        this.ticketNos = builder.ticketNos;
        this.totalRefundPrice = builder.totalRefundPrice;
        this.uploadPictUrls = builder.uploadPictUrls;
        this.voluntary = builder.voluntary;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightRefundApplyV2Request create() {
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
     * @return outSubOrderId
     */
    public String getOutSubOrderId() {
        return this.outSubOrderId;
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
     * @return refundReason
     */
    public String getRefundReason() {
        return this.refundReason;
    }

    /**
     * @return refundReasonType
     */
    public Integer getRefundReasonType() {
        return this.refundReasonType;
    }

    /**
     * @return ticketNos
     */
    public java.util.List < String > getTicketNos() {
        return this.ticketNos;
    }

    /**
     * @return totalRefundPrice
     */
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

    /**
     * @return uploadPictUrls
     */
    public String getUploadPictUrls() {
        return this.uploadPictUrls;
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

    public static final class Builder extends Request.Builder<FlightRefundApplyV2Request, Builder> {
        private String isvName; 
        private String orderId; 
        private String outOrderId; 
        private String outSubOrderId; 
        private java.util.List < PassengerSegmentRelations> passengerSegmentRelations; 
        private Integer preCalType; 
        private String refundReason; 
        private Integer refundReasonType; 
        private java.util.List < String > ticketNos; 
        private Long totalRefundPrice; 
        private String uploadPictUrls; 
        private Boolean voluntary; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightRefundApplyV2Request request) {
            super(request);
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.passengerSegmentRelations = request.passengerSegmentRelations;
            this.preCalType = request.preCalType;
            this.refundReason = request.refundReason;
            this.refundReasonType = request.refundReasonType;
            this.ticketNos = request.ticketNos;
            this.totalRefundPrice = request.totalRefundPrice;
            this.uploadPictUrls = request.uploadPictUrls;
            this.voluntary = request.voluntary;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_sub_order_id.
         */
        public Builder outSubOrderId(String outSubOrderId) {
            this.putBodyParameter("out_sub_order_id", outSubOrderId);
            this.outSubOrderId = outSubOrderId;
            return this;
        }

        /**
         * passenger_segment_relations.
         */
        public Builder passengerSegmentRelations(java.util.List < PassengerSegmentRelations> passengerSegmentRelations) {
            String passengerSegmentRelationsShrink = shrink(passengerSegmentRelations, "passenger_segment_relations", "json");
            this.putBodyParameter("passenger_segment_relations", passengerSegmentRelationsShrink);
            this.passengerSegmentRelations = passengerSegmentRelations;
            return this;
        }

        /**
         * pre_cal_type.
         */
        public Builder preCalType(Integer preCalType) {
            this.putBodyParameter("pre_cal_type", preCalType);
            this.preCalType = preCalType;
            return this;
        }

        /**
         * refund_reason.
         */
        public Builder refundReason(String refundReason) {
            this.putBodyParameter("refund_reason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * refund_reason_type.
         */
        public Builder refundReasonType(Integer refundReasonType) {
            this.putBodyParameter("refund_reason_type", refundReasonType);
            this.refundReasonType = refundReasonType;
            return this;
        }

        /**
         * ticket_nos.
         */
        public Builder ticketNos(java.util.List < String > ticketNos) {
            String ticketNosShrink = shrink(ticketNos, "ticket_nos", "json");
            this.putBodyParameter("ticket_nos", ticketNosShrink);
            this.ticketNos = ticketNos;
            return this;
        }

        /**
         * total_refund_price.
         */
        public Builder totalRefundPrice(Long totalRefundPrice) {
            this.putBodyParameter("total_refund_price", totalRefundPrice);
            this.totalRefundPrice = totalRefundPrice;
            return this;
        }

        /**
         * upload_pict_urls.
         */
        public Builder uploadPictUrls(String uploadPictUrls) {
            this.putBodyParameter("upload_pict_urls", uploadPictUrls);
            this.uploadPictUrls = uploadPictUrls;
            return this;
        }

        /**
         * voluntary.
         */
        public Builder voluntary(Boolean voluntary) {
            this.putBodyParameter("voluntary", voluntary);
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
        public FlightRefundApplyV2Request build() {
            return new FlightRefundApplyV2Request(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundApplyV2Request} extends {@link TeaModel}
     *
     * <p>FlightRefundApplyV2Request</p>
     */
    public static class PassengerSegmentRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
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
