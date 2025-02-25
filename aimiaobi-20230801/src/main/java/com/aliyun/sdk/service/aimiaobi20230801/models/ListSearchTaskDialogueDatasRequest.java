// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListSearchTaskDialogueDatasRequest} extends {@link RequestModel}
 *
 * <p>ListSearchTaskDialogueDatasRequest</p>
 */
public class ListSearchTaskDialogueDatasRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeContent")
    private Boolean includeContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultimodalSearchType")
    private String multimodalSearchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalSessionId")
    private String originalSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchModel")
    private String searchModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchModelDataValue")
    private String searchModelDataValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListSearchTaskDialogueDatasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.includeContent = builder.includeContent;
        this.multimodalSearchType = builder.multimodalSearchType;
        this.originalSessionId = builder.originalSessionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.searchModel = builder.searchModel;
        this.searchModelDataValue = builder.searchModelDataValue;
        this.sessionId = builder.sessionId;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchTaskDialogueDatasRequest create() {
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
     * @return includeContent
     */
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    /**
     * @return multimodalSearchType
     */
    public String getMultimodalSearchType() {
        return this.multimodalSearchType;
    }

    /**
     * @return originalSessionId
     */
    public String getOriginalSessionId() {
        return this.originalSessionId;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return searchModel
     */
    public String getSearchModel() {
        return this.searchModel;
    }

    /**
     * @return searchModelDataValue
     */
    public String getSearchModelDataValue() {
        return this.searchModelDataValue;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListSearchTaskDialogueDatasRequest, Builder> {
        private String regionId; 
        private Boolean includeContent; 
        private String multimodalSearchType; 
        private String originalSessionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String searchModel; 
        private String searchModelDataValue; 
        private String sessionId; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSearchTaskDialogueDatasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.includeContent = request.includeContent;
            this.multimodalSearchType = request.multimodalSearchType;
            this.originalSessionId = request.originalSessionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.searchModel = request.searchModel;
            this.searchModelDataValue = request.searchModelDataValue;
            this.sessionId = request.sessionId;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
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
         * IncludeContent.
         */
        public Builder includeContent(Boolean includeContent) {
            this.putBodyParameter("IncludeContent", includeContent);
            this.includeContent = includeContent;
            return this;
        }

        /**
         * MultimodalSearchType.
         */
        public Builder multimodalSearchType(String multimodalSearchType) {
            this.putBodyParameter("MultimodalSearchType", multimodalSearchType);
            this.multimodalSearchType = multimodalSearchType;
            return this;
        }

        /**
         * OriginalSessionId.
         */
        public Builder originalSessionId(String originalSessionId) {
            this.putBodyParameter("OriginalSessionId", originalSessionId);
            this.originalSessionId = originalSessionId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SearchModel.
         */
        public Builder searchModel(String searchModel) {
            this.putBodyParameter("SearchModel", searchModel);
            this.searchModel = searchModel;
            return this;
        }

        /**
         * SearchModelDataValue.
         */
        public Builder searchModelDataValue(String searchModelDataValue) {
            this.putBodyParameter("SearchModelDataValue", searchModelDataValue);
            this.searchModelDataValue = searchModelDataValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListSearchTaskDialogueDatasRequest build() {
            return new ListSearchTaskDialogueDatasRequest(this);
        } 

    } 

}
