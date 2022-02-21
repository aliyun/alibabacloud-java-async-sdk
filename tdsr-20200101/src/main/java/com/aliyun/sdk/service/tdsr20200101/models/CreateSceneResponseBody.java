// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSceneResponseBody</p>
 */
public class CreateSceneResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("PreviewToken")
    private String previewToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneId")
    private Long sceneId;

    @NameInMap("Success")
    private Boolean success;

    private CreateSceneResponseBody(Builder builder) {
        this.errMessage = builder.errMessage;
        this.previewToken = builder.previewToken;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
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
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errMessage; 
        private String previewToken; 
        private String requestId; 
        private Long sceneId; 
        private Boolean success; 

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * PreviewToken.
         */
        public Builder previewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSceneResponseBody build() {
            return new CreateSceneResponseBody(this);
        } 

    } 

}
