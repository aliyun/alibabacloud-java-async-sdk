// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenePreviewInfoResponseBody</p>
 */
public class GetScenePreviewInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetScenePreviewInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScenePreviewInfoResponseBody build() {
            return new GetScenePreviewInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ModelPath")
        private String modelPath;

        @NameInMap("PanoList")
        private String panoList;

        @NameInMap("TextureModelPath")
        private String textureModelPath;

        @NameInMap("TexturePanoPath")
        private String texturePanoPath;

        private Data(Builder builder) {
            this.modelPath = builder.modelPath;
            this.panoList = builder.panoList;
            this.textureModelPath = builder.textureModelPath;
            this.texturePanoPath = builder.texturePanoPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelPath
         */
        public String getModelPath() {
            return this.modelPath;
        }

        /**
         * @return panoList
         */
        public String getPanoList() {
            return this.panoList;
        }

        /**
         * @return textureModelPath
         */
        public String getTextureModelPath() {
            return this.textureModelPath;
        }

        /**
         * @return texturePanoPath
         */
        public String getTexturePanoPath() {
            return this.texturePanoPath;
        }

        public static final class Builder {
            private String modelPath; 
            private String panoList; 
            private String textureModelPath; 
            private String texturePanoPath; 

            /**
             * 模型地址
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * html转译后的预览数据
             */
            public Builder panoList(String panoList) {
                this.panoList = panoList;
                return this;
            }

            /**
             * 模型的贴图路径
             */
            public Builder textureModelPath(String textureModelPath) {
                this.textureModelPath = textureModelPath;
                return this;
            }

            /**
             * 漫游后预览图片路径
             */
            public Builder texturePanoPath(String texturePanoPath) {
                this.texturePanoPath = texturePanoPath;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
