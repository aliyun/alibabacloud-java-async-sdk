// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
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
         * <p>The information about the recipients if alert notifications are sent to the alert contacts of an alert contact group.</p>
         */
        public Builder contactParameters(ContactParameters contactParameters) {
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * <p>The information about the recipients in Function Compute.</p>
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
         * <p>The information about the recipients in Message Service (MNS).</p>
         */
        public Builder mnsParameters(MnsParameters mnsParameters) {
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * <p>The information about the recipients in OpenAPI Explorer.</p>
         */
        public Builder openApiParameters(OpenApiParameters openApiParameters) {
            this.openApiParameters = openApiParameters;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>87170bc7-e28a-4c93-b9bf-90a1dbe84736</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the recipients in Log Service.</p>
         */
        public Builder slsParameters(SlsParameters slsParameters) {
            this.slsParameters = slsParameters;
            return this;
        }

        /**
         * <p>The information about the recipients if alert notifications are sent by sending a request to a callback URL.</p>
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

            /**
             * <p>The name of the alert group.</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The alert notification methods. Valid values:</p>
             * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the function. </p>
             * <p>Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields: </p>
             * <ul>
             * <li>Service: the code of an Alibaba Cloud service</li>
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
             * <p>The name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>fcTest1</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region where Function Compute is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p>service1</p>
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

            /**
             * <p>The ARN of the MNS queue. </p>
             * <p>Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields: </p>
             * <ul>
             * <li>Service: the code of an Alibaba Cloud service</li>
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
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>testQueue</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The region where MNS is deployed.</p>
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

            /**
             * <p>The name of the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>PutLogs</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The ARN of the API operation. </p>
             * <p>Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields: </p>
             * <ul>
             * <li>Service: the code of an Alibaba Cloud service</li>
             * <li>Region: the region ID</li>
             * <li>Account: the ID of an Alibaba Cloud account</li>
             * <li>ResourceType: the resource type</li>
             * <li>ResourceId: the resource ID The ARN of the Log Service Logstore.</li>
             * </ul>
             * <p>Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields:</p>
             * <ul>
             * <li>Service: the code of an Alibaba Cloud service</li>
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
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * <p>The information about the recipients in OpenAPI Explorer.</p>
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

            /**
             * <p>The ARN of the Log Service Logstore. </p>
             * <p>Format: <code>arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}</code>. Fields: </p>
             * <ul>
             * <li>Service: the code of an Alibaba Cloud service</li>
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
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>logstore_test</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>project_test</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The ID of the region where the Log Service project resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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

            /**
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values: GET and POST.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
