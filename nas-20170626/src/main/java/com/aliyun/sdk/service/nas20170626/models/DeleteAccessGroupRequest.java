// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessGroupRequest</p>
 */
public class DeleteAccessGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    private DeleteAccessGroupRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.fileSystemType = builder.fileSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public static final class Builder extends Request.Builder<DeleteAccessGroupRequest, Builder> {
        private String accessGroupName; 
        private String fileSystemType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessGroupRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.fileSystemType = request.fileSystemType;
        } 

        /**
         * The name of the permission group to be deleted.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * The type of the file system.
         * <p>
         * 
         * Valid values:
         * 
         * *   standard (default): General-purpose NAS file system
         * *   extreme: Extreme NAS file system
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        @Override
        public DeleteAccessGroupRequest build() {
            return new DeleteAccessGroupRequest(this);
        } 

    } 

}
