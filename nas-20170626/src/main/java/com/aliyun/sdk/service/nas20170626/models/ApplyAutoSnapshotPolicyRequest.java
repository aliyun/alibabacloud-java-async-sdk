// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ApplyAutoSnapshotPolicyRequest</p>
 */
public class ApplyAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("AutoSnapshotPolicyId")
    @Validation(required = true)
    private String autoSnapshotPolicyId;

    @Query
    @NameInMap("FileSystemIds")
    @Validation(required = true)
    private String fileSystemIds;

    private ApplyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.fileSystemIds = builder.fileSystemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return fileSystemIds
     */
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

    public static final class Builder extends Request.Builder<ApplyAutoSnapshotPolicyRequest, Builder> {
        private String autoSnapshotPolicyId; 
        private String fileSystemIds; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAutoSnapshotPolicyRequest response) {
            super(response);
            this.autoSnapshotPolicyId = response.autoSnapshotPolicyId;
            this.fileSystemIds = response.fileSystemIds;
        } 

        /**
         * AutoSnapshotPolicyId.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
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
        public ApplyAutoSnapshotPolicyRequest build() {
            return new ApplyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
