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
         * <p>The ID of the collaboration group (such as cg_101). If specified, a group space task is created (the caller must be a valid group member). If empty, a personal task is created.</p>
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
         * <p>The description of the to-do card type.</p>
         */
        public Builder description(java.util.List<Description> description) {
            String descriptionShrink = shrink(description, "description", "json");
            this.putBodyParameter("description", descriptionShrink);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the current effective digital employee. This parameter is empty if not configured.</p>
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
         * <p>Specifies whether public access is enabled.</p>
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
         * <p>The large model used by the assistant. An empty value indicates that DingTalk automatically selects the model.</p>
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
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The site ID.</p>
         */
        public Builder segments(java.util.List<Segments> segments) {
            String segmentsShrink = shrink(segments, "segments", "json");
            this.putBodyParameter("segments", segmentsShrink);
            this.segments = segments;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            String taskDetailShrink = shrink(taskDetail, "taskDetail", "json");
            this.putBodyParameter("taskDetail", taskDetailShrink);
            this.taskDetail = taskDetail;
            return this;
        }

        /**
         * <p>The ID of the effective tenant.</p>
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
         * <p>The trigger configuration. The configuration varies depending on the trigger type. For the specific format, refer to the following data structures:</p>
         * <ul>
         * <li>OSS trigger: See <a href="https://help.aliyun.com/document_detail/415697.html">OSSTriggerConfig</a>.</li>
         * <li>Simple Log Service trigger: See <a href="https://help.aliyun.com/document_detail/415694.html">LogTriggerConfig</a>.</li>
         * <li>Time trigger: See <a href="https://help.aliyun.com/document_detail/415712.html">TimeTriggerConfig</a>.</li>
         * <li>HTTP trigger: See <a href="https://help.aliyun.com/document_detail/415685.html">HTTPTriggerConfig</a>.</li>
         * <li>Tablestore trigger: You only need to specify the complete <strong>SourceArn</strong> parameter. No additional configuration is required. Set the value to an empty object {}.</li>
         * <li>CDN event trigger: See <a href="https://help.aliyun.com/document_detail/415674.html">CDNEventsTriggerConfig</a>.</li>
         * <li>MNS topic trigger: See <a href="https://help.aliyun.com/document_detail/415695.html">MnsTopicTriggerConfig</a>.</li>
         * <li>EventBridge trigger: See <a href="https://help.aliyun.com/document_detail/2508622.html">EventBridgeTriggerConfig</a>.</li>
         * </ul>
         */
        public Builder triggerConfig(TriggerConfig triggerConfig) {
            String triggerConfigShrink = shrink(triggerConfig, "triggerConfig", "json");
            this.putBodyParameter("triggerConfig", triggerConfigShrink);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>The visibility scope of the group task. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaborators), and PUBLIC (visible to all group members). Default value for group tasks: PRIVATE. This parameter is ignored for personal tasks.</p>
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
         * <p>The list of collaborator user IDs. This parameter takes effect only when visibility is set to COLLABORATIVE. It is ignored for other visibility levels. A maximum of 1000 IDs are supported. The task creator and group creator do not need to be included (covered by the authentication layer). This parameter is ignored for personal tasks.</p>
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
             * <p>The streaming output message.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Specifies whether the throttling rule is enabled. A value of true indicates enabled, and a value of false indicates disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The object ID. Pass the project task ID.</p>
             * <ul>
             * <li><p>For internal enterprise applications, use the taskId obtained by calling the <a href="https://open.dingtalk.com/document/orgapp-server/create-a-project-task">Create a project task</a> operation.</p>
             * </li>
             * <li><p>For third-party enterprise applications, use the taskId obtained by calling the <a href="https://open.dingtalk.com/document/isvapp-server/create-a-project-task">Create a project task</a> operation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The object type. Fixed value: task, indicating a project task.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The skill code. This parameter has a value when type is set to skill.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>The HTTP API type. Valid values: Http (standard HTTP API), Rest (RESTful API), WebSocket (WebSocket API), HttpIngress (HTTP API accessed through Ingress), LLM (large language model API), and Agent (Agent proxy API).</p>
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
             * <p>The card callback content.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Specifies whether to enable this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a micro-application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The customer type to save.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The skill code. This parameter has a value when type is set to skill.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>The billing type. Only fixed is supported.</p>
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
             * <p>The mention type, such as objects.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder mentionType(String mentionType) {
                this.mentionType = mentionType;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The object ID. Pass the project task ID.</p>
             * <ul>
             * <li><p>For internal enterprise applications, use the taskId obtained by calling the <a href="https://open.dingtalk.com/document/orgapp-server/create-a-project-task">Create a project task</a> operation.</p>
             * </li>
             * <li><p>For third-party enterprise applications, use the taskId obtained by calling the <a href="https://open.dingtalk.com/document/isvapp-server/create-a-project-task">Create a project task</a> operation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The relationship type. Valid values:</p>
             * <ul>
             * <li>crm_customer: enterprise customer.</li>
             * <li>crm_customer_personal: individual customer.</li>
             * </ul>
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
             * <p>The file extension information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The semantic entity name, such as customer or opportunity.</p>
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
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The skill code.</p>
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
             * <p>The related objects.</p>
             */
            public Builder relatedObjects(java.util.List<RelatedObjects> relatedObjects) {
                this.relatedObjects = relatedObjects;
                return this;
            }

            /**
             * <p>The related semantics.</p>
             */
            public Builder relatedSemantics(java.util.List<RelatedSemantics> relatedSemantics) {
                this.relatedSemantics = relatedSemantics;
                return this;
            }

            /**
             * <p>The related skills.</p>
             */
            public Builder relatedSkills(java.util.List<RelatedSkills> relatedSkills) {
                this.relatedSkills = relatedSkills;
                return this;
            }

            /**
             * <p>The task understanding description polished by the LLM.</p>
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
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li><strong>hdm_alarm_sms</strong>: SMS.</li>
             * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
             * <li><strong>hdm_alarm_sms_and_email</strong>: SMS and email.</li>
             * <li><strong>hdm_alarm_sms,dingtalk</strong>: SMS and DingTalk chatbot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DINGTALK</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The push content scope. Default value: all_replies.</p>
             * 
             * <strong>example:</strong>
             * <p>all_replies</p>
             */
            public Builder contentScope(String contentScope) {
                this.contentScope = contentScope;
                return this;
            }

            /**
             * <p>The push method. Default value: channel_bot.</p>
             * 
             * <strong>example:</strong>
             * <p>channel_bot</p>
             */
            public Builder deliveryMethod(String deliveryMethod) {
                this.deliveryMethod = deliveryMethod;
                return this;
            }

            /**
             * <p>Specifies whether the credential is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The file format. Valid values: Excel and CSV.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>The digital employee name (operating object name, optional).</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>The file receiver type. Valid values:</p>
             * <ul>
             * <li><p>0: One-on-one chat.</p>
             * </li>
             * <li><p>1: Group chat.</p>
             * </li>
             * <li><p>2: DingTalk Drive.</p>
             * </li>
             * <li><p>3: Document.</p>
             * </li>
             * </ul>
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
             * <p>The periodic training information in cron syntax (Minutes Hours DayofMonth Month DayofWeek). An empty value indicates that periodic training is not performed (default). In DayofWeek, 0 indicates Sunday.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The language. Valid values:</p>
             * <ul>
             * <li>zh_CN: Chinese (default)</li>
             * <li>en_US: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The list of task push channels. No push is performed if the list is empty or no channel is enabled.</p>
             */
            public Builder pushConfig(java.util.List<PushConfig> pushConfig) {
                this.pushConfig = pushConfig;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger mode.</p>
             * <p>  1: Manual trigger</p>
             * <p>  2: Scheduled trigger </p>
             * <p>  3: Code commit trigger</p>
             * <p>  5: Pipeline trigger</p>
             * <p>  6: WEBHOOK trigger</p>
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
