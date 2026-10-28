// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateAlertActionRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertActionRequest</p>
 */
public class CreateAlertActionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alertActionId")
    private String alertActionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alertActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertActionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ebParam")
    private EbParam ebParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essParam")
    private EssParam essParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fc3Param")
    private Fc3Param fc3Param;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fcParam")
    private FcParam fcParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mnsParam")
    private MnsParam mnsParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pagerDutyParam")
    private PagerDutyParam pagerDutyParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("slsParam")
    private SlsParam slsParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("webhookParam")
    private WebhookParam webhookParam;

    private CreateAlertActionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertActionId = builder.alertActionId;
        this.alertActionName = builder.alertActionName;
        this.ebParam = builder.ebParam;
        this.essParam = builder.essParam;
        this.fc3Param = builder.fc3Param;
        this.fcParam = builder.fcParam;
        this.mnsParam = builder.mnsParam;
        this.pagerDutyParam = builder.pagerDutyParam;
        this.slsParam = builder.slsParam;
        this.type = builder.type;
        this.webhookParam = builder.webhookParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alertActionId
     */
    public String getAlertActionId() {
        return this.alertActionId;
    }

    /**
     * @return alertActionName
     */
    public String getAlertActionName() {
        return this.alertActionName;
    }

    /**
     * @return ebParam
     */
    public EbParam getEbParam() {
        return this.ebParam;
    }

    /**
     * @return essParam
     */
    public EssParam getEssParam() {
        return this.essParam;
    }

    /**
     * @return fc3Param
     */
    public Fc3Param getFc3Param() {
        return this.fc3Param;
    }

    /**
     * @return fcParam
     */
    public FcParam getFcParam() {
        return this.fcParam;
    }

    /**
     * @return mnsParam
     */
    public MnsParam getMnsParam() {
        return this.mnsParam;
    }

    /**
     * @return pagerDutyParam
     */
    public PagerDutyParam getPagerDutyParam() {
        return this.pagerDutyParam;
    }

    /**
     * @return slsParam
     */
    public SlsParam getSlsParam() {
        return this.slsParam;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return webhookParam
     */
    public WebhookParam getWebhookParam() {
        return this.webhookParam;
    }

    public static final class Builder extends Request.Builder<CreateAlertActionRequest, Builder> {
        private String regionId; 
        private String alertActionId; 
        private String alertActionName; 
        private EbParam ebParam; 
        private EssParam essParam; 
        private Fc3Param fc3Param; 
        private FcParam fcParam; 
        private MnsParam mnsParam; 
        private PagerDutyParam pagerDutyParam; 
        private SlsParam slsParam; 
        private String type; 
        private WebhookParam webhookParam; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertActionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertActionId = request.alertActionId;
            this.alertActionName = request.alertActionName;
            this.ebParam = request.ebParam;
            this.essParam = request.essParam;
            this.fc3Param = request.fc3Param;
            this.fcParam = request.fcParam;
            this.mnsParam = request.mnsParam;
            this.pagerDutyParam = request.pagerDutyParam;
            this.slsParam = request.slsParam;
            this.type = request.type;
            this.webhookParam = request.webhookParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique identifier of the alert action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder alertActionId(String alertActionId) {
            this.putBodyParameter("alertActionId", alertActionId);
            this.alertActionId = alertActionId;
            return this;
        }

        /**
         * <p>The name of the alert action integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder alertActionName(String alertActionName) {
            this.putBodyParameter("alertActionName", alertActionName);
            this.alertActionName = alertActionName;
            return this;
        }

        /**
         * <p>The event bus parameters.</p>
         */
        public Builder ebParam(EbParam ebParam) {
            this.putBodyParameter("ebParam", ebParam);
            this.ebParam = ebParam;
            return this;
        }

        /**
         * <p>The elastic scaling parameters.</p>
         */
        public Builder essParam(EssParam essParam) {
            this.putBodyParameter("essParam", essParam);
            this.essParam = essParam;
            return this;
        }

        /**
         * <p>The Function Compute 3.0 parameters.</p>
         */
        public Builder fc3Param(Fc3Param fc3Param) {
            this.putBodyParameter("fc3Param", fc3Param);
            this.fc3Param = fc3Param;
            return this;
        }

        /**
         * <p>The Function Compute parameters.</p>
         */
        public Builder fcParam(FcParam fcParam) {
            this.putBodyParameter("fcParam", fcParam);
            this.fcParam = fcParam;
            return this;
        }

        /**
         * <p>The Simple Message Queue (formerly MNS) (MSMQ) parameters.</p>
         */
        public Builder mnsParam(MnsParam mnsParam) {
            this.putBodyParameter("mnsParam", mnsParam);
            this.mnsParam = mnsParam;
            return this;
        }

        /**
         * <p>The PagerDuty parameters.</p>
         */
        public Builder pagerDutyParam(PagerDutyParam pagerDutyParam) {
            this.putBodyParameter("pagerDutyParam", pagerDutyParam);
            this.pagerDutyParam = pagerDutyParam;
            return this;
        }

        /**
         * <p>The Simple Log Service parameters.</p>
         */
        public Builder slsParam(SlsParam slsParam) {
            this.putBodyParameter("slsParam", slsParam);
            this.slsParam = slsParam;
            return this;
        }

        /**
         * <p>The type of the alert action integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The webhook parameters.</p>
         */
        public Builder webhookParam(WebhookParam webhookParam) {
            this.putBodyParameter("webhookParam", webhookParam);
            this.webhookParam = webhookParam;
            return this;
        }

        @Override
        public CreateAlertActionRequest build() {
            return new CreateAlertActionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class EbParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ebSource")
        private String ebSource;

        @com.aliyun.core.annotation.NameInMap("eventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        private EbParam(Builder builder) {
            this.ebSource = builder.ebSource;
            this.eventBusName = builder.eventBusName;
            this.regionId = builder.regionId;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EbParam create() {
            return builder().build();
        }

        /**
         * @return ebSource
         */
        public String getEbSource() {
            return this.ebSource;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String ebSource; 
            private String eventBusName; 
            private String regionId; 
            private String subject; 

            private Builder() {
            } 

            private Builder(EbParam model) {
                this.ebSource = model.ebSource;
                this.eventBusName = model.eventBusName;
                this.regionId = model.regionId;
                this.subject = model.subject;
            } 

            /**
             * <p>The event source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ebSource(String ebSource) {
                this.ebSource = ebSource;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The subject.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public EbParam build() {
                return new EbParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class EssParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("essGroupId")
        private String essGroupId;

        @com.aliyun.core.annotation.NameInMap("essRuleId")
        private String essRuleId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private EssParam(Builder builder) {
            this.essGroupId = builder.essGroupId;
            this.essRuleId = builder.essRuleId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EssParam create() {
            return builder().build();
        }

        /**
         * @return essGroupId
         */
        public String getEssGroupId() {
            return this.essGroupId;
        }

        /**
         * @return essRuleId
         */
        public String getEssRuleId() {
            return this.essRuleId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String essGroupId; 
            private String essRuleId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(EssParam model) {
                this.essGroupId = model.essGroupId;
                this.essRuleId = model.essRuleId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the elastic scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder essGroupId(String essGroupId) {
                this.essGroupId = essGroupId;
                return this;
            }

            /**
             * <p>The ID of the elastic scaling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder essRuleId(String essRuleId) {
                this.essRuleId = essRuleId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public EssParam build() {
                return new EssParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class Fc3Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("qualifier")
        private String qualifier;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private Fc3Param(Builder builder) {
            this.function = builder.function;
            this.qualifier = builder.qualifier;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fc3Param create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String function; 
            private String qualifier; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Fc3Param model) {
                this.function = model.function;
                this.qualifier = model.qualifier;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The name of the function in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The version or alias of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-nanjing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Fc3Param build() {
                return new Fc3Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class FcParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        private FcParam(Builder builder) {
            this.function = builder.function;
            this.regionId = builder.regionId;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParam create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String function; 
            private String regionId; 
            private String service; 

            private Builder() {
            } 

            private Builder(FcParam model) {
                this.function = model.function;
                this.regionId = model.regionId;
                this.service = model.service;
            } 

            /**
             * <p>The name of the function in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>testFunction</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The service name of Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>testService</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public FcParam build() {
                return new FcParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class MnsParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mnsType")
        private String mnsType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private MnsParam(Builder builder) {
            this.mnsType = builder.mnsType;
            this.name = builder.name;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParam create() {
            return builder().build();
        }

        /**
         * @return mnsType
         */
        public String getMnsType() {
            return this.mnsType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String mnsType; 
            private String name; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(MnsParam model) {
                this.mnsType = model.mnsType;
                this.name = model.name;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The resource type of Simple Message Queue (formerly MNS) (MSMQ).</p>
             * 
             * <strong>example:</strong>
             * <p>queue</p>
             */
            public Builder mnsType(String mnsType) {
                this.mnsType = mnsType;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * <ul>
             * <li>If the resource type is queue, the resource name is the queue name.</li>
             * <li>If the resource type is topic, the resource name is the topic name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public MnsParam build() {
                return new MnsParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class PagerDutyParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PagerDutyParam(Builder builder) {
            this.key = builder.key;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagerDutyParam create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String key; 
            private String url; 

            private Builder() {
            } 

            private Builder(PagerDutyParam model) {
                this.key = model.key;
                this.url = model.url;
            } 

            /**
             * <p>The integration key of PagerDuty.</p>
             * 
             * <strong>example:</strong>
             * <p>fds3wr54rvcxfr4543t6435</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The integration webhook URL of PagerDuty. Both V1 and V2 are supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://events.pagerduty.com/v2/enqueue">https://events.pagerduty.com/v2/enqueue</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PagerDutyParam build() {
                return new PagerDutyParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class SlsParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private SlsParam(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsParam create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(SlsParam model) {
                this.logstore = model.logstore;
                this.project = model.project;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The name of the Logstore in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>testLogstore。</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the project in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>testProject</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SlsParam build() {
                return new SlsParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertActionRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertActionRequest</p>
     */
    public static class WebhookParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private WebhookParam(Builder builder) {
            this.contentType = builder.contentType;
            this.headers = builder.headers;
            this.method = builder.method;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebhookParam create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String contentType; 
            private java.util.Map<String, String> headers; 
            private String method; 
            private String url; 

            private Builder() {
            } 

            private Builder(WebhookParam model) {
                this.contentType = model.contentType;
                this.headers = model.headers;
                this.method = model.method;
                this.url = model.url;
            } 

            /**
             * <p>The data format. This parameter takes effect only when the request method is POST.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The request header information.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The webhook request method.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The alert callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.test.com">http://www.test.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WebhookParam build() {
                return new WebhookParam(this);
            } 

        } 

    }
}
