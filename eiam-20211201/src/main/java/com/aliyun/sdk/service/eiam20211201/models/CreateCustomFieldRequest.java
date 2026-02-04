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
 * {@link CreateCustomFieldRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomFieldRequest</p>
 */
public class CreateCustomFieldRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldDataConfig")
    private FieldDataConfig fieldDataConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldDataType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String fieldDataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldDisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldDisplayType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String fieldDisplayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Required")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Boolean required;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unique")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Boolean unique;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPermission")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String userPermission;

    private CreateCustomFieldRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.encrypted = builder.encrypted;
        this.entityType = builder.entityType;
        this.fieldDataConfig = builder.fieldDataConfig;
        this.fieldDataType = builder.fieldDataType;
        this.fieldDisplayName = builder.fieldDisplayName;
        this.fieldDisplayType = builder.fieldDisplayType;
        this.fieldName = builder.fieldName;
        this.instanceId = builder.instanceId;
        this.required = builder.required;
        this.unique = builder.unique;
        this.userPermission = builder.userPermission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomFieldRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return unique
     */
    public Boolean getUnique() {
        return this.unique;
    }

    /**
     * @return userPermission
     */
    public String getUserPermission() {
        return this.userPermission;
    }

    public static final class Builder extends Request.Builder<CreateCustomFieldRequest, Builder> {
        private String regionId; 
        private String defaultValue; 
        private String description; 
        private Boolean encrypted; 
        private String entityType; 
        private FieldDataConfig fieldDataConfig; 
        private String fieldDataType; 
        private String fieldDisplayName; 
        private String fieldDisplayType; 
        private String fieldName; 
        private String instanceId; 
        private Boolean required; 
        private Boolean unique; 
        private String userPermission; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomFieldRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defaultValue = request.defaultValue;
            this.description = request.description;
            this.encrypted = request.encrypted;
            this.entityType = request.entityType;
            this.fieldDataConfig = request.fieldDataConfig;
            this.fieldDataType = request.fieldDataType;
            this.fieldDisplayName = request.fieldDisplayName;
            this.fieldDisplayType = request.fieldDisplayType;
            this.fieldName = request.fieldName;
            this.instanceId = request.instanceId;
            this.required = request.required;
            this.unique = request.unique;
            this.userPermission = request.userPermission;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>字段默认值，必须与数据类型一致</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        public Builder defaultValue(String defaultValue) {
            this.putQueryParameter("DefaultValue", defaultValue);
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * <p>对字段的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>字段测试</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
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
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>字段归属实体。实体包括账户、组、组织</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>字段值配置项，必须与数据类型一致</p>
         */
        public Builder fieldDataConfig(FieldDataConfig fieldDataConfig) {
            this.putQueryParameter("FieldDataConfig", fieldDataConfig);
            this.fieldDataConfig = fieldDataConfig;
            return this;
        }

        /**
         * <p>数据类型，枚举值：string、number、boolean</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        public Builder fieldDataType(String fieldDataType) {
            this.putQueryParameter("FieldDataType", fieldDataType);
            this.fieldDataType = fieldDataType;
            return this;
        }

        /**
         * <p>字段展示名，长度不超过128字符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name_001</p>
         */
        public Builder fieldDisplayName(String fieldDisplayName) {
            this.putQueryParameter("FieldDisplayName", fieldDisplayName);
            this.fieldDisplayName = fieldDisplayName;
            return this;
        }

        /**
         * <p>字段展示类型，枚举值，select、checkbox、input</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        public Builder fieldDisplayType(String fieldDisplayType) {
            this.putQueryParameter("FieldDisplayType", fieldDisplayType);
            this.fieldDisplayType = fieldDisplayType;
            return this;
        }

        /**
         * <p>字段标识，英文字母、下划线</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>field_001</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
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
            this.putQueryParameter("Required", required);
            this.required = required;
            return this;
        }

        /**
         * <p>是否唯一，默认false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder unique(Boolean unique) {
            this.putQueryParameter("Unique", unique);
            this.unique = unique;
            return this;
        }

        /**
         * <p>用户端(portal侧)权限，hide、read_only、read_write，默认read_only</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder userPermission(String userPermission) {
            this.putQueryParameter("UserPermission", userPermission);
            this.userPermission = userPermission;
            return this;
        }

        @Override
        public CreateCustomFieldRequest build() {
            return new CreateCustomFieldRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomFieldRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomFieldRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * <p>string</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>配置项状态，枚举值，enabled、disabled</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>配置项展示值</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
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
     * {@link CreateCustomFieldRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomFieldRequest</p>
     */
    public static class FieldDataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        @com.aliyun.core.annotation.Validation(maxLength = 2048)
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
             * <p>字段值配置项，必须与数据类型一致，只能新增数据项，不可删除，项字段：displayName、value、status</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
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
}
