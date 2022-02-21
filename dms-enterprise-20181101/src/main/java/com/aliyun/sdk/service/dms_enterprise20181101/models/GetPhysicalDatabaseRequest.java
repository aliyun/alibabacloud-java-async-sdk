// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetPhysicalDatabaseRequest</p>
 */
public class GetPhysicalDatabaseRequest extends Request {
    @Query
    @NameInMap("DbId")
    @Validation(required = true, minimum = 1)
    private Long dbId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetPhysicalDatabaseRequest(Builder builder) {
        super(builder);
        this.dbId = builder.dbId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
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

    public static final class Builder extends Request.Builder<GetPhysicalDatabaseRequest, Builder> {
        private Long dbId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetPhysicalDatabaseRequest response) {
            super(response);
            this.dbId = response.dbId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * DbId.
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
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
        public GetPhysicalDatabaseRequest build() {
            return new GetPhysicalDatabaseRequest(this);
        } 

    } 

}
