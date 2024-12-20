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
 * {@link GetPrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusInstanceResponseBody</p>
 */
public class GetPrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPrometheusInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
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
         * <p>52C422FD-6B43-524D-B8A1-A4693294318C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrometheusInstanceResponseBody build() {
            return new GetPrometheusInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPrometheusInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusInstanceResponseBody</p>
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
             * <p>tag1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue1</p>
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
     * {@link GetPrometheusInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("ArchiveDuration")
        private Integer archiveDuration;

        @com.aliyun.core.annotation.NameInMap("AuthFreeReadPolicy")
        private String authFreeReadPolicy;

        @com.aliyun.core.annotation.NameInMap("AuthFreeWritePolicy")
        private String authFreeWritePolicy;

        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("DbInstanceStatus")
        private String dbInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("EnableAuthFreeRead")
        private Boolean enableAuthFreeRead;

        @com.aliyun.core.annotation.NameInMap("EnableAuthFreeWrite")
        private Boolean enableAuthFreeWrite;

        @com.aliyun.core.annotation.NameInMap("EnableAuthToken")
        private String enableAuthToken;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map<String, String> extraInfo;

        @com.aliyun.core.annotation.NameInMap("GrafanaInstanceId")
        private String grafanaInstanceId;

        @com.aliyun.core.annotation.NameInMap("HttpApiInterUrl")
        private String httpApiInterUrl;

        @com.aliyun.core.annotation.NameInMap("HttpApiIntraUrl")
        private String httpApiIntraUrl;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("PaymentTypeUpdateTime")
        private String paymentTypeUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

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

        @com.aliyun.core.annotation.NameInMap("StorageDuration")
        private Integer storageDuration;

        @com.aliyun.core.annotation.NameInMap("SubClustersJson")
        private String subClustersJson;

        @com.aliyun.core.annotation.NameInMap("SupportAuthTypes")
        private java.util.List<String> supportAuthTypes;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.accessType = builder.accessType;
            this.archiveDuration = builder.archiveDuration;
            this.authFreeReadPolicy = builder.authFreeReadPolicy;
            this.authFreeWritePolicy = builder.authFreeWritePolicy;
            this.authToken = builder.authToken;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.dbInstanceStatus = builder.dbInstanceStatus;
            this.enableAuthFreeRead = builder.enableAuthFreeRead;
            this.enableAuthFreeWrite = builder.enableAuthFreeWrite;
            this.enableAuthToken = builder.enableAuthToken;
            this.extraInfo = builder.extraInfo;
            this.grafanaInstanceId = builder.grafanaInstanceId;
            this.httpApiInterUrl = builder.httpApiInterUrl;
            this.httpApiIntraUrl = builder.httpApiIntraUrl;
            this.paymentType = builder.paymentType;
            this.paymentTypeUpdateTime = builder.paymentTypeUpdateTime;
            this.product = builder.product;
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
            this.storageDuration = builder.storageDuration;
            this.subClustersJson = builder.subClustersJson;
            this.supportAuthTypes = builder.supportAuthTypes;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return archiveDuration
         */
        public Integer getArchiveDuration() {
            return this.archiveDuration;
        }

        /**
         * @return authFreeReadPolicy
         */
        public String getAuthFreeReadPolicy() {
            return this.authFreeReadPolicy;
        }

        /**
         * @return authFreeWritePolicy
         */
        public String getAuthFreeWritePolicy() {
            return this.authFreeWritePolicy;
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
         * @return dbInstanceStatus
         */
        public String getDbInstanceStatus() {
            return this.dbInstanceStatus;
        }

        /**
         * @return enableAuthFreeRead
         */
        public Boolean getEnableAuthFreeRead() {
            return this.enableAuthFreeRead;
        }

        /**
         * @return enableAuthFreeWrite
         */
        public Boolean getEnableAuthFreeWrite() {
            return this.enableAuthFreeWrite;
        }

        /**
         * @return enableAuthToken
         */
        public String getEnableAuthToken() {
            return this.enableAuthToken;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
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
         * @return paymentTypeUpdateTime
         */
        public String getPaymentTypeUpdateTime() {
            return this.paymentTypeUpdateTime;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
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
         * @return storageDuration
         */
        public Integer getStorageDuration() {
            return this.storageDuration;
        }

        /**
         * @return subClustersJson
         */
        public String getSubClustersJson() {
            return this.subClustersJson;
        }

        /**
         * @return supportAuthTypes
         */
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accessType; 
            private Integer archiveDuration; 
            private String authFreeReadPolicy; 
            private String authFreeWritePolicy; 
            private String authToken; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String dbInstanceStatus; 
            private Boolean enableAuthFreeRead; 
            private Boolean enableAuthFreeWrite; 
            private String enableAuthToken; 
            private java.util.Map<String, String> extraInfo; 
            private String grafanaInstanceId; 
            private String httpApiInterUrl; 
            private String httpApiIntraUrl; 
            private String paymentType; 
            private String paymentTypeUpdateTime; 
            private String product; 
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
            private Integer storageDuration; 
            private String subClustersJson; 
            private java.util.List<String> supportAuthTypes; 
            private java.util.List<Tags> tags; 
            private String userId; 
            private String vSwitchId; 
            private String version; 
            private String vpcId; 

            /**
             * <p>The permission type. Valid values: readWrite, readOnly, and httpReadOnly</p>
             * 
             * <strong>example:</strong>
             * <p>readWrite</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The number of days for which data is automatically archived after the storage duration expires. Valid values: 60, 90, 180, and 365. 0 indicates that the data is not archived.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder archiveDuration(Integer archiveDuration) {
                this.archiveDuration = archiveDuration;
                return this;
            }

            /**
             * <p>The whitelist of IP addresses for which password-free read is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder authFreeReadPolicy(String authFreeReadPolicy) {
                this.authFreeReadPolicy = authFreeReadPolicy;
                return this;
            }

            /**
             * <p>The whitelist of IP addresses for which password-free write is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder authFreeWritePolicy(String authFreeWritePolicy) {
                this.authFreeWritePolicy = authFreeWritePolicy;
                return this;
            }

            /**
             * <p>The authorization token.</p>
             * 
             * <strong>example:</strong>
             * <p>GciOiJIUzI1NiJ9***</p>
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the monitoring object.</p>
             * 
             * <strong>example:</strong>
             * <p>prom1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <ul>
             * <li>remote-write: general-purpose Prometheus instance</li>
             * <li>ecs: Prometheus instances for ECS</li>
             * <li>cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland</li>
             * <li>cloud-product: Prometheus instance for Alibaba Cloud services outside the Chinese mainland</li>
             * <li>global-view: global aggregation instance</li>
             * <li>aliyun-cs: Prometheus instance for Container Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remote-write</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The data storage status at the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder dbInstanceStatus(String dbInstanceStatus) {
                this.dbInstanceStatus = dbInstanceStatus;
                return this;
            }

            /**
             * <p>Indicates whether password-free read is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
                this.enableAuthFreeRead = enableAuthFreeRead;
                return this;
            }

            /**
             * <p>Indicates whether password-free write is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
                this.enableAuthFreeWrite = enableAuthFreeWrite;
                return this;
            }

            /**
             * <p>Indicates whether access token authentication is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAuthToken(String enableAuthToken) {
                this.enableAuthToken = enableAuthToken;
                return this;
            }

            /**
             * <p>The extra information.</p>
             */
            public Builder extraInfo(java.util.Map<String, String> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The ID of the Grafana workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>grafana-rnggfvhlcdl6m71***</p>
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * <p>The public URL for the HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-beijing.arms.aliyuncs.com:9443/api/v1/prometheus/xxx">https://cn-beijing.arms.aliyuncs.com:9443/api/v1/prometheus/xxx</a></p>
             */
            public Builder httpApiInterUrl(String httpApiInterUrl) {
                this.httpApiInterUrl = httpApiInterUrl;
                return this;
            }

            /**
             * <p>The internal URL for the HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx</a></p>
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
             * <p>PREPAY</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * PaymentTypeUpdateTime.
             */
            public Builder paymentTypeUpdateTime(String paymentTypeUpdateTime) {
                this.paymentTypeUpdateTime = paymentTypeUpdateTime;
                return this;
            }

            /**
             * <p>The product to which the Prometheus instance belongs. Valid values: arms and cms.</p>
             * 
             * <strong>example:</strong>
             * <p>arms</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The public URL for Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2">https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
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
             * <p>cn-beijing</p>
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
             * <p><a href="https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write">https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
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
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2vezare****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the resource. Set the value to PROMETHEUS.</p>
             * 
             * <strong>example:</strong>
             * <p>PROMETHEUS</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the security group. This parameter is returned only for Prometheus instances for ECS.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-8vbdgmf4nraiqa9bx0jo</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The data storage duration. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder storageDuration(Integer storageDuration) {
                this.storageDuration = storageDuration;
                return this;
            }

            /**
             * <p>The child instances of the Prometheus instance for GlobalView. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c39a1048921e04fceb039db2fbb73***&quot;,&quot;sourceName&quot;:&quot;arms-luyao-test&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;167275301789***&quot;},{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c6b6485496d5b400abde22cb47b5****&quot;,&quot;sourceName&quot;:&quot;agent-321-test&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;1672753017899***&quot;},{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c261a4f3200c446659133f1ade789b15e&quot;,&quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;167275301789***&quot;}]</p>
             */
            public Builder subClustersJson(String subClustersJson) {
                this.subClustersJson = subClustersJson;
                return this;
            }

            /**
             * <p>The supported authentication types.</p>
             */
            public Builder supportAuthTypes(java.util.List<String> supportAuthTypes) {
                this.supportAuthTypes = supportAuthTypes;
                return this;
            }

            /**
             * <p>The tags of the instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>167275301789****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The vSwitch ID. This parameter is returned only for Prometheus instances for ECS.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-f8z73vcja1tqnw90aav5a</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC ID. This parameter is returned only for Prometheus instances for ECS.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vb02uk57qbcktqcvqqqj</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
