// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCastersRequest} extends {@link RequestModel}
 *
 * <p>DescribeCastersRequest</p>
 */
public class DescribeCastersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    private String casterId;

    @Query
    @NameInMap("CasterName")
    private String casterName;

    @Query
    @NameInMap("ChargeType")
    private Integer chargeType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("NormType")
    private String normType;

    @Query
    @NameInMap("OrderByModifyAsc")
    private String orderByModifyAsc;

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
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeCastersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.casterName = builder.casterName;
        this.chargeType = builder.chargeType;
        this.endTime = builder.endTime;
        this.normType = builder.normType;
        this.orderByModifyAsc = builder.orderByModifyAsc;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCastersRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return chargeType
     */
    public Integer getChargeType() {
        return this.chargeType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return normType
     */
    public String getNormType() {
        return this.normType;
    }

    /**
     * @return orderByModifyAsc
     */
    public String getOrderByModifyAsc() {
        return this.orderByModifyAsc;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCastersRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String casterName; 
        private Integer chargeType; 
        private String endTime; 
        private String normType; 
        private String orderByModifyAsc; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startTime; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCastersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.casterName = request.casterName;
            this.chargeType = request.chargeType;
            this.endTime = request.endTime;
            this.normType = request.normType;
            this.orderByModifyAsc = request.orderByModifyAsc;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
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
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * CasterName.
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(Integer chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
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
         * NormType.
         */
        public Builder normType(String normType) {
            this.putQueryParameter("NormType", normType);
            this.normType = normType;
            return this;
        }

        /**
         * OrderByModifyAsc.
         */
        public Builder orderByModifyAsc(String orderByModifyAsc) {
            this.putQueryParameter("OrderByModifyAsc", orderByModifyAsc);
            this.orderByModifyAsc = orderByModifyAsc;
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
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCastersRequest build() {
            return new DescribeCastersRequest(this);
        } 

    } 

}
