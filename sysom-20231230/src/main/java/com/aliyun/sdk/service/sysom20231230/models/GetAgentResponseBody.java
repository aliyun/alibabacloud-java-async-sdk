// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentResponseBody</p>
 */
public class GetAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private GetAgentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Data data; 
        private String message; 

        private Builder() {
        } 

        private Builder(GetAgentResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public GetAgentResponseBody build() {
            return new GetAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("install_script")
        private String installScript;

        @com.aliyun.core.annotation.NameInMap("uninstall_script")
        private String uninstallScript;

        @com.aliyun.core.annotation.NameInMap("updated_at")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("upgrade_script")
        private String upgradeScript;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Versions(Builder builder) {
            this.createdAt = builder.createdAt;
            this.installScript = builder.installScript;
            this.uninstallScript = builder.uninstallScript;
            this.updatedAt = builder.updatedAt;
            this.upgradeScript = builder.upgradeScript;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return installScript
         */
        public String getInstallScript() {
            return this.installScript;
        }

        /**
         * @return uninstallScript
         */
        public String getUninstallScript() {
            return this.uninstallScript;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return upgradeScript
         */
        public String getUpgradeScript() {
            return this.upgradeScript;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createdAt; 
            private String installScript; 
            private String uninstallScript; 
            private String updatedAt; 
            private String upgradeScript; 
            private String version; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.createdAt = model.createdAt;
                this.installScript = model.installScript;
                this.uninstallScript = model.uninstallScript;
                this.updatedAt = model.updatedAt;
                this.upgradeScript = model.upgradeScript;
                this.version = model.version;
            } 

            /**
             * <p>The time when the agent version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-14T20:46:08</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The installation script for this agent version.</p>
             * 
             * <strong>example:</strong>
             * <p>sysom.sh install</p>
             */
            public Builder installScript(String installScript) {
                this.installScript = installScript;
                return this;
            }

            /**
             * <p>The uninstallation script for this agent version.</p>
             * 
             * <strong>example:</strong>
             * <p>sysom.sh uninstall</p>
             */
            public Builder uninstallScript(String uninstallScript) {
                this.uninstallScript = uninstallScript;
                return this;
            }

            /**
             * <p>The time when the agent version was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-14T20:46:08</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The update script for this agent version.</p>
             * 
             * <strong>example:</strong>
             * <p>sysom.sh upgrade</p>
             */
            public Builder upgradeScript(String upgradeScript) {
                this.upgradeScript = upgradeScript;
                return this;
            }

            /**
             * <p>The agent version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3.4.0-1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("support_arch")
        private String supportArch;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated_at")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.supportArch = builder.supportArch;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return supportArch
         */
        public String getSupportArch() {
            return this.supportArch;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String id; 
            private String name; 
            private String supportArch; 
            private String type; 
            private String updatedAt; 
            private java.util.List<Versions> versions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.supportArch = model.supportArch;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
                this.versions = model.versions;
            } 

            /**
             * <p>The time when the component was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-14T20:46:08</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The component description.</p>
             * 
             * <strong>example:</strong>
             * <p>SysOM Agent</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>SysOM</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The supported architectures.</p>
             * 
             * <strong>example:</strong>
             * <p>x86</p>
             */
            public Builder supportArch(String supportArch) {
                this.supportArch = supportArch;
                return this;
            }

            /**
             * <p>The agent type.</p>
             * 
             * <strong>example:</strong>
             * <p>control</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the component was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-14T20:46:08</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The component version information.</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
