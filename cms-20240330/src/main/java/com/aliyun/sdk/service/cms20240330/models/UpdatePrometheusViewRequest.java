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
 * {@link UpdatePrometheusViewRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusViewRequest</p>
 */
public class UpdatePrometheusViewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusViewId;

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
    private java.util.List<PrometheusInstances> prometheusInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prometheusViewName")
    private String prometheusViewName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private UpdatePrometheusViewRequest(Builder builder) {
        super(builder);
        this.prometheusViewId = builder.prometheusViewId;
        this.authFreeReadPolicy = builder.authFreeReadPolicy;
        this.enableAuthFreeRead = builder.enableAuthFreeRead;
        this.enableAuthToken = builder.enableAuthToken;
        this.prometheusInstances = builder.prometheusInstances;
        this.prometheusViewName = builder.prometheusViewName;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusViewId
     */
    public String getPrometheusViewId() {
        return this.prometheusViewId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusViewRequest, Builder> {
        private String prometheusViewId; 
        private String authFreeReadPolicy; 
        private Boolean enableAuthFreeRead; 
        private Boolean enableAuthToken; 
        private java.util.List<PrometheusInstances> prometheusInstances; 
        private String prometheusViewName; 
        private String status; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusViewRequest request) {
            super(request);
            this.prometheusViewId = request.prometheusViewId;
            this.authFreeReadPolicy = request.authFreeReadPolicy;
            this.enableAuthFreeRead = request.enableAuthFreeRead;
            this.enableAuthToken = request.enableAuthToken;
            this.prometheusInstances = request.prometheusInstances;
            this.prometheusViewName = request.prometheusViewName;
            this.status = request.status;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxxxxxxx</p>
         */
        public Builder prometheusViewId(String prometheusViewId) {
            this.putPathParameter("prometheusViewId", prometheusViewId);
            this.prometheusViewId = prometheusViewId;
            return this;
        }

        /**
         * authFreeReadPolicy.
         */
        public Builder authFreeReadPolicy(String authFreeReadPolicy) {
            this.putBodyParameter("authFreeReadPolicy", authFreeReadPolicy);
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }

        /**
         * enableAuthFreeRead.
         */
        public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.putBodyParameter("enableAuthFreeRead", enableAuthFreeRead);
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }

        /**
         * enableAuthToken.
         */
        public Builder enableAuthToken(Boolean enableAuthToken) {
            this.putBodyParameter("enableAuthToken", enableAuthToken);
            this.enableAuthToken = enableAuthToken;
            return this;
        }

        /**
         * prometheusInstances.
         */
        public Builder prometheusInstances(java.util.List<PrometheusInstances> prometheusInstances) {
            this.putBodyParameter("prometheusInstances", prometheusInstances);
            this.prometheusInstances = prometheusInstances;
            return this;
        }

        /**
         * prometheusViewName.
         */
        public Builder prometheusViewName(String prometheusViewName) {
            this.putBodyParameter("prometheusViewName", prometheusViewName);
            this.prometheusViewName = prometheusViewName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdatePrometheusViewRequest build() {
            return new UpdatePrometheusViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrometheusViewRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrometheusViewRequest</p>
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
             * prometheusInstanceId.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
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
             * userId.
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
}
