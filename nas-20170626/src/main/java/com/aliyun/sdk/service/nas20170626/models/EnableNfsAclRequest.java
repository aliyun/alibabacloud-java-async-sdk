// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableNfsAclRequest} extends {@link RequestModel}
 *
 * <p>EnableNfsAclRequest</p>
 */
public class EnableNfsAclRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    private EnableNfsAclRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableNfsAclRequest create() {
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

    public static final class Builder extends Request.Builder<EnableNfsAclRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(EnableNfsAclRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public EnableNfsAclRequest build() {
            return new EnableNfsAclRequest(this);
        } 

    } 

}
