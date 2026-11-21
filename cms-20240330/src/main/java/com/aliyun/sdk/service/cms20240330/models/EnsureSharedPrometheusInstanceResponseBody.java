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
 * {@link EnsureSharedPrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>EnsureSharedPrometheusInstanceResponseBody</p>
 */
public class EnsureSharedPrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created")
    private Boolean created;

    @com.aliyun.core.annotation.NameInMap("prometheusInstance")
    private PrometheusInstance prometheusInstance;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private EnsureSharedPrometheusInstanceResponseBody(Builder builder) {
        this.created = builder.created;
        this.prometheusInstance = builder.prometheusInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnsureSharedPrometheusInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return created
     */
    public Boolean getCreated() {
        return this.created;
    }

    /**
     * @return prometheusInstance
     */
    public PrometheusInstance getPrometheusInstance() {
        return this.prometheusInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean created; 
        private PrometheusInstance prometheusInstance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnsureSharedPrometheusInstanceResponseBody model) {
            this.created = model.created;
            this.prometheusInstance = model.prometheusInstance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether a new instance was created by this call. The value is false if an existing instance is found.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder created(Boolean created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The details of the shared Prometheus instance. The fields are the same as the prometheusInstance field in GetPrometheusInstance.</p>
         */
        public Builder prometheusInstance(PrometheusInstance prometheusInstance) {
            this.prometheusInstance = prometheusInstance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnsureSharedPrometheusInstanceResponseBody build() {
            return new EnsureSharedPrometheusInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnsureSharedPrometheusInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>EnsureSharedPrometheusInstanceResponseBody</p>
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
             * <p>The key of the instance tag.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:cms:shareScope</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the instance tag.</p>
             * 
             * <strong>example:</strong>
             * <p>region:cn-hangzhou:team-workspace</p>
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
     * {@link EnsureSharedPrometheusInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>EnsureSharedPrometheusInstanceResponseBody</p>
     */
    public static class PrometheusInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("archiveDuration")
        private Integer archiveDuration;

        @com.aliyun.core.annotation.NameInMap("authFreeReadPolicy")
        private String authFreeReadPolicy;

        @com.aliyun.core.annotation.NameInMap("authFreeWritePolicy")
        private String authFreeWritePolicy;

        @com.aliyun.core.annotation.NameInMap("authToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("enableAuthFreeRead")
        private Boolean enableAuthFreeRead;

        @com.aliyun.core.annotation.NameInMap("enableAuthFreeWrite")
        private Boolean enableAuthFreeWrite;

        @com.aliyun.core.annotation.NameInMap("enableAuthToken")
        private Boolean enableAuthToken;

        @com.aliyun.core.annotation.NameInMap("extraInfo")
        private java.util.Map<String, String> extraInfo;

        @com.aliyun.core.annotation.NameInMap("folderUrl")
        private String folderUrl;

        @com.aliyun.core.annotation.NameInMap("grafanaInstanceId")
        private String grafanaInstanceId;

        @com.aliyun.core.annotation.NameInMap("grafanaInstanceName")
        private String grafanaInstanceName;

        @com.aliyun.core.annotation.NameInMap("httpApiInterUrl")
        private String httpApiInterUrl;

        @com.aliyun.core.annotation.NameInMap("httpApiInternalUrl")
        private String httpApiInternalUrl;

        @com.aliyun.core.annotation.NameInMap("httpApiIntraUrl")
        private String httpApiIntraUrl;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("paymentTypeUpdateTime")
        private String paymentTypeUpdateTime;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("prometheusInstanceName")
        private String prometheusInstanceName;

        @com.aliyun.core.annotation.NameInMap("pushGatewayInterUrl")
        private String pushGatewayInterUrl;

        @com.aliyun.core.annotation.NameInMap("pushGatewayInternalUrl")
        private String pushGatewayInternalUrl;

        @com.aliyun.core.annotation.NameInMap("pushGatewayIntraUrl")
        private String pushGatewayIntraUrl;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("remoteReadInterUrl")
        private String remoteReadInterUrl;

        @com.aliyun.core.annotation.NameInMap("remoteReadInternalUrl")
        private String remoteReadInternalUrl;

        @com.aliyun.core.annotation.NameInMap("remoteReadIntraUrl")
        private String remoteReadIntraUrl;

        @com.aliyun.core.annotation.NameInMap("remoteWriteInterUrl")
        private String remoteWriteInterUrl;

        @com.aliyun.core.annotation.NameInMap("remoteWriteInternalUrl")
        private String remoteWriteInternalUrl;

        @com.aliyun.core.annotation.NameInMap("remoteWriteIntraUrl")
        private String remoteWriteIntraUrl;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("storageDuration")
        private Integer storageDuration;

        @com.aliyun.core.annotation.NameInMap("storeConfig")
        private PrometheusInstanceStoreConfig storeConfig;

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

        private PrometheusInstance(Builder builder) {
            this.accessType = builder.accessType;
            this.archiveDuration = builder.archiveDuration;
            this.authFreeReadPolicy = builder.authFreeReadPolicy;
            this.authFreeWritePolicy = builder.authFreeWritePolicy;
            this.authToken = builder.authToken;
            this.createTime = builder.createTime;
            this.enableAuthFreeRead = builder.enableAuthFreeRead;
            this.enableAuthFreeWrite = builder.enableAuthFreeWrite;
            this.enableAuthToken = builder.enableAuthToken;
            this.extraInfo = builder.extraInfo;
            this.folderUrl = builder.folderUrl;
            this.grafanaInstanceId = builder.grafanaInstanceId;
            this.grafanaInstanceName = builder.grafanaInstanceName;
            this.httpApiInterUrl = builder.httpApiInterUrl;
            this.httpApiInternalUrl = builder.httpApiInternalUrl;
            this.httpApiIntraUrl = builder.httpApiIntraUrl;
            this.instanceType = builder.instanceType;
            this.paymentType = builder.paymentType;
            this.paymentTypeUpdateTime = builder.paymentTypeUpdateTime;
            this.product = builder.product;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.prometheusInstanceName = builder.prometheusInstanceName;
            this.pushGatewayInterUrl = builder.pushGatewayInterUrl;
            this.pushGatewayInternalUrl = builder.pushGatewayInternalUrl;
            this.pushGatewayIntraUrl = builder.pushGatewayIntraUrl;
            this.regionId = builder.regionId;
            this.remoteReadInterUrl = builder.remoteReadInterUrl;
            this.remoteReadInternalUrl = builder.remoteReadInternalUrl;
            this.remoteReadIntraUrl = builder.remoteReadIntraUrl;
            this.remoteWriteInterUrl = builder.remoteWriteInterUrl;
            this.remoteWriteInternalUrl = builder.remoteWriteInternalUrl;
            this.remoteWriteIntraUrl = builder.remoteWriteIntraUrl;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.storageDuration = builder.storageDuration;
            this.storeConfig = builder.storeConfig;
            this.supportAuthTypes = builder.supportAuthTypes;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusInstance create() {
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
         * @return enableAuthFreeWrite
         */
        public Boolean getEnableAuthFreeWrite() {
            return this.enableAuthFreeWrite;
        }

        /**
         * @return enableAuthToken
         */
        public Boolean getEnableAuthToken() {
            return this.enableAuthToken;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
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
         * @return httpApiInternalUrl
         */
        public String getHttpApiInternalUrl() {
            return this.httpApiInternalUrl;
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
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return prometheusInstanceName
         */
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        /**
         * @return pushGatewayInterUrl
         */
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        /**
         * @return pushGatewayInternalUrl
         */
        public String getPushGatewayInternalUrl() {
            return this.pushGatewayInternalUrl;
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
         * @return remoteReadInternalUrl
         */
        public String getRemoteReadInternalUrl() {
            return this.remoteReadInternalUrl;
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
         * @return remoteWriteInternalUrl
         */
        public String getRemoteWriteInternalUrl() {
            return this.remoteWriteInternalUrl;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageDuration
         */
        public Integer getStorageDuration() {
            return this.storageDuration;
        }

        /**
         * @return storeConfig
         */
        public PrometheusInstanceStoreConfig getStoreConfig() {
            return this.storeConfig;
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
            private String accessType; 
            private Integer archiveDuration; 
            private String authFreeReadPolicy; 
            private String authFreeWritePolicy; 
            private String authToken; 
            private String createTime; 
            private Boolean enableAuthFreeRead; 
            private Boolean enableAuthFreeWrite; 
            private Boolean enableAuthToken; 
            private java.util.Map<String, String> extraInfo; 
            private String folderUrl; 
            private String grafanaInstanceId; 
            private String grafanaInstanceName; 
            private String httpApiInterUrl; 
            private String httpApiInternalUrl; 
            private String httpApiIntraUrl; 
            private String instanceType; 
            private String paymentType; 
            private String paymentTypeUpdateTime; 
            private String product; 
            private String prometheusInstanceId; 
            private String prometheusInstanceName; 
            private String pushGatewayInterUrl; 
            private String pushGatewayInternalUrl; 
            private String pushGatewayIntraUrl; 
            private String regionId; 
            private String remoteReadInterUrl; 
            private String remoteReadInternalUrl; 
            private String remoteReadIntraUrl; 
            private String remoteWriteInterUrl; 
            private String remoteWriteInternalUrl; 
            private String remoteWriteIntraUrl; 
            private String resourceGroupId; 
            private String resourceType; 
            private String status; 
            private Integer storageDuration; 
            private PrometheusInstanceStoreConfig storeConfig; 
            private java.util.List<String> supportAuthTypes; 
            private java.util.List<Tags> tags; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(PrometheusInstance model) {
                this.accessType = model.accessType;
                this.archiveDuration = model.archiveDuration;
                this.authFreeReadPolicy = model.authFreeReadPolicy;
                this.authFreeWritePolicy = model.authFreeWritePolicy;
                this.authToken = model.authToken;
                this.createTime = model.createTime;
                this.enableAuthFreeRead = model.enableAuthFreeRead;
                this.enableAuthFreeWrite = model.enableAuthFreeWrite;
                this.enableAuthToken = model.enableAuthToken;
                this.extraInfo = model.extraInfo;
                this.folderUrl = model.folderUrl;
                this.grafanaInstanceId = model.grafanaInstanceId;
                this.grafanaInstanceName = model.grafanaInstanceName;
                this.httpApiInterUrl = model.httpApiInterUrl;
                this.httpApiInternalUrl = model.httpApiInternalUrl;
                this.httpApiIntraUrl = model.httpApiIntraUrl;
                this.instanceType = model.instanceType;
                this.paymentType = model.paymentType;
                this.paymentTypeUpdateTime = model.paymentTypeUpdateTime;
                this.product = model.product;
                this.prometheusInstanceId = model.prometheusInstanceId;
                this.prometheusInstanceName = model.prometheusInstanceName;
                this.pushGatewayInterUrl = model.pushGatewayInterUrl;
                this.pushGatewayInternalUrl = model.pushGatewayInternalUrl;
                this.pushGatewayIntraUrl = model.pushGatewayIntraUrl;
                this.regionId = model.regionId;
                this.remoteReadInterUrl = model.remoteReadInterUrl;
                this.remoteReadInternalUrl = model.remoteReadInternalUrl;
                this.remoteReadIntraUrl = model.remoteReadIntraUrl;
                this.remoteWriteInterUrl = model.remoteWriteInterUrl;
                this.remoteWriteInternalUrl = model.remoteWriteInternalUrl;
                this.remoteWriteIntraUrl = model.remoteWriteIntraUrl;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.storageDuration = model.storageDuration;
                this.storeConfig = model.storeConfig;
                this.supportAuthTypes = model.supportAuthTypes;
                this.tags = model.tags;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * <p>The access permissions of the instance. Valid values: readWrite, readOnly, and httpReadOnly.</p>
             * 
             * <strong>example:</strong>
             * <p>readWrite</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The number of days to automatically archive and retain data after the storage expires. A value of 0 indicates no archiving, and 3650 indicates permanent retention.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder archiveDuration(Integer archiveDuration) {
                this.archiveDuration = archiveDuration;
                return this;
            }

            /**
             * <p>The IP address whitelist policy that allows access to the authentication-free read endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder authFreeReadPolicy(String authFreeReadPolicy) {
                this.authFreeReadPolicy = authFreeReadPolicy;
                return this;
            }

            /**
             * <p>The IP address whitelist policy that allows access to the authentication-free write endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder authFreeWritePolicy(String authFreeWritePolicy) {
                this.authFreeWritePolicy = authFreeWritePolicy;
                return this;
            }

            /**
             * <p>The authentication token of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>example-auth-token</p>
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time is displayed in UTC+0 in the yyyy-MM-ddTHH:mmZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-11T06:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether authentication-free read is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
                this.enableAuthFreeRead = enableAuthFreeRead;
                return this;
            }

            /**
             * <p>Specifies whether authentication-free write is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
                this.enableAuthFreeWrite = enableAuthFreeWrite;
                return this;
            }

            /**
             * <p>Specifies whether authentication token-based authentication is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAuthToken(Boolean enableAuthToken) {
                this.enableAuthToken = enableAuthToken;
                return this;
            }

            /**
             * <p>The extended information. This field is returned only for console requests.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;slsProject&quot;:&quot;proj-cms-cn-hangzhou&quot;}</p>
             */
            public Builder extraInfo(java.util.Map<String, String> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The URL of the visualization dashboard associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://g.console.aliyun.com/folders/example">https://g.console.aliyun.com/folders/example</a></p>
             */
            public Builder folderUrl(String folderUrl) {
                this.folderUrl = folderUrl;
                return this;
            }

            /**
             * <p>The ID of the bound managed Grafana instance.</p>
             * 
             * <strong>example:</strong>
             * <p>grafana-cn-hangzhou-example</p>
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * <p>The name of the bound managed Grafana instance.</p>
             * 
             * <strong>example:</strong>
             * <p>shared-grafana</p>
             */
            public Builder grafanaInstanceName(String grafanaInstanceName) {
                this.grafanaInstanceName = grafanaInstanceName;
                return this;
            }

            /**
             * <p>The public endpoint of the Prometheus HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
             */
            public Builder httpApiInterUrl(String httpApiInterUrl) {
                this.httpApiInterUrl = httpApiInterUrl;
                return this;
            }

            /**
             * <p>The internal endpoint of the Prometheus HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
             */
            public Builder httpApiInternalUrl(String httpApiInternalUrl) {
                this.httpApiInternalUrl = httpApiInternalUrl;
                return this;
            }

            /**
             * <p>The internal network endpoint of the Prometheus HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
             */
            public Builder httpApiIntraUrl(String httpApiIntraUrl) {
                this.httpApiIntraUrl = httpApiIntraUrl;
                return this;
            }

            /**
             * <p>The instance type. For shared instances, the value is remote-write, which indicates Prometheus for Remote Write.</p>
             * 
             * <strong>example:</strong>
             * <p>remote-write</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The billing method. A value of POSTPAY indicates pay-as-you-go based on the number of reported metrics, and POSTPAY_GB indicates pay-as-you-go based on the volume of written metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY_GB</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The time when the billing method of the instance was last modified. The time is in UTC+0 and formatted as yyyy-MM-ddTHH:mmZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-11T06:00Z</p>
             */
            public Builder paymentTypeUpdateTime(String paymentTypeUpdateTime) {
                this.paymentTypeUpdateTime = paymentTypeUpdateTime;
                return this;
            }

            /**
             * <p>The product to which the instance belongs. Valid values: arms and cms.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rw-8f3c1a2b4d5e6f70</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>The name of the Prometheus instance. For workspace shared instances, the name is generated by the server in the RegionShare:{workspace}:{regionId} format.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionShare:team-workspace:cn-hangzhou</p>
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * <p>The public endpoint of Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
             */
            public Builder pushGatewayInterUrl(String pushGatewayInterUrl) {
                this.pushGatewayInterUrl = pushGatewayInterUrl;
                return this;
            }

            /**
             * <p>The internal endpoint of Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
             */
            public Builder pushGatewayInternalUrl(String pushGatewayInternalUrl) {
                this.pushGatewayInternalUrl = pushGatewayInternalUrl;
                return this;
            }

            /**
             * <p>The internal network endpoint of Pushgateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
             */
            public Builder pushGatewayIntraUrl(String pushGatewayIntraUrl) {
                this.pushGatewayIntraUrl = pushGatewayIntraUrl;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The public endpoint of Remote Read.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/read">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
             */
            public Builder remoteReadInterUrl(String remoteReadInterUrl) {
                this.remoteReadInterUrl = remoteReadInterUrl;
                return this;
            }

            /**
             * <p>The internal endpoint of Remote Read.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/read">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
             */
            public Builder remoteReadInternalUrl(String remoteReadInternalUrl) {
                this.remoteReadInternalUrl = remoteReadInternalUrl;
                return this;
            }

            /**
             * <p>The internal network endpoint of Remote Read.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/read">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
             */
            public Builder remoteReadIntraUrl(String remoteReadIntraUrl) {
                this.remoteReadIntraUrl = remoteReadIntraUrl;
                return this;
            }

            /**
             * <p>The public endpoint of Remote Write.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/write">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
             */
            public Builder remoteWriteInterUrl(String remoteWriteInterUrl) {
                this.remoteWriteInterUrl = remoteWriteInterUrl;
                return this;
            }

            /**
             * <p>The internal endpoint of Remote Write.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/write">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
             */
            public Builder remoteWriteInternalUrl(String remoteWriteInternalUrl) {
                this.remoteWriteInternalUrl = remoteWriteInternalUrl;
                return this;
            }

            /**
             * <p>The internal network endpoint of Remote Write.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/write">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
             */
            public Builder remoteWriteIntraUrl(String remoteWriteIntraUrl) {
                this.remoteWriteIntraUrl = remoteWriteIntraUrl;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyexample</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource type. The value is fixed as PrometheusInstance.</p>
             * 
             * <strong>example:</strong>
             * <p>PrometheusInstance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The backend data storage status, such as Running.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric storage duration in days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder storageDuration(Integer storageDuration) {
                this.storageDuration = storageDuration;
                return this;
            }

            /**
             * <p>The query cache and parallel query configurations for Prometheus.</p>
             */
            public Builder storeConfig(PrometheusInstanceStoreConfig storeConfig) {
                this.storeConfig = storeConfig;
                return this;
            }

            /**
             * <p>The list of authentication and authorization types supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;BasicAuth&quot;]</p>
             */
            public Builder supportAuthTypes(java.util.List<String> supportAuthTypes) {
                this.supportAuthTypes = supportAuthTypes;
                return this;
            }

            /**
             * <p>The instance tags. Workspace shared instances include the system tag acs:cms:shareScope.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The version of the instance, such as V2.</p>
             * 
             * <strong>example:</strong>
             * <p>V2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The name of the workspace to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>team-workspace</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public PrometheusInstance build() {
                return new PrometheusInstance(this);
            } 

        } 

    }
}
