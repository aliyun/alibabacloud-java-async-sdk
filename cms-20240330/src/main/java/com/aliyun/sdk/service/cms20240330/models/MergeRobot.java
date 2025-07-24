// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MergeRobot} extends {@link TeaModel}
 *
 * <p>MergeRobot</p>
 */
public class MergeRobot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("extend")
    private Extend extend;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("webhook")
    private String webhook;

    private MergeRobot(Builder builder) {
        this.createTime = builder.createTime;
        this.extend = builder.extend;
        this.gmtModified = builder.gmtModified;
        this.identifier = builder.identifier;
        this.lang = builder.lang;
        this.name = builder.name;
        this.source = builder.source;
        this.type = builder.type;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeRobot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return extend
     */
    public Extend getExtend() {
        return this.extend;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder {
        private String createTime; 
        private Extend extend; 
        private String gmtModified; 
        private String identifier; 
        private String lang; 
        private String name; 
        private String source; 
        private String type; 
        private String webhook; 

        private Builder() {
        } 

        private Builder(MergeRobot model) {
            this.createTime = model.createTime;
            this.extend = model.extend;
            this.gmtModified = model.gmtModified;
            this.identifier = model.identifier;
            this.lang = model.lang;
            this.name = model.name;
            this.source = model.source;
            this.type = model.type;
            this.webhook = model.webhook;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * extend.
         */
        public Builder extend(Extend extend) {
            this.extend = extend;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * webhook.
         */
        public Builder webhook(String webhook) {
            this.webhook = webhook;
            return this;
        }

        public MergeRobot build() {
            return new MergeRobot(this);
        } 

    } 

    /**
     * 
     * {@link MergeRobot} extends {@link TeaModel}
     *
     * <p>MergeRobot</p>
     */
    public static class Extend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardTemplate")
        private String cardTemplate;

        @com.aliyun.core.annotation.NameInMap("dailyNoc")
        private Boolean dailyNoc;

        @com.aliyun.core.annotation.NameInMap("dailyNocTime")
        private String dailyNocTime;

        @com.aliyun.core.annotation.NameInMap("dingSignKey")
        private String dingSignKey;

        @com.aliyun.core.annotation.NameInMap("enableOutgoing")
        private Boolean enableOutgoing;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Extend(Builder builder) {
            this.cardTemplate = builder.cardTemplate;
            this.dailyNoc = builder.dailyNoc;
            this.dailyNocTime = builder.dailyNocTime;
            this.dingSignKey = builder.dingSignKey;
            this.enableOutgoing = builder.enableOutgoing;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extend create() {
            return builder().build();
        }

        /**
         * @return cardTemplate
         */
        public String getCardTemplate() {
            return this.cardTemplate;
        }

        /**
         * @return dailyNoc
         */
        public Boolean getDailyNoc() {
            return this.dailyNoc;
        }

        /**
         * @return dailyNocTime
         */
        public String getDailyNocTime() {
            return this.dailyNocTime;
        }

        /**
         * @return dingSignKey
         */
        public String getDingSignKey() {
            return this.dingSignKey;
        }

        /**
         * @return enableOutgoing
         */
        public Boolean getEnableOutgoing() {
            return this.enableOutgoing;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String cardTemplate; 
            private Boolean dailyNoc; 
            private String dailyNocTime; 
            private String dingSignKey; 
            private Boolean enableOutgoing; 
            private String token; 

            private Builder() {
            } 

            private Builder(Extend model) {
                this.cardTemplate = model.cardTemplate;
                this.dailyNoc = model.dailyNoc;
                this.dailyNocTime = model.dailyNocTime;
                this.dingSignKey = model.dingSignKey;
                this.enableOutgoing = model.enableOutgoing;
                this.token = model.token;
            } 

            /**
             * cardTemplate.
             */
            public Builder cardTemplate(String cardTemplate) {
                this.cardTemplate = cardTemplate;
                return this;
            }

            /**
             * dailyNoc.
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * dailyNocTime.
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * dingSignKey.
             */
            public Builder dingSignKey(String dingSignKey) {
                this.dingSignKey = dingSignKey;
                return this;
            }

            /**
             * enableOutgoing.
             */
            public Builder enableOutgoing(Boolean enableOutgoing) {
                this.enableOutgoing = enableOutgoing;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Extend build() {
                return new Extend(this);
            } 

        } 

    }
}
