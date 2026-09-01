// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateKBSyncLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateKBSyncLinkRequest</p>
 */
public class CreateKBSyncLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDir")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048)
    private String sourceDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String tenantId;

    private CreateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.description = builder.description;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkName = builder.linkName;
        this.regionId = builder.regionId;
        this.sourceDir = builder.sourceDir;
        this.sourceType = builder.sourceType;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKBSyncLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return linkName
     */
    public String getLinkName() {
        return this.linkName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceDir
     */
    public String getSourceDir() {
        return this.sourceDir;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return syncIntervalMinutes
     */
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateKBSyncLinkRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private String description; 
        private String knowledgeBaseId; 
        private String linkName; 
        private String regionId; 
        private String sourceDir; 
        private String sourceType; 
        private Integer syncIntervalMinutes; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKBSyncLinkRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.description = request.description;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkName = request.linkName;
            this.regionId = request.regionId;
            this.sourceDir = request.sourceDir;
            this.sourceType = request.sourceType;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_xxxxxxbe8</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder linkName(String linkName) {
            this.putQueryParameter("LinkName", linkName);
            this.linkName = linkName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
         */
        public Builder sourceDir(String sourceDir) {
            this.putQueryParameter("SourceDir", sourceDir);
            this.sourceDir = sourceDir;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SyncIntervalMinutes.
         */
        public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
            this.putQueryParameter("SyncIntervalMinutes", syncIntervalMinutes);
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateKBSyncLinkRequest build() {
            return new CreateKBSyncLinkRequest(this);
        } 

    } 

}
