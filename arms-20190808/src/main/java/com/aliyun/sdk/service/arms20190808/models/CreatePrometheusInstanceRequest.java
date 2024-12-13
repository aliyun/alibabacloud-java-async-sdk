// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
    private java.util.List < Tags> tags;

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
    public java.util.List < Tags> getTags() {
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
        private java.util.List < Tags> tags; 
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
         * <p>Does it require all child instances to be verified successfully before creating a GlobalView instance. The default is false, which means partial success is possible.</p>
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
         * <p>The number of days for which data is automatically archived after the storage expires. Valid values: 60, 90, 180, and 365. 0 indicates that the data is not archived.</p>
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
         * <p>The ID of the ACK cluster. This parameter is required if you set the ClusterType parameter to aliyun-cs.</p>
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
         * <p>The name of the created cluster. This parameter is required if you set the ClusterType parameter to remote-write or ecs.</p>
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
         * <p>The type of the Prometheus instance. Valid values:</p>
         * <ul>
         * <li>remote-write: Prometheus instance for Remote Write</li>
         * <li>ecs (unavailable): Prometheus instance for ECS</li>
         * <li>global-view: Prometheus instance for GlobalView</li>
         * <li>aliyun-cs: Prometheus instance for Container Service</li>
         * <li>cloud-product (unavailable): Prometheus instance for Alibaba Cloud services</li>
         * <li>cloud-monitor (unavailable): Prometheus instance for Hybrid Cloud Monitoring</li>
         * <li>flink (unavailable): Prometheus instance for Flink</li>
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
         * <p>The data storage duration. Unit: days.</p>
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
         * <p>The ID of the Grafana dedicated instance. This parameter is available if you set the ClusterType parameter to ecs.</p>
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
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The ID of the region. If you use a Prometheus instance to monitor an Alibaba Cloud service in China, this parameter must be set to cn-shanghai.</p>
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
         * <p>The ID of the custom resource group. You can configure this parameter to bind the instance to the resource group.</p>
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
         * <p>The ID of the security group. This parameter is required if you set the ClusterType parameter to ecs.</p>
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
         * <p>JSON string for child instances of the globalView instance.</p>
         * 
         * <strong>example:</strong>
         * <p>When the clusterType is global view, this parameter needs to be passed: a list of information about the clusters that need to be aggregated.
         * Example:
         * [
         *   {
         *     &quot;Headers&quot;:{</p>
         * <pre><code>},
         * &quot;RegionId&quot;: &quot;cn hangzhou&quot;,
         * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
         * &quot;Extras&quot;:{
         * 
         * },
         * &quot;ClusterId&quot;: &quot;c39a1048921e04f ****************&quot;,
         * &quot;SourceName&quot;: &quot;test1&quot;,
         * &quot;DataSource&quot;: &quot;&quot;,
         * &quot;UserId&quot;: &quot;1672753 ******************&quot;
         * </code></pre>
         * <p>  },
         *   {
         *     &quot;Headers&quot;:{</p>
         * <pre><code>},
         * &quot;RegionId&quot;: &quot;cn beijing&quot;,
         * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
         * &quot;Extras&quot;:{
         * 
         * },
         * &quot;ClusterId&quot;: &quot;c6b6485496d5b40 ****************&quot;,
         * &quot;SourceName&quot;: &quot;test2&quot;,
         * &quot;DataSource&quot;: &quot;&quot;,
         * &quot;UserId&quot;: &quot;1672753 ******************&quot;
         * </code></pre>
         * <p>  },
         *   {
         *     &quot;Headers&quot;:{</p>
         * <pre><code>},
         * &quot;RegionId&quot;: &quot;cn zhangjiakou&quot;,
         * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
         * &quot;Extras&quot;:{
         * 
         * },
         * &quot;ClusterId&quot;: &quot;c261a4f3200c446 ****************&quot;,
         * &quot;SourceName&quot;: &quot;test3&quot;,
         * &quot;DataSource&quot;: &quot;&quot;,
         * &quot;UserId&quot;: &quot;1672753 ******************&quot;
         * </code></pre>
         * <p>  }
         * ]</p>
         */
        public Builder subClustersJson(String subClustersJson) {
            this.putQueryParameter("SubClustersJson", subClustersJson);
            this.subClustersJson = subClustersJson;
            return this;
        }

        /**
         * <p>The tags of the instance. You can configure this parameter to manage tags for the instance.</p>
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
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. This parameter is required if you set the ClusterType parameter to ecs.</p>
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
         * <p>The ID of virtual private cloud (VPC). This parameter is required if you set the ClusterType parameter to ecs.</p>
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
