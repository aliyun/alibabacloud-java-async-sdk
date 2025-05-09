// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTableModelInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableModelInfoRequest</p>
 */
public class UpdateTableModelInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstLevelThemeId")
    @com.aliyun.core.annotation.Validation()
    private Long firstLevelThemeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelId")
    @com.aliyun.core.annotation.Validation()
    private Long levelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelType")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer levelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondLevelThemeId")
    @com.aliyun.core.annotation.Validation()
    private Long secondLevelThemeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    private UpdateTableModelInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.firstLevelThemeId = builder.firstLevelThemeId;
        this.levelId = builder.levelId;
        this.levelType = builder.levelType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Long firstLevelThemeId; 
        private Long levelId; 
        private Integer levelType; 
        private Long secondLevelThemeId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableModelInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.firstLevelThemeId = request.firstLevelThemeId;
            this.levelId = request.levelId;
            this.levelType = request.levelType;
            this.secondLevelThemeId = request.secondLevelThemeId;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the first-level table folder.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder firstLevelThemeId(Long firstLevelThemeId) {
            this.putQueryParameter("FirstLevelThemeId", firstLevelThemeId);
            this.firstLevelThemeId = firstLevelThemeId;
            return this;
        }

        /**
         * <p>The table level ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * <p>The type of the table level. Valid values: 1 and 2. The value 1 indicates the logical level. The value 2 indicates the physical level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
            return this;
        }

        /**
         * <p>The ID of the second-level table folder.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder secondLevelThemeId(Long secondLevelThemeId) {
            this.putQueryParameter("SecondLevelThemeId", secondLevelThemeId);
            this.secondLevelThemeId = secondLevelThemeId;
            return this;
        }

        /**
         * <p>The GUID of the table. Specify the GUID in the odps.{projectName}.{tableName} format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.test.table1</p>
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
