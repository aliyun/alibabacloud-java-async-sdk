// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeDatabaseInstanceParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseInstanceParametersRequest</p>
 */
public class DescribeDatabaseInstanceParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the Simple Database Service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db-38263fa955774501a2ae1bdaed6f****</p>
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the Simple Database Service instance. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
