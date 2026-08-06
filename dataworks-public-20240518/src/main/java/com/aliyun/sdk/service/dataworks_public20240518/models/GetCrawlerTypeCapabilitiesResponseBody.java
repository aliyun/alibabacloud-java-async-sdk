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
         * CrawlerTypes.
         */
        public Builder crawlerTypes(java.util.List<CrawlerTypes> crawlerTypes) {
            this.crawlerTypes = crawlerTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * Optional.
             */
            public Builder optional(Boolean optional) {
                this.optional = optional;
                return this;
            }

            /**
             * ParentSubType.
             */
            public Builder parentSubType(String parentSubType) {
                this.parentSubType = parentSubType;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Type.
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
             * AllowedValues.
             */
            public Builder allowedValues(java.util.List<String> allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * ValueType.
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
             * DefaultScopeUnit.
             */
            public Builder defaultScopeUnit(String defaultScopeUnit) {
                this.defaultScopeUnit = defaultScopeUnit;
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
             * RequireResourceGroup.
             */
            public Builder requireResourceGroup(Boolean requireResourceGroup) {
                this.requireResourceGroup = requireResourceGroup;
                return this;
            }

            /**
             * SupportAiComment.
             */
            public Builder supportAiComment(Boolean supportAiComment) {
                this.supportAiComment = supportAiComment;
                return this;
            }

            /**
             * SupportExcludeRegex.
             */
            public Builder supportExcludeRegex(Boolean supportExcludeRegex) {
                this.supportExcludeRegex = supportExcludeRegex;
                return this;
            }

            /**
             * SupportSchedule.
             */
            public Builder supportSchedule(Boolean supportSchedule) {
                this.supportSchedule = supportSchedule;
                return this;
            }

            /**
             * SupportedDatasourceTypes.
             */
            public Builder supportedDatasourceTypes(java.util.List<String> supportedDatasourceTypes) {
                this.supportedDatasourceTypes = supportedDatasourceTypes;
                return this;
            }

            /**
             * SupportedEntityTypes.
             */
            public Builder supportedEntityTypes(java.util.List<SupportedEntityTypes> supportedEntityTypes) {
                this.supportedEntityTypes = supportedEntityTypes;
                return this;
            }

            /**
             * SupportedOptionKeys.
             */
            public Builder supportedOptionKeys(java.util.List<SupportedOptionKeys> supportedOptionKeys) {
                this.supportedOptionKeys = supportedOptionKeys;
                return this;
            }

            /**
             * SupportedScopeUnits.
             */
            public Builder supportedScopeUnits(java.util.List<String> supportedScopeUnits) {
                this.supportedScopeUnits = supportedScopeUnits;
                return this;
            }

            /**
             * Type.
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
