// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditLogicDatabaseRequest} extends {@link RequestModel}
 *
 * <p>EditLogicDatabaseRequest</p>
 */
public class EditLogicDatabaseRequest extends Request {
    @Query
    @NameInMap("Alias")
    @Validation(required = true)
    private String alias;

    @Query
    @NameInMap("DatabaseIds")
    @Validation(required = true)
    private java.util.List < Long > databaseIds;

    @Query
    @NameInMap("LogicDbId")
    @Validation(required = true)
    private Long logicDbId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private EditLogicDatabaseRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.databaseIds = builder.databaseIds;
        this.logicDbId = builder.logicDbId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditLogicDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return databaseIds
     */
    public java.util.List < Long > getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return logicDbId
     */
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<EditLogicDatabaseRequest, Builder> {
        private String alias; 
        private java.util.List < Long > databaseIds; 
        private Long logicDbId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(EditLogicDatabaseRequest response) {
            super(response);
            this.alias = response.alias;
            this.databaseIds = response.databaseIds;
            this.logicDbId = response.logicDbId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * DatabaseIds.
         */
        public Builder databaseIds(java.util.List < Long > databaseIds) {
            this.putQueryParameter("DatabaseIds", databaseIds);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * LogicDbId.
         */
        public Builder logicDbId(Long logicDbId) {
            this.putQueryParameter("LogicDbId", logicDbId);
            this.logicDbId = logicDbId;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public EditLogicDatabaseRequest build() {
            return new EditLogicDatabaseRequest(this);
        } 

    } 

}
