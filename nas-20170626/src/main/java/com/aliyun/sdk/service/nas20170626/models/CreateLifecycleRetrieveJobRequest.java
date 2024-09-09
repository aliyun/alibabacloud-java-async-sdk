// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLifecycleRetrieveJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecycleRetrieveJobRequest</p>
 */
public class CreateLifecycleRetrieveJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > paths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private CreateLifecycleRetrieveJobRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.paths = builder.paths;
        this.storageType = builder.storageType;
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

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<CreateLifecycleRetrieveJobRequest, Builder> {
        private String fileSystemId; 
        private java.util.List < String > paths; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecycleRetrieveJobRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.paths = request.paths;
            this.storageType = request.storageType;
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

        /**
         * The storage class.
         * <p>
         * 
         * *   InfrequentAccess (default): the Infrequent Access (IA) storage class.
         * *   Archive: the Archive storage class.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public CreateLifecycleRetrieveJobRequest build() {
            return new CreateLifecycleRetrieveJobRequest(this);
        } 

    } 

}
