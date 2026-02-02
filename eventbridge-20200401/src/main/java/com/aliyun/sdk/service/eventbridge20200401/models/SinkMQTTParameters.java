// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkMQTTParameters} extends {@link TeaModel}
 *
 * <p>SinkMQTTParameters</p>
 */
public class SinkMQTTParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Mqtt5UserProperty")
    private Mqtt5UserProperty mqtt5UserProperty;

    @com.aliyun.core.annotation.NameInMap("ParentTopic")
    private String parentTopic;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("SubTopic")
    private SubTopic subTopic;

    private SinkMQTTParameters(Builder builder) {
        this.instanceId = builder.instanceId;
        this.mqtt5UserProperty = builder.mqtt5UserProperty;
        this.parentTopic = builder.parentTopic;
        this.payload = builder.payload;
        this.subTopic = builder.subTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkMQTTParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mqtt5UserProperty
     */
    public Mqtt5UserProperty getMqtt5UserProperty() {
        return this.mqtt5UserProperty;
    }

    /**
     * @return parentTopic
     */
    public String getParentTopic() {
        return this.parentTopic;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return subTopic
     */
    public SubTopic getSubTopic() {
        return this.subTopic;
    }

    public static final class Builder {
        private String instanceId; 
        private Mqtt5UserProperty mqtt5UserProperty; 
        private String parentTopic; 
        private Payload payload; 
        private SubTopic subTopic; 

        private Builder() {
        } 

        private Builder(SinkMQTTParameters model) {
            this.instanceId = model.instanceId;
            this.mqtt5UserProperty = model.mqtt5UserProperty;
            this.parentTopic = model.parentTopic;
            this.payload = model.payload;
            this.subTopic = model.subTopic;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mqtt5UserProperty.
         */
        public Builder mqtt5UserProperty(Mqtt5UserProperty mqtt5UserProperty) {
            this.mqtt5UserProperty = mqtt5UserProperty;
            return this;
        }

        /**
         * ParentTopic.
         */
        public Builder parentTopic(String parentTopic) {
            this.parentTopic = parentTopic;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * SubTopic.
         */
        public Builder subTopic(SubTopic subTopic) {
            this.subTopic = subTopic;
            return this;
        }

        public SinkMQTTParameters build() {
            return new SinkMQTTParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkMQTTParameters} extends {@link TeaModel}
     *
     * <p>SinkMQTTParameters</p>
     */
    public static class Mqtt5UserProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Mqtt5UserProperty(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mqtt5UserProperty create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Mqtt5UserProperty model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Mqtt5UserProperty build() {
                return new Mqtt5UserProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkMQTTParameters} extends {@link TeaModel}
     *
     * <p>SinkMQTTParameters</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Payload(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkMQTTParameters} extends {@link TeaModel}
     *
     * <p>SinkMQTTParameters</p>
     */
    public static class SubTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SubTopic(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTopic create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(SubTopic model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SubTopic build() {
                return new SubTopic(this);
            } 

        } 

    }
}
