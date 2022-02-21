// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessGroupRequest</p>
 */
public class CreateAccessGroupRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("AccessGroupType")
    @Validation(required = true)
    private String accessGroupType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileSystemType")
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

        private Builder(CreateAccessGroupRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.accessGroupType = response.accessGroupType;
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
         * AccessGroupType.
         */
        public Builder accessGroupType(String accessGroupType) {
            this.putQueryParameter("AccessGroupType", accessGroupType);
            this.accessGroupType = accessGroupType;
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
        public CreateAccessGroupRequest build() {
            return new CreateAccessGroupRequest(this);
        } 

    } 

}
