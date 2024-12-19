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
    private java.util.List<String> paths;

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
    public java.util.List<String> getPaths() {
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
        private java.util.List<String> paths; 
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
         * <p>The directories or files that you want to retrieve. You can specify a maximum of 10 paths.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Paths.1=/pathway/doc1,Paths.2=/pathway/doc2</p>
         */
        public Builder paths(java.util.List<String> paths) {
            this.putQueryParameter("Paths", paths);
            this.paths = paths;
            return this;
        }

        /**
         * <p>The storage class.</p>
         * <ul>
         * <li>InfrequentAccess (default): the Infrequent Access (IA) storage class.</li>
         * <li>Archive: the Archive storage class.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
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
