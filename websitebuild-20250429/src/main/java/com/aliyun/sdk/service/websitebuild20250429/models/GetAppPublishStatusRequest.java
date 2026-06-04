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
 * {@link GetAppPublishStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAppPublishStatusRequest</p>
 */
public class GetAppPublishStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployOrderId")
    private Long deployOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebsiteDomain")
    private String websiteDomain;

    private GetAppPublishStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deployOrderId = builder.deployOrderId;
        this.websiteDomain = builder.websiteDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppPublishStatusRequest create() {
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
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    /**
     * @return websiteDomain
     */
    public String getWebsiteDomain() {
        return this.websiteDomain;
    }

    public static final class Builder extends Request.Builder<GetAppPublishStatusRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Long deployOrderId; 
        private String websiteDomain; 

        private Builder() {
            super();
        } 

        private Builder(GetAppPublishStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deployOrderId = request.deployOrderId;
            this.websiteDomain = request.websiteDomain;
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
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * WebsiteDomain.
         */
        public Builder websiteDomain(String websiteDomain) {
            this.putQueryParameter("WebsiteDomain", websiteDomain);
            this.websiteDomain = websiteDomain;
            return this;
        }

        @Override
        public GetAppPublishStatusRequest build() {
            return new GetAppPublishStatusRequest(this);
        } 

    } 

}
