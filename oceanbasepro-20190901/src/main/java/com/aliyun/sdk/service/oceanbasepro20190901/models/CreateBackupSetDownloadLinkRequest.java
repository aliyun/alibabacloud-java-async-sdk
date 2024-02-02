// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupSetDownloadLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupSetDownloadLinkRequest</p>
 */
public class CreateBackupSetDownloadLinkRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BackupSetId")
    @Validation(required = true)
    private String backupSetId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CreateBackupSetDownloadLinkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetId = builder.backupSetId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupSetDownloadLinkRequest create() {
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
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateBackupSetDownloadLinkRequest, Builder> {
        private String regionId; 
        private String backupSetId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupSetDownloadLinkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupSetId = request.backupSetId;
            this.instanceId = request.instanceId;
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
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putBodyParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateBackupSetDownloadLinkRequest build() {
            return new CreateBackupSetDownloadLinkRequest(this);
        } 

    } 

}
