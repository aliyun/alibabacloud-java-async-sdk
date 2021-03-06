// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLogicDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateLogicDatabaseRequest</p>
 */
public class CreateLogicDatabaseRequest extends Request {
    @Query
    @NameInMap("Alias")
    @Validation(required = true)
    private String alias;

    @Query
    @NameInMap("DatabaseIds")
    @Validation(required = true)
    private java.util.List < Long > databaseIds;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateLogicDatabaseRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.databaseIds = builder.databaseIds;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogicDatabaseRequest create() {
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

    public static final class Builder extends Request.Builder<CreateLogicDatabaseRequest, Builder> {
        private String alias; 
        private java.util.List < Long > databaseIds; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogicDatabaseRequest response) {
            super(response);
            this.alias = response.alias;
            this.databaseIds = response.databaseIds;
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
        public CreateLogicDatabaseRequest build() {
            return new CreateLogicDatabaseRequest(this);
        } 

    } 

}
