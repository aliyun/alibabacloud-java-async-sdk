// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>SearchEditingProjectRequest</p>
 */
public class SearchEditingProjectRequest extends Request {
    @Query
    @NameInMap("CreateSource")
    private String createSource;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ProjectType")
    private String projectType;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private SearchEditingProjectRequest(Builder builder) {
        super(builder);
        this.createSource = builder.createSource;
        this.endTime = builder.endTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectType = builder.projectType;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEditingProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSource
     */
    public String getCreateSource() {
        return this.createSource;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectType
     */
    public String getProjectType() {
        return this.projectType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<SearchEditingProjectRequest, Builder> {
        private String createSource; 
        private String endTime; 
        private Long pageNo; 
        private Long pageSize; 
        private String projectType; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(SearchEditingProjectRequest request) {
            super(request);
            this.createSource = request.createSource;
            this.endTime = request.endTime;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectType = request.projectType;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.templateType = request.templateType;
        } 

        /**
         * CreateSource.
         */
        public Builder createSource(String createSource) {
            this.putQueryParameter("CreateSource", createSource);
            this.createSource = createSource;
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectType.
         */
        public Builder projectType(String projectType) {
            this.putQueryParameter("ProjectType", projectType);
            this.projectType = projectType;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
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
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public SearchEditingProjectRequest build() {
            return new SearchEditingProjectRequest(this);
        } 

    } 

}
