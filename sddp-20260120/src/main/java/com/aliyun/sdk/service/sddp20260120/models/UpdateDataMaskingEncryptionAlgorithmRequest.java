// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link UpdateDataMaskingEncryptionAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataMaskingEncryptionAlgorithmRequest</p>
 */
public class UpdateDataMaskingEncryptionAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionAlgorithm")
    private String encryptionAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    private UpdateDataMaskingEncryptionAlgorithmRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.encryptionAlgorithm = builder.encryptionAlgorithm;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataMaskingEncryptionAlgorithmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return encryptionAlgorithm
     */
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * @return encryptionKeyId
     */
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<UpdateDataMaskingEncryptionAlgorithmRequest, Builder> {
        private String regionId; 
        private String encryptionAlgorithm; 
        private String encryptionKeyId; 
        private String instanceId; 
        private String lang; 
        private String productCode; 
        private Long productId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataMaskingEncryptionAlgorithmRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.encryptionAlgorithm = request.encryptionAlgorithm;
            this.encryptionKeyId = request.encryptionKeyId;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productId = request.productId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EncryptionAlgorithm.
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.putQueryParameter("EncryptionAlgorithm", encryptionAlgorithm);
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * EncryptionKeyId.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putQueryParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public UpdateDataMaskingEncryptionAlgorithmRequest build() {
            return new UpdateDataMaskingEncryptionAlgorithmRequest(this);
        } 

    } 

}
