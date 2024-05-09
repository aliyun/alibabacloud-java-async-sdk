// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvPodMonitorsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvPodMonitorsRequest</p>
 */
public class ListEnvPodMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListEnvPodMonitorsRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvPodMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEnvPodMonitorsRequest, Builder> {
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvPodMonitorsRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * The environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
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
        public ListEnvPodMonitorsRequest build() {
            return new ListEnvPodMonitorsRequest(this);
        } 

    } 

}
