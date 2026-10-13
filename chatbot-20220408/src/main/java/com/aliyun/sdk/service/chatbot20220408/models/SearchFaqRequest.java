// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link SearchFaqRequest} extends {@link RequestModel}
 *
 * <p>SearchFaqRequest</p>
 */
public class SearchFaqRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private java.util.List<Long> categoryIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeBegin")
    private String createTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTimeBegin")
    private String endTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTimeEnd")
    private String endTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyTimeBegin")
    private String modifyTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyTimeEnd")
    private String modifyTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchScope")
    private Integer searchScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTimeBegin")
    private String startTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTimeEnd")
    private String startTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
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
    public java.util.List<Long> getCategoryIds() {
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
        private java.util.List<Long> categoryIds; 
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
         * <p>The business space key. If not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The unique identifier of the category.</p>
         */
        public Builder categoryIds(java.util.List<Long> categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putBodyParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>The start of the creation time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-02T03:09:30Z</p>
         */
        public Builder createTimeBegin(String createTimeBegin) {
            this.putBodyParameter("CreateTimeBegin", createTimeBegin);
            this.createTimeBegin = createTimeBegin;
            return this;
        }

        /**
         * <p>The end of the creation time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-02T03:09:30Z</p>
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder createUserName(String createUserName) {
            this.putBodyParameter("CreateUserName", createUserName);
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The start of the expiration time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-02T03:09:30Z</p>
         */
        public Builder endTimeBegin(String endTimeBegin) {
            this.putBodyParameter("EndTimeBegin", endTimeBegin);
            this.endTimeBegin = endTimeBegin;
            return this;
        }

        /**
         * <p>The end of the expiration time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-02T03:09:30Z</p>
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putBodyParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Search title</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The start of the modification time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-02T03:09:30Z</p>
         */
        public Builder modifyTimeBegin(String modifyTimeBegin) {
            this.putBodyParameter("ModifyTimeBegin", modifyTimeBegin);
            this.modifyTimeBegin = modifyTimeBegin;
            return this;
        }

        /**
         * <p>The end of the modification time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-02T03:09:30Z</p>
         */
        public Builder modifyTimeEnd(String modifyTimeEnd) {
            this.putBodyParameter("ModifyTimeEnd", modifyTimeEnd);
            this.modifyTimeEnd = modifyTimeEnd;
            return this;
        }

        /**
         * <p>The name of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder modifyUserName(String modifyUserName) {
            this.putBodyParameter("ModifyUserName", modifyUserName);
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search scope. Valid values:</p>
         * <ul>
         * <li>1: Search titles and similar questions.</li>
         * <li>2: Search answers.</li>
         * <li>3: Search all.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder searchScope(Integer searchScope) {
            this.putBodyParameter("SearchScope", searchScope);
            this.searchScope = searchScope;
            return this;
        }

        /**
         * <p>The start of the effective time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-02T03:09:30Z</p>
         */
        public Builder startTimeBegin(String startTimeBegin) {
            this.putBodyParameter("StartTimeBegin", startTimeBegin);
            this.startTimeBegin = startTimeBegin;
            return this;
        }

        /**
         * <p>The end of the effective time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-03T03:09:30Z</p>
         */
        public Builder startTimeEnd(String startTimeEnd) {
            this.putBodyParameter("StartTimeEnd", startTimeEnd);
            this.startTimeEnd = startTimeEnd;
            return this;
        }

        /**
         * <p>The knowledge status. Valid values:</p>
         * <ul>
         * <li>-1: deleted and unpublished.</li>
         * <li>1: unpublished.</li>
         * <li>2: published.</li>
         * <li>3: updated and unpublished.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
