// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetAgenticDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetAgenticDatabaseRequest</p>
 */
public class GetAgenticDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseUuid;

    private GetAgenticDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseUuid = builder.databaseUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgenticDatabaseRequest create() {
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
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public static final class Builder extends Request.Builder<GetAgenticDatabaseRequest, Builder> {
        private String regionId; 
        private String databaseUuid; 

        private Builder() {
            super();
        } 

        private Builder(GetAgenticDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseUuid = request.databaseUuid;
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
         * <p>The UUID of the database. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
            this.databaseUuid = databaseUuid;
            return this;
        }

        @Override
        public GetAgenticDatabaseRequest build() {
            return new GetAgenticDatabaseRequest(this);
        } 

    } 

}
