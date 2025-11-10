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
 * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertActionsResponseBody</p>
 */
public class ListAlertActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertActions")
    private java.util.List<AlertActions> alertActions;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAlertActionsResponseBody(Builder builder) {
        this.alertActions = builder.alertActions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertActionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertActions
     */
    public java.util.List<AlertActions> getAlertActions() {
        return this.alertActions;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AlertActions> alertActions; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAlertActionsResponseBody model) {
            this.alertActions = model.alertActions;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>List of alert action configurations.</p>
         */
        public Builder alertActions(java.util.List<AlertActions> alertActions) {
            this.alertActions = alertActions;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAlertActionsResponseBody build() {
            return new ListAlertActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Event source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ebSource(String ebSource) {
                this.ebSource = ebSource;
                return this;
            }

            /**
             * <p>Event bus name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Subject.</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Elastic scaling group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder essGroupId(String essGroupId) {
                this.essGroupId = essGroupId;
                return this;
            }

            /**
             * <p>Elastic scaling rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testId</p>
             */
            public Builder essRuleId(String essRuleId) {
                this.essRuleId = essRuleId;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Function name of the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>Version or alias of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Function name in the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Function Compute service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Resource type of the Lightweight Message Queue (formerly MNS).</p>
             * 
             * <strong>example:</strong>
             * <p>queue</p>
             */
            public Builder mnsType(String mnsType) {
                this.mnsType = mnsType;
                return this;
            }

            /**
             * <p>Resource name.</p>
             * <ul>
             * <li>If the resource type is queue, the resource name is the queue name.</li>
             * <li>If the resource type is topic, the resource name is the topic name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Integration key for PagerDuty.</p>
             * 
             * <strong>example:</strong>
             * <p>fsfer4543t5t65g4t4</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Integration webhook for PagerDuty. Supports V1 and V2 versions.</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Logstore name of the Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
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
             * <p>Data format, effective when the request method is POST.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Request headers.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>Webhook request method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The URL address for the alarm callback.</p>
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
    /**
     * 
     * {@link ListAlertActionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertActionsResponseBody</p>
     */
    public static class AlertActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionId")
        private String alertActionId;

        @com.aliyun.core.annotation.NameInMap("alertActionName")
        private String alertActionName;

        @com.aliyun.core.annotation.NameInMap("ebParam")
        private EbParam ebParam;

        @com.aliyun.core.annotation.NameInMap("essParam")
        private EssParam essParam;

        @com.aliyun.core.annotation.NameInMap("fc3Param")
        private Fc3Param fc3Param;

        @com.aliyun.core.annotation.NameInMap("fcParam")
        private FcParam fcParam;

        @com.aliyun.core.annotation.NameInMap("mnsParam")
        private MnsParam mnsParam;

        @com.aliyun.core.annotation.NameInMap("pagerDutyParam")
        private PagerDutyParam pagerDutyParam;

        @com.aliyun.core.annotation.NameInMap("slsParam")
        private SlsParam slsParam;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("webhookParam")
        private WebhookParam webhookParam;

        private AlertActions(Builder builder) {
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

        public static AlertActions create() {
            return builder().build();
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

        public static final class Builder {
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
            } 

            private Builder(AlertActions model) {
                this.alertActionId = model.alertActionId;
                this.alertActionName = model.alertActionName;
                this.ebParam = model.ebParam;
                this.essParam = model.essParam;
                this.fc3Param = model.fc3Param;
                this.fcParam = model.fcParam;
                this.mnsParam = model.mnsParam;
                this.pagerDutyParam = model.pagerDutyParam;
                this.slsParam = model.slsParam;
                this.type = model.type;
                this.webhookParam = model.webhookParam;
            } 

            /**
             * <p>Unique identifier for the action integration.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder alertActionId(String alertActionId) {
                this.alertActionId = alertActionId;
                return this;
            }

            /**
             * <p>Alert action name.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder alertActionName(String alertActionName) {
                this.alertActionName = alertActionName;
                return this;
            }

            /**
             * <p>Event Bridge parameters.</p>
             */
            public Builder ebParam(EbParam ebParam) {
                this.ebParam = ebParam;
                return this;
            }

            /**
             * <p>Elastic scaling parameters.</p>
             */
            public Builder essParam(EssParam essParam) {
                this.essParam = essParam;
                return this;
            }

            /**
             * <p>Function Compute 3.0 parameters.</p>
             */
            public Builder fc3Param(Fc3Param fc3Param) {
                this.fc3Param = fc3Param;
                return this;
            }

            /**
             * <p>Function Compute parameters.</p>
             */
            public Builder fcParam(FcParam fcParam) {
                this.fcParam = fcParam;
                return this;
            }

            /**
             * <p>Lightweight Message Queue (formerly MNS) parameters.</p>
             */
            public Builder mnsParam(MnsParam mnsParam) {
                this.mnsParam = mnsParam;
                return this;
            }

            /**
             * <p>PagerDuty parameters</p>
             */
            public Builder pagerDutyParam(PagerDutyParam pagerDutyParam) {
                this.pagerDutyParam = pagerDutyParam;
                return this;
            }

            /**
             * <p>Log Service parameters.</p>
             */
            public Builder slsParam(SlsParam slsParam) {
                this.slsParam = slsParam;
                return this;
            }

            /**
             * <p>Action integration type.</p>
             * 
             * <strong>example:</strong>
             * <p>FC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Webhook parameters</p>
             */
            public Builder webhookParam(WebhookParam webhookParam) {
                this.webhookParam = webhookParam;
                return this;
            }

            public AlertActions build() {
                return new AlertActions(this);
            } 

        } 

    }
}
