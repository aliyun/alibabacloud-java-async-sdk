// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessGroupRequest</p>
 */
public class DeleteAccessGroupRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("FileSystemType")
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

        private Builder(DeleteAccessGroupRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.fileSystemType = response.fileSystemType;
        } 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * FileSystemType.
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
