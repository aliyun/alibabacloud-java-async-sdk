// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UpdateAppSupabaseSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppSupabaseSecretRequest</p>
 */
public class UpdateAppSupabaseSecretRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretType")
    private String secretType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretValue")
    private String secretValue;

    private UpdateAppSupabaseSecretRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.secretKey = builder.secretKey;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
        this.secretValue = builder.secretValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppSupabaseSecretRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return secretType
     */
    public String getSecretType() {
        return this.secretType;
    }

    /**
     * @return secretValue
     */
    public String getSecretValue() {
        return this.secretValue;
    }

    public static final class Builder extends Request.Builder<UpdateAppSupabaseSecretRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String secretKey; 
        private String secretName; 
        private String secretType; 
        private String secretValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppSupabaseSecretRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.secretKey = request.secretKey;
            this.secretName = request.secretName;
            this.secretType = request.secretType;
            this.secretValue = request.secretValue;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * SecretKey.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * SecretType.
         */
        public Builder secretType(String secretType) {
            this.putQueryParameter("SecretType", secretType);
            this.secretType = secretType;
            return this;
        }

        /**
         * SecretValue.
         */
        public Builder secretValue(String secretValue) {
            this.putQueryParameter("SecretValue", secretValue);
            this.secretValue = secretValue;
            return this;
        }

        @Override
        public UpdateAppSupabaseSecretRequest build() {
            return new UpdateAppSupabaseSecretRequest(this);
        } 

    } 

}
