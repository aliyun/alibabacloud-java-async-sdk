// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
    private java.util.List < AlertActions> alertActions;

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

    /**
     * @return alertActions
     */
    public java.util.List < AlertActions> getAlertActions() {
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
        private java.util.List < AlertActions> alertActions; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * alertActions.
         */
        public Builder alertActions(java.util.List < AlertActions> alertActions) {
            this.alertActions = alertActions;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
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

            /**
             * essGroupId.
             */
            public Builder essGroupId(String essGroupId) {
                this.essGroupId = essGroupId;
                return this;
            }

            /**
             * essRuleId.
             */
            public Builder essRuleId(String essRuleId) {
                this.essRuleId = essRuleId;
                return this;
            }

            /**
             * regionId.
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

            /**
             * function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * service.
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

            /**
             * mnsType.
             */
            public Builder mnsType(String mnsType) {
                this.mnsType = mnsType;
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
             * regionId.
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

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * url.
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

            /**
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * regionId.
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
        private java.util.Map < String, String > headers;

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
        public java.util.Map < String, String > getHeaders() {
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
            private java.util.Map < String, String > headers; 
            private String method; 
            private String url; 

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * headers.
             */
            public Builder headers(java.util.Map < String, String > headers) {
                this.headers = headers;
                return this;
            }

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * url.
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

        @com.aliyun.core.annotation.NameInMap("essParam")
        private EssParam essParam;

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
            this.essParam = builder.essParam;
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
         * @return essParam
         */
        public EssParam getEssParam() {
            return this.essParam;
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
            private EssParam essParam; 
            private FcParam fcParam; 
            private MnsParam mnsParam; 
            private PagerDutyParam pagerDutyParam; 
            private SlsParam slsParam; 
            private String type; 
            private WebhookParam webhookParam; 

            /**
             * alertActionId.
             */
            public Builder alertActionId(String alertActionId) {
                this.alertActionId = alertActionId;
                return this;
            }

            /**
             * alertActionName.
             */
            public Builder alertActionName(String alertActionName) {
                this.alertActionName = alertActionName;
                return this;
            }

            /**
             * essParam.
             */
            public Builder essParam(EssParam essParam) {
                this.essParam = essParam;
                return this;
            }

            /**
             * fcParam.
             */
            public Builder fcParam(FcParam fcParam) {
                this.fcParam = fcParam;
                return this;
            }

            /**
             * mnsParam.
             */
            public Builder mnsParam(MnsParam mnsParam) {
                this.mnsParam = mnsParam;
                return this;
            }

            /**
             * pagerDutyParam.
             */
            public Builder pagerDutyParam(PagerDutyParam pagerDutyParam) {
                this.pagerDutyParam = pagerDutyParam;
                return this;
            }

            /**
             * slsParam.
             */
            public Builder slsParam(SlsParam slsParam) {
                this.slsParam = slsParam;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * webhookParam.
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
