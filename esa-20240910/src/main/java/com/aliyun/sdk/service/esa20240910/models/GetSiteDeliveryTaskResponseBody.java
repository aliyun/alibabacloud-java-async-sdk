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
            this.requestId = model.requestId;
            this.sinkConfig = model.sinkConfig;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.status = model.status;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The log category. Valid values:</p>
         * <ul>
         * <li>dcdn_log_access_l1 (default): access logs.</li>
         * <li>dcdn_log_er: Edge Routine logs.</li>
         * <li>dcdn_log_waf: firewall logs.</li>
         * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
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
         * <ol>
         * <li>cn: the Chinese mainland.</li>
         * <li>sg: outside the Chinese mainland.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The destination of the delivery. Valid values:</p>
         * <ol>
         * <li>sls: Alibaba Cloud Simple Log Service (SLS).</li>
         * <li>http: HTTP server.</li>
         * <li>aws3: Amazon Simple Storage Service (S3).</li>
         * <li>oss: Alibaba Cloud Object Storage Service (OSS).</li>
         * <li>kafka: Kafka.</li>
         * <li>aws3cmpt: S3-compatible storage service.</li>
         * </ol>
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
         * <p>The log fields.</p>
         * 
         * <strong>example:</strong>
         * <p>Client,UserAgent</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The filtering rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder filterRules(String filterRules) {
            this.filterRules = filterRules;
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
         * <p>{&quot;Region&quot;: &quot;cn-hangzhou&quot;, &quot;Endpoint&quot;: &quot;https://***.oss-cn-hangzhou.aliyuncs.com&quot;, &quot;BucketPath&quot;: &quot;hjy-test002/online-logs&quot;}</p>
         */
        public Builder sinkConfig(Object sinkConfig) {
            this.sinkConfig = sinkConfig;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.***.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>The status of the delivery task.</p>
         * <ul>
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
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
         * <p>The name of the delivery task.</p>
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
