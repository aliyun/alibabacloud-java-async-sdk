// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayListRequest</p>
 */
public class DescribePlayListRequest extends Request {
    @Query
    @NameInMap("BeginTs")
    @Validation(required = true)
    private String beginTs;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private String endTs;

    @Query
    @NameInMap("OrderName")
    private String orderName;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PlayType")
    private String playType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TraceId")
    private String traceId;

    private DescribePlayListRequest(Builder builder) {
        super(builder);
        this.beginTs = builder.beginTs;
        this.endTs = builder.endTs;
        this.orderName = builder.orderName;
        this.orderType = builder.orderType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.playType = builder.playType;
        this.status = builder.status;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTs
     */
    public String getBeginTs() {
        return this.beginTs;
    }

    /**
     * @return endTs
     */
    public String getEndTs() {
        return this.endTs;
    }

    /**
     * @return orderName
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return playType
     */
    public String getPlayType() {
        return this.playType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<DescribePlayListRequest, Builder> {
        private String beginTs; 
        private String endTs; 
        private String orderName; 
        private String orderType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String playType; 
        private String status; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayListRequest request) {
            super(request);
            this.beginTs = request.beginTs;
            this.endTs = request.endTs;
            this.orderName = request.orderName;
            this.orderType = request.orderType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.playType = request.playType;
            this.status = request.status;
            this.traceId = request.traceId;
        } 

        /**
         * BeginTs.
         */
        public Builder beginTs(String beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(String endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * OrderName.
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * PlayType.
         */
        public Builder playType(String playType) {
            this.putQueryParameter("PlayType", playType);
            this.playType = playType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public DescribePlayListRequest build() {
            return new DescribePlayListRequest(this);
        } 

    } 

}
