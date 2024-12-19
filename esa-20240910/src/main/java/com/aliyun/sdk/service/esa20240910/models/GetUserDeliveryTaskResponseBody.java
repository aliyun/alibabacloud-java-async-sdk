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

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private GetUserDeliveryTaskResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.deliveryType = builder.deliveryType;
        this.discardRate = builder.discardRate;
        this.fieldList = builder.fieldList;
        this.filterRules = builder.filterRules;
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
        private String status; 
        private String taskName; 

        /**
         * <p>The log category. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
         * <li><strong>dcdn_log_waf</strong>: firewall logs.</li>
         * <li><strong>dcdn_log_ipa</strong>: TCP/UDP proxy logs.</li>
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
         * <li>cn: the Chinese mainland.</li>
         * <li>sg: outside the Chinese mainland.</li>
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
         * <p>The destination of the delivery. Valid values:</p>
         * <ul>
         * <li>sls: Alibaba Cloud Simple Log Service (SLS).</li>
         * <li>http: HTTP server.</li>
         * <li>aws3: Amazon Simple Storage Service (S3).</li>
         * <li>oss: Alibaba Cloud Object Storage Service (OSS).</li>
         * <li>kafka: Kafka.</li>
         * <li>aws3cmpt: S3-compatible storage service.</li>
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
         * <p>The fields.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientRequestID,ClientRequestHost</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The filtering rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ClientSSLProtocol&quot;: {&quot;equals&quot;: [&quot;TLSv1.3&quot;]}}]</p>
         */
        public Builder filterRules(String filterRules) {
            this.filterRules = filterRules;
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
         * <p>{&quot;Project&quot;: &quot;er-online-hjy-pro&quot;, &quot;Logstore&quot;: &quot;er-online-hjy-log&quot;, &quot;Region&quot;: &quot;cn-hangzhou&quot;, &quot;Endpoint&quot;: &quot;cn-hangzhou.log.aliyuncs.com&quot;, &quot;Aliuid&quot;: &quot;1077912128805410&quot;}</p>
         */
        public Builder sinkConfig(Object sinkConfig) {
            this.sinkConfig = sinkConfig;
            return this;
        }

        /**
         * <p>The status of the delivery task.</p>
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
