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
 * {@link CreatePrometheusViewRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusViewRequest</p>
 */
public class CreatePrometheusViewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authFreeReadPolicy")
    private String authFreeReadPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuthFreeRead")
    private Boolean enableAuthFreeRead;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuthToken")
    private Boolean enableAuthToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prometheusInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PrometheusInstances> prometheusInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prometheusViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusViewName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreatePrometheusViewRequest(Builder builder) {
        super(builder);
        this.authFreeReadPolicy = builder.authFreeReadPolicy;
        this.enableAuthFreeRead = builder.enableAuthFreeRead;
        this.enableAuthToken = builder.enableAuthToken;
        this.prometheusInstances = builder.prometheusInstances;
        this.prometheusViewName = builder.prometheusViewName;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authFreeReadPolicy
     */
    public String getAuthFreeReadPolicy() {
        return this.authFreeReadPolicy;
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
     * @return prometheusInstances
     */
    public java.util.List<PrometheusInstances> getPrometheusInstances() {
        return this.prometheusInstances;
    }

    /**
     * @return prometheusViewName
     */
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreatePrometheusViewRequest, Builder> {
        private String authFreeReadPolicy; 
        private Boolean enableAuthFreeRead; 
        private Boolean enableAuthToken; 
        private java.util.List<PrometheusInstances> prometheusInstances; 
        private String prometheusViewName; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String version; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusViewRequest request) {
            super(request);
            this.authFreeReadPolicy = request.authFreeReadPolicy;
            this.enableAuthFreeRead = request.enableAuthFreeRead;
            this.enableAuthToken = request.enableAuthToken;
            this.prometheusInstances = request.prometheusInstances;
            this.prometheusViewName = request.prometheusViewName;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tags = request.tags;
            this.version = request.version;
            this.workspace = request.workspace;
        } 

        /**
         * <p>Not enabled yet</p>
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
            this.putBodyParameter("authFreeReadPolicy", authFreeReadPolicy);
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }

        /**
         * <p>Whether to support password-free read</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.putBodyParameter("enableAuthFreeRead", enableAuthFreeRead);
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }

        /**
         * <p>Whether to support authToken</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuthToken(Boolean enableAuthToken) {
            this.putBodyParameter("enableAuthToken", enableAuthToken);
            this.enableAuthToken = enableAuthToken;
            return this;
        }

        /**
         * <p>List of Prometheus instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder prometheusInstances(java.util.List<PrometheusInstances> prometheusInstances) {
            this.putBodyParameter("prometheusInstances", prometheusInstances);
            this.prometheusInstances = prometheusInstances;
            return this;
        }

        /**
         * <p>Prometheus view name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-prom-view-name</p>
         */
        public Builder prometheusViewName(String prometheusViewName) {
            this.putBodyParameter("prometheusViewName", prometheusViewName);
            this.prometheusViewName = prometheusViewName;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Not enabled yet.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The operation to be performed.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <ul>
         * <li>V1: Old version</li>
         * <li>V2: New version</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>V2</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>Default value: default-cms-{userId}-{regionId}</p>
         * 
         * <strong>example:</strong>
         * <p>cms-monitor-test-aysls-pub-cn-zhangjiakou-spe-monitor</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreatePrometheusViewRequest build() {
            return new CreatePrometheusViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrometheusViewRequest} extends {@link TeaModel}
     *
     * <p>CreatePrometheusViewRequest</p>
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
             * <p>arms-1d581fac20a462dcde743d9628</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>167271234567890</p>
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
     * {@link CreatePrometheusViewRequest} extends {@link TeaModel}
     *
     * <p>CreatePrometheusViewRequest</p>
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
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
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
