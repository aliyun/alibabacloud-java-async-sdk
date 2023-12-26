// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLifecycleRetrieveJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecycleRetrieveJobRequest</p>
 */
public class CreateLifecycleRetrieveJobRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("Paths")
    @Validation(required = true)
    private java.util.List < String > paths;

    private CreateLifecycleRetrieveJobRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.paths = builder.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLifecycleRetrieveJobRequest create() {
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
     * @return paths
     */
    public java.util.List < String > getPaths() {
        return this.paths;
    }

    public static final class Builder extends Request.Builder<CreateLifecycleRetrieveJobRequest, Builder> {
        private String fileSystemId; 
        private java.util.List < String > paths; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecycleRetrieveJobRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.paths = request.paths;
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
         * The directories or files that you want to retrieve. You can specify a maximum of 10 paths.
         */
        public Builder paths(java.util.List < String > paths) {
            this.putQueryParameter("Paths", paths);
            this.paths = paths;
            return this;
        }

        @Override
        public CreateLifecycleRetrieveJobRequest build() {
            return new CreateLifecycleRetrieveJobRequest(this);
        } 

    } 

}
