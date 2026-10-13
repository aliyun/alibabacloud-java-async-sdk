// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetMigrateApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetMigrateApplicationRequest</p>
 */
public class GetMigrateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("migrationId")
    private String migrationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("migrationType")
    private Long migrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetMigrateApplicationRequest(Builder builder) {
        super(builder);
        this.migrationId = builder.migrationId;
        this.migrationType = builder.migrationType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationId
     */
    public String getMigrationId() {
        return this.migrationId;
    }

    /**
     * @return migrationType
     */
    public Long getMigrationType() {
        return this.migrationType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMigrateApplicationRequest, Builder> {
        private String migrationId; 
        private Long migrationType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrateApplicationRequest request) {
            super(request);
            this.migrationId = request.migrationId;
            this.migrationType = request.migrationType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The migration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afe9995d-31fd-40ff-a669-c125d76d8267</p>
         */
        public Builder migrationId(String migrationId) {
            this.putQueryParameter("migrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>The operation type of the migration task. Valid values: 1: import. 2: export. 3: clone. If this parameter is not specified, all types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder migrationType(Long migrationType) {
            this.putQueryParameter("migrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetMigrateApplicationRequest build() {
            return new GetMigrateApplicationRequest(this);
        } 

    } 

}
