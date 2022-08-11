// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskMetricInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDISyncTaskMetricInfoRequest</p>
 */
public class GetDISyncTaskMetricInfoRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private Long endDate;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private Long fileId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private Long startDate;

    private GetDISyncTaskMetricInfoRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncTaskMetricInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetDISyncTaskMetricInfoRequest, Builder> {
        private Long endDate; 
        private Long fileId; 
        private Long projectId; 
        private String regionId; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetDISyncTaskMetricInfoRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
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
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetDISyncTaskMetricInfoRequest build() {
            return new GetDISyncTaskMetricInfoRequest(this);
        } 

    } 

}
