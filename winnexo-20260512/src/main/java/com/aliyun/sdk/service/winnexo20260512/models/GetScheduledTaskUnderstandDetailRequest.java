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
 * {@link GetScheduledTaskUnderstandDetailRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledTaskUnderstandDetailRequest</p>
 */
public class GetScheduledTaskUnderstandDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> digitalEmployeeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("segments")
    private java.util.List<Segments> segments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userInput")
    private String userInput;

    private GetScheduledTaskUnderstandDetailRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.segments = builder.segments;
        this.tenantId = builder.tenantId;
        this.userInput = builder.userInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskUnderstandDetailRequest create() {
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
     * @return digitalEmployeeName
     */
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return segments
     */
    public java.util.List<Segments> getSegments() {
        return this.segments;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userInput
     */
    public String getUserInput() {
        return this.userInput;
    }

    public static final class Builder extends Request.Builder<GetScheduledTaskUnderstandDetailRequest, Builder> {
        private String collaborationGroupId; 
        private java.util.List<String> digitalEmployeeName; 
        private java.util.List<Segments> segments; 
        private String tenantId; 
        private String userInput; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledTaskUnderstandDetailRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.segments = request.segments;
            this.tenantId = request.tenantId;
            this.userInput = request.userInput;
        } 

        /**
         * <p>所属协作群组 ID（如 cg_101）；群任务理解时传入（调用者需为有效群成员），候选技能额外并入群绑定技能</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putQueryParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>数字员工名称列表，用于过滤可用技能；必传（传空列表表示仅用租户 global 技能）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            String digitalEmployeeNameShrink = shrink(digitalEmployeeName, "digitalEmployeeName", "json");
            this.putQueryParameter("digitalEmployeeName", digitalEmployeeNameShrink);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * segments.
         */
        public Builder segments(java.util.List<Segments> segments) {
            String segmentsShrink = shrink(segments, "segments", "json");
            this.putQueryParameter("segments", segmentsShrink);
            this.segments = segments;
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
         * <p>【接口已下线】自然语言任务描述；后端不再消费该入参，已取消必填约束</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userInput(String userInput) {
            this.putQueryParameter("userInput", userInput);
            this.userInput = userInput;
            return this;
        }

        @Override
        public GetScheduledTaskUnderstandDetailRequest build() {
            return new GetScheduledTaskUnderstandDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskUnderstandDetailRequest} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskUnderstandDetailRequest</p>
     */
    public static class Segments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public String getEnabled() {
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
            private String enabled; 
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
            public Builder enabled(String enabled) {
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
             * <p>This parameter is required.</p>
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
}
