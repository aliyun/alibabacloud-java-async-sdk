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
 * {@link ListSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillsResponseBody</p>
 */
public class ListSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListSkillsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListSkillsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * <p>技能列表</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>符合条件的技能总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListSkillsResponseBody build() {
            return new ListSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("executeMode")
        private String executeMode;

        @com.aliyun.core.annotation.NameInMap("globalAccess")
        private Boolean globalAccess;

        @com.aliyun.core.annotation.NameInMap("hasDraftChanges")
        private Boolean hasDraftChanges;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("skillHubDefinitionId")
        private Long skillHubDefinitionId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("updatedTime")
        private String updatedTime;

        @com.aliyun.core.annotation.NameInMap("versionNumber")
        private String versionNumber;

        private Items(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.executeMode = builder.executeMode;
            this.globalAccess = builder.globalAccess;
            this.hasDraftChanges = builder.hasDraftChanges;
            this.name = builder.name;
            this.skillCode = builder.skillCode;
            this.skillHubDefinitionId = builder.skillHubDefinitionId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updatedTime = builder.updatedTime;
            this.versionNumber = builder.versionNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return skillHubDefinitionId
         */
        public Long getSkillHubDefinitionId() {
            return this.skillHubDefinitionId;
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
         * @return versionNumber
         */
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String executeMode; 
            private Boolean globalAccess; 
            private Boolean hasDraftChanges; 
            private String name; 
            private String skillCode; 
            private Long skillHubDefinitionId; 
            private String sourceType; 
            private String status; 
            private java.util.List<String> tags; 
            private String updatedTime; 
            private String versionNumber; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.executeMode = model.executeMode;
                this.globalAccess = model.globalAccess;
                this.hasDraftChanges = model.hasDraftChanges;
                this.name = model.name;
                this.skillCode = model.skillCode;
                this.skillHubDefinitionId = model.skillHubDefinitionId;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.tags = model.tags;
                this.updatedTime = model.updatedTime;
                this.versionNumber = model.versionNumber;
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
             * <p>执行模式：CODE_AGENT / SYSTEM 等</p>
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
             * <p>技能名称（已 i18n 解析）</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>来源类型：BUILTIN / CUSTOM</p>
             * 
             * <strong>example:</strong>
             * <p>BUILTIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>技能状态：ACTIVE / DRAFT</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>标签列表（已 i18n 解析）</p>
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
             * <p>版本号</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder versionNumber(String versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
