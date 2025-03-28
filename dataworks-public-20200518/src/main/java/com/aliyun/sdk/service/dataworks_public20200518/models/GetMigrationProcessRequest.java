// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMigrationProcessRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationProcessRequest</p>
 */
public class GetMigrationProcessRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrationId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long migrationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long projectId;

    private GetMigrationProcessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.migrationId = builder.migrationId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationProcessRequest create() {
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
     * @return migrationId
     */
    public Long getMigrationId() {
        return this.migrationId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetMigrationProcessRequest, Builder> {
        private String regionId; 
        private Long migrationId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationProcessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.migrationId = request.migrationId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The migration package ID. You can call the CreateImportMigration operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder migrationId(Long migrationId) {
            this.putBodyParameter("MigrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>The workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetMigrationProcessRequest build() {
            return new GetMigrationProcessRequest(this);
        } 

    } 

}
