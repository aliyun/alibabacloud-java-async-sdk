// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDatabaseAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetDatabaseAccountPasswordRequest</p>
 */
public class ResetDatabaseAccountPasswordRequest extends Request {
    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DatabaseInstanceId")
    @Validation(required = true)
    private String databaseInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ResetDatabaseAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountPassword = builder.accountPassword;
        this.clientToken = builder.clientToken;
        this.databaseInstanceId = builder.databaseInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDatabaseAccountPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<ResetDatabaseAccountPasswordRequest, Builder> {
        private String accountPassword; 
        private String clientToken; 
        private String databaseInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetDatabaseAccountPasswordRequest request) {
            super(request);
            this.accountPassword = request.accountPassword;
            this.clientToken = request.clientToken;
            this.databaseInstanceId = request.databaseInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The password of the database administrator account.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
        public ResetDatabaseAccountPasswordRequest build() {
            return new ResetDatabaseAccountPasswordRequest(this);
        } 

    } 

}
