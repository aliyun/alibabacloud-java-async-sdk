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
 * {@link UpdateAppSupabaseAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppSupabaseAuthConfigRequest</p>
 */
public class UpdateAppSupabaseAuthConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigsJson")
    private String configsJson;

    private UpdateAppSupabaseAuthConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.configsJson = builder.configsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppSupabaseAuthConfigRequest create() {
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
     * @return configsJson
     */
    public String getConfigsJson() {
        return this.configsJson;
    }

    public static final class Builder extends Request.Builder<UpdateAppSupabaseAuthConfigRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String configsJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppSupabaseAuthConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.configsJson = request.configsJson;
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
         * ConfigsJson.
         */
        public Builder configsJson(String configsJson) {
            this.putQueryParameter("ConfigsJson", configsJson);
            this.configsJson = configsJson;
            return this;
        }

        @Override
        public UpdateAppSupabaseAuthConfigRequest build() {
            return new UpdateAppSupabaseAuthConfigRequest(this);
        } 

    } 

}
