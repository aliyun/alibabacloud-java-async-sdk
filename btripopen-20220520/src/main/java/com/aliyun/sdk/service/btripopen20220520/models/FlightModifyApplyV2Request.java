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
 * {@link FlightModifyApplyV2Request} extends {@link RequestModel}
 *
 * <p>FlightModifyApplyV2Request</p>
 */
public class FlightModifyApplyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cache_key")
    private String cacheKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact_phone")
    private String contactPhone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("item_id")
    private String itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    private Long orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
    private String outSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_segment_relations")
    private java.util.List<PassengerSegmentRelations> passengerSegmentRelations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voluntary")
    private Boolean voluntary;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightModifyApplyV2Request(Builder builder) {
        super(builder);
        this.cacheKey = builder.cacheKey;
        this.contactPhone = builder.contactPhone;
        this.isvName = builder.isvName;
        this.itemId = builder.itemId;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.passengerSegmentRelations = builder.passengerSegmentRelations;
        this.reason = builder.reason;
        this.sessionId = builder.sessionId;
        this.voluntary = builder.voluntary;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightModifyApplyV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheKey
     */
    public String getCacheKey() {
        return this.cacheKey;
    }

    /**
     * @return contactPhone
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
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
    public java.util.List<PassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
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

    public static final class Builder extends Request.Builder<FlightModifyApplyV2Request, Builder> {
        private String cacheKey; 
        private String contactPhone; 
        private String isvName; 
        private String itemId; 
        private Long orderId; 
        private String outOrderId; 
        private String outSubOrderId; 
        private java.util.List<PassengerSegmentRelations> passengerSegmentRelations; 
        private String reason; 
        private String sessionId; 
        private Boolean voluntary; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightModifyApplyV2Request request) {
            super(request);
            this.cacheKey = request.cacheKey;
            this.contactPhone = request.contactPhone;
            this.isvName = request.isvName;
            this.itemId = request.itemId;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.passengerSegmentRelations = request.passengerSegmentRelations;
            this.reason = request.reason;
            this.sessionId = request.sessionId;
            this.voluntary = request.voluntary;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * cache_key.
         */
        public Builder cacheKey(String cacheKey) {
            this.putBodyParameter("cache_key", cacheKey);
            this.cacheKey = cacheKey;
            return this;
        }

        /**
         * contact_phone.
         */
        public Builder contactPhone(String contactPhone) {
            this.putBodyParameter("contact_phone", contactPhone);
            this.contactPhone = contactPhone;
            return this;
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
         * item_id.
         */
        public Builder itemId(String itemId) {
            this.putBodyParameter("item_id", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(Long orderId) {
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
        public Builder passengerSegmentRelations(java.util.List<PassengerSegmentRelations> passengerSegmentRelations) {
            String passengerSegmentRelationsShrink = shrink(passengerSegmentRelations, "passenger_segment_relations", "json");
            this.putBodyParameter("passenger_segment_relations", passengerSegmentRelationsShrink);
            this.passengerSegmentRelations = passengerSegmentRelations;
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
         * <p>sessionId</p>
         * 
         * <strong>example:</strong>
         * <p>a2ffebfe733742aab5c491d960ba3d59</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("session_id", sessionId);
            this.sessionId = sessionId;
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
        public FlightModifyApplyV2Request build() {
            return new FlightModifyApplyV2Request(this);
        } 

    } 

    /**
     * 
     * {@link FlightModifyApplyV2Request} extends {@link TeaModel}
     *
     * <p>FlightModifyApplyV2Request</p>
     */
    public static class PassengerSegmentRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("segment_id_list")
        private java.util.List<String> segmentIdList;

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
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

        public static final class Builder {
            private String passengerId; 
            private java.util.List<String> segmentIdList; 

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
            public Builder segmentIdList(java.util.List<String> segmentIdList) {
                this.segmentIdList = segmentIdList;
                return this;
            }

            public PassengerSegmentRelations build() {
                return new PassengerSegmentRelations(this);
            } 

        } 

    }
}
