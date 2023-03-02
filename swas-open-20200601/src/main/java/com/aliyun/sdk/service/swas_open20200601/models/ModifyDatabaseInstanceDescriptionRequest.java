// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseInstanceDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseInstanceDescriptionRequest</p>
 */
public class ModifyDatabaseInstanceDescriptionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DatabaseInstanceDescription")
    @Validation(required = true)
    private String databaseInstanceDescription;

    @Query
    @NameInMap("DatabaseInstanceId")
    @Validation(required = true)
    private String databaseInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDatabaseInstanceDescriptionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.databaseInstanceDescription = builder.databaseInstanceDescription;
        this.databaseInstanceId = builder.databaseInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseInstanceDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseInstanceDescription
     */
    public String getDatabaseInstanceDescription() {
        return this.databaseInstanceDescription;
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

    public static final class Builder extends Request.Builder<ModifyDatabaseInstanceDescriptionRequest, Builder> {
        private String clientToken; 
        private String databaseInstanceDescription; 
        private String databaseInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseInstanceDescriptionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.databaseInstanceDescription = request.databaseInstanceDescription;
            this.databaseInstanceId = request.databaseInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DatabaseInstanceDescription.
         */
        public Builder databaseInstanceDescription(String databaseInstanceDescription) {
            this.putQueryParameter("DatabaseInstanceDescription", databaseInstanceDescription);
            this.databaseInstanceDescription = databaseInstanceDescription;
            return this;
        }

        /**
         * DatabaseInstanceId.
         */
        public Builder databaseInstanceId(String databaseInstanceId) {
            this.putQueryParameter("DatabaseInstanceId", databaseInstanceId);
            this.databaseInstanceId = databaseInstanceId;
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
        public ModifyDatabaseInstanceDescriptionRequest build() {
            return new ModifyDatabaseInstanceDescriptionRequest(this);
        } 

    } 

}
