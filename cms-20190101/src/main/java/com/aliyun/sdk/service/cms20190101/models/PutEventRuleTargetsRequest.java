// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEventRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutEventRuleTargetsRequest</p>
 */
public class PutEventRuleTargetsRequest extends Request {
    @Query
    @NameInMap("ContactParameters")
    private java.util.List < ContactParameters> contactParameters;

    @Query
    @NameInMap("FcParameters")
    private java.util.List < FcParameters> fcParameters;

    @Query
    @NameInMap("MnsParameters")
    private java.util.List < MnsParameters> mnsParameters;

    @Query
    @NameInMap("OpenApiParameters")
    private java.util.List < OpenApiParameters> openApiParameters;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("SlsParameters")
    private java.util.List < SlsParameters> slsParameters;

    @Query
    @NameInMap("WebhookParameters")
    private java.util.List < WebhookParameters> webhookParameters;

    private PutEventRuleTargetsRequest(Builder builder) {
        super(builder);
        this.contactParameters = builder.contactParameters;
        this.fcParameters = builder.fcParameters;
        this.mnsParameters = builder.mnsParameters;
        this.openApiParameters = builder.openApiParameters;
        this.ruleName = builder.ruleName;
        this.slsParameters = builder.slsParameters;
        this.webhookParameters = builder.webhookParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactParameters
     */
    public java.util.List < ContactParameters> getContactParameters() {
        return this.contactParameters;
    }

    /**
     * @return fcParameters
     */
    public java.util.List < FcParameters> getFcParameters() {
        return this.fcParameters;
    }

    /**
     * @return mnsParameters
     */
    public java.util.List < MnsParameters> getMnsParameters() {
        return this.mnsParameters;
    }

    /**
     * @return openApiParameters
     */
    public java.util.List < OpenApiParameters> getOpenApiParameters() {
        return this.openApiParameters;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return slsParameters
     */
    public java.util.List < SlsParameters> getSlsParameters() {
        return this.slsParameters;
    }

    /**
     * @return webhookParameters
     */
    public java.util.List < WebhookParameters> getWebhookParameters() {
        return this.webhookParameters;
    }

    public static final class Builder extends Request.Builder<PutEventRuleTargetsRequest, Builder> {
        private java.util.List < ContactParameters> contactParameters; 
        private java.util.List < FcParameters> fcParameters; 
        private java.util.List < MnsParameters> mnsParameters; 
        private java.util.List < OpenApiParameters> openApiParameters; 
        private String ruleName; 
        private java.util.List < SlsParameters> slsParameters; 
        private java.util.List < WebhookParameters> webhookParameters; 

        private Builder() {
            super();
        } 

        private Builder(PutEventRuleTargetsRequest request) {
            super(request);
            this.contactParameters = request.contactParameters;
            this.fcParameters = request.fcParameters;
            this.mnsParameters = request.mnsParameters;
            this.openApiParameters = request.openApiParameters;
            this.ruleName = request.ruleName;
            this.slsParameters = request.slsParameters;
            this.webhookParameters = request.webhookParameters;
        } 

        /**
         * The information about the alert contact groups that receive alert notifications.
         */
        public Builder contactParameters(java.util.List < ContactParameters> contactParameters) {
            this.putQueryParameter("ContactParameters", contactParameters);
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * The information about the recipients in Function Compute.
         */
        public Builder fcParameters(java.util.List < FcParameters> fcParameters) {
            this.putQueryParameter("FcParameters", fcParameters);
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * The information about the recipients in Message Service (MNS).
         */
        public Builder mnsParameters(java.util.List < MnsParameters> mnsParameters) {
            this.putQueryParameter("MnsParameters", mnsParameters);
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * The parameters of API callback notification.
         */
        public Builder openApiParameters(java.util.List < OpenApiParameters> openApiParameters) {
            this.putQueryParameter("OpenApiParameters", openApiParameters);
            this.openApiParameters = openApiParameters;
            return this;
        }

        /**
         * The name of the alert rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The information about the recipients in Simple Log Service.
         */
        public Builder slsParameters(java.util.List < SlsParameters> slsParameters) {
            this.putQueryParameter("SlsParameters", slsParameters);
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * The information about the callback URLs that are used to receive alert notifications.
         */
        public Builder webhookParameters(java.util.List < WebhookParameters> webhookParameters) {
            this.putQueryParameter("WebhookParameters", webhookParameters);
            this.webhookParameters = webhookParameters;
            return this;
        }

        @Override
        public PutEventRuleTargetsRequest build() {
            return new PutEventRuleTargetsRequest(this);
        } 

    } 

    public static class ContactParameters extends TeaModel {
        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Level")
        private String level;

        private ContactParameters(Builder builder) {
            this.contactGroupName = builder.contactGroupName;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameters create() {
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
             * The name of the alert contact group. Valid values of N: 1 to 5.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The alert level and the corresponding notification methods. Valid values of N: 1 to 5. Valid values:
             * <p>
             * 
             * 4: Alert notifications are sent by using DingTalk chatbots and emails.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public ContactParameters build() {
                return new ContactParameters(this);
            } 

        } 

    }
    public static class FcParameters extends TeaModel {
        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Region")
        private String region;

        @NameInMap("ServiceName")
        private String serviceName;

        private FcParameters(Builder builder) {
            this.functionName = builder.functionName;
            this.id = builder.id;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParameters create() {
            return builder().build();
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
            private String functionName; 
            private String id; 
            private String region; 
            private String serviceName; 

            /**
             * The name of the function. Valid values of N: 1 to 5.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The region where Function Compute is deployed. Valid values of N: 1 to 5.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The name of the Function Compute service. Valid values of N: 1 to 5.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FcParameters build() {
                return new FcParameters(this);
            } 

        } 

    }
    public static class MnsParameters extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("Region")
        private String region;

        @NameInMap("Topic")
        private String topic;

        private MnsParameters(Builder builder) {
            this.id = builder.id;
            this.queue = builder.queue;
            this.region = builder.region;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameters create() {
            return builder().build();
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
            private String id; 
            private String queue; 
            private String region; 
            private String topic; 

            /**
             * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the MNS queue. Valid values of N: 1 to 5.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * The region where Message Service (MNS) is deployed. Valid values of N: 1 to 5.
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

            public MnsParameters build() {
                return new MnsParameters(this);
            } 

        } 

    }
    public static class OpenApiParameters extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("JsonParams")
        private String jsonParams;

        @NameInMap("Product")
        private String product;

        @NameInMap("Region")
        private String region;

        @NameInMap("Role")
        private String role;

        @NameInMap("Version")
        private String version;

        private OpenApiParameters(Builder builder) {
            this.action = builder.action;
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
            this.product = builder.product;
            this.region = builder.region;
            this.role = builder.role;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenApiParameters create() {
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
         * @return jsonParams
         */
        public String getJsonParams() {
            return this.jsonParams;
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
            private String jsonParams; 
            private String product; 
            private String region; 
            private String role; 
            private String version; 

            /**
             * The API name.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the resource. Valid values of N: 1 to 5. Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields:
             * <p>
             * 
             * *   Service: the code of a cloud service
             * *   Region: the region ID
             * *   Account: the ID of an Alibaba Cloud account
             * *   ResourceType: the resource type
             * *   ResourceId: the resource ID
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the recipient that receives alert notifications sent by an API callback.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The parameters of the alert callback. Specify the parameters in the JSON format.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
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

            public OpenApiParameters build() {
                return new OpenApiParameters(this);
            } 

        } 

    }
    public static class SlsParameters extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
        private String region;

        private SlsParameters(Builder builder) {
            this.id = builder.id;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsParameters create() {
            return builder().build();
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
            private String id; 
            private String logStore; 
            private String project; 
            private String region; 

            /**
             * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the Simple Log Service Logstore. Valid values of N: 1 to 5.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The name of the Simple Log Service project. Valid values of N: 1 to 5.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The region where Simple Log Service is deployed. Valid values of N: 1 to 5.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public SlsParameters build() {
                return new SlsParameters(this);
            } 

        } 

    }
    public static class WebhookParameters extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Method")
        private String method;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Url")
        private String url;

        private WebhookParameters(Builder builder) {
            this.id = builder.id;
            this.method = builder.method;
            this.protocol = builder.protocol;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookParameters create() {
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
             * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The HTTP request method. Valid values of N: 1 to 5.
             * <p>
             * 
             * Valid values: GET and POST.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The name of the protocol. Valid values of N: 1 to 5. Valid values:
             * <p>
             * 
             * *   http
             * *   telnet
             * *   ping
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The callback URL. Valid values of N: 1 to 5.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebhookParameters build() {
                return new WebhookParameters(this);
            } 

        } 

    }
}
