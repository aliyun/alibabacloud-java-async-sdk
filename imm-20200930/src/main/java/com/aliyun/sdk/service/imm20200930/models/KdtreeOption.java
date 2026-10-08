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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(KdtreeOption model) {
            this.compressionLevel = model.compressionLevel;
            this.libraryName = model.libraryName;
            this.quantizationBits = model.quantizationBits;
        } 

        /**
         * <p>The compression level. Valid values: 0 to 10. A greater value specifies a higher compression ratio and ensures better detail effects.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder compressionLevel(Integer compressionLevel) {
            this.compressionLevel = compressionLevel;
            return this;
        }

        /**
         * <p>The name of the library supported by a k-d tree. Set the value to draco. Default value: draco.</p>
         * 
         * <strong>example:</strong>
         * <p>draco</p>
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /**
         * <p>The number of bits for quantization. Valid values: 0 to 31. A greater value ensures that more details are retained. A value of 0 specifies that vertex compression is not performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
