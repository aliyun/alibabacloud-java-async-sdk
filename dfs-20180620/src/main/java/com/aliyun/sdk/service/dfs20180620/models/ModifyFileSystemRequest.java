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
 * {@link ModifyFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileSystemRequest</p>
 */
public class ModifyFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemName")
    private String fileSystemName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MeteringMode")
    private String meteringMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedThroughputInMiBps")
    @com.aliyun.core.annotation.Validation(maximum = 51200, minimum = 1)
    private Long provisionedThroughputInMiBps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceCapacity")
    @com.aliyun.core.annotation.Validation(maximum = 10485760, minimum = 1)
    private Long spaceCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThroughputMode")
    private String throughputMode;

    private ModifyFileSystemRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemName = builder.fileSystemName;
        this.inputRegionId = builder.inputRegionId;
        this.meteringMode = builder.meteringMode;
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
     * @return meteringMode
     */
    public String getMeteringMode() {
        return this.meteringMode;
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
        private String meteringMode; 
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
            this.meteringMode = request.meteringMode;
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
         * <p>The description of the file system.</p>
         * <p>The description can be up to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the first Apsara File Storage for HDFS instance for my company</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The name of the file system. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 6 to 64 characters in length.</li>
         * <li>The name must be globally unique and cannot be an empty string.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MyFirstModDFS</p>
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
         * <p>The capacity budget of the file system.</p>
         * <p>When the actual data storage reaches the file system capacity, no more data can be written. The file system capacity cannot be reduced.</p>
         * <p>Unit: GB.</p>
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
         * <p>The throughput mode. Valid values:</p>
         * <ul>
         * <li>Standard: standard throughput</li>
         * <li>Provisioned: provisioned throughput</li>
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

        @Override
        public ModifyFileSystemRequest build() {
            return new ModifyFileSystemRequest(this);
        } 

    } 

}
