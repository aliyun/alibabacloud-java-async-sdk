// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponseBody</p>
 */
public class ListPrometheusInstanceByTagAndResourceGroupIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrometheusInstanceByTagAndResourceGroupIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4789C3E9-A85A-524B-B97B-9D2B14BA06BC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody build() {
            return new ListPrometheusInstanceByTagAndResourceGroupIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-cus-tag-3</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-2vc8qq7x89o11rus9uvu</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponseBody</p>
     */
    public static class PrometheusInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("GrafanaInstanceId")
        private String grafanaInstanceId;

        @com.aliyun.core.annotation.NameInMap("HttpApiInterUrl")
        private String httpApiInterUrl;

        @com.aliyun.core.annotation.NameInMap("HttpApiIntraUrl")
        private String httpApiIntraUrl;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("PushGatewayInterUrl")
        private String pushGatewayInterUrl;

        @com.aliyun.core.annotation.NameInMap("PushGatewayIntraUrl")
        private String pushGatewayIntraUrl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemoteReadInterUrl")
        private String remoteReadInterUrl;

        @com.aliyun.core.annotation.NameInMap("RemoteReadIntraUrl")
        private String remoteReadIntraUrl;

        @com.aliyun.core.annotation.NameInMap("RemoteWriteInterUrl")
        private String remoteWriteInterUrl;

