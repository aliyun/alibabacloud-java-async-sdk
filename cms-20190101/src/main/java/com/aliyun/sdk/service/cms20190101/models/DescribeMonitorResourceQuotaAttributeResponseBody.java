// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
 */
public class DescribeMonitorResourceQuotaAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceQuota")
    private ResourceQuota resourceQuota;

    private DescribeMonitorResourceQuotaAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resourceQuota = builder.resourceQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorResourceQuotaAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceQuota
     */
    public ResourceQuota getResourceQuota() {
        return this.resourceQuota;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResourceQuota resourceQuota; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the resource quotas of CloudMonitor.
         */
        public Builder resourceQuota(ResourceQuota resourceQuota) {
            this.resourceQuota = resourceQuota;
            return this;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBody build() {
            return new DescribeMonitorResourceQuotaAttributeResponseBody(this);
        } 

    } 

    public static class Api extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private Api(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Api create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of API calls. Unit: 10,000 calls.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of API calls in your resource plan. Unit: 10,000 calls.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of API calls in your resource plan. Unit: calls.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
    public static class CustomMonitor extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private CustomMonitor(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomMonitor create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of the time series for custom monitoring.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of the time series for custom monitoring in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of the time series for custom monitoring in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public CustomMonitor build() {
                return new CustomMonitor(this);
            } 

        } 

    }
    public static class EnterpriseQuota extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SuitInfo")
        private String suitInfo;

        private EnterpriseQuota(Builder builder) {
            this.instanceId = builder.instanceId;
            this.suitInfo = builder.suitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnterpriseQuota create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return suitInfo
         */
        public String getSuitInfo() {
            return this.suitInfo;
        }

        public static final class Builder {
            private String instanceId; 
            private String suitInfo; 

            /**
             * The ID of the instance monitored by Hybrid Cloud Monitoring.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The description of Hybrid Cloud Monitoring.
             */
            public Builder suitInfo(String suitInfo) {
                this.suitInfo = suitInfo;
                return this;
            }

            public EnterpriseQuota build() {
                return new EnterpriseQuota(this);
            } 

        } 

    }
    public static class EventMonitor extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private EventMonitor(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventMonitor create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of events that can be reported in event monitoring. The total quota is the value that is multiplied by 10,000.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public EventMonitor build() {
                return new EventMonitor(this);
            } 

        } 

    }
    public static class LogMonitor extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private LogMonitor(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMonitor create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of processed log data in log monitoring. Unit: MB/min.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of processed log data in log monitoring in your resource plan. Unit: MB/min.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of processed log data in log monitoring in your resource plan. Unit: MB/min.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public LogMonitor build() {
                return new LogMonitor(this);
            } 

        } 

    }
    public static class Phone extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private Phone(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phone create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of alert phone calls. Unit: calls.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of alert phone calls in your resource plan. Unit: calls.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of alert phone calls in your resource plan. Unit: calls.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public Phone build() {
                return new Phone(this);
            } 

        } 

    }
    public static class SMS extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SMS(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SMS create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of alert text messages.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of alert text messages in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of alert text messages in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SMS build() {
                return new SMS(this);
            } 

        } 

    }
    public static class SiteMonitorBrowser extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SiteMonitorBrowser(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitorBrowser create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of browser detection tasks.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of browser detection tasks in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of browser detection tasks in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SiteMonitorBrowser build() {
                return new SiteMonitorBrowser(this);
            } 

        } 

    }
    public static class SiteMonitorEcsProbe extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SiteMonitorEcsProbe(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitorEcsProbe create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of ECS detection points for site monitoring.
             * <p>
             * 
             * > The value indicates the maximum number of ECS detection points that you can select for a site monitoring task.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of ECS detection points for site monitoring in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of ECS detection points for site monitoring in your resource plan.
             * <p>
             * 
             * > The value indicates the total number of ECS detection points that are used by existing site monitoring tasks.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SiteMonitorEcsProbe build() {
                return new SiteMonitorEcsProbe(this);
            } 

        } 

    }
    public static class SiteMonitorMobile extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SiteMonitorMobile(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitorMobile create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of mobile detection tasks.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of mobile detection tasks in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of mobile detection tasks in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SiteMonitorMobile build() {
                return new SiteMonitorMobile(this);
            } 

        } 

    }
    public static class SiteMonitorOperatorProbe extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SiteMonitorOperatorProbe(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitorOperatorProbe create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of carrier detection points for site monitoring.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of carrier detection points for site monitoring in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of carrier detection points for site monitoring in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SiteMonitorOperatorProbe build() {
                return new SiteMonitorOperatorProbe(this);
            } 

        } 

    }
    public static class SiteMonitorTask extends TeaModel {
        @NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @NameInMap("QuotaUsed")
        private Integer quotaUsed;

        private SiteMonitorTask(Builder builder) {
            this.quotaLimit = builder.quotaLimit;
            this.quotaPackage = builder.quotaPackage;
            this.quotaUsed = builder.quotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitorTask create() {
            return builder().build();
        }

        /**
         * @return quotaLimit
         */
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return quotaPackage
         */
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        /**
         * @return quotaUsed
         */
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

        public static final class Builder {
            private Integer quotaLimit; 
            private Integer quotaPackage; 
            private Integer quotaUsed; 

            /**
             * The total quota of site monitoring tasks.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of site monitoring tasks in your resource plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of site monitoring tasks in your resource plan.
             */
            public Builder quotaUsed(Integer quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            public SiteMonitorTask build() {
                return new SiteMonitorTask(this);
            } 

        } 

    }
    public static class ResourceQuota extends TeaModel {
        @NameInMap("Api")
        private Api api;

        @NameInMap("CustomMonitor")
        private CustomMonitor customMonitor;

        @NameInMap("EnterpriseQuota")
        private EnterpriseQuota enterpriseQuota;

        @NameInMap("EventMonitor")
        private EventMonitor eventMonitor;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LogMonitor")
        private LogMonitor logMonitor;

        @NameInMap("Phone")
        private Phone phone;

        @NameInMap("SMS")
        private SMS SMS;

        @NameInMap("SiteMonitorBrowser")
        private SiteMonitorBrowser siteMonitorBrowser;

        @NameInMap("SiteMonitorEcsProbe")
        private SiteMonitorEcsProbe siteMonitorEcsProbe;

        @NameInMap("SiteMonitorMobile")
        private SiteMonitorMobile siteMonitorMobile;

        @NameInMap("SiteMonitorOperatorProbe")
        private SiteMonitorOperatorProbe siteMonitorOperatorProbe;

        @NameInMap("SiteMonitorTask")
        private SiteMonitorTask siteMonitorTask;

        @NameInMap("SuitInfo")
        private String suitInfo;

        private ResourceQuota(Builder builder) {
            this.api = builder.api;
            this.customMonitor = builder.customMonitor;
            this.enterpriseQuota = builder.enterpriseQuota;
            this.eventMonitor = builder.eventMonitor;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.logMonitor = builder.logMonitor;
            this.phone = builder.phone;
            this.SMS = builder.SMS;
            this.siteMonitorBrowser = builder.siteMonitorBrowser;
            this.siteMonitorEcsProbe = builder.siteMonitorEcsProbe;
            this.siteMonitorMobile = builder.siteMonitorMobile;
            this.siteMonitorOperatorProbe = builder.siteMonitorOperatorProbe;
            this.siteMonitorTask = builder.siteMonitorTask;
            this.suitInfo = builder.suitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceQuota create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public Api getApi() {
            return this.api;
        }

        /**
         * @return customMonitor
         */
        public CustomMonitor getCustomMonitor() {
            return this.customMonitor;
        }

        /**
         * @return enterpriseQuota
         */
        public EnterpriseQuota getEnterpriseQuota() {
            return this.enterpriseQuota;
        }

        /**
         * @return eventMonitor
         */
        public EventMonitor getEventMonitor() {
            return this.eventMonitor;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logMonitor
         */
        public LogMonitor getLogMonitor() {
            return this.logMonitor;
        }

        /**
         * @return phone
         */
        public Phone getPhone() {
            return this.phone;
        }

        /**
         * @return SMS
         */
        public SMS getSMS() {
            return this.SMS;
        }

        /**
         * @return siteMonitorBrowser
         */
        public SiteMonitorBrowser getSiteMonitorBrowser() {
            return this.siteMonitorBrowser;
        }

        /**
         * @return siteMonitorEcsProbe
         */
        public SiteMonitorEcsProbe getSiteMonitorEcsProbe() {
            return this.siteMonitorEcsProbe;
        }

        /**
         * @return siteMonitorMobile
         */
        public SiteMonitorMobile getSiteMonitorMobile() {
            return this.siteMonitorMobile;
        }

        /**
         * @return siteMonitorOperatorProbe
         */
        public SiteMonitorOperatorProbe getSiteMonitorOperatorProbe() {
            return this.siteMonitorOperatorProbe;
        }

        /**
         * @return siteMonitorTask
         */
        public SiteMonitorTask getSiteMonitorTask() {
            return this.siteMonitorTask;
        }

        /**
         * @return suitInfo
         */
        public String getSuitInfo() {
            return this.suitInfo;
        }

        public static final class Builder {
            private Api api; 
            private CustomMonitor customMonitor; 
            private EnterpriseQuota enterpriseQuota; 
            private EventMonitor eventMonitor; 
            private String expireTime; 
            private String instanceId; 
            private LogMonitor logMonitor; 
            private Phone phone; 
            private SMS SMS; 
            private SiteMonitorBrowser siteMonitorBrowser; 
            private SiteMonitorEcsProbe siteMonitorEcsProbe; 
            private SiteMonitorMobile siteMonitorMobile; 
            private SiteMonitorOperatorProbe siteMonitorOperatorProbe; 
            private SiteMonitorTask siteMonitorTask; 
            private String suitInfo; 

            /**
             * The details about the quota of API calls.
             */
            public Builder api(Api api) {
                this.api = api;
                return this;
            }

            /**
             * The details about the quota for custom monitoring.
             */
            public Builder customMonitor(CustomMonitor customMonitor) {
                this.customMonitor = customMonitor;
                return this;
            }

            /**
             * The details about the quota of Hybrid Cloud Monitoring.
             */
            public Builder enterpriseQuota(EnterpriseQuota enterpriseQuota) {
                this.enterpriseQuota = enterpriseQuota;
                return this;
            }

            /**
             * The details about the quota for event monitoring.
             */
            public Builder eventMonitor(EventMonitor eventMonitor) {
                this.eventMonitor = eventMonitor;
                return this;
            }

            /**
             * The time when the resource plan expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the resource plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The details about the quota for log monitoring.
             */
            public Builder logMonitor(LogMonitor logMonitor) {
                this.logMonitor = logMonitor;
                return this;
            }

            /**
             * The details about the quota of alert phone calls.
             */
            public Builder phone(Phone phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The details about the quota of alert text messages.
             */
            public Builder SMS(SMS SMS) {
                this.SMS = SMS;
                return this;
            }

            /**
             * The quota of browser detection tasks.
             */
            public Builder siteMonitorBrowser(SiteMonitorBrowser siteMonitorBrowser) {
                this.siteMonitorBrowser = siteMonitorBrowser;
                return this;
            }

            /**
             * The details about the quota of ECS detection points for site monitoring.
             */
            public Builder siteMonitorEcsProbe(SiteMonitorEcsProbe siteMonitorEcsProbe) {
                this.siteMonitorEcsProbe = siteMonitorEcsProbe;
                return this;
            }

            /**
             * The quota of mobile detection tasks.
             */
            public Builder siteMonitorMobile(SiteMonitorMobile siteMonitorMobile) {
                this.siteMonitorMobile = siteMonitorMobile;
                return this;
            }

            /**
             * The details about the quota of carrier detection points for site monitoring.
             */
            public Builder siteMonitorOperatorProbe(SiteMonitorOperatorProbe siteMonitorOperatorProbe) {
                this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
                return this;
            }

            /**
             * The quota of site monitoring tasks.
             */
            public Builder siteMonitorTask(SiteMonitorTask siteMonitorTask) {
                this.siteMonitorTask = siteMonitorTask;
                return this;
            }

            /**
             * The current edition of CloudMonitor. Valid values:
             * <p>
             * 
             * *   free: Free Edition
             * *   pro: Pro Edition
             * *   cms_post: pay-as-you-go
             */
            public Builder suitInfo(String suitInfo) {
                this.suitInfo = suitInfo;
                return this;
            }

            public ResourceQuota build() {
                return new ResourceQuota(this);
            } 

        } 

    }
}
