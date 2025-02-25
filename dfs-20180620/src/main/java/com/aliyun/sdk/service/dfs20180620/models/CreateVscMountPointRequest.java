// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVscMountPointRequest} extends {@link RequestModel}
 *
 * <p>CreateVscMountPointRequest</p>
 */
public class CreateVscMountPointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private CreateVscMountPointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVscMountPointRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<CreateVscMountPointRequest, Builder> {
        private String regionId; 
        private String description; 
        private String fileSystemId; 
        private String inputRegionId; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateVscMountPointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
            this.instanceIds = request.instanceIds;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public CreateVscMountPointRequest build() {
            return new CreateVscMountPointRequest(this);
        } 

    } 

}
