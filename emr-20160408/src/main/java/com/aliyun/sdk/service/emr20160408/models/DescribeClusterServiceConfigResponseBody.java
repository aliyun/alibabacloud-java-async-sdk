// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceConfigResponseBody</p>
 */
public class DescribeClusterServiceConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    private Config config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterServiceConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        /**
         * Config.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterServiceConfigResponseBody build() {
            return new DescribeClusterServiceConfigResponseBody(this);
        } 

    } 

    public static class ConfigItemValue extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("IsCustom")
        private Boolean isCustom;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("Value")
        private String value;

        private ConfigItemValue(Builder builder) {
            this.description = builder.description;
            this.isCustom = builder.isCustom;
            this.itemName = builder.itemName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItemValue create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isCustom
         */
        public Boolean getIsCustom() {
            return this.isCustom;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private Boolean isCustom; 
            private String itemName; 
            private String value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsCustom.
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigItemValue build() {
                return new ConfigItemValue(this);
            } 

        } 

    }
    public static class ConfigItemValueList extends TeaModel {
        @NameInMap("ConfigItemValue")
        private java.util.List < ConfigItemValue> configItemValue;

        private ConfigItemValueList(Builder builder) {
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItemValueList create() {
            return builder().build();
        }

        /**
         * @return configItemValue
         */
        public java.util.List < ConfigItemValue> getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private java.util.List < ConfigItemValue> configItemValue; 

            /**
             * ConfigItemValue.
             */
            public Builder configItemValue(java.util.List < ConfigItemValue> configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public ConfigItemValueList build() {
                return new ConfigItemValueList(this);
            } 

        } 

    }
    public static class ConfigValue extends TeaModel {
        @NameInMap("AllowCustom")
        private Boolean allowCustom;

        @NameInMap("ConfigItemValueList")
        private ConfigItemValueList configItemValueList;

        @NameInMap("ConfigName")
        private String configName;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("ScopeId")
        private Long scopeId;

        private ConfigValue(Builder builder) {
            this.allowCustom = builder.allowCustom;
            this.configItemValueList = builder.configItemValueList;
            this.configName = builder.configName;
            this.scope = builder.scope;
            this.scopeId = builder.scopeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigValue create() {
            return builder().build();
        }

        /**
         * @return allowCustom
         */
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        /**
         * @return configItemValueList
         */
        public ConfigItemValueList getConfigItemValueList() {
            return this.configItemValueList;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeId
         */
        public Long getScopeId() {
            return this.scopeId;
        }

        public static final class Builder {
            private Boolean allowCustom; 
            private ConfigItemValueList configItemValueList; 
            private String configName; 
            private String scope; 
            private Long scopeId; 

            /**
             * AllowCustom.
             */
            public Builder allowCustom(Boolean allowCustom) {
                this.allowCustom = allowCustom;
                return this;
            }

            /**
             * ConfigItemValueList.
             */
            public Builder configItemValueList(ConfigItemValueList configItemValueList) {
                this.configItemValueList = configItemValueList;
                return this;
            }

            /**
             * ConfigName.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ScopeId.
             */
            public Builder scopeId(Long scopeId) {
                this.scopeId = scopeId;
                return this;
            }

            public ConfigValue build() {
                return new ConfigValue(this);
            } 

        } 

    }
    public static class ConfigValueList extends TeaModel {
        @NameInMap("ConfigValue")
        private java.util.List < ConfigValue> configValue;

        private ConfigValueList(Builder builder) {
            this.configValue = builder.configValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigValueList create() {
            return builder().build();
        }

        /**
         * @return configValue
         */
        public java.util.List < ConfigValue> getConfigValue() {
            return this.configValue;
        }

        public static final class Builder {
            private java.util.List < ConfigValue> configValue; 

            /**
             * ConfigValue.
             */
            public Builder configValue(java.util.List < ConfigValue> configValue) {
                this.configValue = configValue;
                return this;
            }

            public ConfigValueList build() {
                return new ConfigValueList(this);
            } 

        } 

    }
    public static class EffectWay extends TeaModel {
        @NameInMap("EffectType")
        private String effectType;

        @NameInMap("InvokeServiceName")
        private String invokeServiceName;

        private EffectWay(Builder builder) {
            this.effectType = builder.effectType;
            this.invokeServiceName = builder.invokeServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectWay create() {
            return builder().build();
        }

        /**
         * @return effectType
         */
        public String getEffectType() {
            return this.effectType;
        }

        /**
         * @return invokeServiceName
         */
        public String getInvokeServiceName() {
            return this.invokeServiceName;
        }

        public static final class Builder {
            private String effectType; 
            private String invokeServiceName; 

            /**
             * EffectType.
             */
            public Builder effectType(String effectType) {
                this.effectType = effectType;
                return this;
            }

            /**
             * InvokeServiceName.
             */
            public Builder invokeServiceName(String invokeServiceName) {
                this.invokeServiceName = invokeServiceName;
                return this;
            }

            public EffectWay build() {
                return new EffectWay(this);
            } 

        } 

    }
    public static class PropertyTypes extends TeaModel {
        @NameInMap("propertyType")
        private java.util.List < String > propertyType;

        private PropertyTypes(Builder builder) {
            this.propertyType = builder.propertyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyTypes create() {
            return builder().build();
        }

        /**
         * @return propertyType
         */
        public java.util.List < String > getPropertyType() {
            return this.propertyType;
        }

        public static final class Builder {
            private java.util.List < String > propertyType; 

            /**
             * propertyType.
             */
            public Builder propertyType(java.util.List < String > propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            public PropertyTypes build() {
                return new PropertyTypes(this);
            } 

        } 

    }
    public static class ValueEntryInfo extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
        private String value;

        private ValueEntryInfo(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueEntryInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private String value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ValueEntryInfo build() {
                return new ValueEntryInfo(this);
            } 

        } 

    }
    public static class Entries extends TeaModel {
        @NameInMap("ValueEntryInfo")
        private java.util.List < ValueEntryInfo> valueEntryInfo;

        private Entries(Builder builder) {
            this.valueEntryInfo = builder.valueEntryInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return valueEntryInfo
         */
        public java.util.List < ValueEntryInfo> getValueEntryInfo() {
            return this.valueEntryInfo;
        }

        public static final class Builder {
            private java.util.List < ValueEntryInfo> valueEntryInfo; 

            /**
             * ValueEntryInfo.
             */
            public Builder valueEntryInfo(java.util.List < ValueEntryInfo> valueEntryInfo) {
                this.valueEntryInfo = valueEntryInfo;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
    public static class PropertyValueAttributes extends TeaModel {
        @NameInMap("Entries")
        private Entries entries;

        @NameInMap("Hidden")
        private Boolean hidden;

        @NameInMap("IncrememtStep")
        private String incrememtStep;

        @NameInMap("Maximum")
        private String maximum;

        @NameInMap("Mimimum")
        private String mimimum;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("Type")
        private String type;

        @NameInMap("Unit")
        private String unit;

        private PropertyValueAttributes(Builder builder) {
            this.entries = builder.entries;
            this.hidden = builder.hidden;
            this.incrememtStep = builder.incrememtStep;
            this.maximum = builder.maximum;
            this.mimimum = builder.mimimum;
            this.readOnly = builder.readOnly;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValueAttributes create() {
            return builder().build();
        }

        /**
         * @return entries
         */
        public Entries getEntries() {
            return this.entries;
        }

        /**
         * @return hidden
         */
        public Boolean getHidden() {
            return this.hidden;
        }

        /**
         * @return incrememtStep
         */
        public String getIncrememtStep() {
            return this.incrememtStep;
        }

        /**
         * @return maximum
         */
        public String getMaximum() {
            return this.maximum;
        }

        /**
         * @return mimimum
         */
        public String getMimimum() {
            return this.mimimum;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Entries entries; 
            private Boolean hidden; 
            private String incrememtStep; 
            private String maximum; 
            private String mimimum; 
            private Boolean readOnly; 
            private String type; 
            private String unit; 

            /**
             * Entries.
             */
            public Builder entries(Entries entries) {
                this.entries = entries;
                return this;
            }

            /**
             * Hidden.
             */
            public Builder hidden(Boolean hidden) {
                this.hidden = hidden;
                return this;
            }

            /**
             * IncrememtStep.
             */
            public Builder incrememtStep(String incrememtStep) {
                this.incrememtStep = incrememtStep;
                return this;
            }

            /**
             * Maximum.
             */
            public Builder maximum(String maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * Mimimum.
             */
            public Builder mimimum(String mimimum) {
                this.mimimum = mimimum;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public PropertyValueAttributes build() {
                return new PropertyValueAttributes(this);
            } 

        } 

    }
    public static class PropertyInfo extends TeaModel {
        @NameInMap("Component")
        private String component;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EffectWay")
        private EffectWay effectWay;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Name")
        private String name;

        @NameInMap("PropertyTypes")
        private PropertyTypes propertyTypes;

        @NameInMap("PropertyValueAttributes")
        private PropertyValueAttributes propertyValueAttributes;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Value")
        private String value;

        private PropertyInfo(Builder builder) {
            this.component = builder.component;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.effectWay = builder.effectWay;
            this.fileName = builder.fileName;
            this.name = builder.name;
            this.propertyTypes = builder.propertyTypes;
            this.propertyValueAttributes = builder.propertyValueAttributes;
            this.serviceName = builder.serviceName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyInfo create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return effectWay
         */
        public EffectWay getEffectWay() {
            return this.effectWay;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return propertyTypes
         */
        public PropertyTypes getPropertyTypes() {
            return this.propertyTypes;
        }

        /**
         * @return propertyValueAttributes
         */
        public PropertyValueAttributes getPropertyValueAttributes() {
            return this.propertyValueAttributes;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String component; 
            private String description; 
            private String displayName; 
            private EffectWay effectWay; 
            private String fileName; 
            private String name; 
            private PropertyTypes propertyTypes; 
            private PropertyValueAttributes propertyValueAttributes; 
            private String serviceName; 
            private String value; 

            /**
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EffectWay.
             */
            public Builder effectWay(EffectWay effectWay) {
                this.effectWay = effectWay;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PropertyTypes.
             */
            public Builder propertyTypes(PropertyTypes propertyTypes) {
                this.propertyTypes = propertyTypes;
                return this;
            }

            /**
             * PropertyValueAttributes.
             */
            public Builder propertyValueAttributes(PropertyValueAttributes propertyValueAttributes) {
                this.propertyValueAttributes = propertyValueAttributes;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyInfo build() {
                return new PropertyInfo(this);
            } 

        } 

    }
    public static class PropertyInfoList extends TeaModel {
        @NameInMap("PropertyInfo")
        private java.util.List < PropertyInfo> propertyInfo;

        private PropertyInfoList(Builder builder) {
            this.propertyInfo = builder.propertyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyInfoList create() {
            return builder().build();
        }

        /**
         * @return propertyInfo
         */
        public java.util.List < PropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

        public static final class Builder {
            private java.util.List < PropertyInfo> propertyInfo; 

            /**
             * PropertyInfo.
             */
            public Builder propertyInfo(java.util.List < PropertyInfo> propertyInfo) {
                this.propertyInfo = propertyInfo;
                return this;
            }

            public PropertyInfoList build() {
                return new PropertyInfoList(this);
            } 

        } 

    }
    public static class Config extends TeaModel {
        @NameInMap("Applied")
        private String applied;

        @NameInMap("Author")
        private String author;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("ConfigValueList")
        private ConfigValueList configValueList;

        @NameInMap("ConfigVersion")
        private String configVersion;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("PropertyInfoList")
        private PropertyInfoList propertyInfoList;

        @NameInMap("ServiceName")
        private String serviceName;

        private Config(Builder builder) {
            this.applied = builder.applied;
            this.author = builder.author;
            this.comment = builder.comment;
            this.configValueList = builder.configValueList;
            this.configVersion = builder.configVersion;
            this.createTime = builder.createTime;
            this.propertyInfoList = builder.propertyInfoList;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return applied
         */
        public String getApplied() {
            return this.applied;
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return configValueList
         */
        public ConfigValueList getConfigValueList() {
            return this.configValueList;
        }

        /**
         * @return configVersion
         */
        public String getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return propertyInfoList
         */
        public PropertyInfoList getPropertyInfoList() {
            return this.propertyInfoList;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String applied; 
            private String author; 
            private String comment; 
            private ConfigValueList configValueList; 
            private String configVersion; 
            private String createTime; 
            private PropertyInfoList propertyInfoList; 
            private String serviceName; 

            /**
             * Applied.
             */
            public Builder applied(String applied) {
                this.applied = applied;
                return this;
            }

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ConfigValueList.
             */
            public Builder configValueList(ConfigValueList configValueList) {
                this.configValueList = configValueList;
                return this;
            }

            /**
             * ConfigVersion.
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * PropertyInfoList.
             */
            public Builder propertyInfoList(PropertyInfoList propertyInfoList) {
                this.propertyInfoList = propertyInfoList;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
