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
 * {@link CreatePersonalFeishuDocRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalFeishuDocRequest</p>
 */
public class CreatePersonalFeishuDocRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectBindings")
    private java.util.List<ObjectBindings> objectBindings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("syncConfig")
    private SyncConfig syncConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalFeishuDocRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.docUrl = builder.docUrl;
        this.name = builder.name;
        this.notes = builder.notes;
        this.objectBindings = builder.objectBindings;
        this.operatingObjectName = builder.operatingObjectName;
        this.sourceTags = builder.sourceTags;
        this.syncConfig = builder.syncConfig;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalFeishuDocRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return docUrl
     */
    public String getDocUrl() {
        return this.docUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
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
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
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

    public static final class Builder extends Request.Builder<CreatePersonalFeishuDocRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String docUrl; 
        private String name; 
        private String notes; 
        private java.util.List<ObjectBindings> objectBindings; 
        private String operatingObjectName; 
        private String sourceTags; 
        private SyncConfig syncConfig; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalFeishuDocRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.docUrl = request.docUrl;
            this.name = request.name;
            this.notes = request.notes;
            this.objectBindings = request.objectBindings;
            this.operatingObjectName = request.operatingObjectName;
            this.sourceTags = request.sourceTags;
            this.syncConfig = request.syncConfig;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>资源描述</p>
         * 
         * <strong>example:</strong>
         * <p>项目设计文档</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人目录 ID；不传时使用当前用户默认个人根目录</p>
         * 
         * <strong>example:</strong>
         * <p>dir_personal_child</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>飞书 Docx 或底层为 Docx 的 Wiki HTTPS 链接</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.feishu.cn/docx/doxcnExample">https://example.feishu.cn/docx/doxcnExample</a></p>
         */
        public Builder docUrl(String docUrl) {
            this.putBodyParameter("docUrl", docUrl);
            this.docUrl = docUrl;
            return this;
        }

        /**
         * <p>资源名称；不传时同步飞书标题</p>
         * 
         * <strong>example:</strong>
         * <p>项目方案</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>分析指令</p>
         * 
         * <strong>example:</strong>
         * <p>提取决策和待办</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
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
         * <p>运营对象名称</p>
         * 
         * <strong>example:</strong>
         * <p>研发助手</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>资源标签 JSON 字符串列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;研发&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
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
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalFeishuDocRequest build() {
            return new CreatePersonalFeishuDocRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePersonalFeishuDocRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalFeishuDocRequest</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graphName")
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String objectType;

        private ObjectBindings(Builder builder) {
            this.graphName = builder.graphName;
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
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
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
            private String graphName; 
            private String objectId; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.graphName = model.graphName;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
            } 

            /**
             * <p>对象归属语义图谱名</p>
             * 
             * <strong>example:</strong>
             * <p>crm</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>绑定对象 ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>绑定对象类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
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
     * {@link CreatePersonalFeishuDocRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalFeishuDocRequest</p>
     */
    public static class SyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("preset")
        private String preset;

        private SyncConfig(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
            this.preset = builder.preset;
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

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 
            private String preset; 

            private Builder() {
            } 

            private Builder(SyncConfig model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
                this.preset = model.preset;
            } 

            /**
             * <p>五段 cron 表达式</p>
             * 
             * <strong>example:</strong>
             * <p>0 * * * *</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>是否启用定时同步</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>同步预设，默认 custom</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            public SyncConfig build() {
                return new SyncConfig(this);
            } 

        } 

    }
}
