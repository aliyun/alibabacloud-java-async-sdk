// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ApplyAutoSnapshotPolicyRequest</p>
 */
public class ApplyAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemIds")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ApplyAutoSnapshotPolicyRequest request) {
            super(request);
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.fileSystemIds = request.fileSystemIds;
        } 

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>The IDs of advanced Extreme NAS file systems.</p>
         * <p>You can specify a maximum of 100 file system IDs at a time. If you want to apply an automatic snapshot policy to multiple file systems, separate the file system IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-233e6****,extreme -23vbp****,extreme -23vas****</p>
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
