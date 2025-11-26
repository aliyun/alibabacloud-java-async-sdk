// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ExportApplicationConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportApplicationConfigsResponseBody</p>
 */
public class ExportApplicationConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List<ApplicationConfigs> applicationConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportApplicationConfigsResponseBody(Builder builder) {
        this.applicationConfigs = builder.applicationConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportApplicationConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List<ApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApplicationConfigs> applicationConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportApplicationConfigsResponseBody model) {
            this.applicationConfigs = model.applicationConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationConfigs.
         */
        public Builder applicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportApplicationConfigsResponseBody build() {
            return new ExportApplicationConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportApplicationConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ExportApplicationConfigsResponseBody</p>
     */
    public static class ApplicationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ConfigFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private ApplicationConfigs(Builder builder) {
            this.applicationName = builder.applicationName;
            this.configFileName = builder.configFileName;
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfigs create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String applicationName; 
            private String configFileName; 
            private String content; 

            private Builder() {
            } 

            private Builder(ApplicationConfigs model) {
                this.applicationName = model.applicationName;
                this.configFileName = model.configFileName;
                this.content = model.content;
            } 

            /**
             * <p>应用名称。</p>
             * 
             * <strong>example:</strong>
             * <p>YARN</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>文件名称。</p>
             * 
             * <strong>example:</strong>
             * <p>yarn-site.xml</p>
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * <p>文件内容，base64加密。</p>
             * 
             * <strong>example:</strong>
             * <p>export key=value</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public ApplicationConfigs build() {
                return new ApplicationConfigs(this);
            } 

        } 

    }
}
