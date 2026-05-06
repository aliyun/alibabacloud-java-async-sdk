// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListModelProviderTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListModelProviderTemplatesRequest</p>
 */
public class ListModelProviderTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    private String providerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateIds")
    private java.util.List<String> providerTemplateIds;

    private ListModelProviderTemplatesRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.modelTemplateId = builder.modelTemplateId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.providerName = builder.providerName;
        this.providerTemplateIds = builder.providerTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelProviderTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
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
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return providerTemplateIds
     */
    public java.util.List<String> getProviderTemplateIds() {
        return this.providerTemplateIds;
    }

    public static final class Builder extends Request.Builder<ListModelProviderTemplatesRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private String modelTemplateId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String providerName; 
        private java.util.List<String> providerTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(ListModelProviderTemplatesRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.modelTemplateId = request.modelTemplateId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.providerName = request.providerName;
            this.providerTemplateIds = request.providerTemplateIds;
        } 

        /**
         * AgentPlatform.
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ModelTemplateId.
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
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
         * ProviderName.
         */
        public Builder providerName(String providerName) {
            this.putQueryParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        /**
         * ProviderTemplateIds.
         */
        public Builder providerTemplateIds(java.util.List<String> providerTemplateIds) {
            String providerTemplateIdsShrink = shrink(providerTemplateIds, "ProviderTemplateIds", "json");
            this.putQueryParameter("ProviderTemplateIds", providerTemplateIdsShrink);
            this.providerTemplateIds = providerTemplateIds;
            return this;
        }

        @Override
        public ListModelProviderTemplatesRequest build() {
            return new ListModelProviderTemplatesRequest(this);
        } 

    } 

}
