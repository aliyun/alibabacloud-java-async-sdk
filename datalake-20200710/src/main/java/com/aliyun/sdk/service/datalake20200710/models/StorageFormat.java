// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageFormat} extends {@link TeaModel}
 *
 * <p>StorageFormat</p>
 */
public class StorageFormat extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avro")
    private Long avro;

    @com.aliyun.core.annotation.NameInMap("Csv")
    private Long csv;

    @com.aliyun.core.annotation.NameInMap("Delta")
    private Long delta;

    @com.aliyun.core.annotation.NameInMap("Hudi")
    private Long hudi;

    @com.aliyun.core.annotation.NameInMap("Iceberg")
    private Long iceberg;

    @com.aliyun.core.annotation.NameInMap("Json")
    private Long json;

    @com.aliyun.core.annotation.NameInMap("Orc")
    private Long orc;

    @com.aliyun.core.annotation.NameInMap("Parquet")
    private Long parquet;

    @com.aliyun.core.annotation.NameInMap("Uncategorized")
    private Long uncategorized;

    private StorageFormat(Builder builder) {
        this.avro = builder.avro;
        this.csv = builder.csv;
        this.delta = builder.delta;
        this.hudi = builder.hudi;
        this.iceberg = builder.iceberg;
        this.json = builder.json;
        this.orc = builder.orc;
        this.parquet = builder.parquet;
        this.uncategorized = builder.uncategorized;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageFormat create() {
        return builder().build();
    }

    /**
     * @return avro
     */
    public Long getAvro() {
        return this.avro;
    }

    /**
     * @return csv
     */
    public Long getCsv() {
        return this.csv;
    }

    /**
     * @return delta
     */
    public Long getDelta() {
        return this.delta;
    }

    /**
     * @return hudi
     */
    public Long getHudi() {
        return this.hudi;
    }

    /**
     * @return iceberg
     */
    public Long getIceberg() {
        return this.iceberg;
    }

    /**
     * @return json
     */
    public Long getJson() {
        return this.json;
    }

    /**
     * @return orc
     */
    public Long getOrc() {
        return this.orc;
    }

    /**
     * @return parquet
     */
    public Long getParquet() {
        return this.parquet;
    }

    /**
     * @return uncategorized
     */
    public Long getUncategorized() {
        return this.uncategorized;
    }

    public static final class Builder {
        private Long avro; 
        private Long csv; 
        private Long delta; 
        private Long hudi; 
        private Long iceberg; 
        private Long json; 
        private Long orc; 
        private Long parquet; 
        private Long uncategorized; 

        /**
         * Avro.
         */
        public Builder avro(Long avro) {
            this.avro = avro;
            return this;
        }

        /**
         * Csv.
         */
        public Builder csv(Long csv) {
            this.csv = csv;
            return this;
        }

        /**
         * Delta.
         */
        public Builder delta(Long delta) {
            this.delta = delta;
            return this;
        }

        /**
         * Hudi.
         */
        public Builder hudi(Long hudi) {
            this.hudi = hudi;
            return this;
        }

        /**
         * Iceberg.
         */
        public Builder iceberg(Long iceberg) {
            this.iceberg = iceberg;
            return this;
        }

        /**
         * Json.
         */
        public Builder json(Long json) {
            this.json = json;
            return this;
        }

        /**
         * Orc.
         */
        public Builder orc(Long orc) {
            this.orc = orc;
            return this;
        }

        /**
         * Parquet.
         */
        public Builder parquet(Long parquet) {
            this.parquet = parquet;
            return this;
        }

        /**
         * Uncategorized.
         */
        public Builder uncategorized(Long uncategorized) {
            this.uncategorized = uncategorized;
            return this;
        }

        public StorageFormat build() {
            return new StorageFormat(this);
        } 

    } 

}
