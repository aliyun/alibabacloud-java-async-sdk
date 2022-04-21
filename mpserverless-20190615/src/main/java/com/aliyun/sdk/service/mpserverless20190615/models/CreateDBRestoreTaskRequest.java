// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDBRestoreTaskRequest</p>
 */
public class CreateDBRestoreTaskRequest extends Request {
    @Body
    @NameInMap("BackupId")
    @Validation(required = true)
    private String backupId;

    @Body
    @NameInMap("NewCollections")
    @Validation(required = true)
    private String newCollections;

    @Body
    @NameInMap("OriginCollections")
    @Validation(required = true)
    private String originCollections;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private CreateDBRestoreTaskRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.newCollections = builder.newCollections;
        this.originCollections = builder.originCollections;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBRestoreTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return newCollections
     */
    public String getNewCollections() {
        return this.newCollections;
    }

    /**
     * @return originCollections
     */
    public String getOriginCollections() {
        return this.originCollections;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<CreateDBRestoreTaskRequest, Builder> {
        private String backupId; 
        private String newCollections; 
        private String originCollections; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBRestoreTaskRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.newCollections = request.newCollections;
            this.originCollections = request.originCollections;
            this.spaceId = request.spaceId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putBodyParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * NewCollections.
         */
        public Builder newCollections(String newCollections) {
            this.putBodyParameter("NewCollections", newCollections);
            this.newCollections = newCollections;
            return this;
        }

        /**
         * OriginCollections.
         */
        public Builder originCollections(String originCollections) {
            this.putBodyParameter("OriginCollections", originCollections);
            this.originCollections = originCollections;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public CreateDBRestoreTaskRequest build() {
            return new CreateDBRestoreTaskRequest(this);
        } 

    } 

}
