// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedStoragesRequest} extends {@link RequestModel}
 *
 * <p>ListSharedStoragesRequest</p>
 */
public class ListSharedStoragesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    private ListSharedStoragesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemType = builder.fileSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedStoragesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public static final class Builder extends Request.Builder<ListSharedStoragesRequest, Builder> {
        private String clusterId; 
        private String fileSystemId; 
        private String fileSystemType; 

        private Builder() {
            super();
        } 

        private Builder(ListSharedStoragesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.fileSystemId = request.fileSystemId;
            this.fileSystemType = request.fileSystemType;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the attached file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The type of the attached file system. Valid values:
         * <p>
         * 
         * *   nas
         * *   cpfs
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        @Override
        public ListSharedStoragesRequest build() {
            return new ListSharedStoragesRequest(this);
        } 

    } 

}
