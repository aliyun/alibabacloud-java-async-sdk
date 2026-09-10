// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawPluginsResponseBody</p>
 */
public class DescribePolarClawPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Diagnostics")
    private java.util.List<Diagnostics> diagnostics;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Plugins")
    private java.util.List<Plugins> plugins;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarClawPluginsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.diagnostics = builder.diagnostics;
        this.message = builder.message;
        this.plugins = builder.plugins;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawPluginsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return diagnostics
     */
    public java.util.List<Diagnostics> getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return plugins
     */
    public java.util.List<Plugins> getPlugins() {
        return this.plugins;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private java.util.List<Diagnostics> diagnostics; 
        private String message; 
        private java.util.List<Plugins> plugins; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolarClawPluginsResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.diagnostics = model.diagnostics;
            this.message = model.message;
            this.plugins = model.plugins;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>An array of diagnostic objects.</p>
         */
        public Builder diagnostics(java.util.List<Diagnostics> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>An array of plugin objects.</p>
         */
        public Builder plugins(java.util.List<Plugins> plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarClawPluginsResponseBody build() {
            return new DescribePolarClawPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawPluginsResponseBody</p>
     */
    public static class Diagnostics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Diagnostics(Builder builder) {
            this.level = builder.level;
            this.message = builder.message;
            this.pluginId = builder.pluginId;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnostics create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String level; 
            private String message; 
            private String pluginId; 
            private String source; 

            private Builder() {
            } 

            private Builder(Diagnostics model) {
                this.level = model.level;
                this.message = model.message;
                this.pluginId = model.pluginId;
                this.source = model.source;
            } 

            /**
             * <p>The severity level. Valid values: <code>error</code> and <code>warn</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>warn</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The detailed diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>loaded without install/load-path provenance; treat as untracked local code</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the associated plugin.</p>
             * 
             * <strong>example:</strong>
             * <p>openclaw-lark</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>The source file path associated with the diagnostic.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/node/.openclaw/extensions/openclaw-lark/index.js</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Diagnostics build() {
                return new Diagnostics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawPluginsResponseBody</p>
     */
    public static class Plugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelIds")
        private java.util.List<String> channelIds;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("ProviderIds")
        private java.util.List<String> providerIds;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Plugins(Builder builder) {
            this.channelIds = builder.channelIds;
            this.description = builder.description;
            this.error = builder.error;
            this.format = builder.format;
            this.id = builder.id;
            this.name = builder.name;
            this.origin = builder.origin;
            this.providerIds = builder.providerIds;
            this.source = builder.source;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plugins create() {
            return builder().build();
        }

        /**
         * @return channelIds
         */
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return providerIds
         */
        public java.util.List<String> getProviderIds() {
            return this.providerIds;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
            private java.util.List<String> channelIds; 
            private String description; 
            private String error; 
            private String format; 
            private String id; 
            private String name; 
            private String origin; 
            private java.util.List<String> providerIds; 
            private String source; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Plugins model) {
                this.channelIds = model.channelIds;
                this.description = model.description;
                this.error = model.error;
                this.format = model.format;
                this.id = model.id;
                this.name = model.name;
                this.origin = model.origin;
                this.providerIds = model.providerIds;
                this.source = model.source;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>A list of channel IDs, which can be empty.</p>
             */
            public Builder channelIds(java.util.List<String> channelIds) {
                this.channelIds = channelIds;
                return this;
            }

            /**
             * <p>The description of the plugin.</p>
             * 
             * <strong>example:</strong>
             * <p>Lark/Feishu channel plugin with im/doc/wiki/drive/task/calendar tools</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error message, or <code>null</code> if no error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The format of the plugin, which can be an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>openclaw</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The plugin ID.</p>
             * 
             * <strong>example:</strong>
             * <p>openclaw-lark</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the plugin.</p>
             * 
             * <strong>example:</strong>
             * <p>Feishu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The origin of the plugin. Valid values: <code>bundled</code>, <code>global</code>, and <code>user-install</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>A list of provider IDs, which can be empty.</p>
             */
            public Builder providerIds(java.util.List<String> providerIds) {
                this.providerIds = providerIds;
                return this;
            }

            /**
             * <p>The file path to the plugin\&quot;s entry point.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/node/.openclaw/extensions/openclaw-lark/index.js</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the plugin. Valid values: <code>loaded</code>, <code>disabled</code>, and <code>error</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>loaded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number of the plugin.</p>
             * 
             * <strong>example:</strong>
             * <p>2026.4.7</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Plugins build() {
                return new Plugins(this);
            } 

        } 

    }
}
