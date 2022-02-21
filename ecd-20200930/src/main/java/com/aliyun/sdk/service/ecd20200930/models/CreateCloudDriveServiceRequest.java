// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudDriveServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudDriveServiceRequest</p>
 */
public class CreateCloudDriveServiceRequest extends Request {
    @Query
    @NameInMap("MaxSize")
    @Validation(required = true)
    private Long maxSize;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateCloudDriveServiceRequest(Builder builder) {
        super(builder);
        this.maxSize = builder.maxSize;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxSize
     */
    public Long getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateCloudDriveServiceRequest, Builder> {
        private Long maxSize; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudDriveServiceRequest response) {
            super(response);
            this.maxSize = response.maxSize;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * MaxSize.
         */
        public Builder maxSize(Long maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public CreateCloudDriveServiceRequest build() {
            return new CreateCloudDriveServiceRequest(this);
        } 

    } 

}
