// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusGlobalViewRequest</p>
 */
public class DeletePrometheusGlobalViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalViewClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalViewClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeletePrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.globalViewClusterId = builder.globalViewClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusGlobalViewRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrometheusGlobalViewRequest, Builder> {
        private String globalViewClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusGlobalViewRequest request) {
            super(request);
            this.globalViewClusterId = request.globalViewClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the global aggregation instance.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeletePrometheusGlobalViewRequest build() {
            return new DeletePrometheusGlobalViewRequest(this);
        } 

    } 

}
