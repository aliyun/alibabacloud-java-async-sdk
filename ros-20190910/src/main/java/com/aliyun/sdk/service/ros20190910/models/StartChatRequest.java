// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link StartChatRequest} extends {@link RequestModel}
 *
 * <p>StartChatRequest</p>
 */
public class StartChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePartialMessage")
    private Boolean enablePartialMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableThinking")
    private Boolean enableThinking;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private StartChatRequest(Builder builder) {
        super(builder);
        this.agentVersion = builder.agentVersion;
        this.attachments = builder.attachments;
        this.enablePartialMessage = builder.enablePartialMessage;
        this.enableThinking = builder.enableThinking;
        this.mode = builder.mode;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return enablePartialMessage
     */
    public Boolean getEnablePartialMessage() {
        return this.enablePartialMessage;
    }

    /**
     * @return enableThinking
     */
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<StartChatRequest, Builder> {
        private String agentVersion; 
        private java.util.List<Attachments> attachments; 
        private Boolean enablePartialMessage; 
        private Boolean enableThinking; 
        private String mode; 
        private String query; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(StartChatRequest request) {
            super(request);
            this.agentVersion = request.agentVersion;
            this.attachments = request.attachments;
            this.enablePartialMessage = request.enablePartialMessage;
            this.enableThinking = request.enableThinking;
            this.mode = request.mode;
            this.query = request.query;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * AgentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * Attachments.
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.putQueryParameter("Attachments", attachments);
            this.attachments = attachments;
            return this;
        }

        /**
         * EnablePartialMessage.
         */
        public Builder enablePartialMessage(Boolean enablePartialMessage) {
            this.putQueryParameter("EnablePartialMessage", enablePartialMessage);
            this.enablePartialMessage = enablePartialMessage;
            return this;
        }

        /**
         * EnableThinking.
         */
        public Builder enableThinking(Boolean enableThinking) {
            this.putQueryParameter("EnableThinking", enableThinking);
            this.enableThinking = enableThinking;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>你是谁</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public StartChatRequest build() {
            return new StartChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartChatRequest} extends {@link TeaModel}
     *
     * <p>StartChatRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssObjectKey")
        private String ossObjectKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Attachments(Builder builder) {
            this.mimeType = builder.mimeType;
            this.name = builder.name;
            this.ossObjectKey = builder.ossObjectKey;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossObjectKey
         */
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String mimeType; 
            private String name; 
            private String ossObjectKey; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.mimeType = model.mimeType;
                this.name = model.name;
                this.ossObjectKey = model.ossObjectKey;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * MimeType.
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
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
             * OssObjectKey.
             */
            public Builder ossObjectKey(String ossObjectKey) {
                this.ossObjectKey = ossObjectKey;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
}
