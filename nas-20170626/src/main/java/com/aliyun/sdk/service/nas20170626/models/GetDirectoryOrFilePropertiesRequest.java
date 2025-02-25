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
 * {@link GetDirectoryOrFilePropertiesRequest} extends {@link RequestModel}
 *
 * <p>GetDirectoryOrFilePropertiesRequest</p>
 */
public class GetDirectoryOrFilePropertiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    private GetDirectoryOrFilePropertiesRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryOrFilePropertiesRequest create() {
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

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<GetDirectoryOrFilePropertiesRequest, Builder> {
        private String fileSystemId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(GetDirectoryOrFilePropertiesRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.path = request.path;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The absolute path of the directory.</p>
         * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/pathway/to/folder</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public GetDirectoryOrFilePropertiesRequest build() {
            return new GetDirectoryOrFilePropertiesRequest(this);
        } 

    } 

}
