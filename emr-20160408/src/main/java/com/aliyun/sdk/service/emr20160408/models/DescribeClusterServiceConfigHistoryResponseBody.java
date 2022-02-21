// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceConfigHistoryResponseBody</p>
 */
public class DescribeClusterServiceConfigHistoryResponseBody extends TeaModel {
    @NameInMap("Config")
    private Config config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterServiceConfigHistoryResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceConfigHistoryResponseBody create() {
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

        public DescribeClusterServiceConfigHistoryResponseBody build() {
            return new DescribeClusterServiceConfigHistoryResponseBody(this);
        } 

    } 

    public static class ConfigItemValue extends TeaModel {
        @NameInMap("ChangeType")
        private String changeType;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("Value")
        private String value;

        private ConfigItemValue(Builder builder) {
            this.changeType = builder.changeType;
            this.itemName = builder.itemName;
            this.oldValue = builder.oldValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItemValue create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String changeType; 
            private String itemName; 
            private String oldValue; 
            private String value; 

            /**
             * ChangeType.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
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
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
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
        @NameInMap("ConfigItemValueList")
        private ConfigItemValueList configItemValueList;

        @NameInMap("ConfigName")
        private String configName;

        private ConfigValue(Builder builder) {
            this.configItemValueList = builder.configItemValueList;
            this.configName = builder.configName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigValue create() {
            return builder().build();
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

        public static final class Builder {
            private ConfigItemValueList configItemValueList; 
            private String configName; 

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
    public static class Config extends TeaModel {
        @NameInMap("Applied")
        private Boolean applied;

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

        @NameInMap("ServiceName")
        private String serviceName;

        private Config(Builder builder) {
            this.applied = builder.applied;
            this.author = builder.author;
            this.comment = builder.comment;
            this.configValueList = builder.configValueList;
            this.configVersion = builder.configVersion;
            this.createTime = builder.createTime;
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
        public Boolean getApplied() {
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
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private Boolean applied; 
            private String author; 
            private String comment; 
            private ConfigValueList configValueList; 
            private String configVersion; 
            private String createTime; 
            private String serviceName; 

            /**
             * Applied.
             */
            public Builder applied(Boolean applied) {
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
