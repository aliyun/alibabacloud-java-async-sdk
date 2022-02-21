// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

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
    @Body
    @NameInMap("CreateEndTime")
    private String createEndTime;

    @Body
    @NameInMap("CreateStartTime")
    private String createStartTime;

    @Body
    @NameInMap("Creators")
    private String creators;

    @Body
    @NameInMap("ExecuteEndTime")
    private String executeEndTime;

    @Body
    @NameInMap("ExecuteStartTime")
    private String executeStartTime;

    @Body
    @NameInMap("Operators")
    private String operators;

    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("PageStart")
    @Validation(required = true)
    private Integer pageStart;

    @Body
    @NameInMap("PipelineName")
    private String pipelineName;

    @Body
    @NameInMap("ResultStatusList")
    private String resultStatusList;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.creators = builder.creators;
        this.executeEndTime = builder.executeEndTime;
        this.executeStartTime = builder.executeStartTime;
        this.operators = builder.operators;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageStart = builder.pageStart;
        this.pipelineName = builder.pipelineName;
        this.resultStatusList = builder.resultStatusList;
        this.userPk = builder.userPk;
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
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return creators
     */
    public String getCreators() {
        return this.creators;
    }

    /**
     * @return executeEndTime
     */
    public String getExecuteEndTime() {
        return this.executeEndTime;
    }

    /**
     * @return executeStartTime
     */
    public String getExecuteStartTime() {
        return this.executeStartTime;
    }

    /**
     * @return operators
     */
    public String getOperators() {
        return this.operators;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageStart
     */
    public Integer getPageStart() {
        return this.pageStart;
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

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String createEndTime; 
        private String createStartTime; 
        private String creators; 
        private String executeEndTime; 
        private String executeStartTime; 
        private String operators; 
        private String orgId; 
        private Integer pageSize; 
        private Integer pageStart; 
        private String pipelineName; 
        private String resultStatusList; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest response) {
            super(response);
            this.createEndTime = response.createEndTime;
            this.createStartTime = response.createStartTime;
            this.creators = response.creators;
            this.executeEndTime = response.executeEndTime;
            this.executeStartTime = response.executeStartTime;
            this.operators = response.operators;
            this.orgId = response.orgId;
            this.pageSize = response.pageSize;
            this.pageStart = response.pageStart;
            this.pipelineName = response.pipelineName;
            this.resultStatusList = response.resultStatusList;
            this.userPk = response.userPk;
        } 

        /**
         * CreateEndTime.
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("CreateEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * CreateStartTime.
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("CreateStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * Creators.
         */
        public Builder creators(String creators) {
            this.putBodyParameter("Creators", creators);
            this.creators = creators;
            return this;
        }

        /**
         * ExecuteEndTime.
         */
        public Builder executeEndTime(String executeEndTime) {
            this.putBodyParameter("ExecuteEndTime", executeEndTime);
            this.executeEndTime = executeEndTime;
            return this;
        }

        /**
         * ExecuteStartTime.
         */
        public Builder executeStartTime(String executeStartTime) {
            this.putBodyParameter("ExecuteStartTime", executeStartTime);
            this.executeStartTime = executeStartTime;
            return this;
        }

        /**
         * Operators.
         */
        public Builder operators(String operators) {
            this.putBodyParameter("Operators", operators);
            this.operators = operators;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
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
         * PageStart.
         */
        public Builder pageStart(Integer pageStart) {
            this.putBodyParameter("PageStart", pageStart);
            this.pageStart = pageStart;
            return this;
        }

        /**
         * PipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putBodyParameter("PipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * ResultStatusList.
         */
        public Builder resultStatusList(String resultStatusList) {
            this.putBodyParameter("ResultStatusList", resultStatusList);
            this.resultStatusList = resultStatusList;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

}
