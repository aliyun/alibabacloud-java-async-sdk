// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link QueryCalendarAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>QueryCalendarAvailabilityRequest</p>
 */
public class QueryCalendarAvailabilityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdultCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer adultCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckInDateEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkInDateEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckInDateStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkInDateStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildCount")
    private Integer childCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildrenAges")
    private java.util.List<Integer> childrenAges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer roomCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StandardHotelIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> standardHotelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private QueryCalendarAvailabilityRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.adultCount = builder.adultCount;
        this.checkInDateEnd = builder.checkInDateEnd;
        this.checkInDateStart = builder.checkInDateStart;
        this.childCount = builder.childCount;
        this.childrenAges = builder.childrenAges;
        this.roomCount = builder.roomCount;
        this.standardHotelIds = builder.standardHotelIds;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCalendarAvailabilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return adultCount
     */
    public Integer getAdultCount() {
        return this.adultCount;
    }

    /**
     * @return checkInDateEnd
     */
    public String getCheckInDateEnd() {
        return this.checkInDateEnd;
    }

    /**
     * @return checkInDateStart
     */
    public String getCheckInDateStart() {
        return this.checkInDateStart;
    }

    /**
     * @return childCount
     */
    public Integer getChildCount() {
        return this.childCount;
    }

    /**
     * @return childrenAges
     */
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    /**
     * @return roomCount
     */
    public Integer getRoomCount() {
        return this.roomCount;
    }

    /**
     * @return standardHotelIds
     */
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<QueryCalendarAvailabilityRequest, Builder> {
        private Long accountNo; 
        private Integer adultCount; 
        private String checkInDateEnd; 
        private String checkInDateStart; 
        private Integer childCount; 
        private java.util.List<Integer> childrenAges; 
        private Integer roomCount; 
        private java.util.List<String> standardHotelIds; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCalendarAvailabilityRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.adultCount = request.adultCount;
            this.checkInDateEnd = request.checkInDateEnd;
            this.checkInDateStart = request.checkInDateStart;
            this.childCount = request.childCount;
            this.childrenAges = request.childrenAges;
            this.roomCount = request.roomCount;
            this.standardHotelIds = request.standardHotelIds;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder adultCount(Integer adultCount) {
            this.putBodyParameter("AdultCount", adultCount);
            this.adultCount = adultCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-03</p>
         */
        public Builder checkInDateEnd(String checkInDateEnd) {
            this.putBodyParameter("CheckInDateEnd", checkInDateEnd);
            this.checkInDateEnd = checkInDateEnd;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01</p>
         */
        public Builder checkInDateStart(String checkInDateStart) {
            this.putBodyParameter("CheckInDateStart", checkInDateStart);
            this.checkInDateStart = checkInDateStart;
            return this;
        }

        /**
         * ChildCount.
         */
        public Builder childCount(Integer childCount) {
            this.putBodyParameter("ChildCount", childCount);
            this.childCount = childCount;
            return this;
        }

        /**
         * ChildrenAges.
         */
        public Builder childrenAges(java.util.List<Integer> childrenAges) {
            String childrenAgesShrink = shrink(childrenAges, "ChildrenAges", "json");
            this.putBodyParameter("ChildrenAges", childrenAgesShrink);
            this.childrenAges = childrenAges;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roomCount(Integer roomCount) {
            this.putBodyParameter("RoomCount", roomCount);
            this.roomCount = roomCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;H001&quot;]</p>
         */
        public Builder standardHotelIds(java.util.List<String> standardHotelIds) {
            String standardHotelIdsShrink = shrink(standardHotelIds, "StandardHotelIds", "json");
            this.putBodyParameter("StandardHotelIds", standardHotelIdsShrink);
            this.standardHotelIds = standardHotelIds;
            return this;
        }

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public QueryCalendarAvailabilityRequest build() {
            return new QueryCalendarAvailabilityRequest(this);
        } 

    } 

}
