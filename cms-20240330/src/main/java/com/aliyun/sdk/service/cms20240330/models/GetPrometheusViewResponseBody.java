// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetPrometheusViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusViewResponseBody</p>
 */
public class GetPrometheusViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusView")
    private PrometheusView prometheusView;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPrometheusViewResponseBody(Builder builder) {
        this.prometheusView = builder.prometheusView;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusViewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusView
     */
    public PrometheusView getPrometheusView() {
        return this.prometheusView;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PrometheusView prometheusView; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPrometheusViewResponseBody model) {
            this.prometheusView = model.prometheusView;
            this.requestId = model.requestId;
        } 

        /**
         * <p>View instance.</p>
         */
        public Builder prometheusView(PrometheusView prometheusView) {
            this.prometheusView = prometheusView;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrometheusViewResponseBody build() {
            return new GetPrometheusViewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPrometheusViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusViewResponseBody</p>
     */
    public static class PrometheusInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private PrometheusInstances(Builder builder) {
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusInstances create() {
            return builder().build();
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String prometheusInstanceId; 
            private String regionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(PrometheusInstances model) {
                this.prometheusInstanceId = model.prometheusInstanceId;
                this.regionId = model.regionId;
                this.userId = model.userId;
            } 

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rw-63549e054ff596a4149927961dff</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-north-2-gov-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>122xxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PrometheusInstances build() {
                return new PrometheusInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPrometheusViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusViewResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * <p>PagerDuty integration key.</p>
             * 
             * <strong>example:</strong>
             * <p>global_score_series</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>371293199010092839</p>
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
    /**
     * 
     * {@link GetPrometheusViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusViewResponseBody</p>
     */
    public static class PrometheusView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authFreeReadPolicy")
        private String authFreeReadPolicy;

        @com.aliyun.core.annotation.NameInMap("authToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("enableAuthFreeRead")
        private Boolean enableAuthFreeRead;

        @com.aliyun.core.annotation.NameInMap("enableAuthToken")
        private Boolean enableAuthToken;

        @com.aliyun.core.annotation.NameInMap("folderUrl")
        private String folderUrl;

        @com.aliyun.core.annotation.NameInMap("grafanaInstanceId")
        private String grafanaInstanceId;

        @com.aliyun.core.annotation.NameInMap("grafanaInstanceName")
        private String grafanaInstanceName;

        @com.aliyun.core.annotation.NameInMap("httpApiInterUrl")
        private String httpApiInterUrl;

        @com.aliyun.core.annotation.NameInMap("httpApiIntraUrl")
        private String httpApiIntraUrl;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("prometheusInstances")
        private java.util.List<PrometheusInstances> prometheusInstances;

        @com.aliyun.core.annotation.NameInMap("prometheusViewId")
        private String prometheusViewId;

        @com.aliyun.core.annotation.NameInMap("prometheusViewName")
        private String prometheusViewName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("remoteReadInterUrl")
        private String remoteReadInterUrl;

        @com.aliyun.core.annotation.NameInMap("remoteReadIntraUrl")
        private String remoteReadIntraUrl;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("supportAuthTypes")
        private java.util.List<String> supportAuthTypes;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private PrometheusView(Builder builder) {
            this.authFreeReadPolicy = builder.authFreeReadPolicy;
            this.authToken = builder.authToken;
            this.createTime = builder.createTime;
            this.enableAuthFreeRead = builder.enableAuthFreeRead;
            this.enableAuthToken = builder.enableAuthToken;
            this.folderUrl = builder.folderUrl;
            this.grafanaInstanceId = builder.grafanaInstanceId;
            this.grafanaInstanceName = builder.grafanaInstanceName;
            this.httpApiInterUrl = builder.httpApiInterUrl;
            this.httpApiIntraUrl = builder.httpApiIntraUrl;
            this.instanceType = builder.instanceType;
            this.paymentType = builder.paymentType;
            this.product = builder.product;
            this.prometheusInstances = builder.prometheusInstances;
            this.prometheusViewId = builder.prometheusViewId;
            this.prometheusViewName = builder.prometheusViewName;
            this.regionId = builder.regionId;
            this.remoteReadInterUrl = builder.remoteReadInterUrl;
            this.remoteReadIntraUrl = builder.remoteReadIntraUrl;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.supportAuthTypes = builder.supportAuthTypes;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusView create() {
            return builder().build();
        }

        /**
         * @return authFreeReadPolicy
         */
        public String getAuthFreeReadPolicy() {
            return this.authFreeReadPolicy;
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableAuthFreeRead
         */
        public Boolean getEnableAuthFreeRead() {
            return this.enableAuthFreeRead;
        }

        /**
         * @return enableAuthToken
         */
        public Boolean getEnableAuthToken() {
            return this.enableAuthToken;
        }

        /**
         * @return folderUrl
         */
        public String getFolderUrl() {
            return this.folderUrl;
        }

        /**
         * @return grafanaInstanceId
         */
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        /**
         * @return grafanaInstanceName
         */
        public String getGrafanaInstanceName() {
            return this.grafanaInstanceName;
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
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return prometheusInstances
         */
        public java.util.List<PrometheusInstances> getPrometheusInstances() {
            return this.prometheusInstances;
        }

        /**
         * @return prometheusViewId
         */
        public String getPrometheusViewId() {
            return this.prometheusViewId;
        }

        /**
         * @return prometheusViewName
         */
        public String getPrometheusViewName() {
            return this.prometheusViewName;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String authFreeReadPolicy; 
            private String authToken; 
            private String createTime; 
            private Boolean enableAuthFreeRead; 
            private Boolean enableAuthToken; 
            private String folderUrl; 
            private String grafanaInstanceId; 
            private String grafanaInstanceName; 
            private String httpApiInterUrl; 
            private String httpApiIntraUrl; 
            private String instanceType; 
            private String paymentType; 
            private String product; 
            private java.util.List<PrometheusInstances> prometheusInstances; 
            private String prometheusViewId; 
            private String prometheusViewName; 
            private String regionId; 
            private String remoteReadInterUrl; 
            private String remoteReadIntraUrl; 
            private String resourceGroupId; 
            private String resourceType; 
            private String status; 
            private java.util.List<String> supportAuthTypes; 
            private java.util.List<Tags> tags; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(PrometheusView model) {
                this.authFreeReadPolicy = model.authFreeReadPolicy;
                this.authToken = model.authToken;
                this.createTime = model.createTime;
                this.enableAuthFreeRead = model.enableAuthFreeRead;
                this.enableAuthToken = model.enableAuthToken;
                this.folderUrl = model.folderUrl;
                this.grafanaInstanceId = model.grafanaInstanceId;
                this.grafanaInstanceName = model.grafanaInstanceName;
                this.httpApiInterUrl = model.httpApiInterUrl;
                this.httpApiIntraUrl = model.httpApiIntraUrl;
                this.instanceType = model.instanceType;
                this.paymentType = model.paymentType;
                this.product = model.product;
                this.prometheusInstances = model.prometheusInstances;
                this.prometheusViewId = model.prometheusViewId;
                this.prometheusViewName = model.prometheusViewName;
                this.regionId = model.regionId;
                this.remoteReadInterUrl = model.remoteReadInterUrl;
                this.remoteReadIntraUrl = model.remoteReadIntraUrl;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.supportAuthTypes = model.supportAuthTypes;
                this.tags = model.tags;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Password-free read policy (supports IP segments and VpcId).</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;SourceIp&quot;: [
             *     &quot;192.168.1.0/24&quot;,
             *     &quot;172.168.2.22&quot;
             *   ],
             *   &quot;SourceVpc&quot;: [
             *     &quot;vpc-xx1&quot;,
             *     &quot;vpc-xx2&quot;
             *   ]
             * }</p>
             */
            public Builder authFreeReadPolicy(String authFreeReadPolicy) {
                this.authFreeReadPolicy = authFreeReadPolicy;
                return this;
            }

            /**
             * <p>authToken string.</p>
             * 
             * <strong>example:</strong>
             * <p>eJxxxxxx</p>
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * <p>Instance creation time, using UTC+0 time, format is yyyy-MM-ddTHH:mmZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10T02:07:53Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Whether to enable password-free read.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
                this.enableAuthFreeRead = enableAuthFreeRead;
                return this;
            }

            /**
             * <p>Whether to enable authToken.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAuthToken(Boolean enableAuthToken) {
                this.enableAuthToken = enableAuthToken;
                return this;
            }

            /**
             * <p>Observability dashboard URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx">https://xxxx</a></p>
             */
            public Builder folderUrl(String folderUrl) {
                this.folderUrl = folderUrl;
                return this;
            }

            /**
             * <p>Bound managed Grafana instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-xxx</p>
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * <p>Bound managed Grafana instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>gxxx</p>
             */
            public Builder grafanaInstanceName(String grafanaInstanceName) {
                this.grafanaInstanceName = grafanaInstanceName;
                return this;
            }

            /**
             * <p>Public HTTP address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
             */
            public Builder httpApiInterUrl(String httpApiInterUrl) {
                this.httpApiInterUrl = httpApiInterUrl;
                return this;
            }

            /**
             * <p>Private HTTP address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
             */
            public Builder httpApiIntraUrl(String httpApiIntraUrl) {
                this.httpApiIntraUrl = httpApiIntraUrl;
                return this;
            }

            /**
             * <p>Instance type, fixed value prom-view.</p>
             * 
             * <strong>example:</strong>
             * <p>prom-view</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Payment type. Currently, the fixed value is FREE (free).</p>
             * 
             * <strong>example:</strong>
             * <p>FREE</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>Product that the prom instance belongs to.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>Prometheus instance list.</p>
             */
            public Builder prometheusInstances(java.util.List<PrometheusInstances> prometheusInstances) {
                this.prometheusInstances = prometheusInstances;
                return this;
            }

            /**
             * <p>Prometheus view ID.</p>
             * 
             * <strong>example:</strong>
             * <p>view-xxx</p>
             */
            public Builder prometheusViewId(String prometheusViewId) {
                this.prometheusViewId = prometheusViewId;
                return this;
            }

            /**
             * <p>Prometheus view name.</p>
             * 
             * <strong>example:</strong>
             * <p>view1</p>
             */
            public Builder prometheusViewName(String prometheusViewName) {
                this.prometheusViewName = prometheusViewName;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Remote read public URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read">http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read</a></p>
             */
            public Builder remoteReadInterUrl(String remoteReadInterUrl) {
                this.remoteReadInterUrl = remoteReadInterUrl;
                return this;
            }

            /**
             * <p>Remote read intranet URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou-intranet.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read">http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou-intranet.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read</a></p>
             */
            public Builder remoteReadIntraUrl(String remoteReadIntraUrl) {
                this.remoteReadIntraUrl = remoteReadIntraUrl;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm3gn5i6bigbi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Fixed value: PrometheusView</p>
             * 
             * <strong>example:</strong>
             * <p>RegistryModule</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Backend data storage status</p>
             * 
             * <strong>example:</strong>
             * <p>Pending2Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Supported authentication types.</p>
             */
            public Builder supportAuthTypes(java.util.List<String> supportAuthTypes) {
                this.supportAuthTypes = supportAuthTypes;
                return this;
            }

            /**
             * <p>Instance tag keys.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11222</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version.</p>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Workspace to which the environment belongs</p>
             * 
             * <strong>example:</strong>
             * <p>cms-monitor-test-aysls-pub-cn-fuzhou-monitor</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public PrometheusView build() {
                return new PrometheusView(this);
            } 

        } 

    }
}