        @com.aliyun.core.annotation.NameInMap("RemoteWriteIntraUrl")
        private String remoteWriteIntraUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SubClustersJson")
        private String subClustersJson;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private PrometheusInstances(Builder builder) {
            this.authToken = builder.authToken;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.grafanaInstanceId = builder.grafanaInstanceId;
            this.httpApiInterUrl = builder.httpApiInterUrl;
            this.httpApiIntraUrl = builder.httpApiIntraUrl;
            this.paymentType = builder.paymentType;
            this.pushGatewayInterUrl = builder.pushGatewayInterUrl;
            this.pushGatewayIntraUrl = builder.pushGatewayIntraUrl;
            this.regionId = builder.regionId;
            this.remoteReadInterUrl = builder.remoteReadInterUrl;
            this.remoteReadIntraUrl = builder.remoteReadIntraUrl;
            this.remoteWriteInterUrl = builder.remoteWriteInterUrl;
            this.remoteWriteIntraUrl = builder.remoteWriteIntraUrl;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.securityGroupId = builder.securityGroupId;
            this.subClustersJson = builder.subClustersJson;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusInstances create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return grafanaInstanceId
         */
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        /**
         * @return httpApiInterUrl
         */
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        /**
         * @return httpApiIntraUrl
         */
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return pushGatewayInterUrl
         */
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        /**
         * @return pushGatewayIntraUrl
         */
        public String getPushGatewayIntraUrl() {
            return this.pushGatewayIntraUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remoteReadInterUrl
         */
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        /**
         * @return remoteReadIntraUrl
         */
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        /**
         * @return remoteWriteInterUrl
         */
        public String getRemoteWriteInterUrl() {
            return this.remoteWriteInterUrl;
        }

        /**
         * @return remoteWriteIntraUrl
         */
        public String getRemoteWriteIntraUrl() {
            return this.remoteWriteIntraUrl;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return subClustersJson
         */
        public String getSubClustersJson() {
            return this.subClustersJson;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String authToken; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String grafanaInstanceId; 
            private String httpApiInterUrl; 
            private String httpApiIntraUrl; 
            private String paymentType; 
            private String pushGatewayInterUrl; 
            private String pushGatewayIntraUrl; 
            private String regionId; 
            private String remoteReadInterUrl; 
            private String remoteReadIntraUrl; 
            private String remoteWriteInterUrl; 
            private String remoteWriteIntraUrl; 
            private String resourceGroupId; 
            private String resourceType; 
            private String securityGroupId; 
            private String subClustersJson; 
            private java.util.List < Tags> tags; 
            private String userId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * <p>The authorization token.</p>
             * 
             * <strong>example:</strong>
             * <p>ad32dxxxx</p>
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c9d5dda1aeca64220853ace304baeb03d</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>prom1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>remote-write: Prometheus instance for Remote Write</li>
             * <li>ecs: Prometheus instances for ECS</li>
             * <li>cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland</li>
             * <li>cloud-product: Prometheus instance for Alibaba Cloud services outside the Chinese mainland</li>
             * <li>global-view: global aggregation instance</li>
             * <li>aliyun-cs: Prometheus instance for Container Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The ID of the Grafana workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>grafana-rnggfvhlcdl6m71l**</p>
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * <p>The public URL for the HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing">http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing</a></p>
             */
            public Builder httpApiInterUrl(String httpApiInterUrl) {
                this.httpApiInterUrl = httpApiInterUrl;
                return this;
            }

            /**
             * <p>The internal URL for the HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing</a></p>
             */
            public Builder httpApiIntraUrl(String httpApiIntraUrl) {
                this.httpApiIntraUrl = httpApiIntraUrl;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PREPAY: subscription</li>
             * <li>POSTPAY: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The public URL for Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2">http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
             */
            public Builder pushGatewayInterUrl(String pushGatewayInterUrl) {
                this.pushGatewayInterUrl = pushGatewayInterUrl;
                return this;
            }

            /**
             * <p>The internal URL for Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
             */
            public Builder pushGatewayIntraUrl(String pushGatewayIntraUrl) {
                this.pushGatewayIntraUrl = pushGatewayIntraUrl;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The public URL for remote read.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
             */
            public Builder remoteReadInterUrl(String remoteReadInterUrl) {
                this.remoteReadInterUrl = remoteReadInterUrl;
                return this;
            }

            /**
             * <p>The internal URL for remote read.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
             */
            public Builder remoteReadIntraUrl(String remoteReadIntraUrl) {
                this.remoteReadIntraUrl = remoteReadIntraUrl;
                return this;
            }

            /**
             * <p>The public URL for remote write.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write">http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
             */
            public Builder remoteWriteInterUrl(String remoteWriteInterUrl) {
                this.remoteWriteInterUrl = remoteWriteInterUrl;
                return this;
            }

            /**
             * <p>The internal URL for remote write.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
             */
            public Builder remoteWriteIntraUrl(String remoteWriteIntraUrl) {
                this.remoteWriteIntraUrl = remoteWriteIntraUrl;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmz7nocpeidcy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>PROMETHEUS</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-f8zd1toc10wmbi1v5rom</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The child instances of the global aggregation instance. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>[ { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c39a1048921e04fceb039db2fb****&quot;, &quot;sourceName&quot;: &quot;arms-luyao-test&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789****&quot; }, { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-beijing&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c6b6485496d5b400abde22cb47b5****&quot;, &quot;sourceName&quot;: &quot;agent-321-test&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789****&quot; }, { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-zhangjiakou&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c261a4f3200c446659133f1ade78****&quot;, &quot;sourceName&quot;: &quot;zaifeng-cardinality-01&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789****&quot; } ]</p>
             */
            public Builder subClustersJson(String subClustersJson) {
                this.subClustersJson = subClustersJson;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1672753017899***</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-f8z73vcja1tqnw90aav5a</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbtp1fsm8mir18l8rl0u</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PrometheusInstances build() {
                return new PrometheusInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrometheusInstances")
        private java.util.List < PrometheusInstances> prometheusInstances;

        private Data(Builder builder) {
            this.prometheusInstances = builder.prometheusInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return prometheusInstances
         */
        public java.util.List < PrometheusInstances> getPrometheusInstances() {
            return this.prometheusInstances;
        }

        public static final class Builder {
            private java.util.List < PrometheusInstances> prometheusInstances; 

            /**
             * <p>The queried Prometheus instances.</p>
             */
            public Builder prometheusInstances(java.util.List < PrometheusInstances> prometheusInstances) {
                this.prometheusInstances = prometheusInstances;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
