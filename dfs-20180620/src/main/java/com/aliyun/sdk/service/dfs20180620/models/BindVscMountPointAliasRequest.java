// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindVscMountPointAliasRequest} extends {@link RequestModel}
 *
 * <p>BindVscMountPointAliasRequest</p>
 */
public class BindVscMountPointAliasRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AliasPrefix")
    @Validation(required = true)
    private String aliasPrefix;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("MountPointId")
    @Validation(required = true)
    private String mountPointId;

    private BindVscMountPointAliasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliasPrefix = builder.aliasPrefix;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
        this.mountPointId = builder.mountPointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindVscMountPointAliasRequest create() {
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
     * @return aliasPrefix
     */
    public String getAliasPrefix() {
        return this.aliasPrefix;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return mountPointId
     */
    public String getMountPointId() {
        return this.mountPointId;
    }

    public static final class Builder extends Request.Builder<BindVscMountPointAliasRequest, Builder> {
        private String regionId; 
        private String aliasPrefix; 
        private String fileSystemId; 
        private String inputRegionId; 
        private String mountPointId; 

        private Builder() {
            super();
        } 

        private Builder(BindVscMountPointAliasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliasPrefix = request.aliasPrefix;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
            this.mountPointId = request.mountPointId;
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
         * AliasPrefix.
         */
        public Builder aliasPrefix(String aliasPrefix) {
            this.putQueryParameter("AliasPrefix", aliasPrefix);
            this.aliasPrefix = aliasPrefix;
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
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * MountPointId.
         */
        public Builder mountPointId(String mountPointId) {
            this.putQueryParameter("MountPointId", mountPointId);
            this.mountPointId = mountPointId;
            return this;
        }

        @Override
        public BindVscMountPointAliasRequest build() {
            return new BindVscMountPointAliasRequest(this);
        } 

    } 

}
