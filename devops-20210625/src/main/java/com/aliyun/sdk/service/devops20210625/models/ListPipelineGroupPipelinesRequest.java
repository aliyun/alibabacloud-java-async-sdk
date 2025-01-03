// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListPipelineGroupPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineGroupPipelinesRequest</p>
 */
public class ListPipelineGroupPipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private Long createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private Long createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executeEndTime")
    private Long executeEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executeStartTime")
    private Long executeStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resultStatusList")
    private String resultStatusList;

    private ListPipelineGroupPipelinesRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.groupId = builder.groupId;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.executeEndTime = builder.executeEndTime;
        this.executeStartTime = builder.executeStartTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelineName = builder.pipelineName;
        this.resultStatusList = builder.resultStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineGroupPipelinesRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return resultStatusList
     */
    public String getResultStatusList() {
        return this.resultStatusList;
    }

    public static final class Builder extends Request.Builder<ListPipelineGroupPipelinesRequest, Builder> {
        private String organizationId; 
        private Long groupId; 
        private Long createEndTime; 
        private Long createStartTime; 
        private Long executeEndTime; 
        private Long executeStartTime; 
        private Long maxResults; 
        private String nextToken; 
        private String pipelineName; 
        private String resultStatusList; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineGroupPipelinesRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.groupId = request.groupId;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.executeEndTime = request.executeEndTime;
            this.executeStartTime = request.executeStartTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pipelineName = request.pipelineName;
            this.resultStatusList = request.resultStatusList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder groupId(Long groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
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
         * resultStatusList.
         */
        public Builder resultStatusList(String resultStatusList) {
            this.putQueryParameter("resultStatusList", resultStatusList);
            this.resultStatusList = resultStatusList;
            return this;
        }

        @Override
        public ListPipelineGroupPipelinesRequest build() {
            return new ListPipelineGroupPipelinesRequest(this);
        } 

    } 

}
