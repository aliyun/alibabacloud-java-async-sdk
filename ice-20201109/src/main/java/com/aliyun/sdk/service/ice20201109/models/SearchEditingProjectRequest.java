// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SearchEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>SearchEditingProjectRequest</p>
 */
public class SearchEditingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSource")
    private String createSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectType")
    private String projectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
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
         * <p>The source of the project.</p>
         * <p>-OpenAPI</p>
         * <p>-AliyunConsole</p>
         * <p>-WebSDK</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AliyunConsole: The project is created in the Alibaba Cloud console.</li>
         * <li>WebSDK: The project is created by using the SDK for Web.</li>
         * <li>OpenAPI: The project is created by calling API operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WebSDK</p>
         */
        public Builder createSource(String createSource) {
            this.putQueryParameter("CreateSource", createSource);
            this.createSource = createSource;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the editing project. Default value: EditingProject. Valid values:</p>
         * <ul>
         * <li>EditingProject: a regular editing project.</li>
         * <li>LiveEditingProject: a live stream editing project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EditingProject</p>
         */
        public Builder projectType(String projectType) {
            this.putQueryParameter("ProjectType", projectType);
            this.projectType = projectType;
            return this;
        }

        /**
         * <p>The sorting rule of results. Valid values:</p>
         * <p>- CreationTime:Desc (default): The results are sorted in reverse chronological order based on the creation time.</p>
         * <p>- CreationTime:Asc: The results are sorted in chronological order based on the creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the online editing project. Separate multiple values with commas (,). By default, all online editing projects are queried.</p>
         * <p>Valid values:</p>
         * <p>-Draft</p>
         * <p>-Producing</p>
         * <p>-Produced</p>
         * <p>-ProduceFailed</p>
         * 
         * <strong>example:</strong>
         * <p>Producing</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The template type. Valid values:</p>
         * <p>-Timeline</p>
         * <p>-VETemplate</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Timeline: regular template.</li>
         * <li>VETemplate: advanced template.</li>
         * <li>None: No template is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
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
