// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigsResponseBody</p>
 */
public class ListConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListConfigsResponseBody model) {
            this.configs = model.configs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The configuration items.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of items returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConfigsResponseBody build() {
            return new ListConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigsResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private Configs(Builder builder) {
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String configKey; 
            private String configValue; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.configKey = model.configKey;
                this.configValue = model.configValue;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.labels = model.labels;
            } 

            /**
             * <p>The key of the configuration item. Supported keys:</p>
             * <ul>
             * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
             * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
             * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
             * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
             * <li>predefinedTags: The predefined tags of the workspace. All created resources must have tags</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tempTableLifecycle</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://***</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The tags of the configuration item.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
