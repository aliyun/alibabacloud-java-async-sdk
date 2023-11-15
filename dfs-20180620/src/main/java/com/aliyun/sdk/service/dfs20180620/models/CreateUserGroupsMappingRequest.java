// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserGroupsMappingRequest} extends {@link RequestModel}
 *
 * <p>CreateUserGroupsMappingRequest</p>
 */
public class CreateUserGroupsMappingRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("GroupNames")
    private java.util.List < String > groupNames;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private CreateUserGroupsMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileSystemId = builder.fileSystemId;
        this.groupNames = builder.groupNames;
        this.inputRegionId = builder.inputRegionId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserGroupsMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return groupNames
     */
    public java.util.List < String > getGroupNames() {
        return this.groupNames;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateUserGroupsMappingRequest, Builder> {
        private String regionId; 
        private String fileSystemId; 
        private java.util.List < String > groupNames; 
        private String inputRegionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserGroupsMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileSystemId = request.fileSystemId;
            this.groupNames = request.groupNames;
            this.inputRegionId = request.inputRegionId;
            this.userName = request.userName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * GroupNames.
         */
        public Builder groupNames(java.util.List < String > groupNames) {
            String groupNamesShrink = shrink(groupNames, "GroupNames", "json");
            this.putQueryParameter("GroupNames", groupNamesShrink);
            this.groupNames = groupNames;
            return this;
        }

        /**
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateUserGroupsMappingRequest build() {
            return new CreateUserGroupsMappingRequest(this);
        } 

    } 

}
