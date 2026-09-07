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
 * {@link CreatePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusInstanceRequest</p>
 */
public class CreatePrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllSubClustersSuccess")
    private Boolean allSubClustersSuccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveDuration")
    private Integer archiveDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaInstanceId")
    private String grafanaInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubClustersJson")
    private String subClustersJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreatePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.allSubClustersSuccess = builder.allSubClustersSuccess;
        this.archiveDuration = builder.archiveDuration;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.duration = builder.duration;
        this.grafanaInstanceId = builder.grafanaInstanceId;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.subClustersJson = builder.subClustersJson;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allSubClustersSuccess
     */
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
    }

    /**
     * @return archiveDuration
     */
    public Integer getArchiveDuration() {
        return this.archiveDuration;
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return grafanaInstanceId
     */
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
    public java.util.List<Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreatePrometheusInstanceRequest, Builder> {
        private Boolean allSubClustersSuccess; 
        private Integer archiveDuration; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private Integer duration; 
        private String grafanaInstanceId; 
        private String paymentType; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String subClustersJson; 
        private java.util.List<Tags> tags; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusInstanceRequest request) {
            super(request);
            this.allSubClustersSuccess = request.allSubClustersSuccess;
            this.archiveDuration = request.archiveDuration;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.duration = request.duration;
            this.grafanaInstanceId = request.grafanaInstanceId;
            this.paymentType = request.paymentType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.subClustersJson = request.subClustersJson;
            this.tags = request.tags;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>Specifies whether all sub-instances must pass validation before the GlobalView instance is created. Default value: false, which indicates that partial success is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allSubClustersSuccess(Boolean allSubClustersSuccess) {
            this.putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess);
            this.allSubClustersSuccess = allSubClustersSuccess;
            return this;
        }

        /**
         * <p>The number of days to automatically archive data after the storage period expires. Valid values: 60, 90, 180, and 365. A value of 0 indicates that data is not archived.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder archiveDuration(Integer archiveDuration) {
            this.putQueryParameter("ArchiveDuration", archiveDuration);
            this.archiveDuration = archiveDuration;
            return this;
        }

        /**
         * <p>The Container Service cluster ID. This parameter is required when ClusterType is set to aliyun-cs.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the cluster to create. This parameter is required when ClusterType is set to remote-write, ecs, or global-view.</p>
         * <p>For ecs instances, the ClusterName must follow the format &quot;name-vpc-id&quot;, and the name part cannot exceed 24 characters. Example: &quot;mytest1-vpc-xxxxxxxxxxx&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterNameOfTest</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The instance type. Valid values: </p>
         * <ul>
         * <li>remote-write: Prometheus for Remote Write.</li>
         * <li>ecs (no longer supported): Prometheus for ECS.</li>
         * <li>global-view: Prometheus for GlobalView.</li>
         * <li>aliyun-cs (no longer supported): Prometheus for Container Service.</li>
         * <li>cloud-product (no longer supported): Prometheus for Cloud Service.</li>
         * <li>cloud-monitor (no longer supported): Prometheus for Hybrid Cloud Monitoring.</li>
         * <li>flink (no longer supported): Prometheus for Flink.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The data storage duration, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The ID of the bound Grafana workspace. Set this parameter to &quot;free&quot; when you use the shared Grafana edition.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-bp1*****</p>
         */
        public Builder grafanaInstanceId(String grafanaInstanceId) {
            this.putQueryParameter("GrafanaInstanceId", grafanaInstanceId);
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }

        /**
         * <p>The Billable methods. Valid values:
         * POSTPAY: pay-as-you-go based on the number of reported metrics.
         * POSTPAY_GB: pay-as-you-go based on the volume of written metrics.
         * Empty: uses the default billing method configured by the user. If no default is configured, the system defaults to billing based on the number of reported metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The actual region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Network Security group ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1********</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The JSON string of sub-instances for the GlobalView instance.</p>
         * 
         * <strong>example:</strong>
         * <p>当clusterType为global-view时，需要传此参数：需要聚合的集群的信息列表；示例：
         * [
         *     {
         *         &quot;headers&quot;:{</p>
         * <pre><code>    },
         *     &quot;regionId&quot;:&quot;cn-hangzhou&quot;,
         *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
         *     &quot;extras&quot;:{
         * 
         *     },
         *     &quot;clusterId&quot;:&quot;c39a1048921e04f***********&quot;,
         *     &quot;sourceName&quot;:&quot;arms-luyao-test&quot;,
         *     &quot;dataSource&quot;:&quot;&quot;,
         *     &quot;userId&quot;:&quot;1672753***********&quot;
         * },
         * {
         *     &quot;headers&quot;:{
         * 
         *     },
         *     &quot;regionId&quot;:&quot;cn-beijing&quot;,
         *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
         *     &quot;extras&quot;:{
         * 
         *     },
         *     &quot;clusterId&quot;:&quot;c6b6485496d5b40***********&quot;,
         *     &quot;sourceName&quot;:&quot;agent-321-测试&quot;,
         *     &quot;dataSource&quot;:&quot;&quot;,
         *     &quot;userId&quot;:&quot;1672753***********&quot;
         * },
         * {
         *     &quot;headers&quot;:{
         * 
         *     },
         *     &quot;regionId&quot;:&quot;cn-zhangjiakou&quot;,
         *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
         *     &quot;extras&quot;:{
         * 
         *     },
         *     &quot;clusterId&quot;:&quot;c261a4f3200c446***********&quot;,
         *     &quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;,
         *     &quot;dataSource&quot;:&quot;&quot;,
         *     &quot;userId&quot;:&quot;1672753***********&quot;
         * }
         * </code></pre>
         * <p>]</p>
         */
        public Builder subClustersJson(String subClustersJson) {
            this.putQueryParameter("SubClustersJson", subClustersJson);
            this.subClustersJson = subClustersJson;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;labelName&quot;:&quot;labelValue&quot;
         *     },
         *     {
         *         &quot;testName&quot;:&quot;clusterA&quot;
         *     }
         * ]</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-rpn**********</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreatePrometheusInstanceRequest build() {
            return new CreatePrometheusInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrometheusInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePrometheusInstanceRequest</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
