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
 * {@link SaveAppSupabaseSecretsRequest} extends {@link RequestModel}
 *
 * <p>SaveAppSupabaseSecretsRequest</p>
 */
public class SaveAppSupabaseSecretsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretsJson")
    private String secretsJson;

    private SaveAppSupabaseSecretsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.secretsJson = builder.secretsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAppSupabaseSecretsRequest create() {
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
     * @return secretsJson
     */
    public String getSecretsJson() {
        return this.secretsJson;
    }

    public static final class Builder extends Request.Builder<SaveAppSupabaseSecretsRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String secretsJson; 

        private Builder() {
            super();
        } 

        private Builder(SaveAppSupabaseSecretsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.secretsJson = request.secretsJson;
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
         * SecretsJson.
         */
        public Builder secretsJson(String secretsJson) {
            this.putQueryParameter("SecretsJson", secretsJson);
            this.secretsJson = secretsJson;
            return this;
        }

        @Override
        public SaveAppSupabaseSecretsRequest build() {
            return new SaveAppSupabaseSecretsRequest(this);
        } 

    } 

}
