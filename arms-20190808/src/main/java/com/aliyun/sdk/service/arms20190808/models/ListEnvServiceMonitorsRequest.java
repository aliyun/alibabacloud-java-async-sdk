// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvServiceMonitorsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvServiceMonitorsRequest</p>
 */
public class ListEnvServiceMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListEnvServiceMonitorsRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvServiceMonitorsRequest create() {
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

    public static final class Builder extends Request.Builder<ListEnvServiceMonitorsRequest, Builder> {
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvServiceMonitorsRequest request) {
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
        public ListEnvServiceMonitorsRequest build() {
            return new ListEnvServiceMonitorsRequest(this);
        } 

    } 

}
