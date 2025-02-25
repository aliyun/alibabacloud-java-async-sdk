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
         * <p>The name of the permission group.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The name must be 3 to 64 characters in length.</li>
         * <li>The name must start with a letter and can contain letters, digits, underscores (_), and hyphens (-).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * <p>The description of the permission group.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>By default, the description of the permission group is the same as the name of the permission group. The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard (default): General-purpose NAS file system</li>
         * <li>extreme: Extreme NAS file system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
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
