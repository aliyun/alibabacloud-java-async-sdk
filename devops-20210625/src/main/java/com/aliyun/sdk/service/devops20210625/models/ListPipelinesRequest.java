// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelinesRequest</p>
 */
public class ListPipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private Long createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private Long createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("creatorAccountIds")
    private String creatorAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executeAccountIds")
    private String executeAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executeEndTime")
    private Long executeEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executeStartTime")
    private Long executeStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("statusList")
    private String statusList;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.creatorAccountIds = builder.creatorAccountIds;
        this.executeAccountIds = builder.executeAccountIds;
        this.executeEndTime = builder.executeEndTime;
        this.executeStartTime = builder.executeStartTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelineName = builder.pipelineName;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
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
     * @return creatorAccountIds
     */
    public String getCreatorAccountIds() {
        return this.creatorAccountIds;
    }

    /**
     * @return executeAccountIds
     */
    public String getExecuteAccountIds() {
        return this.executeAccountIds;
    }

    /**
     * @return executeEndTime
     */
    public Long getExecuteEndTime() {
        return this.executeEndTime;
    }

    /**
     * @return executeStartTime
     */
    public Long getExecuteStartTime() {
        return this.executeStartTime;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String organizationId; 
        private Long createEndTime; 
        private Long createStartTime; 
        private String creatorAccountIds; 
        private String executeAccountIds; 
        private Long executeEndTime; 
        private Long executeStartTime; 
        private Long maxResults; 
        private String nextToken; 
        private String pipelineName; 
        private String statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.creatorAccountIds = request.creatorAccountIds;
            this.executeAccountIds = request.executeAccountIds;
            this.executeEndTime = request.executeEndTime;
            this.executeStartTime = request.executeStartTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pipelineName = request.pipelineName;
            this.statusList = request.statusList;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * createEndTime.
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * createStartTime.
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * creatorAccountIds.
         */
        public Builder creatorAccountIds(String creatorAccountIds) {
            this.putQueryParameter("creatorAccountIds", creatorAccountIds);
            this.creatorAccountIds = creatorAccountIds;
            return this;
        }

        /**
         * executeAccountIds.
         */
        public Builder executeAccountIds(String executeAccountIds) {
            this.putQueryParameter("executeAccountIds", executeAccountIds);
            this.executeAccountIds = executeAccountIds;
            return this;
        }

        /**
         * executeEndTime.
         */
        public Builder executeEndTime(Long executeEndTime) {
            this.putQueryParameter("executeEndTime", executeEndTime);
            this.executeEndTime = executeEndTime;
            return this;
        }

        /**
         * executeStartTime.
         */
        public Builder executeStartTime(Long executeStartTime) {
            this.putQueryParameter("executeStartTime", executeStartTime);
            this.executeStartTime = executeStartTime;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * statusList.
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("statusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

}
