// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeViewContentRequest} extends {@link RequestModel}
 *
 * <p>DescribeViewContentRequest</p>
 */
public class DescribeViewContentRequest extends Request {
    @Query
    @NameInMap("AuditResult")
    private String auditResult;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DataId")
    private String dataId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("KeywordId")
    private String keywordId;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("LibType")
    private String libType;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Scene")
    private String scene;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("Suggestion")
    private String suggestion;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeViewContentRequest(Builder builder) {
        super(builder);
        this.auditResult = builder.auditResult;
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.dataId = builder.dataId;
        this.endDate = builder.endDate;
        this.imageId = builder.imageId;
        this.keyword = builder.keyword;
        this.keywordId = builder.keywordId;
        this.label = builder.label;
        this.libType = builder.libType;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.startDate = builder.startDate;
        this.suggestion = builder.suggestion;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeViewContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditResult
     */
    public String getAuditResult() {
        return this.auditResult;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return keywordId
     */
    public String getKeywordId() {
        return this.keywordId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return libType
     */
    public String getLibType() {
        return this.libType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<DescribeViewContentRequest, Builder> {
        private String auditResult; 
        private String bizType; 
        private Integer currentPage; 
        private String dataId; 
        private String endDate; 
        private String imageId; 
        private String keyword; 
        private String keywordId; 
        private String label; 
        private String libType; 
        private Integer pageSize; 
        private String resourceType; 
        private String scene; 
        private String startDate; 
        private String suggestion; 
        private String taskId; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeViewContentRequest request) {
            super(request);
            this.auditResult = request.auditResult;
            this.bizType = request.bizType;
            this.currentPage = request.currentPage;
            this.dataId = request.dataId;
            this.endDate = request.endDate;
            this.imageId = request.imageId;
            this.keyword = request.keyword;
            this.keywordId = request.keywordId;
            this.label = request.label;
            this.libType = request.libType;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.startDate = request.startDate;
            this.suggestion = request.suggestion;
            this.taskId = request.taskId;
            this.totalCount = request.totalCount;
        } 

        /**
         * AuditResult.
         */
        public Builder auditResult(String auditResult) {
            this.putQueryParameter("AuditResult", auditResult);
            this.auditResult = auditResult;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * KeywordId.
         */
        public Builder keywordId(String keywordId) {
            this.putQueryParameter("KeywordId", keywordId);
            this.keywordId = keywordId;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * LibType.
         */
        public Builder libType(String libType) {
            this.putQueryParameter("LibType", libType);
            this.libType = libType;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Suggestion.
         */
        public Builder suggestion(String suggestion) {
            this.putQueryParameter("Suggestion", suggestion);
            this.suggestion = suggestion;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public DescribeViewContentRequest build() {
            return new DescribeViewContentRequest(this);
        } 

    } 

}
