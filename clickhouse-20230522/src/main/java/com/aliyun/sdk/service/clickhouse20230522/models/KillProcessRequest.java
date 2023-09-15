// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillProcessRequest} extends {@link RequestModel}
 *
 * <p>KillProcessRequest</p>
 */
public class KillProcessRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("InitialQueryId")
    private String initialQueryId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private KillProcessRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.initialQueryId = builder.initialQueryId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return initialQueryId
     */
    public String getInitialQueryId() {
        return this.initialQueryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<KillProcessRequest, Builder> {
        private String DBInstanceId; 
        private String initialQueryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(KillProcessRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.initialQueryId = request.initialQueryId;
            this.regionId = request.regionId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * InitialQueryId.
         */
        public Builder initialQueryId(String initialQueryId) {
            this.putQueryParameter("InitialQueryId", initialQueryId);
            this.initialQueryId = initialQueryId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public KillProcessRequest build() {
            return new KillProcessRequest(this);
        } 

    } 

}
