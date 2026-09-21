// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSiteDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteDeliveryTaskResponseBody</p>
 */
public class GetSiteDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.NameInMap("FieldList")
    private String fieldList;

    @com.aliyun.core.annotation.NameInMap("FilterRules")
    private String filterRules;

    @com.aliyun.core.annotation.NameInMap("FilterVer")
    private String filterVer;

    @com.aliyun.core.annotation.NameInMap("RawRule")
    private String rawRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SinkConfig")
    private Object sinkConfig;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private GetSiteDeliveryTaskResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.discardRate = builder.discardRate;
        this.fieldList = builder.fieldList;
        this.filterRules = builder.filterRules;
        this.filterVer = builder.filterVer;
        this.rawRule = builder.rawRule;
        this.requestId = builder.requestId;
        this.sinkConfig = builder.sinkConfig;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.status = builder.status;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteDeliveryTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return discardRate
     */
    public Float getDiscardRate() {
        return this.discardRate;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return filterRules
     */
    public String getFilterRules() {
        return this.filterRules;
    }

    /**
     * @return filterVer
     */
    public String getFilterVer() {
        return this.filterVer;
    }

    /**
     * @return rawRule
     */
    public String getRawRule() {
        return this.rawRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sinkConfig
     */
    public Object getSinkConfig() {
        return this.sinkConfig;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String businessType; 
        private String dataCenter; 
        private String deliveryType; 
        private Float discardRate; 
        private String fieldList; 
        private String filterRules; 
        private String filterVer; 
        private String rawRule; 
        private String requestId; 
        private Object sinkConfig; 
        private Long siteId; 
        private String siteName; 
        private String status; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(GetSiteDeliveryTaskResponseBody model) {
            this.businessType = model.businessType;
            this.dataCenter = model.dataCenter;
            this.deliveryType = model.deliveryType;
            this.discardRate = model.discardRate;
            this.fieldList = model.fieldList;
            this.filterRules = model.filterRules;
            this.filterVer = model.filterVer;
            this.rawRule = model.rawRule;
            this.requestId = model.requestId;
            this.sinkConfig = model.sinkConfig;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.status = model.status;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The real-time log type. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1 (default)</strong>: access log.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine function log.</li>
         * <li><strong>dcdn_log_waf</strong>: security protection log.</li>
         * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration log.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: the Chinese mainland.</li>
         * <li><strong>sg</strong>: global (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The delivery type. Valid values:</p>
         * <ul>
         * <li><strong>sls</strong>: Alibaba Cloud Simple Log Service.</li>
         * <li><strong>http</strong>: HTTP service.</li>
         * <li><strong>aws3</strong>: Amazon S3 service.</li>
         * <li><strong>oss</strong>: Alibaba Cloud Object Storage Service.</li>
         * <li><strong>kafka</strong>: Kafka service.</li>
         * <li><strong>aws3cmpt</strong>: Amazon S3-compatible service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The discard rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The list of delivery fields.</p>
         * 
         * <strong>example:</strong>
         * <p>Client,UserAgent</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The filter rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder filterRules(String filterRules) {
            this.filterRules = filterRules;
            return this;
        }

        /**
         * <p>The version of the filter rules.</p>
         * <blockquote>
         * <p>For backward compatibility with legacy filter rules, the default value is v1. Newly created tasks use v2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder filterVer(String filterVer) {
            this.filterVer = filterVer;
            return this;
        }

        /**
         * <p>The filter rules for the delivery task.</p>
         * <blockquote>
         * <p>The new version of delivery filter rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;where&quot;: {
         *     &quot;or&quot;: [
         *       {
         *         &quot;and&quot;: [
         *           { &quot;key&quot;: &quot;site&quot;, &quot;operator&quot;: &quot;eq&quot;, &quot;value&quot;: &quot;example.com&quot; },
         *           { &quot;key&quot;: &quot;status_code&quot;, &quot;operator&quot;: &quot;in&quot;, &quot;value&quot;: [&quot;200&quot;, &quot;304&quot;] }
         *         ]
         *       }
         *     ]
         *   }
         * }</p>
         */
        public Builder rawRule(String rawRule) {
            this.rawRule = rawRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;Endpoint\&quot;: \&quot;https://***.oss-cn-hangzhou.aliyuncs.com\&quot;, \&quot;BucketPath\&quot;: \&quot;hjy-test002/online-logs\&quot;}</p>
         */
        public Builder sinkConfig(Object sinkConfig) {
            this.sinkConfig = sinkConfig;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.***.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p><strong>online</strong>: pushing.</p>
         * </li>
         * <li><p><strong>offline</strong>: push paused.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn-test-task</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public GetSiteDeliveryTaskResponseBody build() {
            return new GetSiteDeliveryTaskResponseBody(this);
        } 

    } 

}
