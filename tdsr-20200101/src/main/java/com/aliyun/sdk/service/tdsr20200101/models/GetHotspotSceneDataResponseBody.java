// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotSceneDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotspotSceneDataResponseBody</p>
 */
public class GetHotspotSceneDataResponseBody extends TeaModel {
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

    private GetHotspotSceneDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotSceneDataResponseBody create() {
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

        public GetHotspotSceneDataResponseBody build() {
            return new GetHotspotSceneDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ModelToken")
        private String modelToken;

        @NameInMap("PreviewData")
        private String previewData;

        @NameInMap("PreviewToken")
        private String previewToken;

        @NameInMap("SceneType")
        private String sceneType;

        private Data(Builder builder) {
            this.modelToken = builder.modelToken;
            this.previewData = builder.previewData;
            this.previewToken = builder.previewToken;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelToken
         */
        public String getModelToken() {
            return this.modelToken;
        }

        /**
         * @return previewData
         */
        public String getPreviewData() {
            return this.previewData;
        }

        /**
         * @return previewToken
         */
        public String getPreviewToken() {
            return this.previewToken;
        }

        /**
         * @return sceneType
         */
        public String getSceneType() {
            return this.sceneType;
        }

        public static final class Builder {
            private String modelToken; 
            private String previewData; 
            private String previewToken; 
            private String sceneType; 

            /**
             * 模型token（sgm token）
             */
            public Builder modelToken(String modelToken) {
                this.modelToken = modelToken;
                return this;
            }

            /**
             * html转译后的预览数据，包含图片、子场景ID等信息
             */
            public Builder previewData(String previewData) {
                this.previewData = previewData;
                return this;
            }

            /**
             * 预览token
             */
            public Builder previewToken(String previewToken) {
                this.previewToken = previewToken;
                return this;
            }

            /**
             * 3D模型：MODEL_3D 全景图片：PIC 全景视频：VIDEO
             */
            public Builder sceneType(String sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
