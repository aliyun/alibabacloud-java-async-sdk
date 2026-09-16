// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AiChunkTransformParameters} extends {@link TeaModel}
 *
 * <p>AiChunkTransformParameters</p>
 */
public class AiChunkTransformParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkingType")
    private String chunkingType;

    @com.aliyun.core.annotation.NameInMap("InputField")
    private AiTransformField inputField;

    @com.aliyun.core.annotation.NameInMap("MaxOverlapSize")
    private Integer maxOverlapSize;

    @com.aliyun.core.annotation.NameInMap("MaxSegmentSize")
    private Integer maxSegmentSize;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.NameInMap("Unpack")
    private Boolean unpack;

    private AiChunkTransformParameters(Builder builder) {
        this.chunkingType = builder.chunkingType;
        this.inputField = builder.inputField;
        this.maxOverlapSize = builder.maxOverlapSize;
        this.maxSegmentSize = builder.maxSegmentSize;
        this.stepName = builder.stepName;
        this.unpack = builder.unpack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiChunkTransformParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkingType
     */
    public String getChunkingType() {
        return this.chunkingType;
    }

    /**
     * @return inputField
     */
    public AiTransformField getInputField() {
        return this.inputField;
    }

    /**
     * @return maxOverlapSize
     */
    public Integer getMaxOverlapSize() {
        return this.maxOverlapSize;
    }

    /**
     * @return maxSegmentSize
     */
    public Integer getMaxSegmentSize() {
        return this.maxSegmentSize;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return unpack
     */
    public Boolean getUnpack() {
        return this.unpack;
    }

    public static final class Builder {
        private String chunkingType; 
        private AiTransformField inputField; 
        private Integer maxOverlapSize; 
        private Integer maxSegmentSize; 
        private String stepName; 
        private Boolean unpack; 

        private Builder() {
        } 

        private Builder(AiChunkTransformParameters model) {
            this.chunkingType = model.chunkingType;
            this.inputField = model.inputField;
            this.maxOverlapSize = model.maxOverlapSize;
            this.maxSegmentSize = model.maxSegmentSize;
            this.stepName = model.stepName;
            this.unpack = model.unpack;
        } 

        /**
         * <p>The chunking algorithm. Valid values: markdown_header and recursive_character.</p>
         * 
         * <strong>example:</strong>
         * <p>recursive_character</p>
         */
        public Builder chunkingType(String chunkingType) {
            this.chunkingType = chunkingType;
            return this;
        }

        /**
         * <p>The text field to chunk. This operator does not use InputField.</p>
         */
        public Builder inputField(AiTransformField inputField) {
            this.inputField = inputField;
            return this;
        }

        /**
         * <p>The chunk overlap length. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxOverlapSize(Integer maxOverlapSize) {
            this.maxOverlapSize = maxOverlapSize;
            return this;
        }

        /**
         * <p>The maximum chunk length. Default value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxSegmentSize(Integer maxSegmentSize) {
            this.maxSegmentSize = maxSegmentSize;
            return this;
        }

        /**
         * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
         * 
         * <strong>example:</strong>
         * <p>chunks</p>
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * <p>Specifies whether to split the output into multiple events. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder unpack(Boolean unpack) {
            this.unpack = unpack;
            return this;
        }

        public AiChunkTransformParameters build() {
            return new AiChunkTransformParameters(this);
        } 

    } 

}
