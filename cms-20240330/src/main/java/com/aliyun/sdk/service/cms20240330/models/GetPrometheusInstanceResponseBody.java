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
 * {@link GetPrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusInstanceResponseBody</p>
 */
public class GetPrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusInstance")
    private PrometheusInstance prometheusInstance;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPrometheusInstanceResponseBody(Builder builder) {
        this.prometheusInstance = builder.prometheusInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private PrometheusInstance prometheusInstance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPrometheusInstanceResponseBody model) {
            this.prometheusInstance = model.prometheusInstance;
            this.requestId = model.requestId;
        } 

        /**
         * prometheusInstance.
         */
        public Builder prometheusInstance(PrometheusInstance prometheusInstance) {
            this.prometheusInstance = prometheusInstance;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
     * {@link GetPrometheusInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrometheusInstanceResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("pushGatewayIntraUrl")
        private String pushGatewayIntraUrl;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("remoteReadInterUrl")
        private String remoteReadInterUrl;

        @com.aliyun.core.annotation.NameInMap("remoteReadIntraUrl")
        private String remoteReadIntraUrl;

        @com.aliyun.core.annotation.NameInMap("remoteWriteInterUrl")
        private String remoteWriteInterUrl;

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
            this.httpApiIntraUrl = builder.httpApiIntraUrl;
            this.instanceType = builder.instanceType;
            this.paymentType = builder.paymentType;
            this.paymentTypeUpdateTime = builder.paymentTypeUpdateTime;
            this.product = builder.product;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.prometheusInstanceName = builder.prometheusInstanceName;
            this.pushGatewayInterUrl = builder.pushGatewayInterUrl;
            this.pushGatewayIntraUrl = builder.pushGatewayIntraUrl;
            this.regionId = builder.regionId;
            this.remoteReadInterUrl = builder.remoteReadInterUrl;
            this.remoteReadIntraUrl = builder.remoteReadIntraUrl;
            this.remoteWriteInterUrl = builder.remoteWriteInterUrl;
            this.remoteWriteIntraUrl = builder.remoteWriteIntraUrl;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.storageDuration = builder.storageDuration;
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
            private String httpApiIntraUrl; 
            private String instanceType; 
            private String paymentType; 
            private String paymentTypeUpdateTime; 
            private String product; 
            private String prometheusInstanceId; 
            private String prometheusInstanceName; 
            private String pushGatewayInterUrl; 
            private String pushGatewayIntraUrl; 
            private String regionId; 
            private String remoteReadInterUrl; 
            private String remoteReadIntraUrl; 
            private String remoteWriteInterUrl; 
            private String remoteWriteIntraUrl; 
            private String resourceGroupId; 
            private String resourceType; 
            private String status; 
            private Integer storageDuration; 
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
                this.httpApiIntraUrl = model.httpApiIntraUrl;
                this.instanceType = model.instanceType;
                this.paymentType = model.paymentType;
                this.paymentTypeUpdateTime = model.paymentTypeUpdateTime;
                this.product = model.product;
                this.prometheusInstanceId = model.prometheusInstanceId;
                this.prometheusInstanceName = model.prometheusInstanceName;
                this.pushGatewayInterUrl = model.pushGatewayInterUrl;
                this.pushGatewayIntraUrl = model.pushGatewayIntraUrl;
                this.regionId = model.regionId;
                this.remoteReadInterUrl = model.remoteReadInterUrl;
                this.remoteReadIntraUrl = model.remoteReadIntraUrl;
                this.remoteWriteInterUrl = model.remoteWriteInterUrl;
                this.remoteWriteIntraUrl = model.remoteWriteIntraUrl;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.storageDuration = model.storageDuration;
                this.supportAuthTypes = model.supportAuthTypes;
                this.tags = model.tags;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * accessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * archiveDuration.
             */
            public Builder archiveDuration(Integer archiveDuration) {
                this.archiveDuration = archiveDuration;
                return this;
            }

            /**
             * authFreeReadPolicy.
             */
            public Builder authFreeReadPolicy(String authFreeReadPolicy) {
                this.authFreeReadPolicy = authFreeReadPolicy;
                return this;
            }

            /**
             * authFreeWritePolicy.
             */
            public Builder authFreeWritePolicy(String authFreeWritePolicy) {
                this.authFreeWritePolicy = authFreeWritePolicy;
                return this;
            }

            /**
             * authToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * enableAuthFreeRead.
             */
            public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
                this.enableAuthFreeRead = enableAuthFreeRead;
                return this;
            }

            /**
             * enableAuthFreeWrite.
             */
            public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
                this.enableAuthFreeWrite = enableAuthFreeWrite;
                return this;
            }

            /**
             * enableAuthToken.
             */
            public Builder enableAuthToken(Boolean enableAuthToken) {
                this.enableAuthToken = enableAuthToken;
                return this;
            }

            /**
             * extraInfo.
             */
            public Builder extraInfo(java.util.Map<String, String> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * folderUrl.
             */
            public Builder folderUrl(String folderUrl) {
                this.folderUrl = folderUrl;
                return this;
            }

            /**
             * grafanaInstanceId.
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * grafanaInstanceName.
             */
            public Builder grafanaInstanceName(String grafanaInstanceName) {
                this.grafanaInstanceName = grafanaInstanceName;
                return this;
            }

            /**
             * httpApiInterUrl.
             */
            public Builder httpApiInterUrl(String httpApiInterUrl) {
                this.httpApiInterUrl = httpApiInterUrl;
                return this;
            }

            /**
             * httpApiIntraUrl.
             */
            public Builder httpApiIntraUrl(String httpApiIntraUrl) {
                this.httpApiIntraUrl = httpApiIntraUrl;
                return this;
            }

            /**
             * <p>remote-write（Prometheus for Remote Write）</p>
             * 
             * <strong>example:</strong>
             * <p>e1</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * paymentTypeUpdateTime.
             */
            public Builder paymentTypeUpdateTime(String paymentTypeUpdateTime) {
                this.paymentTypeUpdateTime = paymentTypeUpdateTime;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * prometheusInstanceId.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * prometheusInstanceName.
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * pushGatewayInterUrl.
             */
            public Builder pushGatewayInterUrl(String pushGatewayInterUrl) {
                this.pushGatewayInterUrl = pushGatewayInterUrl;
                return this;
            }

            /**
             * pushGatewayIntraUrl.
             */
            public Builder pushGatewayIntraUrl(String pushGatewayIntraUrl) {
                this.pushGatewayIntraUrl = pushGatewayIntraUrl;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * remoteReadInterUrl.
             */
            public Builder remoteReadInterUrl(String remoteReadInterUrl) {
                this.remoteReadInterUrl = remoteReadInterUrl;
                return this;
            }

            /**
             * remoteReadIntraUrl.
             */
            public Builder remoteReadIntraUrl(String remoteReadIntraUrl) {
                this.remoteReadIntraUrl = remoteReadIntraUrl;
                return this;
            }

            /**
             * remoteWriteInterUrl.
             */
            public Builder remoteWriteInterUrl(String remoteWriteInterUrl) {
                this.remoteWriteInterUrl = remoteWriteInterUrl;
                return this;
            }

            /**
             * remoteWriteIntraUrl.
             */
            public Builder remoteWriteIntraUrl(String remoteWriteIntraUrl) {
                this.remoteWriteIntraUrl = remoteWriteIntraUrl;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * storageDuration.
             */
            public Builder storageDuration(Integer storageDuration) {
                this.storageDuration = storageDuration;
                return this;
            }

            /**
             * supportAuthTypes.
             */
            public Builder supportAuthTypes(java.util.List<String> supportAuthTypes) {
                this.supportAuthTypes = supportAuthTypes;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * workspace.
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
