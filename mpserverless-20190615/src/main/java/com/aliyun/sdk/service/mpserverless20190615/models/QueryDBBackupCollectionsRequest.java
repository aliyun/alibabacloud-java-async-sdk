// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBBackupCollectionsRequest} extends {@link RequestModel}
 *
 * <p>QueryDBBackupCollectionsRequest</p>
 */
public class QueryDBBackupCollectionsRequest extends Request {
    @Body
    @NameInMap("BackupId")
    @Validation(required = true)
    private String backupId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private QueryDBBackupCollectionsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBBackupCollectionsRequest create() {
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<QueryDBBackupCollectionsRequest, Builder> {
        private String backupId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDBBackupCollectionsRequest request) {
            super(request);
            this.backupId = request.backupId;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public QueryDBBackupCollectionsRequest build() {
            return new QueryDBBackupCollectionsRequest(this);
        } 

    } 

}
