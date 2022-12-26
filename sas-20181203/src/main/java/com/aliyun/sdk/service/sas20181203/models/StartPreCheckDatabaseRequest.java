// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPreCheckDatabaseRequest} extends {@link RequestModel}
 *
 * <p>StartPreCheckDatabaseRequest</p>
 */
public class StartPreCheckDatabaseRequest extends Request {
    @Query
    @NameInMap("DatabaseType")
    @Validation(required = true)
    private String databaseType;

    @Query
    @NameInMap("InstanceUuid")
    @Validation(required = true)
    private String instanceUuid;

    @Query
    @NameInMap("UniRegionId")
    @Validation(required = true)
    private String uniRegionId;

    private StartPreCheckDatabaseRequest(Builder builder) {
        super(builder);
        this.databaseType = builder.databaseType;
        this.instanceUuid = builder.instanceUuid;
        this.uniRegionId = builder.uniRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPreCheckDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public static final class Builder extends Request.Builder<StartPreCheckDatabaseRequest, Builder> {
        private String databaseType; 
        private String instanceUuid; 
        private String uniRegionId; 

        private Builder() {
            super();
        } 

        private Builder(StartPreCheckDatabaseRequest request) {
            super(request);
            this.databaseType = request.databaseType;
            this.instanceUuid = request.instanceUuid;
            this.uniRegionId = request.uniRegionId;
        } 

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * InstanceUuid.
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * UniRegionId.
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        @Override
        public StartPreCheckDatabaseRequest build() {
            return new StartPreCheckDatabaseRequest(this);
        } 

    } 

}
