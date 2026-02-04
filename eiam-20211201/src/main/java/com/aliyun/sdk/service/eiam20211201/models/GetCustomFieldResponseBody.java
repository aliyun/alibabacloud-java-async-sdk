// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetCustomFieldResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomFieldResponseBody</p>
 */
public class GetCustomFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomField")
    private CustomField customField;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCustomFieldResponseBody(Builder builder) {
        this.customField = builder.customField;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomFieldResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customField
     */
    public CustomField getCustomField() {
        return this.customField;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomField customField; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCustomFieldResponseBody model) {
            this.customField = model.customField;
            this.requestId = model.requestId;
        } 

        /**
         * CustomField.
         */
        public Builder customField(CustomField customField) {
            this.customField = customField;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCustomFieldResponseBody build() {
            return new GetCustomFieldResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomFieldResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomFieldResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Items(Builder builder) {
            this.displayName = builder.displayName;
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String displayName; 
            private String status; 
            private String value; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.displayName = model.displayName;
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>配置项展示名</p>
             * 
             * <strong>example:</strong>
             * <p>hobby</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>配置项状态, 枚举值，enabled、disabled</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>配置项值</p>
             * 
             * <strong>example:</strong>
             * <p>game</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomFieldResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomFieldResponseBody</p>
     */
    public static class FieldDataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private FieldDataConfig(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldDataConfig create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(FieldDataConfig model) {
                this.items = model.items;
            } 

            /**
             * <p>字段配置项列表，displayName、value、status</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public FieldDataConfig build() {
                return new FieldDataConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomFieldResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomFieldResponseBody</p>
     */
    public static class CustomField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("FieldDataConfig")
        private FieldDataConfig fieldDataConfig;

        @com.aliyun.core.annotation.NameInMap("FieldDataType")
        private String fieldDataType;

        @com.aliyun.core.annotation.NameInMap("FieldDisplayName")
        private String fieldDisplayName;

        @com.aliyun.core.annotation.NameInMap("FieldDisplayType")
        private String fieldDisplayType;

        @com.aliyun.core.annotation.NameInMap("FieldId")
        private String fieldId;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Unique")
        private Boolean unique;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserPermission")
        private String userPermission;

        private CustomField(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.encrypted = builder.encrypted;
            this.entityType = builder.entityType;
            this.fieldDataConfig = builder.fieldDataConfig;
            this.fieldDataType = builder.fieldDataType;
            this.fieldDisplayName = builder.fieldDisplayName;
            this.fieldDisplayType = builder.fieldDisplayType;
            this.fieldId = builder.fieldId;
            this.fieldName = builder.fieldName;
            this.instanceId = builder.instanceId;
            this.required = builder.required;
            this.status = builder.status;
            this.unique = builder.unique;
            this.updateTime = builder.updateTime;
            this.userPermission = builder.userPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomField create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return fieldDataConfig
         */
        public FieldDataConfig getFieldDataConfig() {
            return this.fieldDataConfig;
        }

        /**
         * @return fieldDataType
         */
        public String getFieldDataType() {
            return this.fieldDataType;
        }

        /**
         * @return fieldDisplayName
         */
        public String getFieldDisplayName() {
            return this.fieldDisplayName;
        }

        /**
         * @return fieldDisplayType
         */
        public String getFieldDisplayType() {
            return this.fieldDisplayType;
        }

        /**
         * @return fieldId
         */
        public String getFieldId() {
            return this.fieldId;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unique
         */
        public Boolean getUnique() {
            return this.unique;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userPermission
         */
        public String getUserPermission() {
            return this.userPermission;
        }

        public static final class Builder {
            private Long createTime; 
            private String defaultValue; 
            private String description; 
            private Boolean encrypted; 
            private String entityType; 
            private FieldDataConfig fieldDataConfig; 
            private String fieldDataType; 
            private String fieldDisplayName; 
            private String fieldDisplayType; 
            private String fieldId; 
            private String fieldName; 
            private String instanceId; 
            private Boolean required; 
            private String status; 
            private Boolean unique; 
            private Long updateTime; 
            private String userPermission; 

            private Builder() {
            } 

            private Builder(CustomField model) {
                this.createTime = model.createTime;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.encrypted = model.encrypted;
                this.entityType = model.entityType;
                this.fieldDataConfig = model.fieldDataConfig;
                this.fieldDataType = model.fieldDataType;
                this.fieldDisplayName = model.fieldDisplayName;
                this.fieldDisplayType = model.fieldDisplayType;
                this.fieldId = model.fieldId;
                this.fieldName = model.fieldName;
                this.instanceId = model.instanceId;
                this.required = model.required;
                this.status = model.status;
                this.unique = model.unique;
                this.updateTime = model.updateTime;
                this.userPermission = model.userPermission;
            } 

            /**
             * <p>扩展字段创建时间，Unix时间戳格式，单位为毫秒</p>
             * 
             * <strong>example:</strong>
             * <p>17642960730</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>字段默认值</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>扩展字段描述</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>是否加密，默认false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>字段所属实体类型</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>字段值配置项</p>
             */
            public Builder fieldDataConfig(FieldDataConfig fieldDataConfig) {
                this.fieldDataConfig = fieldDataConfig;
                return this;
            }

            /**
             * <p>数据类型，枚举值：string、number、boolean</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder fieldDataType(String fieldDataType) {
                this.fieldDataType = fieldDataType;
                return this;
            }

            /**
             * <p>字段展示名</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder fieldDisplayName(String fieldDisplayName) {
                this.fieldDisplayName = fieldDisplayName;
                return this;
            }

            /**
             * <p>字段展示类型，枚举值，select、checkbox、input、number</p>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder fieldDisplayType(String fieldDisplayType) {
                this.fieldDisplayType = fieldDisplayType;
                return this;
            }

            /**
             * <p>字段ID</p>
             * 
             * <strong>example:</strong>
             * <p>ufd_ncvy5trszg3zajaal5iofauy2q</p>
             */
            public Builder fieldId(String fieldId) {
                this.fieldId = fieldId;
                return this;
            }

            /**
             * <p>字段标识</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_z4pwq7v5ankdimdelzo2zbmzo4</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>是否必填，默认false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>扩展字段状态, 枚举类型：enabled，disabled</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>是否唯一，默认false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder unique(Boolean unique) {
                this.unique = unique;
                return this;
            }

            /**
             * <p>扩展字段最近一次更新时间, Unix时间戳格式，单位为毫秒</p>
             * 
             * <strong>example:</strong>
             * <p>17642960730</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>用户端(portal侧)权限，hide、read_only、read_write，默认read_only</p>
             * 
             * <strong>example:</strong>
             * <p>read_only</p>
             */
            public Builder userPermission(String userPermission) {
                this.userPermission = userPermission;
                return this;
            }

            public CustomField build() {
                return new CustomField(this);
            } 

        } 

    }
}
