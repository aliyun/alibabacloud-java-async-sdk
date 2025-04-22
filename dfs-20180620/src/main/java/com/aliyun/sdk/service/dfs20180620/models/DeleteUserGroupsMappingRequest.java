// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link DeleteUserGroupsMappingRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserGroupsMappingRequest</p>
 */
public class DeleteUserGroupsMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupNames")
    private java.util.List<String> groupNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private DeleteUserGroupsMappingRequest(Builder builder) {
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

    public static DeleteUserGroupsMappingRequest create() {
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
    public java.util.List<String> getGroupNames() {
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

    public static final class Builder extends Request.Builder<DeleteUserGroupsMappingRequest, Builder> {
        private String regionId; 
        private String fileSystemId; 
        private java.util.List<String> groupNames; 
        private String inputRegionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserGroupsMappingRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * GroupNames.
         */
        public Builder groupNames(java.util.List<String> groupNames) {
            String groupNamesShrink = shrink(groupNames, "GroupNames", "json");
            this.putQueryParameter("GroupNames", groupNamesShrink);
            this.groupNames = groupNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DeleteUserGroupsMappingRequest build() {
            return new DeleteUserGroupsMappingRequest(this);
        } 

    } 

}
