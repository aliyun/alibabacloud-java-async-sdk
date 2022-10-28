// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesensitizationStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesensitizationStrategyRequest</p>
 */
public class ModifyDesensitizationStrategyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ColumnName")
    @Validation(required = true)
    private String columnName;

    @Query
    @NameInMap("DbId")
    @Validation(required = true)
    private Integer dbId;

    @Query
    @NameInMap("IsLogic")
    @Validation(required = true)
    private Boolean isLogic;

    @Query
    @NameInMap("IsReset")
    private Boolean isReset;

    @Query
    @NameInMap("RuleId")
    private Integer ruleId;

    @Query
    @NameInMap("SchemaName")
    @Validation(required = true)
    private String schemaName;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ModifyDesensitizationStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.dbId = builder.dbId;
        this.isLogic = builder.isLogic;
        this.isReset = builder.isReset;
        this.ruleId = builder.ruleId;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesensitizationStrategyRequest create() {
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
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return isLogic
     */
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    /**
     * @return isReset
     */
    public Boolean getIsReset() {
        return this.isReset;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ModifyDesensitizationStrategyRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Integer dbId; 
        private Boolean isLogic; 
        private Boolean isReset; 
        private Integer ruleId; 
        private String schemaName; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesensitizationStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.dbId = request.dbId;
            this.isLogic = request.isLogic;
            this.isReset = request.isReset;
            this.ruleId = request.ruleId;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
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
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * IsLogic.
         */
        public Builder isLogic(Boolean isLogic) {
            this.putQueryParameter("IsLogic", isLogic);
            this.isLogic = isLogic;
            return this;
        }

        /**
         * IsReset.
         */
        public Builder isReset(Boolean isReset) {
            this.putQueryParameter("IsReset", isReset);
            this.isReset = isReset;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
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
        public ModifyDesensitizationStrategyRequest build() {
            return new ModifyDesensitizationStrategyRequest(this);
        } 

    } 

}
