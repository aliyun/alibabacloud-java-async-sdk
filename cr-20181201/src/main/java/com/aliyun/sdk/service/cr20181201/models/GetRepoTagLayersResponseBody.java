// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    @NameInMap("Layers")
    private java.util.List < Layers> layers;

    @NameInMap("RequestId")
    private String requestId;

    private GetRepoTagLayersResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.layers = builder.layers;
        this.requestId = builder.requestId;
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
     * @return layers
     */
    public java.util.List < Layers> getLayers() {
        return this.layers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private java.util.List < Layers> layers; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Layers.
         */
        public Builder layers(java.util.List < Layers> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRepoTagLayersResponseBody build() {
            return new GetRepoTagLayersResponseBody(this);
        } 

    } 

    public static class Layers extends TeaModel {
        @NameInMap("BlobDigest")
        private String blobDigest;

        @NameInMap("BlobSize")
        private Long blobSize;

        @NameInMap("LayerCMD")
        private String layerCMD;

        @NameInMap("LayerIndex")
        private Integer layerIndex;

        @NameInMap("LayerInstruction")
        private String layerInstruction;

        private Layers(Builder builder) {
            this.blobDigest = builder.blobDigest;
            this.blobSize = builder.blobSize;
            this.layerCMD = builder.layerCMD;
            this.layerIndex = builder.layerIndex;
            this.layerInstruction = builder.layerInstruction;
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
         * @return blobSize
         */
        public Long getBlobSize() {
            return this.blobSize;
        }

        /**
         * @return layerCMD
         */
        public String getLayerCMD() {
            return this.layerCMD;
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

        public static final class Builder {
            private String blobDigest; 
            private Long blobSize; 
            private String layerCMD; 
            private Integer layerIndex; 
            private String layerInstruction; 

            /**
             * BlobDigest.
             */
            public Builder blobDigest(String blobDigest) {
                this.blobDigest = blobDigest;
                return this;
            }

            /**
             * BlobSize.
             */
            public Builder blobSize(Long blobSize) {
                this.blobSize = blobSize;
                return this;
            }

            /**
             * LayerCMD.
             */
            public Builder layerCMD(String layerCMD) {
                this.layerCMD = layerCMD;
                return this;
            }

            /**
             * LayerIndex.
             */
            public Builder layerIndex(Integer layerIndex) {
                this.layerIndex = layerIndex;
                return this;
            }

            /**
             * LayerInstruction.
             */
            public Builder layerInstruction(String layerInstruction) {
                this.layerInstruction = layerInstruction;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
}
