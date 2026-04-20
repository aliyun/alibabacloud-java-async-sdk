// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link MmAppBindingRagRequest} extends {@link RequestModel}
 *
 * <p>MmAppBindingRagRequest</p>
 */
public class MmAppBindingRagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseCodeList")
    private java.util.List<String> knowledgeBaseCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private MmAppBindingRagRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.knowledgeBaseCodeList = builder.knowledgeBaseCodeList;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MmAppBindingRagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return knowledgeBaseCodeList
     */
    public java.util.List<String> getKnowledgeBaseCodeList() {
        return this.knowledgeBaseCodeList;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<MmAppBindingRagRequest, Builder> {
        private String appId; 
        private java.util.List<String> knowledgeBaseCodeList; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(MmAppBindingRagRequest request) {
            super(request);
            this.appId = request.appId;
            this.knowledgeBaseCodeList = request.knowledgeBaseCodeList;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_a2eb4e04b48041108edb1f6de815</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * KnowledgeBaseCodeList.
         */
        public Builder knowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            String knowledgeBaseCodeListShrink = shrink(knowledgeBaseCodeList, "KnowledgeBaseCodeList", "json");
            this.putQueryParameter("KnowledgeBaseCodeList", knowledgeBaseCodeListShrink);
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-6uhm7nfev4k8pwcz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public MmAppBindingRagRequest build() {
            return new MmAppBindingRagRequest(this);
        } 

    } 

}
