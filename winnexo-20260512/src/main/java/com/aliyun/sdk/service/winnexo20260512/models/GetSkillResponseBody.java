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
 * {@link GetSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillResponseBody</p>
 */
public class GetSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("arguments")
    private java.util.List<Arguments> arguments;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("detailLogic")
    private String detailLogic;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("executeMode")
    private String executeMode;

    @com.aliyun.core.annotation.NameInMap("globalAccess")
    private Boolean globalAccess;

    @com.aliyun.core.annotation.NameInMap("hasDraftChanges")
    private Boolean hasDraftChanges;

    @com.aliyun.core.annotation.NameInMap("inputConfig")
    private String inputConfig;

    @com.aliyun.core.annotation.NameInMap("inputConfigFormatted")
    private java.util.List<java.util.Map<String, ?>> inputConfigFormatted;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skillCode")
    private String skillCode;

    @com.aliyun.core.annotation.NameInMap("skillFiles")
    private java.util.List<java.util.Map<String, ?>> skillFiles;

    @com.aliyun.core.annotation.NameInMap("skillHubDefinitionId")
    private Long skillHubDefinitionId;

    @com.aliyun.core.annotation.NameInMap("skillMdSummary")
    private String skillMdSummary;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("updatedTime")
    private String updatedTime;

    @com.aliyun.core.annotation.NameInMap("versionCount")
    private Long versionCount;

    @com.aliyun.core.annotation.NameInMap("versionNumber")
    private String versionNumber;

    private GetSkillResponseBody(Builder builder) {
        this.arguments = builder.arguments;
        this.code = builder.code;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.detailLogic = builder.detailLogic;
        this.displayName = builder.displayName;
        this.executeMode = builder.executeMode;
        this.globalAccess = builder.globalAccess;
        this.hasDraftChanges = builder.hasDraftChanges;
        this.inputConfig = builder.inputConfig;
        this.inputConfigFormatted = builder.inputConfigFormatted;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.skillCode = builder.skillCode;
        this.skillFiles = builder.skillFiles;
        this.skillHubDefinitionId = builder.skillHubDefinitionId;
        this.skillMdSummary = builder.skillMdSummary;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.tags = builder.tags;
        this.updatedTime = builder.updatedTime;
        this.versionCount = builder.versionCount;
        this.versionNumber = builder.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arguments
     */
    public java.util.List<Arguments> getArguments() {
        return this.arguments;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detailLogic
     */
    public String getDetailLogic() {
        return this.detailLogic;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return executeMode
     */
    public String getExecuteMode() {
        return this.executeMode;
    }

    /**
     * @return globalAccess
     */
    public Boolean getGlobalAccess() {
        return this.globalAccess;
    }

    /**
     * @return hasDraftChanges
     */
    public Boolean getHasDraftChanges() {
        return this.hasDraftChanges;
    }

    /**
     * @return inputConfig
     */
    public String getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return inputConfigFormatted
     */
    public java.util.List<java.util.Map<String, ?>> getInputConfigFormatted() {
        return this.inputConfigFormatted;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillCode
     */
    public String getSkillCode() {
        return this.skillCode;
    }

    /**
     * @return skillFiles
     */
    public java.util.List<java.util.Map<String, ?>> getSkillFiles() {
        return this.skillFiles;
    }

    /**
     * @return skillHubDefinitionId
     */
    public Long getSkillHubDefinitionId() {
        return this.skillHubDefinitionId;
    }

    /**
     * @return skillMdSummary
     */
    public String getSkillMdSummary() {
        return this.skillMdSummary;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @return versionCount
     */
    public Long getVersionCount() {
        return this.versionCount;
    }

    /**
     * @return versionNumber
     */
    public String getVersionNumber() {
        return this.versionNumber;
    }

    public static final class Builder {
        private java.util.List<Arguments> arguments; 
        private String code; 
        private String createdTime; 
        private String description; 
        private String detailLogic; 
        private String displayName; 
        private String executeMode; 
        private Boolean globalAccess; 
        private Boolean hasDraftChanges; 
        private String inputConfig; 
        private java.util.List<java.util.Map<String, ?>> inputConfigFormatted; 
        private String message; 
        private String name; 
        private String requestId; 
        private String skillCode; 
        private java.util.List<java.util.Map<String, ?>> skillFiles; 
        private Long skillHubDefinitionId; 
        private String skillMdSummary; 
        private String sourceType; 
        private String status; 
        private java.util.List<String> tags; 
        private String updatedTime; 
        private Long versionCount; 
        private String versionNumber; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.arguments = model.arguments;
            this.code = model.code;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.detailLogic = model.detailLogic;
            this.displayName = model.displayName;
            this.executeMode = model.executeMode;
            this.globalAccess = model.globalAccess;
            this.hasDraftChanges = model.hasDraftChanges;
            this.inputConfig = model.inputConfig;
            this.inputConfigFormatted = model.inputConfigFormatted;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.skillCode = model.skillCode;
            this.skillFiles = model.skillFiles;
            this.skillHubDefinitionId = model.skillHubDefinitionId;
            this.skillMdSummary = model.skillMdSummary;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.tags = model.tags;
            this.updatedTime = model.updatedTime;
            this.versionCount = model.versionCount;
            this.versionNumber = model.versionNumber;
        } 

        /**
         * arguments.
         */
        public Builder arguments(java.util.List<Arguments> arguments) {
            this.arguments = arguments;
            return this;
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
         * <p>创建时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>技能描述（已 i18n 解析）</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>技能详细逻辑</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder detailLogic(String detailLogic) {
            this.detailLogic = detailLogic;
            return this;
        }

        /**
         * <p>展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>执行模式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder executeMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }

        /**
         * <p>是否全局可访问</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder globalAccess(Boolean globalAccess) {
            this.globalAccess = globalAccess;
            return this;
        }

        /**
         * <p>是否存在未发布的草稿修改</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasDraftChanges(Boolean hasDraftChanges) {
            this.hasDraftChanges = hasDraftChanges;
            return this;
        }

        /**
         * <p>入参配置原文</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * inputConfigFormatted.
         */
        public Builder inputConfigFormatted(java.util.List<java.util.Map<String, ?>> inputConfigFormatted) {
            this.inputConfigFormatted = inputConfigFormatted;
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
         * <p>技能编码（全局唯一）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }

        /**
         * skillFiles.
         */
        public Builder skillFiles(java.util.List<java.util.Map<String, ?>> skillFiles) {
            this.skillFiles = skillFiles;
            return this;
        }

        /**
         * <p>技能定义 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skillHubDefinitionId(Long skillHubDefinitionId) {
            this.skillHubDefinitionId = skillHubDefinitionId;
            return this;
        }

        /**
         * <p>SKILL.md 简介（由 LLM 生成）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillMdSummary(String skillMdSummary) {
            this.skillMdSummary = skillMdSummary;
            return this;
        }

        /**
         * <p>来源类型: BUILTIN / CUSTOM</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>技能状态: ACTIVE / DRAFT</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>tags</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>修改时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        /**
         * <p>版本总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionCount(Long versionCount) {
            this.versionCount = versionCount;
            return this;
        }

        /**
         * <p>版本号</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder versionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public GetSkillResponseBody build() {
            return new GetSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillResponseBody</p>
     */
    public static class Arguments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("default")
        private String _default;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enum")
        private java.util.List<String> _enum;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Arguments(Builder builder) {
            this._default = builder._default;
            this.description = builder.description;
            this._enum = builder._enum;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arguments create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return _enum
         */
        public java.util.List<String> get_enum() {
            return this._enum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String _default; 
            private String description; 
            private java.util.List<String> _enum; 
            private String name; 
            private Boolean required; 
            private String type; 

            private Builder() {
            } 

            private Builder(Arguments model) {
                this._default = model._default;
                this.description = model.description;
                this._enum = model._enum;
                this.name = model.name;
                this.required = model.required;
                this.type = model.type;
            } 

            /**
             * <p>默认值</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>参数说明</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>enum</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder _enum(java.util.List<String> _enum) {
                this._enum = _enum;
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
             * <p>是否必填</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>参数类型: string / number / boolean / array</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Arguments build() {
                return new Arguments(this);
            } 

        } 

    }
}
