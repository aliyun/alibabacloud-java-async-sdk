// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DescribePlayListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayListRequest</p>
 */
public class DescribePlayListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderName")
    private String orderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayType")
    private String playType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The beginning of the time range to query. By default, the system queries data of the current day.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1676170500011</p>
         */
        public Builder beginTs(String beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time range cannot exceed 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1682474405173</p>
         */
        public Builder endTs(String endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>The criteria by which the sorting is performed. Valid values:</p>
         * <ul>
         * <li>FirstFrameDuration</li>
         * <li>PlayDuration</li>
         * <li>VideoDuration</li>
         * <li>StuckDuration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FirstFrameDuration</p>
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>DESC: descending order.</li>
         * <li>ASC: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
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
         * <p>The playback type. Valid value: </p>
         * <ul>
         * <li>vod</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        public Builder playType(String playType) {
            this.putQueryParameter("PlayType", playType);
            this.playType = playType;
            return this;
        }

        /**
         * <p>The playback status. Valid values:</p>
         * <ul>
         * <li>complete</li>
         * <li>playing</li>
         * <li>unusual: A playback error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The TraceId of the player.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc5e70516766285805381012d271e</p>
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
