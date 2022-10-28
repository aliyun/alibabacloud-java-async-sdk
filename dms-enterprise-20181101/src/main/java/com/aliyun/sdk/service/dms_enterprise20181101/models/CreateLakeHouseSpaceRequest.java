// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLakeHouseSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateLakeHouseSpaceRequest</p>
 */
public class CreateLakeHouseSpaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DevDbId")
    @Validation(required = true)
    private String devDbId;

    @Query
    @NameInMap("DwDbType")
    @Validation(required = true)
    private String dwDbType;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("ProdDbId")
    private String prodDbId;

    @Query
    @NameInMap("SpaceConfig")
    @Validation(required = true)
    private String spaceConfig;

    @Query
    @NameInMap("SpaceName")
    @Validation(required = true)
    private String spaceName;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateLakeHouseSpaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.devDbId = builder.devDbId;
        this.dwDbType = builder.dwDbType;
        this.mode = builder.mode;
        this.prodDbId = builder.prodDbId;
        this.spaceConfig = builder.spaceConfig;
        this.spaceName = builder.spaceName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLakeHouseSpaceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return devDbId
     */
    public String getDevDbId() {
        return this.devDbId;
    }

    /**
     * @return dwDbType
     */
    public String getDwDbType() {
        return this.dwDbType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return prodDbId
     */
    public String getProdDbId() {
        return this.prodDbId;
    }

    /**
     * @return spaceConfig
     */
    public String getSpaceConfig() {
        return this.spaceConfig;
    }

    /**
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateLakeHouseSpaceRequest, Builder> {
        private String regionId; 
        private String description; 
        private String devDbId; 
        private String dwDbType; 
        private String mode; 
        private String prodDbId; 
        private String spaceConfig; 
        private String spaceName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateLakeHouseSpaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.devDbId = request.devDbId;
            this.dwDbType = request.dwDbType;
            this.mode = request.mode;
            this.prodDbId = request.prodDbId;
            this.spaceConfig = request.spaceConfig;
            this.spaceName = request.spaceName;
            this.tid = request.tid;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DevDbId.
         */
        public Builder devDbId(String devDbId) {
            this.putQueryParameter("DevDbId", devDbId);
            this.devDbId = devDbId;
            return this;
        }

        /**
         * DwDbType.
         */
        public Builder dwDbType(String dwDbType) {
            this.putQueryParameter("DwDbType", dwDbType);
            this.dwDbType = dwDbType;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * ProdDbId.
         */
        public Builder prodDbId(String prodDbId) {
            this.putQueryParameter("ProdDbId", prodDbId);
            this.prodDbId = prodDbId;
            return this;
        }

        /**
         * SpaceConfig.
         */
        public Builder spaceConfig(String spaceConfig) {
            this.putQueryParameter("SpaceConfig", spaceConfig);
            this.spaceConfig = spaceConfig;
            return this;
        }

        /**
         * SpaceName.
         */
        public Builder spaceName(String spaceName) {
            this.putQueryParameter("SpaceName", spaceName);
            this.spaceName = spaceName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateLakeHouseSpaceRequest build() {
            return new CreateLakeHouseSpaceRequest(this);
        } 

    } 

}
