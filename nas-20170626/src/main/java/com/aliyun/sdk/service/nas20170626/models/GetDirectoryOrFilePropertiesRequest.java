// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryOrFilePropertiesRequest} extends {@link RequestModel}
 *
 * <p>GetDirectoryOrFilePropertiesRequest</p>
 */
public class GetDirectoryOrFilePropertiesRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
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
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The absolute path of the directory.
         * <p>
         * 
         * The path must start with a forward slash (/) and must be a path that exists in the mount target.
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
