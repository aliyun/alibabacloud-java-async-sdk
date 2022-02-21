// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceStatisticsDataRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceStatisticsDataRequest</p>
 */
public class GetNamespaceStatisticsDataRequest extends Request {
    @Query
    @NameInMap("DimensionType")
    @Validation(required = true)
    private String dimensionType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private GetNamespaceStatisticsDataRequest(Builder builder) {
        super(builder);
        this.dimensionType = builder.dimensionType;
        this.endTime = builder.endTime;
        this.namespace = builder.namespace;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceStatisticsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimensionType
     */
    public String getDimensionType() {
        return this.dimensionType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetNamespaceStatisticsDataRequest, Builder> {
        private String dimensionType; 
        private String endTime; 
        private String namespace; 
        private String projectId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceStatisticsDataRequest response) {
            super(response);
            this.dimensionType = response.dimensionType;
            this.endTime = response.endTime;
            this.namespace = response.namespace;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
        } 

        /**
         * DimensionType.
         */
        public Builder dimensionType(String dimensionType) {
            this.putQueryParameter("DimensionType", dimensionType);
            this.dimensionType = dimensionType;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetNamespaceStatisticsDataRequest build() {
            return new GetNamespaceStatisticsDataRequest(this);
        } 

    } 

}
