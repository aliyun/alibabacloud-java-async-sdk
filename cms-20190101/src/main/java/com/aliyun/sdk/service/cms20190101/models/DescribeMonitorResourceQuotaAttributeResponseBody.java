// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
 */
public class DescribeMonitorResourceQuotaAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceQuota")
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
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31BC7201-00F2-47B2-B7B9-6A173076ACE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the resource quotas of CloudMonitor.</p>
         */
        public Builder resourceQuota(ResourceQuota resourceQuota) {
            this.resourceQuota = resourceQuota;
            return this;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBody build() {
            return new DescribeMonitorResourceQuotaAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of API calls. Unit: 10,000 calls.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of API calls in your resource plan. Unit: 10,000 calls.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of API calls in your resource plan. Unit: calls.</p>
             * 
             * <strong>example:</strong>
             * <p>9987</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class CustomMonitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of the time series for custom monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of the time series for custom monitoring in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of the time series for custom monitoring in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class EnterpriseQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SuitInfo")
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
             * <p>The ID of the instance monitored by Hybrid Cloud Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>cms_enterprise_public_cn-7mz27pd****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The description of Hybrid Cloud Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>ENTERPRISE</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class EventMonitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of events that can be reported in event monitoring. The total quota is the value that is multiplied by 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class LogMonitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of processed log data in log monitoring. Unit: MB/min.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of processed log data in log monitoring in your resource plan. Unit: MB/min.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of processed log data in log monitoring in your resource plan. Unit: MB/min.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class Phone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of alert phone calls. Unit: calls.</p>
             * 
             * <strong>example:</strong>
             * <p>550</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of alert phone calls in your resource plan. Unit: calls.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of alert phone calls in your resource plan. Unit: calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SMS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of alert text messages. Unit: messages.</p>
             * 
             * <strong>example:</strong>
             * <p>550</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of alert text messages in your resource plan. Unit: messages.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of alert text messages in your resource plan. Unit: messages.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SiteMonitorBrowser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of browser detection tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of browser detection tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of browser detection tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SiteMonitorEcsProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of ECS detection points for site monitoring.</p>
             * <blockquote>
             * <p>The value indicates the maximum number of ECS detection points that you can select for a site monitoring task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of ECS detection points for site monitoring in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of ECS detection points for site monitoring in your resource plan.</p>
             * <blockquote>
             * <p>The value indicates the total number of ECS detection points that are used by existing site monitoring tasks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SiteMonitorMobile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of mobile detection tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of mobile detection tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of mobile detection tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SiteMonitorOperatorProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of carrier detection points for site monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of carrier detection points for site monitoring in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of carrier detection points for site monitoring in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class SiteMonitorTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaLimit")
        private Integer quotaLimit;

        @com.aliyun.core.annotation.NameInMap("QuotaPackage")
        private Integer quotaPackage;

        @com.aliyun.core.annotation.NameInMap("QuotaUsed")
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
             * <p>The total quota of site monitoring tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder quotaLimit(Integer quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The quota of site monitoring tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder quotaPackage(Integer quotaPackage) {
                this.quotaPackage = quotaPackage;
                return this;
            }

            /**
             * <p>The used quota of site monitoring tasks in your resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
    /**
     * 
     * {@link DescribeMonitorResourceQuotaAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorResourceQuotaAttributeResponseBody</p>
     */
    public static class ResourceQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private Api api;

        @com.aliyun.core.annotation.NameInMap("CustomMonitor")
        private CustomMonitor customMonitor;

        @com.aliyun.core.annotation.NameInMap("EnterpriseQuota")
        private EnterpriseQuota enterpriseQuota;

        @com.aliyun.core.annotation.NameInMap("EventMonitor")
        private EventMonitor eventMonitor;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LogMonitor")
        private LogMonitor logMonitor;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private Phone phone;

        @com.aliyun.core.annotation.NameInMap("SMS")
        private SMS SMS;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorBrowser")
        private SiteMonitorBrowser siteMonitorBrowser;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorEcsProbe")
        private SiteMonitorEcsProbe siteMonitorEcsProbe;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorMobile")
        private SiteMonitorMobile siteMonitorMobile;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorOperatorProbe")
        private SiteMonitorOperatorProbe siteMonitorOperatorProbe;

        @com.aliyun.core.annotation.NameInMap("SiteMonitorTask")
        private SiteMonitorTask siteMonitorTask;

        @com.aliyun.core.annotation.NameInMap("SuitInfo")
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
             * <p>The details about the quota of API calls.</p>
             */
            public Builder api(Api api) {
                this.api = api;
                return this;
            }

            /**
             * <p>The details about the quota for custom monitoring.</p>
             */
            public Builder customMonitor(CustomMonitor customMonitor) {
                this.customMonitor = customMonitor;
                return this;
            }

            /**
             * <p>The details about the quota of Hybrid Cloud Monitoring.</p>
             */
            public Builder enterpriseQuota(EnterpriseQuota enterpriseQuota) {
                this.enterpriseQuota = enterpriseQuota;
                return this;
            }

            /**
             * <p>The details about the quota for event monitoring.</p>
             */
            public Builder eventMonitor(EventMonitor eventMonitor) {
                this.eventMonitor = eventMonitor;
                return this;
            }

            /**
             * <p>The time when the resource plan expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-28</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cms_edition-cn-n6w20rn****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The details about the quota for log monitoring.</p>
             */
            public Builder logMonitor(LogMonitor logMonitor) {
                this.logMonitor = logMonitor;
                return this;
            }

            /**
             * <p>The details about the quota of alert phone calls.</p>
             */
            public Builder phone(Phone phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The details about the quota of alert text messages.</p>
             */
            public Builder SMS(SMS SMS) {
                this.SMS = SMS;
                return this;
            }

            /**
             * <p>The quota of browser detection tasks.</p>
             */
            public Builder siteMonitorBrowser(SiteMonitorBrowser siteMonitorBrowser) {
                this.siteMonitorBrowser = siteMonitorBrowser;
                return this;
            }

            /**
             * <p>The details about the quota of ECS detection points for site monitoring.</p>
             */
            public Builder siteMonitorEcsProbe(SiteMonitorEcsProbe siteMonitorEcsProbe) {
                this.siteMonitorEcsProbe = siteMonitorEcsProbe;
                return this;
            }

            /**
             * <p>The quota of mobile detection tasks.</p>
             */
            public Builder siteMonitorMobile(SiteMonitorMobile siteMonitorMobile) {
                this.siteMonitorMobile = siteMonitorMobile;
                return this;
            }

            /**
             * <p>The details about the quota of carrier detection points for site monitoring.</p>
             */
            public Builder siteMonitorOperatorProbe(SiteMonitorOperatorProbe siteMonitorOperatorProbe) {
                this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
                return this;
            }

            /**
             * <p>The quota of site monitoring tasks.</p>
             */
            public Builder siteMonitorTask(SiteMonitorTask siteMonitorTask) {
                this.siteMonitorTask = siteMonitorTask;
                return this;
            }

            /**
             * <p>The current edition of CloudMonitor. Valid values:</p>
             * <ul>
             * <li>free: Free Edition</li>
             * <li>pro: Pro Edition</li>
             * <li>cms_post: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pro</p>
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
