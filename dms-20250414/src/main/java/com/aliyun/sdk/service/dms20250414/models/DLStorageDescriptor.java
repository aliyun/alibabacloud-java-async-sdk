// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DLStorageDescriptor} extends {@link TeaModel}
 *
 * <p>DLStorageDescriptor</p>
 */
public class DLStorageDescriptor extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketCols")
    private java.util.List<String> bucketCols;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<DLColumn> columns;

    @com.aliyun.core.annotation.NameInMap("InputFormat")
    private String inputFormat;

    @com.aliyun.core.annotation.NameInMap("IsCompressed")
    private Boolean isCompressed;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("NumBuckets")
    private Integer numBuckets;

    @com.aliyun.core.annotation.NameInMap("OriginalColumns")
    private java.util.List<DLColumn> originalColumns;

    @com.aliyun.core.annotation.NameInMap("OutputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("SerdeInfo")
    private DLSerdeInfo serdeInfo;

    @com.aliyun.core.annotation.NameInMap("SkewedInfo")
    private DLSkewedInfo skewedInfo;

    @com.aliyun.core.annotation.NameInMap("SortCols")
    private java.util.List<DLOrder> sortCols;

    private DLStorageDescriptor(Builder builder) {
        this.bucketCols = builder.bucketCols;
        this.columns = builder.columns;
        this.inputFormat = builder.inputFormat;
        this.isCompressed = builder.isCompressed;
        this.location = builder.location;
        this.numBuckets = builder.numBuckets;
        this.originalColumns = builder.originalColumns;
        this.outputFormat = builder.outputFormat;
        this.parameters = builder.parameters;
        this.serdeInfo = builder.serdeInfo;
        this.skewedInfo = builder.skewedInfo;
        this.sortCols = builder.sortCols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLStorageDescriptor create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketCols
     */
    public java.util.List<String> getBucketCols() {
        return this.bucketCols;
    }

    /**
     * @return columns
     */
    public java.util.List<DLColumn> getColumns() {
        return this.columns;
    }

    /**
     * @return inputFormat
     */
    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * @return isCompressed
     */
    public Boolean getIsCompressed() {
        return this.isCompressed;
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
     * @return originalColumns
     */
    public java.util.List<DLColumn> getOriginalColumns() {
        return this.originalColumns;
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
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return serdeInfo
     */
    public DLSerdeInfo getSerdeInfo() {
        return this.serdeInfo;
    }

    /**
     * @return skewedInfo
     */
    public DLSkewedInfo getSkewedInfo() {
        return this.skewedInfo;
    }

    /**
     * @return sortCols
     */
    public java.util.List<DLOrder> getSortCols() {
        return this.sortCols;
    }

    public static final class Builder {
        private java.util.List<String> bucketCols; 
        private java.util.List<DLColumn> columns; 
        private String inputFormat; 
        private Boolean isCompressed; 
        private String location; 
        private Integer numBuckets; 
        private java.util.List<DLColumn> originalColumns; 
        private String outputFormat; 
        private java.util.Map<String, ?> parameters; 
        private DLSerdeInfo serdeInfo; 
        private DLSkewedInfo skewedInfo; 
        private java.util.List<DLOrder> sortCols; 

        private Builder() {
        } 

        private Builder(DLStorageDescriptor model) {
            this.bucketCols = model.bucketCols;
            this.columns = model.columns;
            this.inputFormat = model.inputFormat;
            this.isCompressed = model.isCompressed;
            this.location = model.location;
            this.numBuckets = model.numBuckets;
            this.originalColumns = model.originalColumns;
            this.outputFormat = model.outputFormat;
            this.parameters = model.parameters;
            this.serdeInfo = model.serdeInfo;
            this.skewedInfo = model.skewedInfo;
            this.sortCols = model.sortCols;
        } 

        /**
         * <p>A list of bucket column names that determine the hash distribution of the data.</p>
         */
        public Builder bucketCols(java.util.List<String> bucketCols) {
            this.bucketCols = bucketCols;
            return this;
        }

        /**
         * <p>The description of the data columns in the table.</p>
         */
        public Builder columns(java.util.List<DLColumn> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The name of the input format class used to read data.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.mapred.SequenceFileInputFormat</p>
         */
        public Builder inputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * <p>Specifies whether the data is compressed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isCompressed(Boolean isCompressed) {
            this.isCompressed = isCompressed;
            return this;
        }

        /**
         * <p>The specific location of the data storage.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://xxx</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The number of buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder numBuckets(Integer numBuckets) {
            this.numBuckets = numBuckets;
            return this;
        }

        /**
         * <p>The description of the original columns.</p>
         */
        public Builder originalColumns(java.util.List<DLColumn> originalColumns) {
            this.originalColumns = originalColumns;
            return this;
        }

        /**
         * <p>The name of the output format class used to write data.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat</p>
         */
        public Builder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * <p>Other parameter mappings for data storage.</p>
         * 
         * <strong>example:</strong>
         * <p>key/value</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The serialization and deserialization information.</p>
         */
        public Builder serdeInfo(DLSerdeInfo serdeInfo) {
            this.serdeInfo = serdeInfo;
            return this;
        }

        /**
         * <p>The data structure that stores information about skewed columns.</p>
         */
        public Builder skewedInfo(DLSkewedInfo skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }

        /**
         * <p>The description of the sorted columns.</p>
         */
        public Builder sortCols(java.util.List<DLOrder> sortCols) {
            this.sortCols = sortCols;
            return this;
        }

        public DLStorageDescriptor build() {
            return new DLStorageDescriptor(this);
        } 

    } 

}
