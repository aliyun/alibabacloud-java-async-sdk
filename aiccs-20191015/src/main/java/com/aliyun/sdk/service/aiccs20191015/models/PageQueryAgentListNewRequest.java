// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link PageQueryAgentListNewRequest} extends {@link RequestModel}
 *
 * <p>PageQueryAgentListNewRequest</p>
 */
public class PageQueryAgentListNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAvailable")
    private Boolean isAvailable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private PageQueryAgentListNewRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.isAvailable = builder.isAvailable;
        this.pageIndex = builder.pageIndex;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQueryAgentListNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return isAvailable
     */
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<PageQueryAgentListNewRequest, Builder> {
        private String agentId; 
        private String agentName; 
        private Boolean isAvailable; 
        private Long pageIndex; 
        private Long pageNo; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(PageQueryAgentListNewRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentName = request.agentName;
            this.isAvailable = request.isAvailable;
            this.pageIndex = request.pageIndex;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>智能客服助手</p>
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>Indicates whether the agent is available for outbound calls. The value is <code>true</code> if the agent\&quot;s current deployment branch has a published version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAvailable(Boolean isAvailable) {
            this.putQueryParameter("IsAvailable", isAvailable);
            this.isAvailable = isAvailable;
            return this;
        }

        /**
         * <p>The page index. This parameter is deprecated. Use <code>PageNo</code> instead.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public PageQueryAgentListNewRequest build() {
            return new PageQueryAgentListNewRequest(this);
        } 

    } 

}
