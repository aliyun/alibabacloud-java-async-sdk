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
 * {@link QueryAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>QueryAvailabilityRequest</p>
 */
public class QueryAvailabilityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdultCount")
    private Integer adultCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckInDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkInDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckOutDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkOutDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildCount")
    private Integer childCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildrenAges")
    private java.util.List<Integer> childrenAges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomCount")
    private Integer roomCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StandardHotelIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> standardHotelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private QueryAvailabilityRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.adultCount = builder.adultCount;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.childCount = builder.childCount;
        this.childrenAges = builder.childrenAges;
        this.roomCount = builder.roomCount;
        this.standardHotelIds = builder.standardHotelIds;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvailabilityRequest create() {
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
     * @return checkInDate
     */
    public String getCheckInDate() {
        return this.checkInDate;
    }

    /**
     * @return checkOutDate
     */
    public String getCheckOutDate() {
        return this.checkOutDate;
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

    public static final class Builder extends Request.Builder<QueryAvailabilityRequest, Builder> {
        private Long accountNo; 
        private Integer adultCount; 
        private String checkInDate; 
        private String checkOutDate; 
        private Integer childCount; 
        private java.util.List<Integer> childrenAges; 
        private Integer roomCount; 
        private java.util.List<String> standardHotelIds; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvailabilityRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.adultCount = request.adultCount;
            this.checkInDate = request.checkInDate;
            this.checkOutDate = request.checkOutDate;
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
         * AdultCount.
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
         * <p>2026-07-01</p>
         */
        public Builder checkInDate(String checkInDate) {
            this.putBodyParameter("CheckInDate", checkInDate);
            this.checkInDate = checkInDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-03</p>
         */
        public Builder checkOutDate(String checkOutDate) {
            this.putBodyParameter("CheckOutDate", checkOutDate);
            this.checkOutDate = checkOutDate;
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
         * RoomCount.
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
         * <p>string</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public QueryAvailabilityRequest build() {
            return new QueryAvailabilityRequest(this);
        } 

    } 

}
