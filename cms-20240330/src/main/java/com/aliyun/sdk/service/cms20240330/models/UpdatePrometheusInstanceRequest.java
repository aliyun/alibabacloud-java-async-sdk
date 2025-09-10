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
 * {@link UpdatePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusInstanceRequest</p>
 */
public class UpdatePrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("archiveDuration")
    private Integer archiveDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authFreeReadPolicy")
    private String authFreeReadPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authFreeWritePolicy")
    private String authFreeWritePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuthFreeRead")
    private Boolean enableAuthFreeRead;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuthFreeWrite")
    private Boolean enableAuthFreeWrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuthToken")
    private Boolean enableAuthToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceName")
    private String prometheusInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storageDuration")
    private Integer storageDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private UpdatePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.archiveDuration = builder.archiveDuration;
        this.authFreeReadPolicy = builder.authFreeReadPolicy;
        this.authFreeWritePolicy = builder.authFreeWritePolicy;
        this.enableAuthFreeRead = builder.enableAuthFreeRead;
        this.enableAuthFreeWrite = builder.enableAuthFreeWrite;
        this.enableAuthToken = builder.enableAuthToken;
        this.paymentType = builder.paymentType;
        this.prometheusInstanceName = builder.prometheusInstanceName;
        this.status = builder.status;
        this.storageDuration = builder.storageDuration;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusInstanceId
     */
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
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
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return prometheusInstanceName
     */
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusInstanceRequest, Builder> {
        private String prometheusInstanceId; 
        private Integer archiveDuration; 
        private String authFreeReadPolicy; 
        private String authFreeWritePolicy; 
        private Boolean enableAuthFreeRead; 
        private Boolean enableAuthFreeWrite; 
        private Boolean enableAuthToken; 
        private String paymentType; 
        private String prometheusInstanceName; 
        private String status; 
        private Integer storageDuration; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusInstanceRequest request) {
            super(request);
            this.prometheusInstanceId = request.prometheusInstanceId;
            this.archiveDuration = request.archiveDuration;
            this.authFreeReadPolicy = request.authFreeReadPolicy;
            this.authFreeWritePolicy = request.authFreeWritePolicy;
            this.enableAuthFreeRead = request.enableAuthFreeRead;
            this.enableAuthFreeWrite = request.enableAuthFreeWrite;
            this.enableAuthToken = request.enableAuthToken;
            this.paymentType = request.paymentType;
            this.prometheusInstanceName = request.prometheusInstanceName;
            this.status = request.status;
            this.storageDuration = request.storageDuration;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxxxxxx</p>
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putPathParameter("prometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * archiveDuration.
         */
        public Builder archiveDuration(Integer archiveDuration) {
            this.putBodyParameter("archiveDuration", archiveDuration);
            this.archiveDuration = archiveDuration;
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
         * authFreeWritePolicy.
         */
        public Builder authFreeWritePolicy(String authFreeWritePolicy) {
            this.putBodyParameter("authFreeWritePolicy", authFreeWritePolicy);
            this.authFreeWritePolicy = authFreeWritePolicy;
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
         * enableAuthFreeWrite.
         */
        public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
            this.putBodyParameter("enableAuthFreeWrite", enableAuthFreeWrite);
            this.enableAuthFreeWrite = enableAuthFreeWrite;
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
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * prometheusInstanceName.
         */
        public Builder prometheusInstanceName(String prometheusInstanceName) {
            this.putBodyParameter("prometheusInstanceName", prometheusInstanceName);
            this.prometheusInstanceName = prometheusInstanceName;
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
         * storageDuration.
         */
        public Builder storageDuration(Integer storageDuration) {
            this.putBodyParameter("storageDuration", storageDuration);
            this.storageDuration = storageDuration;
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
        public UpdatePrometheusInstanceRequest build() {
            return new UpdatePrometheusInstanceRequest(this);
        } 

    } 

}
