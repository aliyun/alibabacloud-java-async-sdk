// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoTagLayersResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagLayersResponseBody</p>
 */
public class GetRepoTagLayersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Layers")
    private java.util.List < Layers> layers;


    private GetRepoTagLayersResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.layers = builder.layers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagLayersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return layers
     */
    public java.util.List < Layers> getLayers() {
        return this.layers;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List < Layers> layers; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Layer data</p>
         */
        public Builder layers(java.util.List < Layers> layers) {
            this.layers = layers;
            return this;
        }

        public GetRepoTagLayersResponseBody build() {
            return new GetRepoTagLayersResponseBody(this);
        } 

    } 

    public static class Layers extends TeaModel {
        @NameInMap("BlobDigest")
        private String blobDigest;

        @NameInMap("LayerIndex")
        private Integer layerIndex;

        @NameInMap("LayerInstruction")
        private String layerInstruction;

        @NameInMap("LayerCMD")
        private String layerCMD;

        @NameInMap("BlobSize")
        private Long blobSize;


        private Layers(Builder builder) {
            this.blobDigest = builder.blobDigest;
            this.layerIndex = builder.layerIndex;
            this.layerInstruction = builder.layerInstruction;
            this.layerCMD = builder.layerCMD;
            this.blobSize = builder.blobSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return blobDigest
         */
        public String getBlobDigest() {
            return this.blobDigest;
        }

        /**
         * @return layerIndex
         */
        public Integer getLayerIndex() {
            return this.layerIndex;
        }

        /**
         * @return layerInstruction
         */
        public String getLayerInstruction() {
            return this.layerInstruction;
        }

        /**
         * @return layerCMD
         */
        public String getLayerCMD() {
            return this.layerCMD;
        }

        /**
         * @return blobSize
         */
        public Long getBlobSize() {
            return this.blobSize;
        }

        public static final class Builder {
            private String blobDigest; 
            private Integer layerIndex; 
            private String layerInstruction; 
            private String layerCMD; 
            private Long blobSize; 

            /**
             * <p>Block digest value</p>
             */
            public Builder blobDigest(String blobDigest) {
                this.blobDigest = blobDigest;
                return this;
            }

            /**
             * <p>Subscript</p>
             */
            public Builder layerIndex(Integer layerIndex) {
                this.layerIndex = layerIndex;
                return this;
            }

            /**
             * <p>Layer instruction</p>
             */
            public Builder layerInstruction(String layerInstruction) {
                this.layerInstruction = layerInstruction;
                return this;
            }

            /**
             * <p>Layer command</p>
             */
            public Builder layerCMD(String layerCMD) {
                this.layerCMD = layerCMD;
                return this;
            }

            /**
             * <p>Block size</p>
             */
            public Builder blobSize(Long blobSize) {
                this.blobSize = blobSize;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
}
