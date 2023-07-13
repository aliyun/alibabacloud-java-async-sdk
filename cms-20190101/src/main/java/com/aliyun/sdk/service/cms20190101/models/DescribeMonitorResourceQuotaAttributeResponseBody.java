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
         * The quota of alert phone calls in your purchased resource plan. Unit: calls.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The used quota of the time series in custom monitoring in your purchased plan.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The details about the quota of detection points that are provided by other carriers in site monitoring.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total quota of alert text messages.
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
             * The current edition of CloudMonitor. Valid values:
             * <p>
             * 
             * *   free: free edition
             * *   pro: Professional Edition
             * *   cms_post: pay-as-you-go
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The used quota of API operation calls in your purchased plan. Unit: calls.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The quota of alert text messages in your purchased resource plan.
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
             * The total quota of alert phone calls. Unit: calls.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of site monitoring tasks.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The total quota of events that can be reported in event monitoring. The total quota is the value that is multiplied by 10,000.
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SuitInfo.
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
             * The used quota of detection points that are provided by Alibaba Cloud in site monitoring in your purchased plan.
             * <p>
             * 
             * >  The value indicates the total number of detection points provided by Alibaba Cloud that are used by existing site monitoring tasks.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The details about the quota of custom monitoring.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The description of the instance.
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
             * The used quota of events that can be reported in event monitoring in your purchased plan. The product of multiplying the value and 10,000 indicates the used quota.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The details about the resource quotas of CloudMonitor.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The used quota of alert text messages in your purchased resource plan.
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
             * The quota of processed log data in log monitoring in your purchased plan. Unit: MB/min.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The quota of API operation calls in your purchased plan. Unit: 10,000 calls.
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
             * The details about the quota of detection points that are provided by Alibaba Cloud in site monitoring.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The used quota of processed log data in log monitoring in your purchased plan. Unit: MB/min.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The quota of events that can be reported in event monitoring in your purchased plan. The quota of events that can be reported in event monitoring.
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
             * The used quota of site monitoring tasks in your purchased plan.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The quota of the time series in custom monitoring in your purchased plan.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * Specifies whether to return information about used quotas. Valid values:
             * <p>
             * 
             * *   true: to include information about used quotas. Default value: true.
             * *   false: to exclude information about used quotas.
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
             * The total quota of processed log data in log monitoring. Unit: MB/min.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The time when the plan expires.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The details about the quota of event monitoring.
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
             * The total quota of the time series in custom monitoring.
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * The details about the quota.
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * The ID of the purchased subscription plan.
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

        @NameInMap("SiteMonitorEcsProbe")
        private SiteMonitorEcsProbe siteMonitorEcsProbe;

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
            this.siteMonitorEcsProbe = builder.siteMonitorEcsProbe;
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
         * @return siteMonitorEcsProbe
         */
        public SiteMonitorEcsProbe getSiteMonitorEcsProbe() {
            return this.siteMonitorEcsProbe;
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
            private SiteMonitorEcsProbe siteMonitorEcsProbe; 
            private SiteMonitorOperatorProbe siteMonitorOperatorProbe; 
            private SiteMonitorTask siteMonitorTask; 
            private String suitInfo; 

            /**
             * The details about the quota of API operation calls.
             */
            public Builder api(Api api) {
                this.api = api;
                return this;
            }

            /**
             * The quota of detection points that are provided by other carriers in site monitoring in your purchased plan.
             */
            public Builder customMonitor(CustomMonitor customMonitor) {
                this.customMonitor = customMonitor;
                return this;
            }

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder enterpriseQuota(EnterpriseQuota enterpriseQuota) {
                this.enterpriseQuota = enterpriseQuota;
                return this;
            }

            /**
             * The details about the quota of alert phone calls.
             */
            public Builder eventMonitor(EventMonitor eventMonitor) {
                this.eventMonitor = eventMonitor;
                return this;
            }

            /**
             * The total quota of detection points that are provided by Alibaba Cloud in site monitoring.
             * <p>
             * 
             * >  The value indicates the maximum number of detection points provided by Alibaba Cloud that you can select for a site monitoring task.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to DescribeMonitorResourceQuotaAttribute.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The total quota of site monitoring tasks.
             */
            public Builder logMonitor(LogMonitor logMonitor) {
                this.logMonitor = logMonitor;
                return this;
            }

            /**
             * The details about the quota of alert text messages.
             */
            public Builder phone(Phone phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The used quota of detection points that are provided by other carriers in site monitoring in your purchased plan.
             */
            public Builder SMS(SMS SMS) {
                this.SMS = SMS;
                return this;
            }

            /**
             * The error message.
             */
            public Builder siteMonitorEcsProbe(SiteMonitorEcsProbe siteMonitorEcsProbe) {
                this.siteMonitorEcsProbe = siteMonitorEcsProbe;
                return this;
            }

            /**
             * The total quota of API operation calls. Unit: 10,000 calls.
             */
            public Builder siteMonitorOperatorProbe(SiteMonitorOperatorProbe siteMonitorOperatorProbe) {
                this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
                return this;
            }

            /**
             * The quota of site monitoring tasks in your purchased plan.
             */
            public Builder siteMonitorTask(SiteMonitorTask siteMonitorTask) {
                this.siteMonitorTask = siteMonitorTask;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The HTTP status code 200 indicates that the call succeeds.
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
