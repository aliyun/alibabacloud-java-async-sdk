// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDirRequest} extends {@link RequestModel}
 *
 * <p>CreateDirRequest</p>
 */
public class CreateDirRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("OwnerGroupId")
    @Validation(required = true)
    private Integer ownerGroupId;

    @Query
    @NameInMap("OwnerUserId")
    @Validation(required = true)
    private Integer ownerUserId;

    @Query
    @NameInMap("Permission")
    @Validation(required = true)
    private String permission;

    @Query
    @NameInMap("Recursion")
    private Boolean recursion;

    @Query
    @NameInMap("RootDirectory")
    @Validation(required = true)
    private String rootDirectory;

    private CreateDirRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.ownerGroupId = builder.ownerGroupId;
        this.ownerUserId = builder.ownerUserId;
        this.permission = builder.permission;
        this.recursion = builder.recursion;
        this.rootDirectory = builder.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDirRequest create() {
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
     * @return ownerGroupId
     */
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    /**
     * @return ownerUserId
     */
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return recursion
     */
    public Boolean getRecursion() {
        return this.recursion;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public static final class Builder extends Request.Builder<CreateDirRequest, Builder> {
        private String fileSystemId; 
        private Integer ownerGroupId; 
        private Integer ownerUserId; 
        private String permission; 
        private Boolean recursion; 
        private String rootDirectory; 

        private Builder() {
            super();
        } 

        private Builder(CreateDirRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.ownerGroupId = request.ownerGroupId;
            this.ownerUserId = request.ownerUserId;
            this.permission = request.permission;
            this.recursion = request.recursion;
            this.rootDirectory = request.rootDirectory;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * OwnerGroupId.
         */
        public Builder ownerGroupId(Integer ownerGroupId) {
            this.putQueryParameter("OwnerGroupId", ownerGroupId);
            this.ownerGroupId = ownerGroupId;
            return this;
        }

        /**
         * OwnerUserId.
         */
        public Builder ownerUserId(Integer ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * Permission.
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * Recursion.
         */
        public Builder recursion(Boolean recursion) {
            this.putQueryParameter("Recursion", recursion);
            this.recursion = recursion;
            return this;
        }

        /**
         * RootDirectory.
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        @Override
        public CreateDirRequest build() {
            return new CreateDirRequest(this);
        } 

    } 

}
