// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDriveServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudDriveServiceRequest</p>
 */
public class ModifyCloudDriveServiceRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("CdsName")
    @Validation(required = true)
    private String cdsName;

    @Query
    @NameInMap("MaxSize")
    @Validation(required = true)
    private Long maxSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyCloudDriveServiceRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.cdsName = builder.cdsName;
        this.maxSize = builder.maxSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudDriveServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return cdsName
     */
    public String getCdsName() {
        return this.cdsName;
    }

    /**
     * @return maxSize
     */
    public Long getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCloudDriveServiceRequest, Builder> {
        private String cdsId; 
        private String cdsName; 
        private Long maxSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudDriveServiceRequest response) {
            super(response);
            this.cdsId = response.cdsId;
            this.cdsName = response.cdsName;
            this.maxSize = response.maxSize;
            this.regionId = response.regionId;
        } 

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * CdsName.
         */
        public Builder cdsName(String cdsName) {
            this.putQueryParameter("CdsName", cdsName);
            this.cdsName = cdsName;
            return this;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCloudDriveServiceRequest build() {
            return new ModifyCloudDriveServiceRequest(this);
        } 

    } 

}
