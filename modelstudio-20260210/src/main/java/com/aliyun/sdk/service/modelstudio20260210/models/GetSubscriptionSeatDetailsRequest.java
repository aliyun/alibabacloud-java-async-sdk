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
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusListStr")
    private String statusListStr;

    private GetSubscriptionSeatDetailsRequest(Builder builder) {
        super(builder);
        this.callerUacAccountId = builder.callerUacAccountId;
        this.namespaceId = builder.namespaceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryAssigned = builder.queryAssigned;
        this.seatId = builder.seatId;
        this.seatType = builder.seatType;
        this.statusList = builder.statusList;
        this.statusListStr = builder.statusListStr;
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
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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

    /**
     * @return statusListStr
     */
    public String getStatusListStr() {
        return this.statusListStr;
    }

    public static final class Builder extends Request.Builder<GetSubscriptionSeatDetailsRequest, Builder> {
        private String callerUacAccountId; 
        private String namespaceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean queryAssigned; 
        private String seatId; 
        private String seatType; 
        private java.util.List<String> statusList; 
        private String statusListStr; 

        private Builder() {
            super();
        } 

        private Builder(GetSubscriptionSeatDetailsRequest request) {
            super(request);
            this.callerUacAccountId = request.callerUacAccountId;
            this.namespaceId = request.namespaceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryAssigned = request.queryAssigned;
            this.seatId = request.seatId;
            this.seatType = request.seatType;
            this.statusList = request.statusList;
            this.statusListStr = request.statusListStr;
        } 

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putQueryParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryAssigned.
         */
        public Builder queryAssigned(Boolean queryAssigned) {
            this.putQueryParameter("QueryAssigned", queryAssigned);
            this.queryAssigned = queryAssigned;
            return this;
        }

        /**
         * SeatId.
         */
        public Builder seatId(String seatId) {
            this.putQueryParameter("SeatId", seatId);
            this.seatId = seatId;
            return this;
        }

        /**
         * SeatType.
         */
        public Builder seatType(String seatType) {
            this.putQueryParameter("SeatType", seatType);
            this.seatType = seatType;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * StatusListStr.
         */
        public Builder statusListStr(String statusListStr) {
            this.putQueryParameter("StatusListStr", statusListStr);
            this.statusListStr = statusListStr;
            return this;
        }

        @Override
        public GetSubscriptionSeatDetailsRequest build() {
            return new GetSubscriptionSeatDetailsRequest(this);
        } 

    } 

}
