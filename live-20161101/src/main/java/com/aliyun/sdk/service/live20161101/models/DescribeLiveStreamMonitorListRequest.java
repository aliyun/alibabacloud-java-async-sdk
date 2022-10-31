// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamMonitorListRequest</p>
 */
public class DescribeLiveStreamMonitorListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MonitorId")
    private String monitorId;

    @Query
    @NameInMap("OrderRule")
    private Integer orderRule;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeLiveStreamMonitorListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.monitorId = builder.monitorId;
        this.orderRule = builder.orderRule;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamMonitorListRequest, Builder> {
        private String regionId; 
        private String monitorId; 
        private Integer orderRule; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamMonitorListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.monitorId = request.monitorId;
            this.orderRule = request.orderRule;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * MonitorId.
         */
        public Builder monitorId(String monitorId) {
            this.putQueryParameter("MonitorId", monitorId);
            this.monitorId = monitorId;
            return this;
        }

        /**
         * OrderRule.
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * Status.
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
