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
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.name = builder.name;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String description; 
        private Metadata metadata; 
        private String name; 
        private String prompt; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRequest request) {
            super(request);
            this.description = request.description;
            this.metadata = request.metadata;
            this.name = request.name;
            this.prompt = request.prompt;
        } 

        /**
         * <p>The description of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>连接配置描述信息</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The associated metadata.</p>
         */
        public Builder metadata(Metadata metadata) {
            String metadataShrink = shrink(metadata, "Metadata", "json");
            this.putBodyParameter("Metadata", metadataShrink);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The name of the agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>You are an IoT data analytics assistant...</p>
         * 
         * <strong>example:</strong>
         * <p>我想要她，你这样增加请求头获取用户IP CF-Connecting-IP%3B</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        private Attachments(Builder builder) {
            this.arn = builder.arn;
            this.mimeType = builder.mimeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        public static final class Builder {
            private String arn; 
            private String mimeType; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.arn = model.arn;
                this.mimeType = model.mimeType;
            } 

            /**
             * <p>The ARN of the attached metadata object.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:12345:eventhouse/system-rocketmq/namespace/rmq-cn-XXX/table/order</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The object type of the attached metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>inner-resource/event-table</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private java.util.List<Attachments> attachments;

        private Metadata(Builder builder) {
            this.attachments = builder.attachments;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List<Attachments> getAttachments() {
            return this.attachments;
        }

        public static final class Builder {
            private java.util.List<Attachments> attachments; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.attachments = model.attachments;
            } 

            /**
             * <p>The array of attached metadata objects.</p>
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
}
