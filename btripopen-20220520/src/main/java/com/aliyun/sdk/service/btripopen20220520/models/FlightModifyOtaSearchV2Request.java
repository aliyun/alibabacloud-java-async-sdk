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
 * {@link FlightModifyOtaSearchV2Request} extends {@link RequestModel}
 *
 * <p>FlightModifyOtaSearchV2Request</p>
 */
public class FlightModifyOtaSearchV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cabin_class")
    private java.util.List<Integer> cabinClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_date")
    private java.util.List<String> depDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_id")
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_segment_relations")
    private java.util.List<PassengerSegmentRelations> passengerSegmentRelations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selected_segments")
    private java.util.List<SelectedSegments> selectedSegments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("voluntary")
    private Boolean voluntary;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightModifyOtaSearchV2Request(Builder builder) {
        super(builder);
        this.cabinClass = builder.cabinClass;
        this.depDate = builder.depDate;
        this.isvName = builder.isvName;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.passengerSegmentRelations = builder.passengerSegmentRelations;
        this.selectedSegments = builder.selectedSegments;
        this.sessionId = builder.sessionId;
        this.voluntary = builder.voluntary;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightModifyOtaSearchV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cabinClass
     */
    public java.util.List<Integer> getCabinClass() {
        return this.cabinClass;
    }

    /**
     * @return depDate
     */
    public java.util.List<String> getDepDate() {
        return this.depDate;
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
     * @return passengerSegmentRelations
     */
    public java.util.List<PassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    /**
     * @return selectedSegments
     */
    public java.util.List<SelectedSegments> getSelectedSegments() {
        return this.selectedSegments;
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

    public static final class Builder extends Request.Builder<FlightModifyOtaSearchV2Request, Builder> {
        private java.util.List<Integer> cabinClass; 
        private java.util.List<String> depDate; 
        private String isvName; 
        private Long orderId; 
        private String outOrderId; 
        private java.util.List<PassengerSegmentRelations> passengerSegmentRelations; 
        private java.util.List<SelectedSegments> selectedSegments; 
        private String sessionId; 
        private Boolean voluntary; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightModifyOtaSearchV2Request request) {
            super(request);
            this.cabinClass = request.cabinClass;
            this.depDate = request.depDate;
            this.isvName = request.isvName;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.passengerSegmentRelations = request.passengerSegmentRelations;
            this.selectedSegments = request.selectedSegments;
            this.sessionId = request.sessionId;
            this.voluntary = request.voluntary;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * cabin_class.
         */
        public Builder cabinClass(java.util.List<Integer> cabinClass) {
            String cabinClassShrink = shrink(cabinClass, "cabin_class", "json");
            this.putQueryParameter("cabin_class", cabinClassShrink);
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * dep_date.
         */
        public Builder depDate(java.util.List<String> depDate) {
            String depDateShrink = shrink(depDate, "dep_date", "json");
            this.putQueryParameter("dep_date", depDateShrink);
            this.depDate = depDate;
            return this;
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
        public Builder orderId(Long orderId) {
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
        public Builder passengerSegmentRelations(java.util.List<PassengerSegmentRelations> passengerSegmentRelations) {
            String passengerSegmentRelationsShrink = shrink(passengerSegmentRelations, "passenger_segment_relations", "json");
            this.putQueryParameter("passenger_segment_relations", passengerSegmentRelationsShrink);
            this.passengerSegmentRelations = passengerSegmentRelations;
            return this;
        }

        /**
         * selected_segments.
         */
        public Builder selectedSegments(java.util.List<SelectedSegments> selectedSegments) {
            String selectedSegmentsShrink = shrink(selectedSegments, "selected_segments", "json");
            this.putQueryParameter("selected_segments", selectedSegmentsShrink);
            this.selectedSegments = selectedSegments;
            return this;
        }

        /**
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("session_id", sessionId);
            this.sessionId = sessionId;
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
        public FlightModifyOtaSearchV2Request build() {
            return new FlightModifyOtaSearchV2Request(this);
        } 

    } 

    /**
     * 
     * {@link FlightModifyOtaSearchV2Request} extends {@link TeaModel}
     *
     * <p>FlightModifyOtaSearchV2Request</p>
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

            private Builder() {
            } 

            private Builder(PassengerSegmentRelations model) {
                this.passengerId = model.passengerId;
                this.segmentIdList = model.segmentIdList;
            } 

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
    /**
     * 
     * {@link FlightModifyOtaSearchV2Request} extends {@link TeaModel}
     *
     * <p>FlightModifyOtaSearchV2Request</p>
     */
    public static class SelectedSegments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date_time")
        private String depDateTime;

        @com.aliyun.core.annotation.NameInMap("journey_seq")
        private Integer journeySeq;

        @com.aliyun.core.annotation.NameInMap("marketing_flight_no")
        private String marketingFlightNo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @com.aliyun.core.annotation.NameInMap("segment_seq")
        private Integer segmentSeq;

        private SelectedSegments(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.depDateTime = builder.depDateTime;
            this.journeySeq = builder.journeySeq;
            this.marketingFlightNo = builder.marketingFlightNo;
            this.operatingFlightNo = builder.operatingFlightNo;
            this.segmentSeq = builder.segmentSeq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedSegments create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depDateTime
         */
        public String getDepDateTime() {
            return this.depDateTime;
        }

        /**
         * @return journeySeq
         */
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        /**
         * @return marketingFlightNo
         */
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        /**
         * @return segmentSeq
         */
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String depDateTime; 
            private Integer journeySeq; 
            private String marketingFlightNo; 
            private String operatingFlightNo; 
            private Integer segmentSeq; 

            private Builder() {
            } 

            private Builder(SelectedSegments model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.depDateTime = model.depDateTime;
                this.journeySeq = model.journeySeq;
                this.marketingFlightNo = model.marketingFlightNo;
                this.operatingFlightNo = model.operatingFlightNo;
                this.segmentSeq = model.segmentSeq;
            } 

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_date_time.
             */
            public Builder depDateTime(String depDateTime) {
                this.depDateTime = depDateTime;
                return this;
            }

            /**
             * journey_seq.
             */
            public Builder journeySeq(Integer journeySeq) {
                this.journeySeq = journeySeq;
                return this;
            }

            /**
             * marketing_flight_no.
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * segment_seq.
             */
            public Builder segmentSeq(Integer segmentSeq) {
                this.segmentSeq = segmentSeq;
                return this;
            }

            public SelectedSegments build() {
                return new SelectedSegments(this);
            } 

        } 

    }
}
