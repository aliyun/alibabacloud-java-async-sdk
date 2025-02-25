// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatasetProxyConfig} extends {@link TeaModel}
 *
 * <p>DatasetProxyConfig</p>
 */
public class DatasetProxyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("SourceDatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDatasetId;

    private DatasetProxyConfig(Builder builder) {
        this.datasetType = builder.datasetType;
        this.source = builder.source;
        this.sourceDatasetId = builder.sourceDatasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetProxyConfig create() {
        return builder().build();
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceDatasetId
     */
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    public static final class Builder {
        private String datasetType; 
        private String source; 
        private String sourceDatasetId; 

        /**
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * SourceDatasetId.
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        public DatasetProxyConfig build() {
            return new DatasetProxyConfig(this);
        } 

    } 

}
