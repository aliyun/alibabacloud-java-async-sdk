// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFaqRequest} extends {@link RequestModel}
 *
 * <p>SearchFaqRequest</p>
 */
public class SearchFaqRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("CategoryIds")
    private java.util.List < Long > categoryIds;

    @Body
    @NameInMap("CreateTimeBegin")
    private String createTimeBegin;

    @Body
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Body
    @NameInMap("CreateUserName")
    private String createUserName;

    @Body
    @NameInMap("EndTimeBegin")
    private String endTimeBegin;

    @Body
    @NameInMap("EndTimeEnd")
    private String endTimeEnd;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("ModifyTimeBegin")
    private String modifyTimeBegin;

    @Body
    @NameInMap("ModifyTimeEnd")
    private String modifyTimeEnd;

    @Body
    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchScope")
    private Integer searchScope;

    @Body
    @NameInMap("StartTimeBegin")
    private String startTimeBegin;

    @Body
    @NameInMap("StartTimeEnd")
    private String startTimeEnd;

    @Body
    @NameInMap("Status")
    private Integer status;

    private SearchFaqRequest(Builder builder) {
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
        this.searchScope = builder.searchScope;
        this.startTimeBegin = builder.startTimeBegin;
        this.startTimeEnd = builder.startTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFaqRequest create() {
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

    public static final class Builder extends Request.Builder<SearchFaqRequest, Builder> {
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
        private Integer searchScope; 
        private String startTimeBegin; 
        private String startTimeEnd; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(SearchFaqRequest request) {
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
            this.putBodyParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * CreateTimeBegin.
         */
        public Builder createTimeBegin(String createTimeBegin) {
            this.putBodyParameter("CreateTimeBegin", createTimeBegin);
            this.createTimeBegin = createTimeBegin;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.putBodyParameter("CreateUserName", createUserName);
            this.createUserName = createUserName;
            return this;
        }

        /**
         * EndTimeBegin.
         */
        public Builder endTimeBegin(String endTimeBegin) {
            this.putBodyParameter("EndTimeBegin", endTimeBegin);
            this.endTimeBegin = endTimeBegin;
            return this;
        }

        /**
         * EndTimeEnd.
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putBodyParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * ModifyTimeBegin.
         */
        public Builder modifyTimeBegin(String modifyTimeBegin) {
            this.putBodyParameter("ModifyTimeBegin", modifyTimeBegin);
            this.modifyTimeBegin = modifyTimeBegin;
            return this;
        }

        /**
         * ModifyTimeEnd.
         */
        public Builder modifyTimeEnd(String modifyTimeEnd) {
            this.putBodyParameter("ModifyTimeEnd", modifyTimeEnd);
            this.modifyTimeEnd = modifyTimeEnd;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.putBodyParameter("ModifyUserName", modifyUserName);
            this.modifyUserName = modifyUserName;
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
         * SearchScope.
         */
        public Builder searchScope(Integer searchScope) {
            this.putBodyParameter("SearchScope", searchScope);
            this.searchScope = searchScope;
            return this;
        }

        /**
         * StartTimeBegin.
         */
        public Builder startTimeBegin(String startTimeBegin) {
            this.putBodyParameter("StartTimeBegin", startTimeBegin);
            this.startTimeBegin = startTimeBegin;
            return this;
        }

        /**
         * StartTimeEnd.
         */
        public Builder startTimeEnd(String startTimeEnd) {
            this.putBodyParameter("StartTimeEnd", startTimeEnd);
            this.startTimeEnd = startTimeEnd;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SearchFaqRequest build() {
            return new SearchFaqRequest(this);
        } 

    } 

}
