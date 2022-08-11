// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableModelInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableModelInfoRequest</p>
 */
public class UpdateTableModelInfoRequest extends Request {
    @Query
    @NameInMap("FirstLevelThemeId")
    @Validation()
    private Long firstLevelThemeId;

    @Query
    @NameInMap("LevelId")
    @Validation()
    private Long levelId;

    @Query
    @NameInMap("LevelType")
    @Validation(maximum = 2147483647)
    private Integer levelType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecondLevelThemeId")
    @Validation()
    private Long secondLevelThemeId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private UpdateTableModelInfoRequest(Builder builder) {
        super(builder);
        this.firstLevelThemeId = builder.firstLevelThemeId;
        this.levelId = builder.levelId;
        this.levelType = builder.levelType;
        this.regionId = builder.regionId;
        this.secondLevelThemeId = builder.secondLevelThemeId;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableModelInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firstLevelThemeId
     */
    public Long getFirstLevelThemeId() {
        return this.firstLevelThemeId;
    }

    /**
     * @return levelId
     */
    public Long getLevelId() {
        return this.levelId;
    }

    /**
     * @return levelType
     */
    public Integer getLevelType() {
        return this.levelType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return secondLevelThemeId
     */
    public Long getSecondLevelThemeId() {
        return this.secondLevelThemeId;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<UpdateTableModelInfoRequest, Builder> {
        private Long firstLevelThemeId; 
        private Long levelId; 
        private Integer levelType; 
        private String regionId; 
        private Long secondLevelThemeId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableModelInfoRequest request) {
            super(request);
            this.firstLevelThemeId = request.firstLevelThemeId;
            this.levelId = request.levelId;
            this.levelType = request.levelType;
            this.regionId = request.regionId;
            this.secondLevelThemeId = request.secondLevelThemeId;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * FirstLevelThemeId.
         */
        public Builder firstLevelThemeId(Long firstLevelThemeId) {
            this.putQueryParameter("FirstLevelThemeId", firstLevelThemeId);
            this.firstLevelThemeId = firstLevelThemeId;
            return this;
        }

        /**
         * LevelId.
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * LevelType.
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
            return this;
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
         * SecondLevelThemeId.
         */
        public Builder secondLevelThemeId(Long secondLevelThemeId) {
            this.putQueryParameter("SecondLevelThemeId", secondLevelThemeId);
            this.secondLevelThemeId = secondLevelThemeId;
            return this;
        }

        /**
         * TableGuid.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public UpdateTableModelInfoRequest build() {
            return new UpdateTableModelInfoRequest(this);
        } 

    } 

}
