// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DeleteFileSystemRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileSystemRequest</p>
 */
public class DeleteFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DeleteFileSystemRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileSystemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DeleteFileSystemRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileSystemRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The ID of the file system that you want to delete.</p>
         * <ul>
         * <li>Sample ID of a General-purpose NAS file system: 31a8e4****.</li>
         * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, extreme-0015****.</li>
         * <li>The IDs of Cloud Parallel File Storage (CPFS) file systems must start with <code>cpfs-</code>, for example, cpfs-00cb6fa094ca****.</li>
         * </ul>
         * <blockquote>
         * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DeleteFileSystemRequest build() {
            return new DeleteFileSystemRequest(this);
        } 

    } 

}
