// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackupRequest} extends {@link RequestModel}
 *
 * <p>GetBackupRequest</p>
 */
public class GetBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    private GetBackupRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupRequest create() {
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

    public static final class Builder extends Request.Builder<GetBackupRequest, Builder> {
        private String backupId; 

        private Builder() {
            super();
        } 

        private Builder(GetBackupRequest request) {
            super(request);
            this.backupId = request.backupId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        @Override
        public GetBackupRequest build() {
            return new GetBackupRequest(this);
        } 

    } 

}
