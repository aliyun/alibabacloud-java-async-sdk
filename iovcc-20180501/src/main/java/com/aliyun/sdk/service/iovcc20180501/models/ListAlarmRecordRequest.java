// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmRecordRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmRecordRequest</p>
 */
public class ListAlarmRecordRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("FenceId")
    @Validation(required = true)
    private Long fenceId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    private Integer size;

    private ListAlarmRecordRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.fenceId = builder.fenceId;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fenceId
     */
    public Long getFenceId() {
        return this.fenceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAlarmRecordRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private Long fenceId; 
        private Integer offset; 
        private String projectId; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmRecordRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.endTime = response.endTime;
            this.fenceId = response.fenceId;
            this.offset = response.offset;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.size = response.size;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FenceId.
         */
        public Builder fenceId(Long fenceId) {
            this.putQueryParameter("FenceId", fenceId);
            this.fenceId = fenceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAlarmRecordRequest build() {
            return new ListAlarmRecordRequest(this);
        } 

    } 

}
