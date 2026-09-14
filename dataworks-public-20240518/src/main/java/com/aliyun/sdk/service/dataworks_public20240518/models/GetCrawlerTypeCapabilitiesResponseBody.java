// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetCrawlerTypeCapabilitiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrawlerTypeCapabilitiesResponseBody</p>
 */
public class GetCrawlerTypeCapabilitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrawlerTypes")
    private java.util.List<CrawlerTypes> crawlerTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCrawlerTypeCapabilitiesResponseBody(Builder builder) {
        this.crawlerTypes = builder.crawlerTypes;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrawlerTypeCapabilitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawlerTypes
     */
    public java.util.List<CrawlerTypes> getCrawlerTypes() {
        return this.crawlerTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<CrawlerTypes> crawlerTypes; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCrawlerTypeCapabilitiesResponseBody model) {
            this.crawlerTypes = model.crawlerTypes;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of crawler types and capabilities supported in the current region.</p>
         */
        public Builder crawlerTypes(java.util.List<CrawlerTypes> crawlerTypes) {
            this.crawlerTypes = crawlerTypes;
            return this;
        }

        /**
         * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCrawlerTypeCapabilitiesResponseBody build() {
            return new GetCrawlerTypeCapabilitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCrawlerTypeCapabilitiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerTypeCapabilitiesResponseBody</p>
     */
    public static class SupportedEntityTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Optional")
        private Boolean optional;

        @com.aliyun.core.annotation.NameInMap("ParentSubType")
        private String parentSubType;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SupportedEntityTypes(Builder builder) {
            this.optional = builder.optional;
            this.parentSubType = builder.parentSubType;
            this.subType = builder.subType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEntityTypes create() {
            return builder().build();
        }

        /**
         * @return optional
         */
        public Boolean getOptional() {
            return this.optional;
        }

        /**
         * @return parentSubType
         */
        public String getParentSubType() {
            return this.parentSubType;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean optional; 
            private String parentSubType; 
            private String subType; 
            private String type; 

            private Builder() {
            } 

            private Builder(SupportedEntityTypes model) {
                this.optional = model.optional;
                this.parentSubType = model.parentSubType;
                this.subType = model.subType;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the metadata entity level is optional.</p>
             */
            public Builder optional(Boolean optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The parent-level metadata entity subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder parentSubType(String parentSubType) {
                this.parentSubType = parentSubType;
                return this;
            }

            /**
             * <p>The metadata entity subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The metadata entity type identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>holo</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SupportedEntityTypes build() {
                return new SupportedEntityTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCrawlerTypeCapabilitiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerTypeCapabilitiesResponseBody</p>
     */
    public static class SupportedOptionKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List<String> allowedValues;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private SupportedOptionKeys(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.defaultValue = builder.defaultValue;
            this.key = builder.key;
            this.required = builder.required;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedOptionKeys create() {
            return builder().build();
        }

        /**
         * @return allowedValues
         */
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private java.util.List<String> allowedValues; 
            private String defaultValue; 
            private String key; 
            private Boolean required; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(SupportedOptionKeys model) {
                this.allowedValues = model.allowedValues;
                this.defaultValue = model.defaultValue;
                this.key = model.key;
                this.required = model.required;
                this.valueType = model.valueType;
            } 

            /**
             * <p>The list of allowed values for the extension configuration item.</p>
             */
            public Builder allowedValues(java.util.List<String> allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * <p>The default value of the extension configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The name of the extension configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>CollectRecyclebin</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Indicates whether the extension configuration item is required.</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The value type of the extension configuration item, such as BOOLEAN.</p>
             * 
             * <strong>example:</strong>
             * <p>BOOLEAN</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SupportedOptionKeys build() {
                return new SupportedOptionKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCrawlerTypeCapabilitiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerTypeCapabilitiesResponseBody</p>
     */
    public static class CrawlerTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultScopeUnit")
        private String defaultScopeUnit;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("RequireResourceGroup")
        private Boolean requireResourceGroup;

        @com.aliyun.core.annotation.NameInMap("SupportAiComment")
        private Boolean supportAiComment;

        @com.aliyun.core.annotation.NameInMap("SupportExcludeRegex")
        private Boolean supportExcludeRegex;

        @com.aliyun.core.annotation.NameInMap("SupportSchedule")
        private Boolean supportSchedule;

        @com.aliyun.core.annotation.NameInMap("SupportedDatasourceTypes")
        private java.util.List<String> supportedDatasourceTypes;

        @com.aliyun.core.annotation.NameInMap("SupportedEntityTypes")
        private java.util.List<SupportedEntityTypes> supportedEntityTypes;

        @com.aliyun.core.annotation.NameInMap("SupportedOptionKeys")
        private java.util.List<SupportedOptionKeys> supportedOptionKeys;

        @com.aliyun.core.annotation.NameInMap("SupportedScopeUnits")
        private java.util.List<String> supportedScopeUnits;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CrawlerTypes(Builder builder) {
            this.defaultScopeUnit = builder.defaultScopeUnit;
            this.displayName = builder.displayName;
            this.requireResourceGroup = builder.requireResourceGroup;
            this.supportAiComment = builder.supportAiComment;
            this.supportExcludeRegex = builder.supportExcludeRegex;
            this.supportSchedule = builder.supportSchedule;
            this.supportedDatasourceTypes = builder.supportedDatasourceTypes;
            this.supportedEntityTypes = builder.supportedEntityTypes;
            this.supportedOptionKeys = builder.supportedOptionKeys;
            this.supportedScopeUnits = builder.supportedScopeUnits;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrawlerTypes create() {
            return builder().build();
        }

        /**
         * @return defaultScopeUnit
         */
        public String getDefaultScopeUnit() {
            return this.defaultScopeUnit;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return requireResourceGroup
         */
        public Boolean getRequireResourceGroup() {
            return this.requireResourceGroup;
        }

        /**
         * @return supportAiComment
         */
        public Boolean getSupportAiComment() {
            return this.supportAiComment;
        }

        /**
         * @return supportExcludeRegex
         */
        public Boolean getSupportExcludeRegex() {
            return this.supportExcludeRegex;
        }

        /**
         * @return supportSchedule
         */
        public Boolean getSupportSchedule() {
            return this.supportSchedule;
        }

        /**
         * @return supportedDatasourceTypes
         */
        public java.util.List<String> getSupportedDatasourceTypes() {
            return this.supportedDatasourceTypes;
        }

        /**
         * @return supportedEntityTypes
         */
        public java.util.List<SupportedEntityTypes> getSupportedEntityTypes() {
            return this.supportedEntityTypes;
        }

        /**
         * @return supportedOptionKeys
         */
        public java.util.List<SupportedOptionKeys> getSupportedOptionKeys() {
            return this.supportedOptionKeys;
        }

        /**
         * @return supportedScopeUnits
         */
        public java.util.List<String> getSupportedScopeUnits() {
            return this.supportedScopeUnits;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultScopeUnit; 
            private String displayName; 
            private Boolean requireResourceGroup; 
            private Boolean supportAiComment; 
            private Boolean supportExcludeRegex; 
            private Boolean supportSchedule; 
            private java.util.List<String> supportedDatasourceTypes; 
            private java.util.List<SupportedEntityTypes> supportedEntityTypes; 
            private java.util.List<SupportedOptionKeys> supportedOptionKeys; 
            private java.util.List<String> supportedScopeUnits; 
            private String type; 

            private Builder() {
            } 

            private Builder(CrawlerTypes model) {
                this.defaultScopeUnit = model.defaultScopeUnit;
                this.displayName = model.displayName;
                this.requireResourceGroup = model.requireResourceGroup;
                this.supportAiComment = model.supportAiComment;
                this.supportExcludeRegex = model.supportExcludeRegex;
                this.supportSchedule = model.supportSchedule;
                this.supportedDatasourceTypes = model.supportedDatasourceTypes;
                this.supportedEntityTypes = model.supportedEntityTypes;
                this.supportedOptionKeys = model.supportedOptionKeys;
                this.supportedScopeUnits = model.supportedScopeUnits;
                this.type = model.type;
            } 

            /**
             * <p>The default collection scope granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>DATABASE</p>
             */
            public Builder defaultScopeUnit(String defaultScopeUnit) {
                this.defaultScopeUnit = defaultScopeUnit;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether a resource group must be specified when creating this type of crawler.</p>
             */
            public Builder requireResourceGroup(Boolean requireResourceGroup) {
                this.requireResourceGroup = requireResourceGroup;
                return this;
            }

            /**
             * <p>Indicates whether AI metadata description is supported.</p>
             */
            public Builder supportAiComment(Boolean supportAiComment) {
                this.supportAiComment = supportAiComment;
                return this;
            }

            /**
             * <p>Indicates whether schema or table exclusion regular expressions are supported.</p>
             */
            public Builder supportExcludeRegex(Boolean supportExcludeRegex) {
                this.supportExcludeRegex = supportExcludeRegex;
                return this;
            }

            /**
             * <p>Indicates whether periodic scheduling is supported.</p>
             */
            public Builder supportSchedule(Boolean supportSchedule) {
                this.supportSchedule = supportSchedule;
                return this;
            }

            /**
             * <p>The list of supported data source types.</p>
             */
            public Builder supportedDatasourceTypes(java.util.List<String> supportedDatasourceTypes) {
                this.supportedDatasourceTypes = supportedDatasourceTypes;
                return this;
            }

            /**
             * <p>The metadata entity levels that the crawler type supports for collection.</p>
             */
            public Builder supportedEntityTypes(java.util.List<SupportedEntityTypes> supportedEntityTypes) {
                this.supportedEntityTypes = supportedEntityTypes;
                return this;
            }

            /**
             * <p>The supported crawler extension configuration items.</p>
             */
            public Builder supportedOptionKeys(java.util.List<SupportedOptionKeys> supportedOptionKeys) {
                this.supportedOptionKeys = supportedOptionKeys;
                return this;
            }

            /**
             * <p>The list of supported collection scope granularities.</p>
             */
            public Builder supportedScopeUnits(java.util.List<String> supportedScopeUnits) {
                this.supportedScopeUnits = supportedScopeUnits;
                return this;
            }

            /**
             * <p>The crawler type.</p>
             * 
             * <strong>example:</strong>
             * <p>holo</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CrawlerTypes build() {
                return new CrawlerTypes(this);
            } 

        } 

    }
}
