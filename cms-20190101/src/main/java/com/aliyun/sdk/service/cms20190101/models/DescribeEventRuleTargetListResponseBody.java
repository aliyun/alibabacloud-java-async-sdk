// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleTargetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleTargetListResponseBody</p>
 */
public class DescribeEventRuleTargetListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContactParameters")
    private ContactParameters contactParameters;

    @NameInMap("FcParameters")
    private FcParameters fcParameters;

    @NameInMap("Message")
    private String message;

    @NameInMap("MnsParameters")
    private MnsParameters mnsParameters;

    @NameInMap("OpenApiParameters")
    private OpenApiParameters openApiParameters;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsParameters")
    private SlsParameters slsParameters;

    @NameInMap("WebhookParameters")
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

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the recipients if alert notifications are sent to the alert contacts of an alert contact group.
         */
        public Builder contactParameters(ContactParameters contactParameters) {
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * The information about the recipients in Function Compute.
         */
        public Builder fcParameters(FcParameters fcParameters) {
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about the recipients in Message Service (MNS).
         */
        public Builder mnsParameters(MnsParameters mnsParameters) {
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * The information about the recipients in OpenAPI Explorer.
         */
        public Builder openApiParameters(OpenApiParameters openApiParameters) {
            this.openApiParameters = openApiParameters;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the recipients in Log Service.
         */
        public Builder slsParameters(SlsParameters slsParameters) {
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * The information about the recipients if alert notifications are sent by sending a request to a callback URL.
         */
        public Builder webhookParameters(WebhookParameters webhookParameters) {
            this.webhookParameters = webhookParameters;
            return this;
        }

        public DescribeEventRuleTargetListResponseBody build() {
            return new DescribeEventRuleTargetListResponseBody(this);
        } 

    } 

    public static class ContactParameter extends TeaModel {
        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Level")
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

            /**
             * The name of the alert group.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The alert notification methods. Valid values:
             * <p>
             * 
             * 4: Alert notifications are sent by using DingTalk chatbots and emails.
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
    public static class ContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        private java.util.List < ContactParameter> contactParameter;

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
        public java.util.List < ContactParameter> getContactParameter() {
            return this.contactParameter;
        }

        public static final class Builder {
            private java.util.List < ContactParameter> contactParameter; 

            /**
             * ContactParameter.
             */
            public Builder contactParameter(java.util.List < ContactParameter> contactParameter) {
                this.contactParameter = contactParameter;
                return this;
            }

            public ContactParameters build() {
                return new ContactParameters(this);
            } 

        } 

    }
    public static class FCParameter extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Region")
        private String region;

        @NameInMap("ServiceName")
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

            /**
             * The Alibaba Cloud Resource Name (ARN) of the function. 
             * <p>
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: 
             * 
             * - Service: the code of an Alibaba Cloud service
             * - Region: the region ID
             * - Account: the ID of an Alibaba Cloud account
             * - ResourceType: the resource type
             * - ResourceId: the resource ID
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The name of the function.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The region where Function Compute is deployed.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The name of the Function Compute service.
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
    public static class FcParameters extends TeaModel {
        @NameInMap("FCParameter")
        private java.util.List < FCParameter> FCParameter;

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
        public java.util.List < FCParameter> getFCParameter() {
            return this.FCParameter;
        }

        public static final class Builder {
            private java.util.List < FCParameter> FCParameter; 

            /**
             * FCParameter.
             */
            public Builder FCParameter(java.util.List < FCParameter> FCParameter) {
                this.FCParameter = FCParameter;
                return this;
            }

            public FcParameters build() {
                return new FcParameters(this);
            } 

        } 

    }
    public static class MnsParameter extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("Region")
        private String region;

        @NameInMap("Topic")
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

            /**
             * The ARN of the MNS queue. 
             * <p>
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: 
             * 
             * - Service: the code of an Alibaba Cloud service
             * - Region: the region ID
             * - Account: the ID of an Alibaba Cloud account
             * - ResourceType: the resource type
             * - ResourceId: the resource ID
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the MNS queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * The region where MNS is deployed.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The MNS topic.
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
    public static class MnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        private java.util.List < MnsParameter> mnsParameter;

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
        public java.util.List < MnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

        public static final class Builder {
            private java.util.List < MnsParameter> mnsParameter; 

            /**
             * MnsParameter.
             */
            public Builder mnsParameter(java.util.List < MnsParameter> mnsParameter) {
                this.mnsParameter = mnsParameter;
                return this;
            }

            public MnsParameters build() {
                return new MnsParameters(this);
            } 

        } 

    }
    public static class OpenApiParametersOpenApiParameters extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("Product")
        private String product;

        @NameInMap("Region")
        private String region;

        @NameInMap("Role")
        private String role;

        @NameInMap("Version")
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

            /**
             * The name of the API operation.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The ARN of the API operation. 
             * <p>
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: 
             * 
             * - Service: the code of an Alibaba Cloud service
             * - Region: the region ID
             * - Account: the ID of an Alibaba Cloud account
             * - ResourceType: the resource type
             * - ResourceId: the resource ID The ARN of the Log Service Logstore. 
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields:
             * - Service: the code of an Alibaba Cloud service
             * - Region: the region ID
             * - Account: the ID of an Alibaba Cloud account
             * - ResourceType: the resource type
             * - ResourceId: the resource ID
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the cloud service to which the API operation belongs.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The region where the resource resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The name of the role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The version of the API.
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
    public static class OpenApiParameters extends TeaModel {
        @NameInMap("OpenApiParameters")
        private java.util.List < OpenApiParametersOpenApiParameters> openApiParameters;

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
        public java.util.List < OpenApiParametersOpenApiParameters> getOpenApiParameters() {
            return this.openApiParameters;
        }

        public static final class Builder {
            private java.util.List < OpenApiParametersOpenApiParameters> openApiParameters; 

            /**
             * The information about the recipients in OpenAPI Explorer.
             */
            public Builder openApiParameters(java.util.List < OpenApiParametersOpenApiParameters> openApiParameters) {
                this.openApiParameters = openApiParameters;
                return this;
            }

            public OpenApiParameters build() {
                return new OpenApiParameters(this);
            } 

        } 

    }
    public static class SlsParameter extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
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

            /**
             * The ARN of the Log Service Logstore. 
             * <p>
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: 
             * 
             * - Service: the code of an Alibaba Cloud service
             * - Region: the region ID
             * - Account: the ID of an Alibaba Cloud account
             * - ResourceType: the resource type
             * - ResourceId: the resource ID
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The ID of the region where the Log Service project resides.
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
    public static class SlsParameters extends TeaModel {
        @NameInMap("SlsParameter")
        private java.util.List < SlsParameter> slsParameter;

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
        public java.util.List < SlsParameter> getSlsParameter() {
            return this.slsParameter;
        }

        public static final class Builder {
            private java.util.List < SlsParameter> slsParameter; 

            /**
             * SlsParameter.
             */
            public Builder slsParameter(java.util.List < SlsParameter> slsParameter) {
                this.slsParameter = slsParameter;
                return this;
            }

            public SlsParameters build() {
                return new SlsParameters(this);
            } 

        } 

    }
    public static class WebhookParameter extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Method")
        private String method;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Url")
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

            /**
             * The ID of the recipient.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The HTTP request method. Valid values: GET and POST.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The protocol type.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The callback URL.
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
    public static class WebhookParameters extends TeaModel {
        @NameInMap("WebhookParameter")
        private java.util.List < WebhookParameter> webhookParameter;

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
        public java.util.List < WebhookParameter> getWebhookParameter() {
            return this.webhookParameter;
        }

        public static final class Builder {
            private java.util.List < WebhookParameter> webhookParameter; 

            /**
             * WebhookParameter.
             */
            public Builder webhookParameter(java.util.List < WebhookParameter> webhookParameter) {
                this.webhookParameter = webhookParameter;
                return this;
            }

            public WebhookParameters build() {
                return new WebhookParameters(this);
            } 

        } 

    }
}
