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
 * {@link UpdateAlertDestinationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertDestinationRequest</p>
 */
public class UpdateAlertDestinationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("app_id")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("app_secret")
    private String appSecret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_id")
    private java.util.List<String> groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imbot")
    private Boolean imbot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private Params params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    private UpdateAlertDestinationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSecret = builder.appSecret;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.imbot = builder.imbot;
        this.name = builder.name;
        this.params = builder.params;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return groupId
     */
    public java.util.List<String> getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imbot
     */
    public Boolean getImbot() {
        return this.imbot;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<UpdateAlertDestinationRequest, Builder> {
        private String appId; 
        private String appSecret; 
        private java.util.List<String> groupId; 
        private String id; 
        private Boolean imbot; 
        private String name; 
        private Params params; 
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertDestinationRequest request) {
            super(request);
            this.appId = request.appId;
            this.appSecret = request.appSecret;
            this.groupId = request.groupId;
            this.id = request.id;
            this.imbot = request.imbot;
            this.name = request.name;
            this.params = request.params;
            this.source = request.source;
            this.target = request.target;
        } 

        /**
         * app_id.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("app_id", appId);
            this.appId = appId;
            return this;
        }

        /**
         * app_secret.
         */
        public Builder appSecret(String appSecret) {
            this.putBodyParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        /**
         * group_id.
         */
        public Builder groupId(java.util.List<String> groupId) {
            this.putBodyParameter("group_id", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * imbot.
         */
        public Builder imbot(Boolean imbot) {
            this.putBodyParameter("imbot", imbot);
            this.imbot = imbot;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * params.
         */
        public Builder params(Params params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        @Override
        public UpdateAlertDestinationRequest build() {
            return new UpdateAlertDestinationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAlertDestinationRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertDestinationRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("sec")
        private String sec;

        @com.aliyun.core.annotation.NameInMap("webhook")
        private String webhook;

        private Params(Builder builder) {
            this.email = builder.email;
            this.phone = builder.phone;
            this.sec = builder.sec;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return sec
         */
        public String getSec() {
            return this.sec;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String email; 
            private String phone; 
            private String sec; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.email = model.email;
                this.phone = model.phone;
                this.sec = model.sec;
                this.webhook = model.webhook;
            } 

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * sec.
             */
            public Builder sec(String sec) {
                this.sec = sec;
                return this;
            }

            /**
             * webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
