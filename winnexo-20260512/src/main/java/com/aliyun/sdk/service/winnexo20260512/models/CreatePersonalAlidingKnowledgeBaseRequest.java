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
 * {@link CreatePersonalAlidingKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalAlidingKnowledgeBaseRequest</p>
 */
public class CreatePersonalAlidingKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kbName")
    private String kbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kbUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectBindings")
    private java.util.List<ObjectBindings> objectBindings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("syncConfig")
    private SyncConfig syncConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalAlidingKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.kbName = builder.kbName;
        this.kbUrl = builder.kbUrl;
        this.objectBindings = builder.objectBindings;
        this.operatingObjectName = builder.operatingObjectName;
        this.syncConfig = builder.syncConfig;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalAlidingKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return kbName
     */
    public String getKbName() {
        return this.kbName;
    }

    /**
     * @return kbUrl
     */
    public String getKbUrl() {
        return this.kbUrl;
    }

    /**
     * @return objectBindings
     */
    public java.util.List<ObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return syncConfig
     */
    public SyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalAlidingKnowledgeBaseRequest, Builder> {
        private String directoryId; 
        private String kbName; 
        private String kbUrl; 
        private java.util.List<ObjectBindings> objectBindings; 
        private String operatingObjectName; 
        private SyncConfig syncConfig; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalAlidingKnowledgeBaseRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.kbName = request.kbName;
            this.kbUrl = request.kbUrl;
            this.objectBindings = request.objectBindings;
            this.operatingObjectName = request.operatingObjectName;
            this.syncConfig = request.syncConfig;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目标个人目录 ID；不传时自动绑定到用户默认根目录，传入时必须是当前用户的已有个人目录（PERSONAL）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>知识库显示名称；不传时由后台从远程拉取的根节点名称回填</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder kbName(String kbName) {
            this.putBodyParameter("kbName", kbName);
            this.kbName = kbName;
            return this;
        }

        /**
         * <p>阿里钉知识库的可公开访问 URL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder kbUrl(String kbUrl) {
            this.putBodyParameter("kbUrl", kbUrl);
            this.kbUrl = kbUrl;
            return this;
        }

        /**
         * objectBindings.
         */
        public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
            String objectBindingsShrink = shrink(objectBindings, "objectBindings", "json");
            this.putBodyParameter("objectBindings", objectBindingsShrink);
            this.objectBindings = objectBindings;
            return this;
        }

        /**
         * <p>Agent 命名空间标识，可选</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * syncConfig.
         */
        public Builder syncConfig(SyncConfig syncConfig) {
            String syncConfigShrink = shrink(syncConfig, "syncConfig", "json");
            this.putBodyParameter("syncConfig", syncConfigShrink);
            this.syncConfig = syncConfig;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalAlidingKnowledgeBaseRequest build() {
            return new CreatePersonalAlidingKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePersonalAlidingKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalAlidingKnowledgeBaseRequest</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private ObjectBindings(Builder builder) {
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectBindings create() {
            return builder().build();
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String objectId; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.objectId = model.objectId;
                this.objectType = model.objectType;
            } 

            /**
             * <p>绑定对象 ID</p>
             * 
             * <strong>example:</strong>
             * <p>2676</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>绑定对象类型，例如 CUSTOMER / OPPORTUNITY</p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public ObjectBindings build() {
                return new ObjectBindings(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePersonalAlidingKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalAlidingKnowledgeBaseRequest</p>
     */
    public static class SyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private SyncConfig(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncConfig create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(SyncConfig model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
            } 

            /**
             * <p>cron 表达式；enabled=true 时必填，enabled=false 时忽略</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>是否启用定时同步</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public SyncConfig build() {
                return new SyncConfig(this);
            } 

        } 

    }
}
