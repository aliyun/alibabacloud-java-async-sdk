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
 * {@link GetAgenticTableColumnRequest} extends {@link RequestModel}
 *
 * <p>GetAgenticTableColumnRequest</p>
 */
public class GetAgenticTableColumnRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableQualifiedName;

    private GetAgenticTableColumnRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseUuid = builder.databaseUuid;
        this.tableQualifiedName = builder.tableQualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgenticTableColumnRequest create() {
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

    /**
     * @return tableQualifiedName
     */
    public String getTableQualifiedName() {
        return this.tableQualifiedName;
    }

    public static final class Builder extends Request.Builder<GetAgenticTableColumnRequest, Builder> {
        private String regionId; 
        private String databaseUuid; 
        private String tableQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(GetAgenticTableColumnRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseUuid = request.databaseUuid;
            this.tableQualifiedName = request.tableQualifiedName;
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
         * <p>The UUID of the database to which the table belongs. You can obtain the UUID by calling the ListAgenticDatabase or SearchAgenticDatabase operation.</p>
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

        /**
         * <p>The fully qualified name of the table. You can obtain the name from the QualifiedName parameter returned by the ListAgenticTableBaseInfo operation. You must specify the complete name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        public Builder tableQualifiedName(String tableQualifiedName) {
            this.putQueryParameter("TableQualifiedName", tableQualifiedName);
            this.tableQualifiedName = tableQualifiedName;
            return this;
        }

        @Override
        public GetAgenticTableColumnRequest build() {
            return new GetAgenticTableColumnRequest(this);
        } 

    } 

}
