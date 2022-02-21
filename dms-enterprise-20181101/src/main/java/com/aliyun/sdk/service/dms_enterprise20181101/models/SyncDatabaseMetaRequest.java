// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDatabaseMetaRequest} extends {@link RequestModel}
 *
 * <p>SyncDatabaseMetaRequest</p>
 */
public class SyncDatabaseMetaRequest extends Request {
    @Query
    @NameInMap("DbId")
    @Validation(required = true)
    private String dbId;

    @Query
    @NameInMap("Logic")
    private Boolean logic;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private SyncDatabaseMetaRequest(Builder builder) {
        super(builder);
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDatabaseMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
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

    public static final class Builder extends Request.Builder<SyncDatabaseMetaRequest, Builder> {
        private String dbId; 
        private Boolean logic; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SyncDatabaseMetaRequest response) {
            super(response);
            this.dbId = response.dbId;
            this.logic = response.logic;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * DbId.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
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
        public SyncDatabaseMetaRequest build() {
            return new SyncDatabaseMetaRequest(this);
        } 

    } 

}
