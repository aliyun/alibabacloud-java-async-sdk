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
 * {@link CreateFileRequest} extends {@link RequestModel}
 *
 * <p>CreateFileRequest</p>
 */
public class CreateFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccessInheritable")
    private Boolean ownerAccessInheritable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateFileRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.owner = builder.owner;
        this.ownerAccessInheritable = builder.ownerAccessInheritable;
        this.path = builder.path;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileRequest create() {
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerAccessInheritable
     */
    public Boolean getOwnerAccessInheritable() {
        return this.ownerAccessInheritable;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateFileRequest, Builder> {
        private String fileSystemId; 
        private String owner; 
        private Boolean ownerAccessInheritable; 
        private String path; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.owner = request.owner;
            this.ownerAccessInheritable = request.ownerAccessInheritable;
            this.path = request.path;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the portable account. The ID must be a 16-digit string. The string can contain digits and lowercase letters.</p>
         * 
         * <strong>example:</strong>
         * <p>378cc7630f26****</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>Specifies whether to share the directory. Valid values:</p>
         * <ul>
         * <li>false (default): does not share the directory.</li>
         * <li>true: shares the directory.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only if the Type parameter is set to Directory and the Owner parameter is not empty.</li>
         * <li>The permissions on a directory can be inherited by the owner. The owner has read and write permissions on the subdirectories and subfiles created in the directory, even if they are created by others.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ownerAccessInheritable(Boolean ownerAccessInheritable) {
            this.putQueryParameter("OwnerAccessInheritable", ownerAccessInheritable);
            this.ownerAccessInheritable = ownerAccessInheritable;
            return this;
        }

        /**
         * <p>The absolute path of the directory or file. The path must start and end with a forward slash (/) and must be 2 to 1024 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The type of the object. Valid values:</p>
         * <ul>
         * <li>File</li>
         * <li>Directory</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFileRequest build() {
            return new CreateFileRequest(this);
        } 

    } 

}
