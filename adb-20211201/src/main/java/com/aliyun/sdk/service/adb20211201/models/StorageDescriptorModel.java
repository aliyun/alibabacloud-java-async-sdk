// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    private java.util.Map < String, String > parameters;

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
    public java.util.Map < String, String > getParameters() {
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
        private java.util.Map < String, String > parameters; 
        private Long sdId; 
        private SerDeInfoModel serDeInfo; 
        private Boolean storedAsSubDirectories; 

        /**
         * Compressed.
         */
        public Builder compressed(Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * InputFormat.
         */
        public Builder inputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * NumBuckets.
         */
        public Builder numBuckets(Long numBuckets) {
            this.numBuckets = numBuckets;
            return this;
        }

        /**
         * OutputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * SdId.
         */
        public Builder sdId(Long sdId) {
            this.sdId = sdId;
            return this;
        }

        /**
         * SerDeInfo.
         */
        public Builder serDeInfo(SerDeInfoModel serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }

        /**
         * StoredAsSubDirectories.
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
