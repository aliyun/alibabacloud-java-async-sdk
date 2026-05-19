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
 * {@link GetLlmProxyConfigForAdminRequest} extends {@link RequestModel}
 *
 * <p>GetLlmProxyConfigForAdminRequest</p>
 */
public class GetLlmProxyConfigForAdminRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capability")
    private String capability;

    private GetLlmProxyConfigForAdminRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.capability = builder.capability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLlmProxyConfigForAdminRequest create() {
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
     * @return capability
     */
    public String getCapability() {
        return this.capability;
    }

    public static final class Builder extends Request.Builder<GetLlmProxyConfigForAdminRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String capability; 

        private Builder() {
            super();
        } 

        private Builder(GetLlmProxyConfigForAdminRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.capability = request.capability;
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
         * Capability.
         */
        public Builder capability(String capability) {
            this.putQueryParameter("Capability", capability);
            this.capability = capability;
            return this;
        }

        @Override
        public GetLlmProxyConfigForAdminRequest build() {
            return new GetLlmProxyConfigForAdminRequest(this);
        } 

    } 

}
