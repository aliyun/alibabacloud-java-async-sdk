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
 * {@link CreateFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateFileSystemRequest</p>
 */
public class CreateFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRedundancyType")
    private String dataRedundancyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNumber")
    private Integer partitionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedThroughputInMiBps")
    @com.aliyun.core.annotation.Validation(maximum = 5120, minimum = 1)
    private Long provisionedThroughputInMiBps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceCapacity")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10485760, minimum = 1)
    private Long spaceCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSetName")
    private String storageSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThroughputMode")
    private String throughputMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateFileSystemRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataRedundancyType = builder.dataRedundancyType;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.description = builder.description;
        this.fileSystemName = builder.fileSystemName;
        this.inputRegionId = builder.inputRegionId;
        this.partitionNumber = builder.partitionNumber;
        this.protocolType = builder.protocolType;
        this.provisionedThroughputInMiBps = builder.provisionedThroughputInMiBps;
        this.spaceCapacity = builder.spaceCapacity;
        this.storageSetName = builder.storageSetName;
        this.storageType = builder.storageType;
        this.throughputMode = builder.throughputMode;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemRequest create() {
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
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return partitionNumber
     */
    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
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
     * @return storageSetName
     */
    public String getStorageSetName() {
        return this.storageSetName;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return throughputMode
     */
    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateFileSystemRequest, Builder> {
        private String regionId; 
        private String dataRedundancyType; 
        private String dedicatedClusterId; 
        private String description; 
        private String fileSystemName; 
        private String inputRegionId; 
        private Integer partitionNumber; 
        private String protocolType; 
        private Long provisionedThroughputInMiBps; 
        private Long spaceCapacity; 
        private String storageSetName; 
        private String storageType; 
        private String throughputMode; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileSystemRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataRedundancyType = request.dataRedundancyType;
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.description = request.description;
            this.fileSystemName = request.fileSystemName;
            this.inputRegionId = request.inputRegionId;
            this.partitionNumber = request.partitionNumber;
            this.protocolType = request.protocolType;
            this.provisionedThroughputInMiBps = request.provisionedThroughputInMiBps;
            this.spaceCapacity = request.spaceCapacity;
            this.storageSetName = request.storageSetName;
            this.storageType = request.storageType;
            this.throughputMode = request.throughputMode;
            this.zoneId = request.zoneId;
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
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putQueryParameter("DataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * DedicatedClusterId.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyFirstHDFS</p>
         */
        public Builder fileSystemName(String fileSystemName) {
            this.putQueryParameter("FileSystemName", fileSystemName);
            this.fileSystemName = fileSystemName;
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
         * PartitionNumber.
         */
        public Builder partitionNumber(Integer partitionNumber) {
            this.putQueryParameter("PartitionNumber", partitionNumber);
            this.partitionNumber = partitionNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder spaceCapacity(Long spaceCapacity) {
            this.putQueryParameter("SpaceCapacity", spaceCapacity);
            this.spaceCapacity = spaceCapacity;
            return this;
        }

        /**
         * StorageSetName.
         */
        public Builder storageSetName(String storageSetName) {
            this.putQueryParameter("StorageSetName", storageSetName);
            this.storageSetName = storageSetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
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

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateFileSystemRequest build() {
            return new CreateFileSystemRequest(this);
        } 

    } 

}
