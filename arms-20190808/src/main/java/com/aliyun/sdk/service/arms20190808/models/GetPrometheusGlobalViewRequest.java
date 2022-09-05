// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusGlobalViewRequest</p>
 */
public class GetPrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("GlobalViewClusterId")
    @Validation(required = true)
    private String globalViewClusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.globalViewClusterId = builder.globalViewClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalViewClusterId
     */
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetPrometheusGlobalViewRequest, Builder> {
        private String globalViewClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusGlobalViewRequest request) {
            super(request);
            this.globalViewClusterId = request.globalViewClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * GlobalViewClusterId.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetPrometheusGlobalViewRequest build() {
            return new GetPrometheusGlobalViewRequest(this);
        } 

    } 

}
