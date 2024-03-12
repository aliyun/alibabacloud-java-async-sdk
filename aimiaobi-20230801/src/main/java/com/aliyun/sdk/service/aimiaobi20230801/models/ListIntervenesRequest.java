// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntervenesRequest} extends {@link RequestModel}
 *
 * <p>ListIntervenesRequest</p>
 */
public class ListIntervenesRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("InterveneType")
    private Integer interveneType;

    @Body
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Query")
    private String query;

    @Body
    @NameInMap("RuleId")
    private Long ruleId;

    private ListIntervenesRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.interveneType = builder.interveneType;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntervenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return interveneType
     */
    public Integer getInterveneType() {
        return this.interveneType;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<ListIntervenesRequest, Builder> {
        private String agentKey; 
        private Integer interveneType; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String query; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(ListIntervenesRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.interveneType = request.interveneType;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.ruleId = request.ruleId;
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
         * InterveneType.
         */
        public Builder interveneType(Integer interveneType) {
            this.putBodyParameter("InterveneType", interveneType);
            this.interveneType = interveneType;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ListIntervenesRequest build() {
            return new ListIntervenesRequest(this);
        } 

    } 

}
