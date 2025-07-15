// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamMonitorListRequest</p>
 */
public class DescribeLiveStreamMonitorListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorId")
    private String monitorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderRule")
    private Integer orderRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeLiveStreamMonitorListRequest(Builder builder) {
        super(builder);
        this.monitorId = builder.monitorId;
        this.orderRule = builder.orderRule;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMonitorListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorId
     */
    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * @return orderRule
     */
    public Integer getOrderRule() {
        return this.orderRule;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamMonitorListRequest, Builder> {
        private String monitorId; 
        private Integer orderRule; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamMonitorListRequest request) {
            super(request);
            this.monitorId = request.monitorId;
            this.orderRule = request.orderRule;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the monitoring session.</p>
         * <blockquote>
         * <p> You can obtain the monitoring session ID from the response parameter MonitorId of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation. If you leave this parameter empty, the data of all monitoring sessions is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder monitorId(String monitorId) {
            this.putQueryParameter("MonitorId", monitorId);
            this.monitorId = monitorId;
            return this;
        }

        /**
         * <p>The sorting order of monitoring sessions. Valid values:</p>
         * <ul>
         * <li>0: Monitoring sessions are sorted by status.</li>
         * <li>1: Monitoring sessions are sorted by start time in descending order.</li>
         * <li>2: Monitoring sessions are sorted by start time in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderRule(Integer orderRule) {
            this.putQueryParameter("OrderRule", orderRule);
            this.orderRule = orderRule;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of monitoring sessions to return per page.</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the monitoring session. Valid values:</p>
         * <ul>
         * <li>1: Monitoring</li>
         * <li>0: Unmonitored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeLiveStreamMonitorListRequest build() {
            return new DescribeLiveStreamMonitorListRequest(this);
        } 

    } 

}
