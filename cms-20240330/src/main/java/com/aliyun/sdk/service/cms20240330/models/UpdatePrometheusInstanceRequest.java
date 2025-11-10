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
         * <p>Prometheus instance ID</p>
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
         * <p>The number of days to automatically archive and save after the storage expires, 0 means no archiving. The range of archiving days:
         * V1: 1<del>365 days. Only supported for metric write volume.
         * V2: 1</del>3650 days (3650 indicates permanent storage).</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder archiveDuration(Integer archiveDuration) {
            this.putBodyParameter("archiveDuration", archiveDuration);
            this.archiveDuration = archiveDuration;
            return this;
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
            this.putBodyParameter("authFreeReadPolicy", authFreeReadPolicy);
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }

        /**
         * <p>Password-free write policy (supports IP segments and VpcId).</p>
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
        public Builder authFreeWritePolicy(String authFreeWritePolicy) {
            this.putBodyParameter("authFreeWritePolicy", authFreeWritePolicy);
            this.authFreeWritePolicy = authFreeWritePolicy;
            return this;
        }

        /**
         * <p>Whether to enable password-free read.</p>
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
         * <p>Whether to enable password-free write.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
            this.putBodyParameter("enableAuthFreeWrite", enableAuthFreeWrite);
            this.enableAuthFreeWrite = enableAuthFreeWrite;
            return this;
        }

        /**
         * <p>Whether to enable access token authentication.</p>
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
         * <p>Billing method (can only be modified once during the instance&quot;s lifecycle):
         * POSTPAY: Postpaid by metric reporting volume.
         * POSTPAY_GB: Postpaid by metric write volume.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY_GB</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-prom-name</p>
         */
        public Builder prometheusInstanceName(String prometheusInstanceName) {
            this.putBodyParameter("prometheusInstanceName", prometheusInstanceName);
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }

        /**
         * <p>Instance storage DB status (only supports RUNNING). If empty, the storage DB status will not be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Storage duration (days):
         * By write volume: 90, 180.
         * By metric reporting volume: 15, 30, 60, 90, 180.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder storageDuration(Integer storageDuration) {
            this.putBodyParameter("storageDuration", storageDuration);
            this.storageDuration = storageDuration;
            return this;
        }

        /**
         * <p>Belonging workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1500199863951574-cn-shanghai</p>
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
