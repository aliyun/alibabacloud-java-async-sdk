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
 * {@link DisableNfsAclRequest} extends {@link RequestModel}
 *
 * <p>DisableNfsAclRequest</p>
 */
public class DisableNfsAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DisableNfsAclRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableNfsAclRequest create() {
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

    public static final class Builder extends Request.Builder<DisableNfsAclRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DisableNfsAclRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>91fcdxxxx</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DisableNfsAclRequest build() {
            return new DisableNfsAclRequest(this);
        } 

    } 

}
