// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogicDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetLogicDatabaseRequest</p>
 */
public class GetLogicDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private GetLogicDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogicDatabaseRequest create() {
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetLogicDatabaseRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetLogicDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
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
         * The ID of the logical database. You can call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation to obtain the ID of the logical database.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetLogicDatabaseRequest build() {
            return new GetLogicDatabaseRequest(this);
        } 

    } 

}
