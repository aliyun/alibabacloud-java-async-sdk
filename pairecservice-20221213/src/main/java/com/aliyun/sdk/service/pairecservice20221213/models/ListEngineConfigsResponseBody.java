// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListEngineConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEngineConfigsResponseBody</p>
 */
public class ListEngineConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EngineConfigs")
    private java.util.List<EngineConfigs> engineConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListEngineConfigsResponseBody(Builder builder) {
        this.engineConfigs = builder.engineConfigs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEngineConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineConfigs
     */
    public java.util.List<EngineConfigs> getEngineConfigs() {
        return this.engineConfigs;
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
        private java.util.List<EngineConfigs> engineConfigs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEngineConfigsResponseBody model) {
            this.engineConfigs = model.engineConfigs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EngineConfigs.
         */
        public Builder engineConfigs(java.util.List<EngineConfigs> engineConfigs) {
            this.engineConfigs = engineConfigs;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEngineConfigsResponseBody build() {
            return new ListEngineConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEngineConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEngineConfigsResponseBody</p>
     */
    public static class EngineConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EngineConfigId")
        private String engineConfigId;

        @com.aliyun.core.annotation.NameInMap("Environment")
        private String environment;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("GmtReleasedTime")
        private String gmtReleasedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private EngineConfigs(Builder builder) {
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.engineConfigId = builder.engineConfigId;
            this.environment = builder.environment;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.gmtReleasedTime = builder.gmtReleasedTime;
            this.name = builder.name;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineConfigs create() {
            return builder().build();
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return engineConfigId
         */
        public String getEngineConfigId() {
            return this.engineConfigId;
        }

        /**
         * @return environment
         */
        public String getEnvironment() {
            return this.environment;
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
         * @return gmtReleasedTime
         */
        public String getGmtReleasedTime() {
            return this.gmtReleasedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String configValue; 
            private String description; 
            private String engineConfigId; 
            private String environment; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String gmtReleasedTime; 
            private String name; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(EngineConfigs model) {
                this.configValue = model.configValue;
                this.description = model.description;
                this.engineConfigId = model.engineConfigId;
                this.environment = model.environment;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.gmtReleasedTime = model.gmtReleasedTime;
                this.name = model.name;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * EngineConfigId.
             */
            public Builder engineConfigId(String engineConfigId) {
                this.engineConfigId = engineConfigId;
                return this;
            }

            /**
             * Environment.
             */
            public Builder environment(String environment) {
                this.environment = environment;
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
             * GmtReleasedTime.
             */
            public Builder gmtReleasedTime(String gmtReleasedTime) {
                this.gmtReleasedTime = gmtReleasedTime;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public EngineConfigs build() {
                return new EngineConfigs(this);
            } 

        } 

    }
}
