// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationJobStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeMigrationJobStatusRequest</p>
 */
public class DescribeMigrationJobStatusRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MigrationJobId")
    @Validation(required = true)
    private String migrationJobId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    private DescribeMigrationJobStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.migrationJobId = builder.migrationJobId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobStatusRequest create() {
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
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeMigrationJobStatusRequest, Builder> {
        private String clientToken; 
        private String migrationJobId; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMigrationJobStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.migrationJobId = request.migrationJobId;
            this.ownerId = request.ownerId;
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
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeMigrationJobStatusRequest build() {
            return new DescribeMigrationJobStatusRequest(this);
        } 

    } 

}
