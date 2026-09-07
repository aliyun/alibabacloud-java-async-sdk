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
 * {@link UpdatePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusInstanceRequest</p>
 */
public class UpdatePrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveDuration")
    private Integer archiveDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthFreeReadPolicy")
    private String authFreeReadPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthFreeWritePolicy")
    private String authFreeWritePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAuthFreeRead")
    private Boolean enableAuthFreeRead;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAuthFreeWrite")
    private Boolean enableAuthFreeWrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAuthToken")
    private Boolean enableAuthToken;

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
    @com.aliyun.core.annotation.NameInMap("StorageDuration")
    private Integer storageDuration;

    private UpdatePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.archiveDuration = builder.archiveDuration;
        this.authFreeReadPolicy = builder.authFreeReadPolicy;
        this.authFreeWritePolicy = builder.authFreeWritePolicy;
        this.clusterId = builder.clusterId;
        this.enableAuthFreeRead = builder.enableAuthFreeRead;
        this.enableAuthFreeWrite = builder.enableAuthFreeWrite;
        this.enableAuthToken = builder.enableAuthToken;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageDuration = builder.storageDuration;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return storageDuration
     */
    public Integer getStorageDuration() {
        return this.storageDuration;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusInstanceRequest, Builder> {
        private Integer archiveDuration; 
        private String authFreeReadPolicy; 
        private String authFreeWritePolicy; 
        private String clusterId; 
        private Boolean enableAuthFreeRead; 
        private Boolean enableAuthFreeWrite; 
        private Boolean enableAuthToken; 
        private String paymentType; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer storageDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusInstanceRequest request) {
            super(request);
            this.archiveDuration = request.archiveDuration;
            this.authFreeReadPolicy = request.authFreeReadPolicy;
            this.authFreeWritePolicy = request.authFreeWritePolicy;
            this.clusterId = request.clusterId;
            this.enableAuthFreeRead = request.enableAuthFreeRead;
            this.enableAuthFreeWrite = request.enableAuthFreeWrite;
            this.enableAuthToken = request.enableAuthToken;
            this.paymentType = request.paymentType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageDuration = request.storageDuration;
        } 

        /**
         * <p>The number of days for automatic archiving after storage expires. Valid values: 60, 90, 180, and 365. A value of 0 indicates no archiving.</p>
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
         * <p>The list of IP addresses for authentication-free read. CIDR notation is supported. Separate multiple IP addresses with line feeds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder authFreeReadPolicy(String authFreeReadPolicy) {
            this.putQueryParameter("AuthFreeReadPolicy", authFreeReadPolicy);
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }

        /**
         * <p>The list of IP addresses for authentication-free write. CIDR notation is supported. Separate multiple IP addresses with line feeds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder authFreeWritePolicy(String authFreeWritePolicy) {
            this.putQueryParameter("AuthFreeWritePolicy", authFreeWritePolicy);
            this.authFreeWritePolicy = authFreeWritePolicy;
            return this;
        }

        /**
         * <p>The Prometheus instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication-free read.</p>
         */
        public Builder enableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.putQueryParameter("EnableAuthFreeRead", enableAuthFreeRead);
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication-free write.</p>
         */
        public Builder enableAuthFreeWrite(Boolean enableAuthFreeWrite) {
            this.putQueryParameter("EnableAuthFreeWrite", enableAuthFreeWrite);
            this.enableAuthFreeWrite = enableAuthFreeWrite;
            return this;
        }

        /**
         * <p>Specifies whether to enable access token authentication.</p>
         */
        public Builder enableAuthToken(Boolean enableAuthToken) {
            this.putQueryParameter("EnableAuthToken", enableAuthToken);
            this.enableAuthToken = enableAuthToken;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POSTPAY: Pay-as-you-go based on metric reporting volume.</li>
         * <li>POSTPAY_GB: Pay-as-you-go based on metric write volume.</li>
         * </ul>
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID of the Prometheus instance.</p>
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
         * <p>The data retention period, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder storageDuration(Integer storageDuration) {
            this.putQueryParameter("StorageDuration", storageDuration);
            this.storageDuration = storageDuration;
            return this;
        }

        @Override
        public UpdatePrometheusInstanceRequest build() {
            return new UpdatePrometheusInstanceRequest(this);
        } 

    } 

}
