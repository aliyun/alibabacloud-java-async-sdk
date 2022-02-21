// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>TempPreviewResponseBody</p>
 */
public class TempPreviewResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PreviewUrl")
    private String previewUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneId")
    private String sceneId;

    @NameInMap("Success")
    private Boolean success;

    private TempPreviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.previewUrl = builder.previewUrl;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempPreviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return previewUrl
     */
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private String previewUrl; 
        private String requestId; 
        private String sceneId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
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
         * 预览链接
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TempPreviewResponseBody build() {
            return new TempPreviewResponseBody(this);
        } 

    } 

}
