// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SLSConfig} extends {@link TeaModel}
 *
 * <p>SLSConfig</p>
 */
public class SLSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("collectConfigs")
    private java.util.List < CollectConfigs> collectConfigs;

    private SLSConfig(Builder builder) {
        this.collectConfigs = builder.collectConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSConfig create() {
        return builder().build();
    }

    /**
     * @return collectConfigs
     */
    public java.util.List < CollectConfigs> getCollectConfigs() {
        return this.collectConfigs;
    }

    public static final class Builder {
        private java.util.List < CollectConfigs> collectConfigs; 

        /**
         * collectConfigs.
         */
        public Builder collectConfigs(java.util.List < CollectConfigs> collectConfigs) {
            this.collectConfigs = collectConfigs;
            return this;
        }

        public SLSConfig build() {
            return new SLSConfig(this);
        } 

    } 

    /**
     * 
     * {@link SLSConfig} extends {@link TeaModel}
     *
     * <p>SLSConfig</p>
     */
    public static class CollectConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logPath")
        private String logPath;

        @com.aliyun.core.annotation.NameInMap("logType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("logstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("logtailName")
        private String logtailName;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        private CollectConfigs(Builder builder) {
            this.logPath = builder.logPath;
            this.logType = builder.logType;
            this.logstoreName = builder.logstoreName;
            this.logtailName = builder.logtailName;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CollectConfigs create() {
            return builder().build();
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return logtailName
         */
        public String getLogtailName() {
            return this.logtailName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String logPath; 
            private String logType; 
            private String logstoreName; 
            private String logtailName; 
            private String projectName; 

            /**
             * logPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * logType.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * logstoreName.
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * logtailName.
             */
            public Builder logtailName(String logtailName) {
                this.logtailName = logtailName;
                return this;
            }

            /**
             * projectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public CollectConfigs build() {
                return new CollectConfigs(this);
            } 

        } 

    }
}
