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
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private java.util.List<Description> description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private java.util.List<String> digitalEmployeeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isOpen")
    private Boolean isOpen;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("segments")
    private java.util.List<Segments> segments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDetail")
    private TaskDetail taskDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    private TriggerConfig triggerConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibility")
    private String visibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibleMemberUserIds")
    private java.util.List<String> visibleMemberUserIds;

    private CreateScheduledTaskRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.description = builder.description;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.isOpen = builder.isOpen;
        this.model = builder.model;
        this.name = builder.name;
        this.segments = builder.segments;
        this.taskDetail = builder.taskDetail;
        this.tenantId = builder.tenantId;
        this.triggerConfig = builder.triggerConfig;
        this.visibility = builder.visibility;
        this.visibleMemberUserIds = builder.visibleMemberUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return description
     */
    public java.util.List<Description> getDescription() {
        return this.description;
    }

    /**
     * @return digitalEmployeeName
     */
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return segments
     */
    public java.util.List<Segments> getSegments() {
        return this.segments;
    }

    /**
     * @return taskDetail
     */
    public TaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return triggerConfig
     */
    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return visibleMemberUserIds
     */
    public java.util.List<String> getVisibleMemberUserIds() {
        return this.visibleMemberUserIds;
    }

    public static final class Builder extends Request.Builder<CreateScheduledTaskRequest, Builder> {
        private String collaborationGroupId; 
        private java.util.List<Description> description; 
        private java.util.List<String> digitalEmployeeName; 
        private Boolean isOpen; 
        private String model; 
        private String name; 
        private java.util.List<Segments> segments; 
        private TaskDetail taskDetail; 
        private String tenantId; 
        private TriggerConfig triggerConfig; 
        private String visibility; 
        private java.util.List<String> visibleMemberUserIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledTaskRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.description = request.description;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.isOpen = request.isOpen;
            this.model = request.model;
            this.name = request.name;
            this.segments = request.segments;
            this.taskDetail = request.taskDetail;
            this.tenantId = request.tenantId;
            this.triggerConfig = request.triggerConfig;
            this.visibility = request.visibility;
            this.visibleMemberUserIds = request.visibleMemberUserIds;
        } 

        /**
         * <p>所属协作群组 ID（如 cg_101）；传入时创建群空间任务（调用者需为有效群成员），为空创建个人任务</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(java.util.List<Description> description) {
            String descriptionShrink = shrink(description, "description", "json");
            this.putBodyParameter("description", descriptionShrink);
            this.description = description;
            return this;
        }

        /**
         * <p>数字员工名称列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            String digitalEmployeeNameShrink = shrink(digitalEmployeeName, "digitalEmployeeName", "json");
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeNameShrink);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>是否公开访问</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isOpen(Boolean isOpen) {
            this.putBodyParameter("isOpen", isOpen);
            this.isOpen = isOpen;
            return this;
        }

        /**
         * <p>执行模型档位，不传默认 standard</p>
         * 
         * <strong>example:</strong>
         * <p>quick</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>文件名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * segments.
         */
        public Builder segments(java.util.List<Segments> segments) {
            String segmentsShrink = shrink(segments, "segments", "json");
            this.putBodyParameter("segments", segmentsShrink);
            this.segments = segments;
            return this;
        }

        /**
         * taskDetail.
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            String taskDetailShrink = shrink(taskDetail, "taskDetail", "json");
            this.putBodyParameter("taskDetail", taskDetailShrink);
            this.taskDetail = taskDetail;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * triggerConfig.
         */
        public Builder triggerConfig(TriggerConfig triggerConfig) {
            String triggerConfigShrink = shrink(triggerConfig, "triggerConfig", "json");
            this.putBodyParameter("triggerConfig", triggerConfigShrink);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>群任务可见范围：PRIVATE(仅创建人与群主可见)/COLLABORATIVE(指定协作成员可见)/PUBLIC(群内全员可见)；群任务不传时默认 PRIVATE，个人任务忽略该字段</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * <p>协作成员用户 ID 列表（仅 visibility=COLLABORATIVE 生效，其余档位忽略，最多 1000 个）；任务创建人与群创建人无需传入（由鉴权层覆盖）；个人任务忽略该字段</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder visibleMemberUserIds(java.util.List<String> visibleMemberUserIds) {
            String visibleMemberUserIdsShrink = shrink(visibleMemberUserIds, "visibleMemberUserIds", "json");
            this.putBodyParameter("visibleMemberUserIds", visibleMemberUserIdsShrink);
            this.visibleMemberUserIds = visibleMemberUserIds;
            return this;
        }

        @Override
        public CreateScheduledTaskRequest build() {
            return new CreateScheduledTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class Description extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Description(Builder builder) {
            this.content = builder.content;
            this.enabled = builder.enabled;
            this.name = builder.name;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
            this.skillCode = builder.skillCode;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        /**
         * @return skillCode
         */
        public String getSkillCode() {
            return this.skillCode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private Boolean enabled; 
            private String name; 
            private String objectId; 
            private String objectType; 
            private String skillCode; 
            private String type; 

            private Builder() {
            } 

            private Builder(Description model) {
                this.content = model.content;
                this.enabled = model.enabled;
                this.name = model.name;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
                this.skillCode = model.skillCode;
                this.type = model.type;
            } 

            /**
             * <p>文本内容，type=text 时必填</p>
             * 
             * <strong>example:</strong>
             * <p>示例内容</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>功能开关，type=web_search 时可选</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>对象 ID，type=mention 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象类型如 customer，type=mention 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>技能编码，type=skill 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>元素类型：text|web_search|mention|skill</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class Segments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Segments(Builder builder) {
            this.content = builder.content;
            this.enabled = builder.enabled;
            this.name = builder.name;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
            this.skillCode = builder.skillCode;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segments create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        /**
         * @return skillCode
         */
        public String getSkillCode() {
            return this.skillCode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private Boolean enabled; 
            private String name; 
            private String objectId; 
            private String objectType; 
            private String skillCode; 
            private String type; 

            private Builder() {
            } 

            private Builder(Segments model) {
                this.content = model.content;
                this.enabled = model.enabled;
                this.name = model.name;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
                this.skillCode = model.skillCode;
                this.type = model.type;
            } 

            /**
             * <p>文本内容，type=text 时必填</p>
             * 
             * <strong>example:</strong>
             * <p>示例内容</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>功能开关，type=web_search 时可选</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>对象 ID，type=mention 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象类型如 customer，type=mention 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>技能编码，type=skill 时有值</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>元素类型：text|web_search|mention|skill</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Segments build() {
                return new Segments(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class RelatedObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mentionType")
        private String mentionType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private RelatedObjects(Builder builder) {
            this.mentionType = builder.mentionType;
            this.name = builder.name;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedObjects create() {
            return builder().build();
        }

        /**
         * @return mentionType
         */
        public String getMentionType() {
            return this.mentionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String mentionType; 
            private String name; 
            private String objectId; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(RelatedObjects model) {
                this.mentionType = model.mentionType;
                this.name = model.name;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
            } 

            /**
             * <p>提及类型，如 objects</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder mentionType(String mentionType) {
                this.mentionType = mentionType;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>对象 ID（@指定时有值）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象类型，如 customer、company</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public RelatedObjects build() {
                return new RelatedObjects(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class RelatedSemantics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("entity")
        private String entity;

        private RelatedSemantics(Builder builder) {
            this.attributes = builder.attributes;
            this.entity = builder.entity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedSemantics create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return entity
         */
        public String getEntity() {
            return this.entity;
        }

        public static final class Builder {
            private String attributes; 
            private String entity; 

            private Builder() {
            } 

            private Builder(RelatedSemantics model) {
                this.attributes = model.attributes;
                this.entity = model.entity;
            } 

            /**
             * <p>语义属性（JSON 字符串），用于语义检索时过滤</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>语义实体名，如客户/机会</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder entity(String entity) {
                this.entity = entity;
                return this;
            }

            public RelatedSemantics build() {
                return new RelatedSemantics(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class RelatedSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("sourceIds")
        private java.util.List<String> sourceIds;

        private RelatedSkills(Builder builder) {
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.skillCode = builder.skillCode;
            this.sourceIds = builder.sourceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedSkills create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillCode
         */
        public String getSkillCode() {
            return this.skillCode;
        }

        /**
         * @return sourceIds
         */
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public static final class Builder {
            private String displayName; 
            private String name; 
            private String skillCode; 
            private java.util.List<String> sourceIds; 

            private Builder() {
            } 

            private Builder(RelatedSkills model) {
                this.displayName = model.displayName;
                this.name = model.name;
                this.skillCode = model.skillCode;
                this.sourceIds = model.sourceIds;
            } 

            /**
             * <p>技能展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>技能代码</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>sourceIds</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceIds(java.util.List<String> sourceIds) {
                this.sourceIds = sourceIds;
                return this;
            }

            public RelatedSkills build() {
                return new RelatedSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("relatedObjects")
        private java.util.List<RelatedObjects> relatedObjects;

        @com.aliyun.core.annotation.NameInMap("relatedSemantics")
        private java.util.List<RelatedSemantics> relatedSemantics;

        @com.aliyun.core.annotation.NameInMap("relatedSkills")
        private java.util.List<RelatedSkills> relatedSkills;

        @com.aliyun.core.annotation.NameInMap("taskUnderstand")
        private String taskUnderstand;

        private TaskDetail(Builder builder) {
            this.relatedObjects = builder.relatedObjects;
            this.relatedSemantics = builder.relatedSemantics;
            this.relatedSkills = builder.relatedSkills;
            this.taskUnderstand = builder.taskUnderstand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetail create() {
            return builder().build();
        }

        /**
         * @return relatedObjects
         */
        public java.util.List<RelatedObjects> getRelatedObjects() {
            return this.relatedObjects;
        }

        /**
         * @return relatedSemantics
         */
        public java.util.List<RelatedSemantics> getRelatedSemantics() {
            return this.relatedSemantics;
        }

        /**
         * @return relatedSkills
         */
        public java.util.List<RelatedSkills> getRelatedSkills() {
            return this.relatedSkills;
        }

        /**
         * @return taskUnderstand
         */
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        public static final class Builder {
            private java.util.List<RelatedObjects> relatedObjects; 
            private java.util.List<RelatedSemantics> relatedSemantics; 
            private java.util.List<RelatedSkills> relatedSkills; 
            private String taskUnderstand; 

            private Builder() {
            } 

            private Builder(TaskDetail model) {
                this.relatedObjects = model.relatedObjects;
                this.relatedSemantics = model.relatedSemantics;
                this.relatedSkills = model.relatedSkills;
                this.taskUnderstand = model.taskUnderstand;
            } 

            /**
             * relatedObjects.
             */
            public Builder relatedObjects(java.util.List<RelatedObjects> relatedObjects) {
                this.relatedObjects = relatedObjects;
                return this;
            }

            /**
             * relatedSemantics.
             */
            public Builder relatedSemantics(java.util.List<RelatedSemantics> relatedSemantics) {
                this.relatedSemantics = relatedSemantics;
                return this;
            }

            /**
             * relatedSkills.
             */
            public Builder relatedSkills(java.util.List<RelatedSkills> relatedSkills) {
                this.relatedSkills = relatedSkills;
                return this;
            }

            /**
             * <p>【已废弃】任务理解描述；任务理解功能已下线，服务端接收后忽略该字段，仅为存量调用方入参兼容保留</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder taskUnderstand(String taskUnderstand) {
                this.taskUnderstand = taskUnderstand;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class PushConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("contentScope")
        private String contentScope;

        @com.aliyun.core.annotation.NameInMap("deliveryMethod")
        private String deliveryMethod;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("fileFormat")
        private String fileFormat;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private String operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("receiverType")
        private String receiverType;

        private PushConfig(Builder builder) {
            this.channelType = builder.channelType;
            this.contentScope = builder.contentScope;
            this.deliveryMethod = builder.deliveryMethod;
            this.enabled = builder.enabled;
            this.fileFormat = builder.fileFormat;
            this.operatingObjectName = builder.operatingObjectName;
            this.receiverType = builder.receiverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushConfig create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return contentScope
         */
        public String getContentScope() {
            return this.contentScope;
        }

        /**
         * @return deliveryMethod
         */
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return operatingObjectName
         */
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        public static final class Builder {
            private String channelType; 
            private String contentScope; 
            private String deliveryMethod; 
            private Boolean enabled; 
            private String fileFormat; 
            private String operatingObjectName; 
            private String receiverType; 

            private Builder() {
            } 

            private Builder(PushConfig model) {
                this.channelType = model.channelType;
                this.contentScope = model.contentScope;
                this.deliveryMethod = model.deliveryMethod;
                this.enabled = model.enabled;
                this.fileFormat = model.fileFormat;
                this.operatingObjectName = model.operatingObjectName;
                this.receiverType = model.receiverType;
            } 

            /**
             * <p>推送渠道</p>
             * 
             * <strong>example:</strong>
             * <p>DINGTALK</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>推送内容范围，默认 all_replies</p>
             * 
             * <strong>example:</strong>
             * <p>all_replies</p>
             */
            public Builder contentScope(String contentScope) {
                this.contentScope = contentScope;
                return this;
            }

            /**
             * <p>推送方式，默认 channel_bot</p>
             * 
             * <strong>example:</strong>
             * <p>channel_bot</p>
             */
            public Builder deliveryMethod(String deliveryMethod) {
                this.deliveryMethod = deliveryMethod;
                return this;
            }

            /**
             * <p>是否推送该频道，默认关闭</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>产出文件推送格式，默认 file</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>发送机器人所属数字员工，必传且不可为空</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>接收人，当前仅支持 self</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            public PushConfig build() {
                return new PushConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
     */
    public static class TriggerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("pushConfig")
        private java.util.List<PushConfig> pushConfig;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("triggerMode")
        private String triggerMode;

        private TriggerConfig(Builder builder) {
            this.cron = builder.cron;
            this.language = builder.language;
            this.pushConfig = builder.pushConfig;
            this.timezone = builder.timezone;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return pushConfig
         */
        public java.util.List<PushConfig> getPushConfig() {
            return this.pushConfig;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String cron; 
            private String language; 
            private java.util.List<PushConfig> pushConfig; 
            private String timezone; 
            private String triggerMode; 

            private Builder() {
            } 

            private Builder(TriggerConfig model) {
                this.cron = model.cron;
                this.language = model.language;
                this.pushConfig = model.pushConfig;
                this.timezone = model.timezone;
                this.triggerMode = model.triggerMode;
            } 

            /**
             * <p>Cron 表达式，trigger_mode=scheduled 时必填，如 &quot;00 09 * * *&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>语言如 zh-CN|en-US，由服务端自动注入</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>任务推送频道列表；为空或无启用频道时不推送</p>
             */
            public Builder pushConfig(java.util.List<PushConfig> pushConfig) {
                this.pushConfig = pushConfig;
                return this;
            }

            /**
             * <p>时区如 Asia/Shanghai，由服务端自动注入</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>触发模式：manual|scheduled</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
}
