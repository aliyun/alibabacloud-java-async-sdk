// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRunsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineRunsRequest</p>
 */
public class ListPipelineRunsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Query
    @NameInMap("endTime")
    private Long endTime;

    @Query
    @NameInMap("maxResults")
    private Long maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("startTime")
    private Long startTime;

    @Query
    @NameInMap("status")
    private String status;

    @Query
    @NameInMap("triggerMode")
    private Integer triggerMode;

    private ListPipelineRunsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.triggerMode = builder.triggerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRunsRequest create() {
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
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return triggerMode
     */
    public Integer getTriggerMode() {
        return this.triggerMode;
    }

    public static final class Builder extends Request.Builder<ListPipelineRunsRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long endTime; 
        private Long maxResults; 
        private String nextToken; 
        private Long startTime; 
        private String status; 
        private Integer triggerMode; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineRunsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.endTime = response.endTime;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.startTime = response.startTime;
            this.status = response.status;
            this.triggerMode = response.triggerMode;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 流水线id
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 最大返回数量
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
         * 开始时间
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 状态 状态 FAIL 运行失败 SUCCESS 运行成功 RUNNING 运行中
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * 触发模式 1人工触发 2定时触发 3代码提交触发
         */
        public Builder triggerMode(Integer triggerMode) {
            this.putQueryParameter("triggerMode", triggerMode);
            this.triggerMode = triggerMode;
            return this;
        }

        @Override
        public ListPipelineRunsRequest build() {
            return new ListPipelineRunsRequest(this);
        } 

    } 

}
