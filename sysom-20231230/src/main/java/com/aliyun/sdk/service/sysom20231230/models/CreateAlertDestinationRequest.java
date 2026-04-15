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
 * {@link CreateAlertDestinationRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertDestinationRequest</p>
 */
public class CreateAlertDestinationRequest extends Request {
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

    private CreateAlertDestinationRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.params = builder.params;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateAlertDestinationRequest, Builder> {
        private String name; 
        private Params params; 
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertDestinationRequest request) {
            super(request);
            this.name = request.name;
            this.params = request.params;
            this.source = request.source;
            this.target = request.target;
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
        public CreateAlertDestinationRequest build() {
            return new CreateAlertDestinationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlertDestinationRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertDestinationRequest</p>
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
