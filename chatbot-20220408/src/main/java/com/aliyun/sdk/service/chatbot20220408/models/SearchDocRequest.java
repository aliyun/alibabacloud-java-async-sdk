// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDocRequest} extends {@link RequestModel}
 *
 * <p>SearchDocRequest</p>
 */
public class SearchDocRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private java.util.List < Long > categoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeBegin")
    private String createTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeBegin")
    private String endTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeEnd")
    private String endTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyTimeBegin")
    private String modifyTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyTimeEnd")
    private String modifyTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessStatus")
    private Integer processStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchScope")
    private Integer searchScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeBegin")
    private String startTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeEnd")
    private String startTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private SearchDocRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.categoryIds = builder.categoryIds;
        this.createTimeBegin = builder.createTimeBegin;
        this.createTimeEnd = builder.createTimeEnd;
        this.createUserName = builder.createUserName;
        this.endTimeBegin = builder.endTimeBegin;
        this.endTimeEnd = builder.endTimeEnd;
        this.keyword = builder.keyword;
        this.modifyTimeBegin = builder.modifyTimeBegin;
        this.modifyTimeEnd = builder.modifyTimeEnd;
        this.modifyUserName = builder.modifyUserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processStatus = builder.processStatus;
        this.searchScope = builder.searchScope;
        this.startTimeBegin = builder.startTimeBegin;
        this.startTimeEnd = builder.startTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDocRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return categoryIds
     */
    public java.util.List < Long > getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return createTimeBegin
     */
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return endTimeBegin
     */
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    /**
     * @return endTimeEnd
     */
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return modifyTimeBegin
     */
    public String getModifyTimeBegin() {
        return this.modifyTimeBegin;
    }

    /**
     * @return modifyTimeEnd
     */
    public String getModifyTimeEnd() {
        return this.modifyTimeEnd;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
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
     * @return processStatus
     */
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    /**
     * @return searchScope
     */
    public Integer getSearchScope() {
        return this.searchScope;
    }

    /**
     * @return startTimeBegin
     */
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    /**
     * @return startTimeEnd
     */
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SearchDocRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List < Long > categoryIds; 
        private String createTimeBegin; 
        private String createTimeEnd; 
        private String createUserName; 
        private String endTimeBegin; 
        private String endTimeEnd; 
        private String keyword; 
        private String modifyTimeBegin; 
        private String modifyTimeEnd; 
        private String modifyUserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer processStatus; 
        private Integer searchScope; 
        private String startTimeBegin; 
        private String startTimeEnd; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(SearchDocRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.categoryIds = request.categoryIds;
            this.createTimeBegin = request.createTimeBegin;
            this.createTimeEnd = request.createTimeEnd;
            this.createUserName = request.createUserName;
            this.endTimeBegin = request.endTimeBegin;
            this.endTimeEnd = request.endTimeEnd;
            this.keyword = request.keyword;
            this.modifyTimeBegin = request.modifyTimeBegin;
            this.modifyTimeEnd = request.modifyTimeEnd;
            this.modifyUserName = request.modifyUserName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processStatus = request.processStatus;
            this.searchScope = request.searchScope;
            this.startTimeBegin = request.startTimeBegin;
            this.startTimeEnd = request.startTimeEnd;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * CategoryIds.
         */
        public Builder categoryIds(java.util.List < Long > categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * CreateTimeBegin.
         */
        public Builder createTimeBegin(String createTimeBegin) {
            this.putQueryParameter("CreateTimeBegin", createTimeBegin);
            this.createTimeBegin = createTimeBegin;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.putQueryParameter("CreateUserName", createUserName);
            this.createUserName = createUserName;
            return this;
        }

        /**
         * EndTimeBegin.
         */
        public Builder endTimeBegin(String endTimeBegin) {
            this.putQueryParameter("EndTimeBegin", endTimeBegin);
            this.endTimeBegin = endTimeBegin;
            return this;
        }

        /**
         * EndTimeEnd.
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putQueryParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
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
         * ModifyTimeBegin.
         */
        public Builder modifyTimeBegin(String modifyTimeBegin) {
            this.putQueryParameter("ModifyTimeBegin", modifyTimeBegin);
            this.modifyTimeBegin = modifyTimeBegin;
            return this;
        }

        /**
         * ModifyTimeEnd.
         */
        public Builder modifyTimeEnd(String modifyTimeEnd) {
            this.putQueryParameter("ModifyTimeEnd", modifyTimeEnd);
            this.modifyTimeEnd = modifyTimeEnd;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.putQueryParameter("ModifyUserName", modifyUserName);
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProcessStatus.
         */
        public Builder processStatus(Integer processStatus) {
            this.putQueryParameter("ProcessStatus", processStatus);
            this.processStatus = processStatus;
            return this;
        }

        /**
         * SearchScope.
         */
        public Builder searchScope(Integer searchScope) {
            this.putQueryParameter("SearchScope", searchScope);
            this.searchScope = searchScope;
            return this;
        }

        /**
         * StartTimeBegin.
         */
        public Builder startTimeBegin(String startTimeBegin) {
            this.putQueryParameter("StartTimeBegin", startTimeBegin);
            this.startTimeBegin = startTimeBegin;
            return this;
        }

        /**
         * StartTimeEnd.
         */
        public Builder startTimeEnd(String startTimeEnd) {
            this.putQueryParameter("StartTimeEnd", startTimeEnd);
            this.startTimeEnd = startTimeEnd;
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
        public SearchDocRequest build() {
            return new SearchDocRequest(this);
        } 

    } 

}
