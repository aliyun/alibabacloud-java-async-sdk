// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessGroupRequest</p>
 */
public class ModifyAccessGroupRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileSystemType")
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

        private Builder(ModifyAccessGroupRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.description = response.description;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public ModifyAccessGroupRequest build() {
            return new ModifyAccessGroupRequest(this);
        } 

    } 

}
