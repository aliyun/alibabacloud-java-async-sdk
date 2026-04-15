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
 * {@link CreateAlertDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertDestinationResponseBody</p>
 */
public class CreateAlertDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAlertDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertDestinationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlertDestinationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertDestinationResponseBody build() {
            return new CreateAlertDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlertDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAlertDestinationResponseBody</p>
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
    /**
     * 
     * {@link CreateAlertDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAlertDestinationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("params")
        private Params params;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.name = builder.name;
            this.params = builder.params;
            this.source = builder.source;
            this.target = builder.target;
            this.uid = builder.uid;
            this.updatedAt = builder.updatedAt;
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
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
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

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private Integer id; 
            private String name; 
            private Params params; 
            private String source; 
            private String target; 
            private String uid; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.id = model.id;
                this.name = model.name;
                this.params = model.params;
                this.source = model.source;
                this.target = model.target;
                this.uid = model.uid;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
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
             * params.
             */
            public Builder params(Params params) {
                this.params = params;
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
             * target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
