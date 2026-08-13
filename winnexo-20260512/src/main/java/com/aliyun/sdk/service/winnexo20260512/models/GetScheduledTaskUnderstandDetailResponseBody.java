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
 * {@link GetScheduledTaskUnderstandDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskUnderstandDetailResponseBody</p>
 */
public class GetScheduledTaskUnderstandDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("relatedObjects")
    private java.util.List<RelatedObjects> relatedObjects;

    @com.aliyun.core.annotation.NameInMap("relatedSemantics")
    private java.util.List<RelatedSemantics> relatedSemantics;

    @com.aliyun.core.annotation.NameInMap("relatedSkills")
    private java.util.List<RelatedSkills> relatedSkills;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskUnderstand")
    private String taskUnderstand;

    private GetScheduledTaskUnderstandDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.relatedObjects = builder.relatedObjects;
        this.relatedSemantics = builder.relatedSemantics;
        this.relatedSkills = builder.relatedSkills;
        this.requestId = builder.requestId;
        this.taskUnderstand = builder.taskUnderstand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskUnderstandDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskUnderstand
     */
    public String getTaskUnderstand() {
        return this.taskUnderstand;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<RelatedObjects> relatedObjects; 
        private java.util.List<RelatedSemantics> relatedSemantics; 
        private java.util.List<RelatedSkills> relatedSkills; 
        private String requestId; 
        private String taskUnderstand; 

        private Builder() {
        } 

        private Builder(GetScheduledTaskUnderstandDetailResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.relatedObjects = model.relatedObjects;
            this.relatedSemantics = model.relatedSemantics;
            this.relatedSkills = model.relatedSkills;
            this.requestId = model.requestId;
            this.taskUnderstand = model.taskUnderstand;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
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
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>润色后的任务理解</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder taskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }

        public GetScheduledTaskUnderstandDetailResponseBody build() {
            return new GetScheduledTaskUnderstandDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskUnderstandDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskUnderstandDetailResponseBody</p>
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
             * <p>提及类型</p>
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
             * <p>对象 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象类型</p>
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
     * {@link GetScheduledTaskUnderstandDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskUnderstandDetailResponseBody</p>
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
     * {@link GetScheduledTaskUnderstandDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskUnderstandDetailResponseBody</p>
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
}
