// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmrMainVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeEmrMainVersionRequest</p>
 */
public class DescribeEmrMainVersionRequest extends Request {
    @Query
    @NameInMap("EmrVersion")
    private String emrVersion;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeEmrMainVersionRequest(Builder builder) {
        super(builder);
        this.emrVersion = builder.emrVersion;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmrMainVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emrVersion
     */
    public String getEmrVersion() {
        return this.emrVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeEmrMainVersionRequest, Builder> {
        private String emrVersion; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEmrMainVersionRequest response) {
            super(response);
            this.emrVersion = response.emrVersion;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * EmrVersion.
         */
        public Builder emrVersion(String emrVersion) {
            this.putQueryParameter("EmrVersion", emrVersion);
            this.emrVersion = emrVersion;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeEmrMainVersionRequest build() {
            return new DescribeEmrMainVersionRequest(this);
        } 

    } 

}
