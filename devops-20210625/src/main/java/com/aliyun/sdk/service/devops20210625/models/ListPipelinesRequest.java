// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelinesRequest</p>
 */
public class ListPipelinesRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("createEndTime")
    private Long createEndTime;

    @Query
    @NameInMap("createStartTime")
    private Long createStartTime;

    @Query
    @NameInMap("creatorAccountIds")
    private String creatorAccountIds;

    @Query
    @NameInMap("executeAccountIds")
    private String executeAccountIds;

    @Query
    @NameInMap("executeEndTime")
    private Long executeEndTime;

    @Query
    @NameInMap("executeStartTime")
    private Long executeStartTime;

    @Query
    @NameInMap("maxResults")
    private Long maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("pipelineName")
    private String pipelineName;

    @Query
    @NameInMap("statusList")
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

        private Builder(ListPipelinesRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.createEndTime = response.createEndTime;
            this.createStartTime = response.createStartTime;
            this.creatorAccountIds = response.creatorAccountIds;
            this.executeAccountIds = response.executeAccountIds;
            this.executeEndTime = response.executeEndTime;
            this.executeStartTime = response.executeStartTime;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.pipelineName = response.pipelineName;
            this.statusList = response.statusList;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如 https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 创建结束时间
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * 创建开始时间
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * 创建人阿里云账号Id
         */
        public Builder creatorAccountIds(String creatorAccountIds) {
            this.putQueryParameter("creatorAccountIds", creatorAccountIds);
            this.creatorAccountIds = creatorAccountIds;
            return this;
        }

        /**
         * 执行人阿里云账号id
         */
        public Builder executeAccountIds(String executeAccountIds) {
            this.putQueryParameter("executeAccountIds", executeAccountIds);
            this.executeAccountIds = executeAccountIds;
            return this;
        }

        /**
         * 执行结束时间
         */
        public Builder executeEndTime(Long executeEndTime) {
            this.putQueryParameter("executeEndTime", executeEndTime);
            this.executeEndTime = executeEndTime;
            return this;
        }

        /**
         * 执行开始时间
         */
        public Builder executeStartTime(Long executeStartTime) {
            this.putQueryParameter("executeStartTime", executeStartTime);
            this.executeStartTime = executeStartTime;
            return this;
        }

        /**
         * 返回的总数
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页Token
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 流水线名称
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * 状态列表，多个逗号分割
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
