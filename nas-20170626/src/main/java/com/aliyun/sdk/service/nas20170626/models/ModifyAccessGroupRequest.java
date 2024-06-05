// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessGroupRequest</p>
 */
public class ModifyAccessGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    private ModifyAccessGroupRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.description = builder.description;
        this.fileSystemType = builder.fileSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public static final class Builder extends Request.Builder<ModifyAccessGroupRequest, Builder> {
        private String accessGroupName; 
        private String description; 
        private String fileSystemType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessGroupRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.description = request.description;
            this.fileSystemType = request.fileSystemType;
        } 

        /**
         * The name of the permission group.
         * <p>
         * 
         * Limits:
         * 
         * *   The name must be 3 to 64 characters in length.
         * *   The name must start with a letter and can contain letters, digits, underscores (\_), and hyphens (-).
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * The description of the permission group.
         * <p>
         * 
         * Limits:
         * 
         * *   By default, the description of the permission group is the same as the name of the permission group. The description must be 2 to 128 characters in length.
         * *   The description must start with a letter and cannot start with `http://` or `https://`.
         * *   The description can contain digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public ModifyAccessGroupRequest build() {
            return new ModifyAccessGroupRequest(this);
        } 

    } 

}
