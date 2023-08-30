// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstanceParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseInstanceParametersRequest</p>
 */
public class DescribeDatabaseInstanceParametersRequest extends Request {
    @Query
    @NameInMap("DatabaseInstanceId")
    @Validation(required = true)
    private String databaseInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDatabaseInstanceParametersRequest(Builder builder) {
        super(builder);
        this.databaseInstanceId = builder.databaseInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseInstanceId
     */
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDatabaseInstanceParametersRequest, Builder> {
        private String databaseInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabaseInstanceParametersRequest request) {
            super(request);
            this.databaseInstanceId = request.databaseInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the Simple Database Service instance.
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDatabaseInstanceParametersRequest build() {
            return new DescribeDatabaseInstanceParametersRequest(this);
        } 

    } 

}
