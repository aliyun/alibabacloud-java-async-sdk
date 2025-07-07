// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteBackupFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupFileRequest</p>
 */
public class DeleteBackupFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFileIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> backupFileIdList;

    private DeleteBackupFileRequest(Builder builder) {
        super(builder);
        this.backupFileIdList = builder.backupFileIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupFileIdList
     */
    public java.util.List<String> getBackupFileIdList() {
        return this.backupFileIdList;
    }

    public static final class Builder extends Request.Builder<DeleteBackupFileRequest, Builder> {
        private java.util.List<String> backupFileIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupFileRequest request) {
            super(request);
            this.backupFileIdList = request.backupFileIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder backupFileIdList(java.util.List<String> backupFileIdList) {
            this.putQueryParameter("BackupFileIdList", backupFileIdList);
            this.backupFileIdList = backupFileIdList;
            return this;
        }

        @Override
        public DeleteBackupFileRequest build() {
            return new DeleteBackupFileRequest(this);
        } 

    } 

}
