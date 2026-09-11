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
         * <p>The file system ID.</p>
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
         * <p>The portable account ID.
         * Limit: The value is a 16-character string that supports digits and lowercase letters.</p>
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
         * <p>Specifies whether to share directory permissions. Valid values:</p>
         * <ul>
         * <li>false (default): does not share directory permissions.</li>
         * <li>true: shares directory permissions.<blockquote>
         * <ul>
         * <li>This parameter takes effect only when Type is set to Directory and Owner is not empty.</li>
         * <li>The directory has inheritable Owner permissions. The Owner has read and write permissions on subdirectories and files created under this directory, even if they are created by other users.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The absolute path of the directory or file.</p>
         * <ul>
         * <li>The path must start and end with a forward slash (/).</li>
         * <li>The path must be 1 to 1,023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * </ul>
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
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>File: file.</li>
         * <li>Directory: directory.</li>
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
