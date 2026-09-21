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
 * {@link GetUserDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserDeliveryTaskResponseBody</p>
 */
public class GetUserDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

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

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private GetUserDeliveryTaskResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.details = builder.details;
        this.discardRate = builder.discardRate;
        this.fieldList = builder.fieldList;
        this.filterRules = builder.filterRules;
        this.filterVer = builder.filterVer;
        this.rawRule = builder.rawRule;
        this.requestId = builder.requestId;
        this.sinkConfig = builder.sinkConfig;
        this.status = builder.status;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeliveryTaskResponseBody create() {
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
     * @return details
     */
    public String getDetails() {
        return this.details;
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
        private String details; 
        private Float discardRate; 
        private String fieldList; 
        private String filterRules; 
        private String filterVer; 
        private String rawRule; 
        private String requestId; 
        private Object sinkConfig; 
        private String status; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(GetUserDeliveryTaskResponseBody model) {
            this.businessType = model.businessType;
            this.dataCenter = model.dataCenter;
            this.deliveryType = model.deliveryType;
            this.details = model.details;
            this.discardRate = model.discardRate;
            this.fieldList = model.fieldList;
            this.filterRules = model.filterRules;
            this.filterVer = model.filterVer;
            this.rawRule = model.rawRule;
            this.requestId = model.requestId;
            this.sinkConfig = model.sinkConfig;
            this.status = model.status;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The business type. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine function logs.</li>
         * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
         * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_er</p>
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
         * <p>oss</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The list of Edge Routine PODs.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The discard rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The field array.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientRequestID,ClientRequestHost</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The filter rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ClientSSLProtocol&quot;: {&quot;equals&quot;: [&quot;TLSv1.3&quot;]}}]</p>
         */
        public Builder filterRules(String filterRules) {
            this.filterRules = filterRules;
            return this;
        }

        /**
         * <p>The version of the filter rules.</p>
         * <blockquote>
         * <p>For backward compatibility with legacy filter rules, the default value is v1. Newly created rules use v2.</p>
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
         * <p>New version of delivery filter rules.</p>
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
         * <p>7072132a-bd3c-46a6-9e81-aba3e0e3f861</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Project\&quot;: \&quot;er-online-hjy-pro\&quot;, \&quot;Logstore\&quot;: \&quot;er-online-hjy-log\&quot;, \&quot;Region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;Endpoint\&quot;: \&quot;cn-hangzhou.log.aliyuncs.com\&quot;, \&quot;Aliuid\&quot;: \&quot;1077912128805410\&quot;}</p>
         */
        public Builder sinkConfig(Object sinkConfig) {
            this.sinkConfig = sinkConfig;
            return this;
        }

        /**
         * <p>The task status.</p>
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
         * <p>testoss11</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public GetUserDeliveryTaskResponseBody build() {
            return new GetUserDeliveryTaskResponseBody(this);
        } 

    } 

}
