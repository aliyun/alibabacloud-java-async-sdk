// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDatabaseMetaRequest} extends {@link RequestModel}
 *
 * <p>SyncDatabaseMetaRequest</p>
 */
public class SyncDatabaseMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private SyncDatabaseMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SyncDatabaseMetaRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private Boolean logic; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SyncDatabaseMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.logic = request.logic;
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
         * The ID of the database.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Specifies whether the database is a logical database.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).
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
