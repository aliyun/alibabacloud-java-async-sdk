// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link StorageDescriptorModel} extends {@link TeaModel}
 *
 * <p>StorageDescriptorModel</p>
 */
public class StorageDescriptorModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Compressed")
    private Boolean compressed;

    @com.aliyun.core.annotation.NameInMap("InputFormat")
    private String inputFormat;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("NumBuckets")
    private Long numBuckets;

    @com.aliyun.core.annotation.NameInMap("OutputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("SdId")
    private Long sdId;

    @com.aliyun.core.annotation.NameInMap("SerDeInfo")
    private SerDeInfoModel serDeInfo;

    @com.aliyun.core.annotation.NameInMap("StoredAsSubDirectories")
    private Boolean storedAsSubDirectories;

    private StorageDescriptorModel(Builder builder) {
        this.compressed = builder.compressed;
        this.inputFormat = builder.inputFormat;
        this.location = builder.location;
        this.numBuckets = builder.numBuckets;
        this.outputFormat = builder.outputFormat;
        this.parameters = builder.parameters;
        this.sdId = builder.sdId;
        this.serDeInfo = builder.serDeInfo;
        this.storedAsSubDirectories = builder.storedAsSubDirectories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageDescriptorModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressed
     */
    public Boolean getCompressed() {
        return this.compressed;
    }

    /**
     * @return inputFormat
     */
    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return numBuckets
     */
    public Long getNumBuckets() {
        return this.numBuckets;
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return sdId
     */
    public Long getSdId() {
        return this.sdId;
    }

    /**
     * @return serDeInfo
     */
    public SerDeInfoModel getSerDeInfo() {
        return this.serDeInfo;
    }

    /**
     * @return storedAsSubDirectories
     */
    public Boolean getStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

    public static final class Builder {
        private Boolean compressed; 
        private String inputFormat; 
        private String location; 
        private Long numBuckets; 
        private String outputFormat; 
        private java.util.Map<String, String> parameters; 
        private Long sdId; 
        private SerDeInfoModel serDeInfo; 
        private Boolean storedAsSubDirectories; 

        private Builder() {
        } 

        private Builder(StorageDescriptorModel model) {
            this.compressed = model.compressed;
            this.inputFormat = model.inputFormat;
            this.location = model.location;
            this.numBuckets = model.numBuckets;
            this.outputFormat = model.outputFormat;
            this.parameters = model.parameters;
            this.sdId = model.sdId;
            this.serDeInfo = model.serDeInfo;
            this.storedAsSubDirectories = model.storedAsSubDirectories;
        } 

        /**
         * <p>Indicates whether the storage description is compressed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder compressed(Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * <p>The input format of the storage description.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
         */
        public Builder inputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * <p>The location of the storage description.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://**************</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The number of buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder numBuckets(Long numBuckets) {
            this.numBuckets = numBuckets;
            return this;
        }

        /**
         * <p>The output format of the storage description.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
         */
        public Builder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * <p>The storage configuration parameter.</p>
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the storage description.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sdId(Long sdId) {
            this.sdId = sdId;
            return this;
        }

        /**
         * <p>The information about serialization or deserialization.</p>
         */
        public Builder serDeInfo(SerDeInfoModel serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }

        /**
         * <p>Indicates whether the storage description is stored in subdirectories.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder storedAsSubDirectories(Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }

        public StorageDescriptorModel build() {
            return new StorageDescriptorModel(this);
        } 

    } 

}
