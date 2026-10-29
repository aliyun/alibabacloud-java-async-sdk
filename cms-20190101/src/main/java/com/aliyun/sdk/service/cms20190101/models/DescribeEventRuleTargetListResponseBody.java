// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleTargetListResponseBody</p>
 */
public class DescribeEventRuleTargetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContactParameters")
    private ContactParameters contactParameters;

    @com.aliyun.core.annotation.NameInMap("FcParameters")
    private FcParameters fcParameters;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MnsParameters")
    private MnsParameters mnsParameters;

    @com.aliyun.core.annotation.NameInMap("OpenApiParameters")
    private OpenApiParameters openApiParameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsParameters")
    private SlsParameters slsParameters;

    @com.aliyun.core.annotation.NameInMap("WebhookParameters")
    private WebhookParameters webhookParameters;

    private DescribeEventRuleTargetListResponseBody(Builder builder) {
        this.code = builder.code;
        this.contactParameters = builder.contactParameters;
        this.fcParameters = builder.fcParameters;
        this.message = builder.message;
        this.mnsParameters = builder.mnsParameters;
        this.openApiParameters = builder.openApiParameters;
        this.requestId = builder.requestId;
        this.slsParameters = builder.slsParameters;
        this.webhookParameters = builder.webhookParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleTargetListResponseBody create() {
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
     * @return contactParameters
     */
    public ContactParameters getContactParameters() {
        return this.contactParameters;
    }

    /**
     * @return fcParameters
     */
    public FcParameters getFcParameters() {
        return this.fcParameters;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mnsParameters
     */
    public MnsParameters getMnsParameters() {
        return this.mnsParameters;
    }

    /**
     * @return openApiParameters
     */
    public OpenApiParameters getOpenApiParameters() {
        return this.openApiParameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsParameters
     */
    public SlsParameters getSlsParameters() {
        return this.slsParameters;
    }

    /**
     * @return webhookParameters
     */
    public WebhookParameters getWebhookParameters() {
        return this.webhookParameters;
    }

    public static final class Builder {
        private String code; 
        private ContactParameters contactParameters; 
        private FcParameters fcParameters; 
        private String message; 
        private MnsParameters mnsParameters; 
        private OpenApiParameters openApiParameters; 
        private String requestId; 
        private SlsParameters slsParameters; 
        private WebhookParameters webhookParameters; 

        private Builder() {
        } 

        private Builder(DescribeEventRuleTargetListResponseBody model) {
            this.code = model.code;
            this.contactParameters = model.contactParameters;
            this.fcParameters = model.fcParameters;
            this.message = model.message;
            this.mnsParameters = model.mnsParameters;
            this.openApiParameters = model.openApiParameters;
            this.requestId = model.requestId;
            this.slsParameters = model.slsParameters;
            this.webhookParameters = model.webhookParameters;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A value of 200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContactParameters.
         */
        public Builder contactParameters(ContactParameters contactParameters) {
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * FcParameters.
         */
        public Builder fcParameters(FcParameters fcParameters) {
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MnsParameters.
         */
        public Builder mnsParameters(MnsParameters mnsParameters) {
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * OpenApiParameters.
         */
        public Builder openApiParameters(OpenApiParameters openApiParameters) {
            this.openApiParameters = openApiParameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87170bc7-e28a-4c93-b9bf-90a1dbe84736</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsParameters.
         */
        public Builder slsParameters(SlsParameters slsParameters) {
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * WebhookParameters.
         */
        public Builder webhookParameters(WebhookParameters webhookParameters) {
            this.webhookParameters = webhookParameters;
            return this;
        }

        public DescribeEventRuleTargetListResponseBody build() {
            return new DescribeEventRuleTargetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class ContactParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private ContactParameter(Builder builder) {
            this.contactGroupName = builder.contactGroupName;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameter create() {
            return builder().build();
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String contactGroupName; 
            private String id; 
            private String level; 

            private Builder() {
            } 

            private Builder(ContactParameter model) {
                this.contactGroupName = model.contactGroupName;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * ContactGroupName.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public ContactParameter build() {
                return new ContactParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class ContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactParameter")
        private java.util.List<ContactParameter> contactParameter;

        private ContactParameters(Builder builder) {
            this.contactParameter = builder.contactParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameters create() {
            return builder().build();
        }

        /**
         * @return contactParameter
         */
        public java.util.List<ContactParameter> getContactParameter() {
            return this.contactParameter;
        }

        public static final class Builder {
            private java.util.List<ContactParameter> contactParameter; 

            private Builder() {
            } 

            private Builder(ContactParameters model) {
                this.contactParameter = model.contactParameter;
            } 

            /**
             * ContactParameter.
             */
            public Builder contactParameter(java.util.List<ContactParameter> contactParameter) {
                this.contactParameter = contactParameter;
                return this;
            }

            public ContactParameters build() {
                return new ContactParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class FCParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private FCParameter(Builder builder) {
            this.arn = builder.arn;
            this.functionName = builder.functionName;
            this.id = builder.id;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FCParameter create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String arn; 
            private String functionName; 
            private String id; 
            private String region; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(FCParameter model) {
                this.arn = model.arn;
                this.functionName = model.functionName;
                this.id = model.id;
                this.region = model.region;
                this.serviceName = model.serviceName;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FCParameter build() {
                return new FCParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class FcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FCParameter")
        private java.util.List<FCParameter> FCParameter;

        private FcParameters(Builder builder) {
            this.FCParameter = builder.FCParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParameters create() {
            return builder().build();
        }

        /**
         * @return FCParameter
         */
        public java.util.List<FCParameter> getFCParameter() {
            return this.FCParameter;
        }

        public static final class Builder {
            private java.util.List<FCParameter> FCParameter; 

            private Builder() {
            } 

            private Builder(FcParameters model) {
                this.FCParameter = model.FCParameter;
            } 

            /**
             * FCParameter.
             */
            public Builder FCParameter(java.util.List<FCParameter> FCParameter) {
                this.FCParameter = FCParameter;
                return this;
            }

            public FcParameters build() {
                return new FcParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class MnsParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private MnsParameter(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.queue = builder.queue;
            this.region = builder.region;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameter create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String queue; 
            private String region; 
            private String topic; 

            private Builder() {
            } 

            private Builder(MnsParameter model) {
                this.arn = model.arn;
                this.id = model.id;
                this.queue = model.queue;
                this.region = model.region;
                this.topic = model.topic;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
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
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public MnsParameter build() {
                return new MnsParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class MnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MnsParameter")
        private java.util.List<MnsParameter> mnsParameter;

        private MnsParameters(Builder builder) {
            this.mnsParameter = builder.mnsParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameters create() {
            return builder().build();
        }

        /**
         * @return mnsParameter
         */
        public java.util.List<MnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

        public static final class Builder {
            private java.util.List<MnsParameter> mnsParameter; 

            private Builder() {
            } 

            private Builder(MnsParameters model) {
                this.mnsParameter = model.mnsParameter;
            } 

            /**
             * MnsParameter.
             */
            public Builder mnsParameter(java.util.List<MnsParameter> mnsParameter) {
                this.mnsParameter = mnsParameter;
                return this;
            }

            public MnsParameters build() {
                return new MnsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class OpenApiParametersOpenApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private OpenApiParametersOpenApiParameters(Builder builder) {
            this.action = builder.action;
            this.arn = builder.arn;
            this.id = builder.id;
            this.product = builder.product;
            this.region = builder.region;
            this.role = builder.role;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenApiParametersOpenApiParameters create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String action; 
            private String arn; 
            private String id; 
            private String product; 
            private String region; 
            private String role; 
            private String version; 

            private Builder() {
            } 

            private Builder(OpenApiParametersOpenApiParameters model) {
                this.action = model.action;
                this.arn = model.arn;
                this.id = model.id;
                this.product = model.product;
                this.region = model.region;
                this.role = model.role;
                this.version = model.version;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
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
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public OpenApiParametersOpenApiParameters build() {
                return new OpenApiParametersOpenApiParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class OpenApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenApiParameters")
        private java.util.List<OpenApiParametersOpenApiParameters> openApiParameters;

        private OpenApiParameters(Builder builder) {
            this.openApiParameters = builder.openApiParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenApiParameters create() {
            return builder().build();
        }

        /**
         * @return openApiParameters
         */
        public java.util.List<OpenApiParametersOpenApiParameters> getOpenApiParameters() {
            return this.openApiParameters;
        }

        public static final class Builder {
            private java.util.List<OpenApiParametersOpenApiParameters> openApiParameters; 

            private Builder() {
            } 

            private Builder(OpenApiParameters model) {
                this.openApiParameters = model.openApiParameters;
            } 

            /**
             * OpenApiParameters.
             */
            public Builder openApiParameters(java.util.List<OpenApiParametersOpenApiParameters> openApiParameters) {
                this.openApiParameters = openApiParameters;
                return this;
            }

            public OpenApiParameters build() {
                return new OpenApiParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class SlsParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private SlsParameter(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsParameter create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String logStore; 
            private String project; 
            private String region; 

            private Builder() {
            } 

            private Builder(SlsParameter model) {
                this.arn = model.arn;
                this.id = model.id;
                this.logStore = model.logStore;
                this.project = model.project;
                this.region = model.region;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
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
             * LogStore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public SlsParameter build() {
                return new SlsParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class SlsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlsParameter")
        private java.util.List<SlsParameter> slsParameter;

        private SlsParameters(Builder builder) {
            this.slsParameter = builder.slsParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsParameters create() {
            return builder().build();
        }

        /**
         * @return slsParameter
         */
        public java.util.List<SlsParameter> getSlsParameter() {
            return this.slsParameter;
        }

        public static final class Builder {
            private java.util.List<SlsParameter> slsParameter; 

            private Builder() {
            } 

            private Builder(SlsParameters model) {
                this.slsParameter = model.slsParameter;
            } 

            /**
             * SlsParameter.
             */
            public Builder slsParameter(java.util.List<SlsParameter> slsParameter) {
                this.slsParameter = slsParameter;
                return this;
            }

            public SlsParameters build() {
                return new SlsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class WebhookParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private WebhookParameter(Builder builder) {
            this.id = builder.id;
            this.method = builder.method;
            this.protocol = builder.protocol;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookParameter create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String method; 
            private String protocol; 
            private String url; 

            private Builder() {
            } 

            private Builder(WebhookParameter model) {
                this.id = model.id;
                this.method = model.method;
                this.protocol = model.protocol;
                this.url = model.url;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebhookParameter build() {
                return new WebhookParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleTargetListResponseBody</p>
     */
    public static class WebhookParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WebhookParameter")
        private java.util.List<WebhookParameter> webhookParameter;

        private WebhookParameters(Builder builder) {
            this.webhookParameter = builder.webhookParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookParameters create() {
            return builder().build();
        }

        /**
         * @return webhookParameter
         */
        public java.util.List<WebhookParameter> getWebhookParameter() {
            return this.webhookParameter;
        }

        public static final class Builder {
            private java.util.List<WebhookParameter> webhookParameter; 

            private Builder() {
            } 

            private Builder(WebhookParameters model) {
                this.webhookParameter = model.webhookParameter;
            } 

            /**
             * WebhookParameter.
             */
            public Builder webhookParameter(java.util.List<WebhookParameter> webhookParameter) {
                this.webhookParameter = webhookParameter;
                return this;
            }

            public WebhookParameters build() {
                return new WebhookParameters(this);
            } 

        } 

    }
}
