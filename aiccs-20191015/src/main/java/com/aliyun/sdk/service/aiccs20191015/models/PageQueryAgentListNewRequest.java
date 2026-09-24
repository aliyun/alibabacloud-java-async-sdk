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
    @com.aliyun.core.annotation.NameInMap("InboundConfigurableOnly")
    private Boolean inboundConfigurableOnly;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDirection")
    private String serviceDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private PageQueryAgentListNewRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.inboundConfigurableOnly = builder.inboundConfigurableOnly;
        this.isAvailable = builder.isAvailable;
        this.pageIndex = builder.pageIndex;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.serviceDirection = builder.serviceDirection;
        this.templateId = builder.templateId;
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
     * @return inboundConfigurableOnly
     */
    public Boolean getInboundConfigurableOnly() {
        return this.inboundConfigurableOnly;
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

    /**
     * @return serviceDirection
     */
    public String getServiceDirection() {
        return this.serviceDirection;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<PageQueryAgentListNewRequest, Builder> {
        private String agentId; 
        private String agentName; 
        private Boolean inboundConfigurableOnly; 
        private Boolean isAvailable; 
        private Long pageIndex; 
        private Long pageNo; 
        private Long pageSize; 
        private String serviceDirection; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(PageQueryAgentListNewRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentName = request.agentName;
            this.inboundConfigurableOnly = request.inboundConfigurableOnly;
            this.isAvailable = request.isAvailable;
            this.pageIndex = request.pageIndex;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.serviceDirection = request.serviceDirection;
            this.templateId = request.templateId;
        } 

        /**
         * <p>Agent ID</p>
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
         * <p>Intelligent Customer Service Assistant</p>
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>Specifies whether to return only candidate agents that are configurable for inbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder inboundConfigurableOnly(Boolean inboundConfigurableOnly) {
            this.putQueryParameter("InboundConfigurableOnly", inboundConfigurableOnly);
            this.inboundConfigurableOnly = inboundConfigurableOnly;
            return this;
        }

        /**
         * <p>Specifies whether the agent is available for outbound calls. A value of True indicates that the current deployment branch of the agent has a published version and is available for outbound calls.</p>
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
         * <p>The page number. This parameter is deprecated. Use PageNo instead.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The service direction.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder serviceDirection(String serviceDirection) {
            this.putQueryParameter("ServiceDirection", serviceDirection);
            this.serviceDirection = serviceDirection;
            return this;
        }

        /**
         * <p>The source template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public PageQueryAgentListNewRequest build() {
            return new PageQueryAgentListNewRequest(this);
        } 

    } 

}
