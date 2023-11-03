// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonReleaseRequest</p>
 */
public class DescribeAddonReleaseRequest extends Request {
    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReleaseName")
    @Validation(required = true)
    private String releaseName;

    private DescribeAddonReleaseRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
        this.releaseName = builder.releaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonReleaseRequest create() {
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

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    public static final class Builder extends Request.Builder<DescribeAddonReleaseRequest, Builder> {
        private String environmentId; 
        private String regionId; 
        private String releaseName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonReleaseRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
            this.releaseName = request.releaseName;
        } 

        /**
         * Environment ID.
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

        /**
         * Name of Release.
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("ReleaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        @Override
        public DescribeAddonReleaseRequest build() {
            return new DescribeAddonReleaseRequest(this);
        } 

    } 

}
