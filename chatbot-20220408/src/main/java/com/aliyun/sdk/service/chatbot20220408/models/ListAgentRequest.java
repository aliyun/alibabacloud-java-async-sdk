// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAgentRequest} extends {@link RequestModel}
 *
 * <p>ListAgentRequest</p>
 */
public class ListAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GoodsCodes")
    private String goodsCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListAgentRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.goodsCodes = builder.goodsCodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return goodsCodes
     */
    public String getGoodsCodes() {
        return this.goodsCodes;
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

    public static final class Builder extends Request.Builder<ListAgentRequest, Builder> {
        private String agentName; 
        private String goodsCodes; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.goodsCodes = request.goodsCodes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * GoodsCodes.
         */
        public Builder goodsCodes(String goodsCodes) {
            this.putQueryParameter("GoodsCodes", goodsCodes);
            this.goodsCodes = goodsCodes;
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

        @Override
        public ListAgentRequest build() {
            return new ListAgentRequest(this);
        } 

    } 

}
