// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageDescriptor} extends {@link TeaModel}
 *
 * <p>StorageDescriptor</p>
 */
public class StorageDescriptor extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketCols")
    private java.util.List < String > bucketCols;

    @com.aliyun.core.annotation.NameInMap("Cols")
    private java.util.List < FieldSchema > cols;

    @com.aliyun.core.annotation.NameInMap("Compressed")
    private Boolean compressed;

    @com.aliyun.core.annotation.NameInMap("InputFormat")
    private String inputFormat;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("NumBuckets")
    private Integer numBuckets;

    @com.aliyun.core.annotation.NameInMap("OutputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @com.aliyun.core.annotation.NameInMap("SerDeInfo")
    private SerDeInfo serDeInfo;

    @com.aliyun.core.annotation.NameInMap("SkewedInfo")
    private SkewedInfo skewedInfo;

    @com.aliyun.core.annotation.NameInMap("SortCols")
    private java.util.List < Order > sortCols;

    @com.aliyun.core.annotation.NameInMap("StoredAsSubDirectories")
    private Boolean storedAsSubDirectories;

    private StorageDescriptor(Builder builder) {
        this.bucketCols = builder.bucketCols;
        this.cols = builder.cols;
        this.compressed = builder.compressed;
        this.inputFormat = builder.inputFormat;
        this.location = builder.location;
        this.numBuckets = builder.numBuckets;
        this.outputFormat = builder.outputFormat;
        this.parameters = builder.parameters;
        this.serDeInfo = builder.serDeInfo;
        this.skewedInfo = builder.skewedInfo;
        this.sortCols = builder.sortCols;
        this.storedAsSubDirectories = builder.storedAsSubDirectories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageDescriptor create() {
        return builder().build();
    }

    /**
     * @return bucketCols
     */
    public java.util.List < String > getBucketCols() {
        return this.bucketCols;
    }

    /**
     * @return cols
     */
    public java.util.List < FieldSchema > getCols() {
        return this.cols;
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
    public Integer getNumBuckets() {
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
     * @return serDeInfo
     */
    public SerDeInfo getSerDeInfo() {
        return this.serDeInfo;
    }

    /**
     * @return skewedInfo
     */
    public SkewedInfo getSkewedInfo() {
        return this.skewedInfo;
    }

    /**
     * @return sortCols
     */
    public java.util.List < Order > getSortCols() {
        return this.sortCols;
    }

    /**
     * @return storedAsSubDirectories
     */
    public Boolean getStoredAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

    public static final class Builder {
        private java.util.List < String > bucketCols; 
        private java.util.List < FieldSchema > cols; 
        private Boolean compressed; 
        private String inputFormat; 
        private String location; 
        private Integer numBuckets; 
        private String outputFormat; 
        private java.util.Map < String, String > parameters; 
        private SerDeInfo serDeInfo; 
        private SkewedInfo skewedInfo; 
        private java.util.List < Order > sortCols; 
        private Boolean storedAsSubDirectories; 

        /**
         * BucketCols.
         */
        public Builder bucketCols(java.util.List < String > bucketCols) {
            this.bucketCols = bucketCols;
            return this;
        }

        /**
         * Cols.
         */
        public Builder cols(java.util.List < FieldSchema > cols) {
            this.cols = cols;
            return this;
        }

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
        public Builder numBuckets(Integer numBuckets) {
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
         * SerDeInfo.
         */
        public Builder serDeInfo(SerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }

        /**
         * SkewedInfo.
         */
        public Builder skewedInfo(SkewedInfo skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }

        /**
         * SortCols.
         */
        public Builder sortCols(java.util.List < Order > sortCols) {
            this.sortCols = sortCols;
            return this;
        }

        /**
         * StoredAsSubDirectories.
         */
        public Builder storedAsSubDirectories(Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }

        public StorageDescriptor build() {
            return new StorageDescriptor(this);
        } 

    } 

}
