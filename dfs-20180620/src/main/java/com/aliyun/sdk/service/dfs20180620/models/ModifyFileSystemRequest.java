// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileSystemRequest</p>
 */
public class ModifyFileSystemRequest extends Request {
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
    @NameInMap("FileSystemName")
    private String fileSystemName;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("ProvisionedThroughputInMiBps")
    @Validation(maximum = 51200, minimum = 1)
    private Long provisionedThroughputInMiBps;

    @Query
    @NameInMap("SpaceCapacity")
    @Validation(maximum = 10485760, minimum = 1)
    private Long spaceCapacity;

    @Query
    @NameInMap("ThroughputMode")
    private String throughputMode;

    private ModifyFileSystemRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemName = builder.fileSystemName;
        this.inputRegionId = builder.inputRegionId;
        this.provisionedThroughputInMiBps = builder.provisionedThroughputInMiBps;
        this.spaceCapacity = builder.spaceCapacity;
        this.throughputMode = builder.throughputMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFileSystemRequest create() {
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
     * @return fileSystemName
     */
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return provisionedThroughputInMiBps
     */
    public Long getProvisionedThroughputInMiBps() {
        return this.provisionedThroughputInMiBps;
    }

    /**
     * @return spaceCapacity
     */
    public Long getSpaceCapacity() {
        return this.spaceCapacity;
    }

    /**
     * @return throughputMode
     */
    public String getThroughputMode() {
        return this.throughputMode;
    }

    public static final class Builder extends Request.Builder<ModifyFileSystemRequest, Builder> {
        private String regionId; 
        private String description; 
        private String fileSystemId; 
        private String fileSystemName; 
        private String inputRegionId; 
        private Long provisionedThroughputInMiBps; 
        private Long spaceCapacity; 
        private String throughputMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFileSystemRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.fileSystemName = request.fileSystemName;
            this.inputRegionId = request.inputRegionId;
            this.provisionedThroughputInMiBps = request.provisionedThroughputInMiBps;
            this.spaceCapacity = request.spaceCapacity;
            this.throughputMode = request.throughputMode;
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
         * FileSystemName.
         */
        public Builder fileSystemName(String fileSystemName) {
            this.putQueryParameter("FileSystemName", fileSystemName);
            this.fileSystemName = fileSystemName;
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
         * ProvisionedThroughputInMiBps.
         */
        public Builder provisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
            this.putQueryParameter("ProvisionedThroughputInMiBps", provisionedThroughputInMiBps);
            this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
            return this;
        }

        /**
         * SpaceCapacity.
         */
        public Builder spaceCapacity(Long spaceCapacity) {
            this.putQueryParameter("SpaceCapacity", spaceCapacity);
            this.spaceCapacity = spaceCapacity;
            return this;
        }

        /**
         * ThroughputMode.
         */
        public Builder throughputMode(String throughputMode) {
            this.putQueryParameter("ThroughputMode", throughputMode);
            this.throughputMode = throughputMode;
            return this;
        }

        @Override
        public ModifyFileSystemRequest build() {
            return new ModifyFileSystemRequest(this);
        } 

    } 

}
