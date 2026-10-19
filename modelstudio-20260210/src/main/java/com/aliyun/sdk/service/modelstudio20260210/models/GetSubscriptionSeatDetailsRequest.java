// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetSubscriptionSeatDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetSubscriptionSeatDetailsRequest</p>
 */
public class GetSubscriptionSeatDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryAssigned")
    private Boolean queryAssigned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatId")
    private String seatId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatType")
    private String seatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private GetSubscriptionSeatDetailsRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryAssigned = builder.queryAssigned;
        this.seatId = builder.seatId;
        this.seatType = builder.seatType;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionSeatDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryAssigned
     */
    public Boolean getQueryAssigned() {
        return this.queryAssigned;
    }

    /**
     * @return seatId
     */
    public String getSeatId() {
        return this.seatId;
    }

    /**
     * @return seatType
     */
    public String getSeatType() {
        return this.seatType;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<GetSubscriptionSeatDetailsRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean queryAssigned; 
        private String seatId; 
        private String seatType; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(GetSubscriptionSeatDetailsRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryAssigned = request.queryAssigned;
            this.seatId = request.seatId;
            this.seatType = request.seatType;
            this.statusList = request.statusList;
        } 

        /**
         * <p>The page number. Default value: 1. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The seat assignment status filter. Set to true for assigned seats, false for unassigned seats, or null for all seats.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryAssigned(Boolean queryAssigned) {
            this.putQueryParameter("QueryAssigned", queryAssigned);
            this.queryAssigned = queryAssigned;
            return this;
        }

        /**
         * <p>The seat ID.</p>
         * 
         * <strong>example:</strong>
         * <p>seat-123456</p>
         */
        public Builder seatId(String seatId) {
            this.putQueryParameter("SeatId", seatId);
            this.seatId = seatId;
            return this;
        }

        /**
         * <p>The seat type (specType). Valid values:</p>
         * <ul>
         * <li>standard: standard seat.</li>
         * <li>pro: pro seat.</li>
         * <li>max: premium seat.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder seatType(String seatType) {
            this.putQueryParameter("SeatType", seatType);
            this.seatType = seatType;
            return this;
        }

        /**
         * <p>The list of seat statuses used for filtering.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public GetSubscriptionSeatDetailsRequest build() {
            return new GetSubscriptionSeatDetailsRequest(this);
        } 

    } 

}
