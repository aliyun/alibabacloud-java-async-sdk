// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListNodeOutputsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeOutputsResponseBody</p>
 */
public class ListNodeOutputsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List<Outputs> outputs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodeOutputsResponseBody(Builder builder) {
        this.outputs = builder.outputs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeOutputsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputs
     */
    public java.util.List<Outputs> getOutputs() {
        return this.outputs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Outputs> outputs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodeOutputsResponseBody model) {
            this.outputs = model.outputs;
            this.requestId = model.requestId;
        } 

        /**
         * Outputs.
         */
        public Builder outputs(java.util.List<Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodeOutputsResponseBody build() {
            return new ListNodeOutputsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeOutputsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeOutputsResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgoName")
        private String algoName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("LocationType")
        private String locationType;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OutputId")
        private String outputId;

        @com.aliyun.core.annotation.NameInMap("OutputIndex")
        private String outputIndex;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.Map<String, ?> value;

        private Outputs(Builder builder) {
            this.algoName = builder.algoName;
            this.displayName = builder.displayName;
            this.locationType = builder.locationType;
            this.nodeName = builder.nodeName;
            this.outputId = builder.outputId;
            this.outputIndex = builder.outputIndex;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return algoName
         */
        public String getAlgoName() {
            return this.algoName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return locationType
         */
        public String getLocationType() {
            return this.locationType;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return outputId
         */
        public String getOutputId() {
            return this.outputId;
        }

        /**
         * @return outputIndex
         */
        public String getOutputIndex() {
            return this.outputIndex;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public java.util.Map<String, ?> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String algoName; 
            private String displayName; 
            private String locationType; 
            private String nodeName; 
            private String outputId; 
            private String outputIndex; 
            private String type; 
            private java.util.Map<String, ?> value; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.algoName = model.algoName;
                this.displayName = model.displayName;
                this.locationType = model.locationType;
                this.nodeName = model.nodeName;
                this.outputId = model.outputId;
                this.outputIndex = model.outputIndex;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * AlgoName.
             */
            public Builder algoName(String algoName) {
                this.algoName = algoName;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * LocationType.
             */
            public Builder locationType(String locationType) {
                this.locationType = locationType;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * OutputId.
             */
            public Builder outputId(String outputId) {
                this.outputId = outputId;
                return this;
            }

            /**
             * OutputIndex.
             */
            public Builder outputIndex(String outputIndex) {
                this.outputIndex = outputIndex;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.Map<String, ?> value) {
                this.value = value;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
}
