// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreatePrometheusAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusAlertRuleRequest</p>
 */
public class CreatePrometheusAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyType")
    private String notifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreatePrometheusAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.annotations = builder.annotations;
        this.clusterId = builder.clusterId;
        this.dispatchRuleId = builder.dispatchRuleId;
        this.duration = builder.duration;
        this.expression = builder.expression;
        this.labels = builder.labels;
        this.message = builder.message;
        this.notifyType = builder.notifyType;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dispatchRuleId
     */
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePrometheusAlertRuleRequest, Builder> {
        private String alertName; 
        private String annotations; 
        private String clusterId; 
        private Long dispatchRuleId; 
        private String duration; 
        private String expression; 
        private String labels; 
        private String message; 
        private String notifyType; 
        private String regionId; 
        private java.util.List<Tags> tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusAlertRuleRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.annotations = request.annotations;
            this.clusterId = request.clusterId;
            this.dispatchRuleId = request.dispatchRuleId;
            this.duration = request.duration;
            this.expression = request.expression;
            this.labels = request.labels;
            this.message = request.message;
            this.notifyType = request.notifyType;
            this.regionId = request.regionId;
            this.tags = request.tags;
            this.type = request.type;
        } 

        /**
         * <p>The name of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus_Alert</p>
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The annotations that are described in a JSON string. You must specify the name and value of each annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Value&quot;: &quot;xxx&quot;,&quot;Name&quot;: &quot;description&quot;}]</p>
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c0bad479465464e1d8c1e641b0afb****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the notification policy. This parameter is required if the NotifyType parameter is set to <code>DISPATCH_RULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10282</p>
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.putQueryParameter("DispatchRuleId", dispatchRuleId);
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * <p>The duration. The value ranges from 1 to 1440 minutes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10m</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The expression of the alert rule. The expression must follow the PromQL syntax.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100 * (sum(rate(container_cpu_usage_seconds_total[1m])) by (pod_name) / sum(label_replace(kube_pod_container_resource_limits_cpu_cores, &quot;pod_name&quot;, &quot;$1&quot;, &quot;pod&quot;, &quot;(.*)&quot;)) by (pod_name))&gt;75</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The tags that are described in a JSON string. You must specify the name and value of each tag.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Value&quot;: &quot;critical&quot;,&quot;Name&quot;: &quot;severity&quot;}]</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The content of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The CPU utilization of ${{$labels.pod_name}} has exceeded 80%. Current value: {{$value}}%</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The method that is used to send alert notifications. Valid values:</p>
         * <ul>
         * <li><code>ALERT_MANAGER</code>: Alert notifications are sent by Operation Center. This is the default value.</li>
         * <li><code>DISPATCH_RULE</code>: Alert notifications are sent based on the specified notification policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALERT_MANAGER</p>
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the alert rule. Valid values:</p>
         * <ul>
         * <li>99: custom alert</li>
         * <li>101: Prometheus Service alert</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePrometheusAlertRuleRequest build() {
            return new CreatePrometheusAlertRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrometheusAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreatePrometheusAlertRuleRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
