// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLifecycleRuleRequest} extends {@link RequestModel}
 *
 * <p>GetLifecycleRuleRequest</p>
 */
public class GetLifecycleRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    private GetLifecycleRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.resourceName = builder.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLifecycleRuleRequest create() {
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    public static final class Builder extends Request.Builder<GetLifecycleRuleRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String resourceName; 

        private Builder() {
            super();
        } 

        private Builder(GetLifecycleRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.resourceName = request.resourceName;
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
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        @Override
        public GetLifecycleRuleRequest build() {
            return new GetLifecycleRuleRequest(this);
        } 

    } 

}
