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
 * {@link DescribePolarClawAgentToolsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawAgentToolsResponseBody</p>
 */
public class DescribePolarClawAgentToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("CurrentConfig")
    private CurrentConfig currentConfig;

    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Profiles")
    private java.util.List<Profiles> profiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarClawAgentToolsResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.currentConfig = builder.currentConfig;
        this.groups = builder.groups;
        this.message = builder.message;
        this.profiles = builder.profiles;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawAgentToolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return currentConfig
     */
    public CurrentConfig getCurrentConfig() {
        return this.currentConfig;
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return profiles
     */
    public java.util.List<Profiles> getProfiles() {
        return this.profiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private CurrentConfig currentConfig; 
        private java.util.List<Groups> groups; 
        private String message; 
        private java.util.List<Profiles> profiles; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolarClawAgentToolsResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.currentConfig = model.currentConfig;
            this.groups = model.groups;
            this.message = model.message;
            this.profiles = model.profiles;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentConfig.
         */
        public Builder currentConfig(CurrentConfig currentConfig) {
            this.currentConfig = currentConfig;
            return this;
        }

        /**
         * Groups.
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Profiles.
         */
        public Builder profiles(java.util.List<Profiles> profiles) {
            this.profiles = profiles;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarClawAgentToolsResponseBody build() {
            return new DescribePolarClawAgentToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentToolsResponseBody</p>
     */
    public static class CurrentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allow")
        private java.util.List<String> allow;

        @com.aliyun.core.annotation.NameInMap("AlsoAllow")
        private java.util.List<String> alsoAllow;

        @com.aliyun.core.annotation.NameInMap("Deny")
        private java.util.List<String> deny;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        private CurrentConfig(Builder builder) {
            this.allow = builder.allow;
            this.alsoAllow = builder.alsoAllow;
            this.deny = builder.deny;
            this.profile = builder.profile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentConfig create() {
            return builder().build();
        }

        /**
         * @return allow
         */
        public java.util.List<String> getAllow() {
            return this.allow;
        }

        /**
         * @return alsoAllow
         */
        public java.util.List<String> getAlsoAllow() {
            return this.alsoAllow;
        }

        /**
         * @return deny
         */
        public java.util.List<String> getDeny() {
            return this.deny;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        public static final class Builder {
            private java.util.List<String> allow; 
            private java.util.List<String> alsoAllow; 
            private java.util.List<String> deny; 
            private String profile; 

            private Builder() {
            } 

            private Builder(CurrentConfig model) {
                this.allow = model.allow;
                this.alsoAllow = model.alsoAllow;
                this.deny = model.deny;
                this.profile = model.profile;
            } 

            /**
             * Allow.
             */
            public Builder allow(java.util.List<String> allow) {
                this.allow = allow;
                return this;
            }

            /**
             * AlsoAllow.
             */
            public Builder alsoAllow(java.util.List<String> alsoAllow) {
                this.alsoAllow = alsoAllow;
                return this;
            }

            /**
             * Deny.
             */
            public Builder deny(java.util.List<String> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            public CurrentConfig build() {
                return new CurrentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentToolsResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultProfiles")
        private java.util.List<String> defaultProfiles;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Tools(Builder builder) {
            this.defaultProfiles = builder.defaultProfiles;
            this.description = builder.description;
            this.id = builder.id;
            this.label = builder.label;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return defaultProfiles
         */
        public java.util.List<String> getDefaultProfiles() {
            return this.defaultProfiles;
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
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List<String> defaultProfiles; 
            private String description; 
            private String id; 
            private String label; 
            private String source; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.defaultProfiles = model.defaultProfiles;
                this.description = model.description;
                this.id = model.id;
                this.label = model.label;
                this.source = model.source;
            } 

            /**
             * DefaultProfiles.
             */
            public Builder defaultProfiles(java.util.List<String> defaultProfiles) {
                this.defaultProfiles = defaultProfiles;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentToolsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        private Groups(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
            this.source = builder.source;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String id; 
            private String label; 
            private String source; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.id = model.id;
                this.label = model.label;
                this.source = model.source;
                this.tools = model.tools;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentToolsResponseBody</p>
     */
    public static class Profiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Profiles(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profiles create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Profiles model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Profiles build() {
                return new Profiles(this);
            } 

        } 

    }
}
