// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link PrecheckYikeAIAppJobRequest} extends {@link RequestModel}
 *
 * <p>PrecheckYikeAIAppJobRequest</p>
 */
public class PrecheckYikeAIAppJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppParams")
    private String appParams;

    private PrecheckYikeAIAppJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appParams = builder.appParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckYikeAIAppJobRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appParams
     */
    public String getAppParams() {
        return this.appParams;
    }

    public static final class Builder extends Request.Builder<PrecheckYikeAIAppJobRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appParams; 

        private Builder() {
            super();
        } 

        private Builder(PrecheckYikeAIAppJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appParams = request.appParams;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppParams.
         */
        public Builder appParams(String appParams) {
            this.putQueryParameter("AppParams", appParams);
            this.appParams = appParams;
            return this;
        }

        @Override
        public PrecheckYikeAIAppJobRequest build() {
            return new PrecheckYikeAIAppJobRequest(this);
        } 

    } 

}
