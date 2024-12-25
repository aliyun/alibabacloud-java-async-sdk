// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link KdtreeOption} extends {@link TeaModel}
 *
 * <p>KdtreeOption</p>
 */
public class KdtreeOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompressionLevel")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer compressionLevel;

    @com.aliyun.core.annotation.NameInMap("LibraryName")
    private String libraryName;

    @com.aliyun.core.annotation.NameInMap("QuantizationBits")
    @com.aliyun.core.annotation.Validation(maximum = 31)
    private Integer quantizationBits;

    private KdtreeOption(Builder builder) {
        this.compressionLevel = builder.compressionLevel;
        this.libraryName = builder.libraryName;
        this.quantizationBits = builder.quantizationBits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KdtreeOption create() {
        return builder().build();
    }

    /**
     * @return compressionLevel
     */
    public Integer getCompressionLevel() {
        return this.compressionLevel;
    }

    /**
     * @return libraryName
     */
    public String getLibraryName() {
        return this.libraryName;
    }

    /**
     * @return quantizationBits
     */
    public Integer getQuantizationBits() {
        return this.quantizationBits;
    }

    public static final class Builder {
        private Integer compressionLevel; 
        private String libraryName; 
        private Integer quantizationBits; 

        /**
         * CompressionLevel.
         */
        public Builder compressionLevel(Integer compressionLevel) {
            this.compressionLevel = compressionLevel;
            return this;
        }

        /**
         * LibraryName.
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /**
         * QuantizationBits.
         */
        public Builder quantizationBits(Integer quantizationBits) {
            this.quantizationBits = quantizationBits;
            return this;
        }

        public KdtreeOption build() {
            return new KdtreeOption(this);
        } 

    } 

}
