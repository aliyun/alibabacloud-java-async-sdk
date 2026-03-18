// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link UpdateBackupRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupRequest</p>
 */
public class UpdateBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backupTaskId")
    private String backupTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateBackupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupTaskId = builder.backupTaskId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupRequest create() {
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
     * @return backupTaskId
     */
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateBackupRequest, Builder> {
        private String regionId; 
        private String backupTaskId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupTaskId = request.backupTaskId;
            this.description = request.description;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * backupTaskId.
         */
        public Builder backupTaskId(String backupTaskId) {
            this.putBodyParameter("backupTaskId", backupTaskId);
            this.backupTaskId = backupTaskId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateBackupRequest build() {
            return new UpdateBackupRequest(this);
        } 

    } 

}
