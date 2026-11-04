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
    @com.aliyun.core.annotation.NameInMap("MeteringMode")
    private String meteringMode;

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
        this.meteringMode = builder.meteringMode;
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
     * @return meteringMode
     */
    public String getMeteringMode() {
        return this.meteringMode;
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
        private String meteringMode; 
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
            this.meteringMode = request.meteringMode;
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
         * <p>The redundancy mode of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>LRS: locally redundant storage. This is the default value.</li>
         * <li>ZRS: zone-redundant storage. If you select ZRS, ZoneId must be a string that consists of multiple zone IDs for zone-redundant storage, such as <codeph> <code>zoneId1,zoneId2</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putQueryParameter("DataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * <p>The ID of the dedicated cluster for Apsara File Storage for HDFS.</p>
         * 
         * <strong>example:</strong>
         * <p>alidfs-DC-f76f7ca5-*****</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The description of the file system.</p>
         * <p>The description can be up to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the first Apsara File Storage for HDFS instance for our company</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the file system. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 6 to 64 characters in length. </li>
         * <li>The name must be globally unique and cannot be an empty string.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * </ul>
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
         * <p>The region ID.</p>
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
         * <p>The metering mode.</p>
         * 
         * <strong>example:</strong>
         * <p>UsageBased,CapacityBased</p>
         */
        public Builder meteringMode(String meteringMode) {
            this.putQueryParameter("MeteringMode", meteringMode);
            this.meteringMode = meteringMode;
            return this;
        }

        /**
         * <p>This parameter is reserved and does not require configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder partitionNumber(Integer partitionNumber) {
            this.putQueryParameter("PartitionNumber", partitionNumber);
            this.partitionNumber = partitionNumber;
            return this;
        }

        /**
         * <p>The protocol type.</p>
         * <p>Only Hadoop Distributed File System (HDFS) is supported.</p>
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
         * <p>The provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned.</p>
         * <p>Unit: MB/s.</p>
         * <p>Valid values: 1 to 5120.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder provisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
            this.putQueryParameter("ProvisionedThroughputInMiBps", provisionedThroughputInMiBps);
            this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
            return this;
        }

        /**
         * <p>The capacity of the file system.</p>
         * <p>You cannot write data when the amount of stored data reaches the file system capacity.</p>
         * <p>Unit: GiB.</p>
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
         * <p>This parameter is reserved and does not require configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>AligroupStorageSet</p>
         */
        public Builder storageSetName(String storageSetName) {
            this.putQueryParameter("StorageSetName", storageSetName);
            this.storageSetName = storageSetName;
            return this;
        }

        /**
         * <p>The storage medium type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>STANDARD: standard storage. This is the default value.</li>
         * <li>PERFORMANCE: performance storage.</li>
         * </ul>
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
         * <p>The throughput mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Standard: standard throughput. This is the default value.</li>
         * <li>Provisioned: provisioned throughput.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder throughputMode(String throughputMode) {
            this.putQueryParameter("ThroughputMode", throughputMode);
            this.throughputMode = throughputMode;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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
