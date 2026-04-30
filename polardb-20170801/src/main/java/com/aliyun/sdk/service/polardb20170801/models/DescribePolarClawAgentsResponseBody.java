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
 * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawAgentsResponseBody</p>
 */
public class DescribePolarClawAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agents")
    private java.util.List<Agents> agents;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DefaultId")
    private String defaultId;

    @com.aliyun.core.annotation.NameInMap("MainKey")
    private String mainKey;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private DescribePolarClawAgentsResponseBody(Builder builder) {
        this.agents = builder.agents;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.defaultId = builder.defaultId;
        this.mainKey = builder.mainKey;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agents
     */
    public java.util.List<Agents> getAgents() {
        return this.agents;
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
     * @return defaultId
     */
    public String getDefaultId() {
        return this.defaultId;
    }

    /**
     * @return mainKey
     */
    public String getMainKey() {
        return this.mainKey;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List<Agents> agents; 
        private String applicationId; 
        private Integer code; 
        private String defaultId; 
        private String mainKey; 
        private String message; 
        private String requestId; 
        private String scope; 

        private Builder() {
        } 

        private Builder(DescribePolarClawAgentsResponseBody model) {
            this.agents = model.agents;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.defaultId = model.defaultId;
            this.mainKey = model.mainKey;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scope = model.scope;
        } 

        /**
         * Agents.
         */
        public Builder agents(java.util.List<Agents> agents) {
            this.agents = agents;
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
         * DefaultId.
         */
        public Builder defaultId(String defaultId) {
            this.defaultId = defaultId;
            return this;
        }

        /**
         * MainKey.
         */
        public Builder mainKey(String mainKey) {
            this.mainKey = mainKey;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public DescribePolarClawAgentsResponseBody build() {
            return new DescribePolarClawAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Identity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Emoji")
        private String emoji;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        private Identity(Builder builder) {
            this.avatar = builder.avatar;
            this.avatarUrl = builder.avatarUrl;
            this.emoji = builder.emoji;
            this.name = builder.name;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identity create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return emoji
         */
        public String getEmoji() {
            return this.emoji;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private String avatar; 
            private String avatarUrl; 
            private String emoji; 
            private String name; 
            private String theme; 

            private Builder() {
            } 

            private Builder(Identity model) {
                this.avatar = model.avatar;
                this.avatarUrl = model.avatarUrl;
                this.emoji = model.emoji;
                this.name = model.name;
                this.theme = model.theme;
            } 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * Emoji.
             */
            public Builder emoji(String emoji) {
                this.emoji = emoji;
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
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public Identity build() {
                return new Identity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private Identity identity;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Agents(Builder builder) {
            this.id = builder.id;
            this.identity = builder.identity;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return identity
         */
        public Identity getIdentity() {
            return this.identity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private Identity identity; 
            private String name; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.id = model.id;
                this.identity = model.identity;
                this.name = model.name;
            } 

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
}
