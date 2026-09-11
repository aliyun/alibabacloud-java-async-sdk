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
 * {@link CreateAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessGroupRequest</p>
 */
public class CreateAccessGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    private CreateAccessGroupRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.accessGroupType = builder.accessGroupType;
        this.description = builder.description;
        this.fileSystemType = builder.fileSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessGroupRequest create() {
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
     * @return accessGroupType
     */
    public String getAccessGroupType() {
        return this.accessGroupType;
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

    public static final class Builder extends Request.Builder<CreateAccessGroupRequest, Builder> {
        private String accessGroupName; 
        private String accessGroupType; 
        private String description; 
        private String fileSystemType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessGroupRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.accessGroupType = request.accessGroupType;
            this.description = request.description;
            this.fileSystemType = request.fileSystemType;
        } 

        /**
         * <p>The name of the permission group.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The name must be 3 to 64 characters in length.</li>
         * <li>The name must start with a letter and can contain letters, digits, underscores (_), or hyphens (-).</li>
         * <li>The name of the new permission group cannot be the same as the name of the default permission group.</li>
         * </ul>
         * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (default VPC permission group).</p>
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
         * <p>The type of the permission group. Set the value to <strong>Vpc</strong>, which indicates VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        public Builder accessGroupType(String accessGroupType) {
            this.putQueryParameter("AccessGroupType", accessGroupType);
            this.accessGroupType = accessGroupType;
            return this;
        }

        /**
         * <p>The description of the permission group.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description defaults to the permission group name and must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpctestaccessgroup</p>
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
         * <li>standard (default): General-purpose NAS.</li>
         * <li>extreme: Extreme NAS.</li>
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
        public CreateAccessGroupRequest build() {
            return new CreateAccessGroupRequest(this);
        } 

    } 

}
