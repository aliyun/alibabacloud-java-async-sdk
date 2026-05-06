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
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListModelTemplatesRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.hasModel = builder.hasModel;
        this.modelTemplateIdList = builder.modelTemplateIdList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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

    public static final class Builder extends Request.Builder<ListModelTemplatesRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private Boolean hasModel; 
        private java.util.List<String> modelTemplateIdList; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListModelTemplatesRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.hasModel = request.hasModel;
            this.modelTemplateIdList = request.modelTemplateIdList;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * HasModel.
         */
        public Builder hasModel(Boolean hasModel) {
            this.putQueryParameter("HasModel", hasModel);
            this.hasModel = hasModel;
            return this;
        }

        /**
         * ModelTemplateIdList.
         */
        public Builder modelTemplateIdList(java.util.List<String> modelTemplateIdList) {
            String modelTemplateIdListShrink = shrink(modelTemplateIdList, "ModelTemplateIdList", "json");
            this.putQueryParameter("ModelTemplateIdList", modelTemplateIdListShrink);
            this.modelTemplateIdList = modelTemplateIdList;
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
        public ListModelTemplatesRequest build() {
            return new ListModelTemplatesRequest(this);
        } 

    } 

}
