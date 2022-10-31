// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterProgramRequest} extends {@link RequestModel}
 *
 * <p>DescribeCasterProgramRequest</p>
 */
public class DescribeCasterProgramRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EpisodeId")
    private String episodeId;

    @Query
    @NameInMap("EpisodeType")
    private String episodeType;

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

    private DescribeCasterProgramRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.endTime = builder.endTime;
        this.episodeId = builder.episodeId;
        this.episodeType = builder.episodeType;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterProgramRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return episodeId
     */
    public String getEpisodeId() {
        return this.episodeId;
    }

    /**
     * @return episodeType
     */
    public String getEpisodeType() {
        return this.episodeType;
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

    public static final class Builder extends Request.Builder<DescribeCasterProgramRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String endTime; 
        private String episodeId; 
        private String episodeType; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startTime; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCasterProgramRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.endTime = request.endTime;
            this.episodeId = request.episodeId;
            this.episodeType = request.episodeType;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EpisodeId.
         */
        public Builder episodeId(String episodeId) {
            this.putQueryParameter("EpisodeId", episodeId);
            this.episodeId = episodeId;
            return this;
        }

        /**
         * EpisodeType.
         */
        public Builder episodeType(String episodeType) {
            this.putQueryParameter("EpisodeType", episodeType);
            this.episodeType = episodeType;
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
        public DescribeCasterProgramRequest build() {
            return new DescribeCasterProgramRequest(this);
        } 

    } 

}
