// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDIJobsRequest</p>
 */
public class ListDIJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
    private String destinationDataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
    private String sourceDataSourceType;

    private ListDIJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationDataSourceType = builder.destinationDataSourceType;
        this.jobName = builder.jobName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sourceDataSourceType = builder.sourceDataSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobsRequest create() {
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
     * @return destinationDataSourceType
     */
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceDataSourceType
     */
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    public static final class Builder extends Request.Builder<ListDIJobsRequest, Builder> {
        private String regionId; 
        private String destinationDataSourceType; 
        private String jobName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sourceDataSourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListDIJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationDataSourceType = request.destinationDataSourceType;
            this.jobName = request.jobName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sourceDataSourceType = request.sourceDataSourceType;
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
         * The destination type. If you do not configure this parameter, no limits are imposed on the tasks.
         */
        public Builder destinationDataSourceType(String destinationDataSourceType) {
            this.putBodyParameter("DestinationDataSourceType", destinationDataSourceType);
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }

        /**
         * The name of the task. Fuzzy match is supported. If you do not configure this parameter, no limits are imposed on the tasks.
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The source type. If you do not configure this parameter, no limits are imposed on the tasks.
         */
        public Builder sourceDataSourceType(String sourceDataSourceType) {
            this.putBodyParameter("SourceDataSourceType", sourceDataSourceType);
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }

        @Override
        public ListDIJobsRequest build() {
            return new ListDIJobsRequest(this);
        } 

    } 

}
