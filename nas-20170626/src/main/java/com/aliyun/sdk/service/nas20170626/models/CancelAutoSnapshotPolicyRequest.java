// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CancelAutoSnapshotPolicyRequest</p>
 */
public class CancelAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("FileSystemIds")
    @Validation(required = true)
    private String fileSystemIds;

    private CancelAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.fileSystemIds = builder.fileSystemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemIds
     */
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

    public static final class Builder extends Request.Builder<CancelAutoSnapshotPolicyRequest, Builder> {
        private String fileSystemIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelAutoSnapshotPolicyRequest response) {
            super(response);
            this.fileSystemIds = response.fileSystemIds;
        } 

        /**
         * FileSystemIds.
         */
        public Builder fileSystemIds(String fileSystemIds) {
            this.putQueryParameter("FileSystemIds", fileSystemIds);
            this.fileSystemIds = fileSystemIds;
            return this;
        }

        @Override
        public CancelAutoSnapshotPolicyRequest build() {
            return new CancelAutoSnapshotPolicyRequest(this);
        } 

    } 

}
