// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutEventRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutEventRuleTargetsRequest</p>
 */
public class PutEventRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactParameters")
    private java.util.List < ContactParameters> contactParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FcParameters")
    private java.util.List < FcParameters> fcParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MnsParameters")
    private java.util.List < MnsParameters> mnsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenApiParameters")
    private java.util.List < OpenApiParameters> openApiParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsParameters")
    private java.util.List < SlsParameters> slsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebhookParameters")
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
         * <p>The information about the alert contact groups that receive alert notifications.</p>
         */
        public Builder contactParameters(java.util.List < ContactParameters> contactParameters) {
            this.putQueryParameter("ContactParameters", contactParameters);
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * <p>The information about the recipients in Function Compute.</p>
         */
        public Builder fcParameters(java.util.List < FcParameters> fcParameters) {
            this.putQueryParameter("FcParameters", fcParameters);
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * <p>The information about the recipients in Message Service (MNS).</p>
         */
        public Builder mnsParameters(java.util.List < MnsParameters> mnsParameters) {
            this.putQueryParameter("MnsParameters", mnsParameters);
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * <p>The parameters of API callback notification.</p>
         */
        public Builder openApiParameters(java.util.List < OpenApiParameters> openApiParameters) {
            this.putQueryParameter("OpenApiParameters", openApiParameters);
            this.openApiParameters = openApiParameters;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEventRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The information about the recipients in Simple Log Service.</p>
         */
        public Builder slsParameters(java.util.List < SlsParameters> slsParameters) {
            this.putQueryParameter("SlsParameters", slsParameters);
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * <p>The information about the callback URLs that are used to receive alert notifications.</p>
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

    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class ContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * <p>The name of the alert contact group. Valid values of N: 1 to 5.</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The alert level and the corresponding notification methods. Valid values of N: 1 to 5. Valid values:</p>
             * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class FcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
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
             * <p>The name of the function. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>fc-test</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region where Function Compute is deployed. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the Function Compute service. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>fc-test</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class MnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the MNS queue. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>queue1</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The region where Message Service (MNS) is deployed. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The MNS topic.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_sample</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class OpenApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>PutLogs</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Valid values of N: 1 to 5. Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields:</p>
             * <ul>
             * <li>Service: the code of a cloud service</li>
             * <li>Region: the region ID</li>
             * <li>Account: the ID of an Alibaba Cloud account</li>
             * <li>ResourceType: the resource type</li>
             * <li>ResourceId: the resource ID</li>
             * </ul>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the recipient that receives alert notifications sent by an API callback.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The parameters of the alert callback. Specify the parameters in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * <p>The ID of the cloud service to which the API operation belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>log</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The region where the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>MyRole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The version of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class SlsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
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
             * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service Logstore. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>testlogstore</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>testproject</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region where Simple Log Service is deployed. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsRequest</p>
     */
    public static class WebhookParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values of N: 1 to 5.</p>
             * <p>Valid values: GET and POST.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The name of the protocol. Valid values of N: 1 to 5. Valid values:</p>
             * <ul>
             * <li>http</li>
             * <li>telnet</li>
             * <li>ping</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The callback URL. Valid values of N: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
