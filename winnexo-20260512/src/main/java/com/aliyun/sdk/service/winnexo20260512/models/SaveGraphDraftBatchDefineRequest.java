// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SaveGraphDraftBatchDefineRequest} extends {@link RequestModel}
 *
 * <p>SaveGraphDraftBatchDefineRequest</p>
 */
public class SaveGraphDraftBatchDefineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("draftChangeIds")
    private java.util.List<Long> draftChangeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("saveMode")
    private String saveMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yamlEdit;

    private SaveGraphDraftBatchDefineRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.draftChangeIds = builder.draftChangeIds;
        this.graphName = builder.graphName;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.saveMode = builder.saveMode;
        this.tenantId = builder.tenantId;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGraphDraftBatchDefineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return draftChangeIds
     */
    public java.util.List<Long> getDraftChangeIds() {
        return this.draftChangeIds;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return saveMode
     */
    public String getSaveMode() {
        return this.saveMode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return yamlEdit
     */
    public String getYamlEdit() {
        return this.yamlEdit;
    }

    public static final class Builder extends Request.Builder<SaveGraphDraftBatchDefineRequest, Builder> {
        private String appToken; 
        private java.util.List<Long> draftChangeIds; 
        private String graphName; 
        private String opsUserCode; 
        private String opsUserId; 
        private String saveMode; 
        private String tenantId; 
        private String yamlEdit; 

        private Builder() {
            super();
        } 

        private Builder(SaveGraphDraftBatchDefineRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.draftChangeIds = request.draftChangeIds;
            this.graphName = request.graphName;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.saveMode = request.saveMode;
            this.tenantId = request.tenantId;
            this.yamlEdit = request.yamlEdit;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The list of draft change IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[401001, 401002]</p>
         */
        public Builder draftChangeIds(java.util.List<Long> draftChangeIds) {
            String draftChangeIdsShrink = shrink(draftChangeIds, "draftChangeIds", "json");
            this.putBodyParameter("draftChangeIds", draftChangeIdsShrink);
            this.draftChangeIds = draftChangeIds;
            return this;
        }

        /**
         * <p>The graph name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The save mode.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL_YAML</p>
         */
        public Builder saveMode(String saveMode) {
            this.putBodyParameter("saveMode", saveMode);
            this.saveMode = saveMode;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The raw YAML text of the graph schema trimmed by READ permissions, with $ref references retained within the authorized subgraph.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name: crm_graph</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.putBodyParameter("yamlEdit", yamlEdit);
            this.yamlEdit = yamlEdit;
            return this;
        }

        @Override
        public SaveGraphDraftBatchDefineRequest build() {
            return new SaveGraphDraftBatchDefineRequest(this);
        } 

    } 

}
