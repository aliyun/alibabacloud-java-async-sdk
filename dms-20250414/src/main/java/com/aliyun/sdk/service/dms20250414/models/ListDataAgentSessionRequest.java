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
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSaved")
    private Boolean isSaved;

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
        this.customAgentId = builder.customAgentId;
        this.DMSUnit = builder.DMSUnit;
        this.isSaved = builder.isSaved;
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
        private String customAgentId; 
        private String DMSUnit; 
        private Boolean isSaved; 
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
            this.customAgentId = request.customAgentId;
            this.DMSUnit = request.DMSUnit;
            this.isSaved = request.isSaved;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.title = request.title;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * CreateEndTime.
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("CreateEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * CreateStartTime.
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("CreateStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * CustomAgentId.
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * IsSaved.
         */
        public Builder isSaved(Boolean isSaved) {
            this.putQueryParameter("IsSaved", isSaved);
            this.isSaved = isSaved;
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
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * WorkspaceId.
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
