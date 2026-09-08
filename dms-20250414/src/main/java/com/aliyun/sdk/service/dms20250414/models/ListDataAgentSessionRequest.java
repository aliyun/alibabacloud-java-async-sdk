// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentSessionRequest</p>
 */
public class ListDataAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateEndTime")
    private Long createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateStartTime")
    private Long createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSaved")
    private Boolean isSaved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDataAgentSessionRequest(Builder builder) {
        super(builder);
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.creatorId = builder.creatorId;
        this.customAgentId = builder.customAgentId;
        this.DMSUnit = builder.DMSUnit;
        this.isSaved = builder.isSaved;
        this.mode = builder.mode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.title = builder.title;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return isSaved
     */
    public Boolean getIsSaved() {
        return this.isSaved;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDataAgentSessionRequest, Builder> {
        private Long createEndTime; 
        private Long createStartTime; 
        private String creatorId; 
        private String customAgentId; 
        private String DMSUnit; 
        private Boolean isSaved; 
        private String mode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryType; 
        private String title; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentSessionRequest request) {
            super(request);
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.creatorId = request.creatorId;
            this.customAgentId = request.customAgentId;
            this.DMSUnit = request.DMSUnit;
            this.isSaved = request.isSaved;
            this.mode = request.mode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.title = request.title;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The end time for session creation.</p>
         * 
         * <strong>example:</strong>
         * <p>1770912000000</p>
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("CreateEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * <p>The start time for session creation.</p>
         * 
         * <strong>example:</strong>
         * <p>1770825600000</p>
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("CreateStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putQueryParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * <p>The current Data Management unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve only favorited sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSaved(Boolean isSaved) {
            this.putQueryParameter("IsSaved", isSaved);
            this.isSaved = isSaved;
            return this;
        }

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li>Analysis</li>
         * <li>Coding</li>
         * </ul>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The session type. This parameter is required when a workspace is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>myFavorite</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The Data Agent title. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze this data for me</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDataAgentSessionRequest build() {
            return new ListDataAgentSessionRequest(this);
        } 

    } 

}
