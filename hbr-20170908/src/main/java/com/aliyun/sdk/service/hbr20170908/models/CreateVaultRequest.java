// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateVaultRequest</p>
 */
public class CreateVaultRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("CompressionAlgorithm")
    private String compressionAlgorithm;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Endpoint")
    private String endpoint;

    @Query
    @NameInMap("RedundancyType")
    private String redundancyType;

    @Query
    @NameInMap("VaultAccessKeyId")
    private String vaultAccessKeyId;

    @Query
    @NameInMap("VaultAccessKeySecret")
    private String vaultAccessKeySecret;

    @Query
    @NameInMap("VaultName")
    @Validation(required = true)
    private String vaultName;

    @Query
    @NameInMap("VaultRegionId")
    @Validation(required = true)
    private String vaultRegionId;

    @Query
    @NameInMap("VaultStorageClass")
    private String vaultStorageClass;

    @Query
    @NameInMap("VaultType")
    private String vaultType;

    private CreateVaultRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.compressionAlgorithm = builder.compressionAlgorithm;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.redundancyType = builder.redundancyType;
        this.vaultAccessKeyId = builder.vaultAccessKeyId;
        this.vaultAccessKeySecret = builder.vaultAccessKeySecret;
        this.vaultName = builder.vaultName;
        this.vaultRegionId = builder.vaultRegionId;
        this.vaultStorageClass = builder.vaultStorageClass;
        this.vaultType = builder.vaultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVaultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return compressionAlgorithm
     */
    public String getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return redundancyType
     */
    public String getRedundancyType() {
        return this.redundancyType;
    }

    /**
     * @return vaultAccessKeyId
     */
    public String getVaultAccessKeyId() {
        return this.vaultAccessKeyId;
    }

    /**
     * @return vaultAccessKeySecret
     */
    public String getVaultAccessKeySecret() {
        return this.vaultAccessKeySecret;
    }

    /**
     * @return vaultName
     */
    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * @return vaultRegionId
     */
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    /**
     * @return vaultStorageClass
     */
    public String getVaultStorageClass() {
        return this.vaultStorageClass;
    }

    /**
     * @return vaultType
     */
    public String getVaultType() {
        return this.vaultType;
    }

    public static final class Builder extends Request.Builder<CreateVaultRequest, Builder> {
        private String bucketName; 
        private String compressionAlgorithm; 
        private String description; 
        private String endpoint; 
        private String redundancyType; 
        private String vaultAccessKeyId; 
        private String vaultAccessKeySecret; 
        private String vaultName; 
        private String vaultRegionId; 
        private String vaultStorageClass; 
        private String vaultType; 

        private Builder() {
            super();
        } 

        private Builder(CreateVaultRequest response) {
            super(response);
            this.bucketName = response.bucketName;
            this.compressionAlgorithm = response.compressionAlgorithm;
            this.description = response.description;
            this.endpoint = response.endpoint;
            this.redundancyType = response.redundancyType;
            this.vaultAccessKeyId = response.vaultAccessKeyId;
            this.vaultAccessKeySecret = response.vaultAccessKeySecret;
            this.vaultName = response.vaultName;
            this.vaultRegionId = response.vaultRegionId;
            this.vaultStorageClass = response.vaultStorageClass;
            this.vaultType = response.vaultType;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CompressionAlgorithm.
         */
        public Builder compressionAlgorithm(String compressionAlgorithm) {
            this.putQueryParameter("CompressionAlgorithm", compressionAlgorithm);
            this.compressionAlgorithm = compressionAlgorithm;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * RedundancyType.
         */
        public Builder redundancyType(String redundancyType) {
            this.putQueryParameter("RedundancyType", redundancyType);
            this.redundancyType = redundancyType;
            return this;
        }

        /**
         * VaultAccessKeyId.
         */
        public Builder vaultAccessKeyId(String vaultAccessKeyId) {
            this.putQueryParameter("VaultAccessKeyId", vaultAccessKeyId);
            this.vaultAccessKeyId = vaultAccessKeyId;
            return this;
        }

        /**
         * VaultAccessKeySecret.
         */
        public Builder vaultAccessKeySecret(String vaultAccessKeySecret) {
            this.putQueryParameter("VaultAccessKeySecret", vaultAccessKeySecret);
            this.vaultAccessKeySecret = vaultAccessKeySecret;
            return this;
        }

        /**
         * VaultName.
         */
        public Builder vaultName(String vaultName) {
            this.putQueryParameter("VaultName", vaultName);
            this.vaultName = vaultName;
            return this;
        }

        /**
         * VaultRegionId.
         */
        public Builder vaultRegionId(String vaultRegionId) {
            this.putQueryParameter("VaultRegionId", vaultRegionId);
            this.vaultRegionId = vaultRegionId;
            return this;
        }

        /**
         * VaultStorageClass.
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            this.putQueryParameter("VaultStorageClass", vaultStorageClass);
            this.vaultStorageClass = vaultStorageClass;
            return this;
        }

        /**
         * VaultType.
         */
        public Builder vaultType(String vaultType) {
            this.putQueryParameter("VaultType", vaultType);
            this.vaultType = vaultType;
            return this;
        }

        @Override
        public CreateVaultRequest build() {
            return new CreateVaultRequest(this);
        } 

    } 

}
