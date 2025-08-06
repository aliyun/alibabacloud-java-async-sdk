// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListStrategyExecutionRecordRequest} extends {@link RequestModel}
 *
 * <p>ListStrategyExecutionRecordRequest</p>
 */
public class ListStrategyExecutionRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyType")
    private String strategyType;

    private ListStrategyExecutionRecordRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.mediaId = builder.mediaId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
        this.strategyType = builder.strategyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStrategyExecutionRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyType
     */
    public String getStrategyType() {
        return this.strategyType;
    }

    public static final class Builder extends Request.Builder<ListStrategyExecutionRecordRequest, Builder> {
        private String endTime; 
        private String mediaId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String startTime; 
        private String status; 
        private String strategyId; 
        private String strategyType; 

        private Builder() {
            super();
        } 

        private Builder(ListStrategyExecutionRecordRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.mediaId = request.mediaId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.strategyId = request.strategyId;
            this.strategyType = request.strategyType;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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
         * StrategyId.
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * StrategyType.
         */
        public Builder strategyType(String strategyType) {
            this.putQueryParameter("StrategyType", strategyType);
            this.strategyType = strategyType;
            return this;
        }

        @Override
        public ListStrategyExecutionRecordRequest build() {
            return new ListStrategyExecutionRecordRequest(this);
        } 

    } 

}
