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
 * {@link ListModelTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListModelTemplatesRequest</p>
 */
public class ListModelTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatformList")
    private java.util.List<String> agentPlatformList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProviderList")
    private java.util.List<String> agentProviderList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasModel")
    private Boolean hasModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateIdList")
    private java.util.List<String> modelTemplateIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefScope")
    private String refScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private ListModelTemplatesRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentPlatformList = builder.agentPlatformList;
        this.agentProvider = builder.agentProvider;
        this.agentProviderList = builder.agentProviderList;
        this.bizType = builder.bizType;
        this.hasModel = builder.hasModel;
        this.modelTemplateIdList = builder.modelTemplateIdList;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.refScope = builder.refScope;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelTemplatesRequest create() {
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
     * @return agentPlatformList
     */
    public java.util.List<String> getAgentPlatformList() {
        return this.agentPlatformList;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return agentProviderList
     */
    public java.util.List<String> getAgentProviderList() {
        return this.agentProviderList;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return hasModel
     */
    public Boolean getHasModel() {
        return this.hasModel;
    }

    /**
     * @return modelTemplateIdList
     */
    public java.util.List<String> getModelTemplateIdList() {
        return this.modelTemplateIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return refScope
     */
    public String getRefScope() {
        return this.refScope;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListModelTemplatesRequest, Builder> {
        private String agentPlatform; 
        private java.util.List<String> agentPlatformList; 
        private String agentProvider; 
        private java.util.List<String> agentProviderList; 
        private Integer bizType; 
        private Boolean hasModel; 
        private java.util.List<String> modelTemplateIdList; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String refScope; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListModelTemplatesRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentPlatformList = request.agentPlatformList;
            this.agentProvider = request.agentProvider;
            this.agentProviderList = request.agentProviderList;
            this.bizType = request.bizType;
            this.hasModel = request.hasModel;
            this.modelTemplateIdList = request.modelTemplateIdList;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.refScope = request.refScope;
            this.source = request.source;
        } 

        /**
         * <p>The Agent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The list of Agent platforms. Supports COMMON. If specified together with AgentPlatform, AgentPlatform takes precedence and this list is ignored. If neither platform filter is specified, the default value is ENTERPRISE. To query Common model groups, explicitly include COMMON. If filtering by Provider at the same time, set the value to Common.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatformList(java.util.List<String> agentPlatformList) {
            this.putQueryParameter("AgentPlatformList", agentPlatformList);
            this.agentPlatformList = agentPlatformList;
            return this;
        }

        /**
         * <p>The Agent provider name.</p>
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
         * <p>The list of Agent providers. Supports Common. If specified together with AgentProvider, AgentProvider takes precedence and this list is ignored. To query Common model groups, explicitly include COMMON in the platform filter.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProviderList(java.util.List<String> agentProviderList) {
            this.putQueryParameter("AgentProviderList", agentProviderList);
            this.agentProviderList = agentProviderList;
            return this;
        }

        /**
         * <p>The business type.</p>
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
         * <p>Specifies whether models are configured in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasModel(Boolean hasModel) {
            this.putQueryParameter("HasModel", hasModel);
            this.hasModel = hasModel;
            return this;
        }

        /**
         * <p>The list of template group IDs used for filtering.</p>
         */
        public Builder modelTemplateIdList(java.util.List<String> modelTemplateIdList) {
            String modelTemplateIdListShrink = shrink(modelTemplateIdList, "ModelTemplateIdList", "json");
            this.putQueryParameter("ModelTemplateIdList", modelTemplateIdListShrink);
            this.modelTemplateIdList = modelTemplateIdList;
            return this;
        }

        /**
         * <p>The model group name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>coding-openai</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number, starting from 1. Values 0 and 1 return the same result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The authorization scope filter. Valid values: ALL_USER, USER_MIXED, and RESOURCE_MIXED (strictly uppercase. Case variants and unknown values return InvalidParameter). If not specified, no filtering is applied. Unlike the create/update operations, the filter scenario allows RESOURCE_MIXED (to filter non-Common model groups).</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_USER</p>
         */
        public Builder refScope(String refScope) {
            this.putQueryParameter("RefScope", refScope);
            this.refScope = refScope;
            return this;
        }

        /**
         * <p>The template source filter. Valid values: User (tenant-created, default if not specified) and System (system preset).</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListModelTemplatesRequest build() {
            return new ListModelTemplatesRequest(this);
        } 

    } 

}
