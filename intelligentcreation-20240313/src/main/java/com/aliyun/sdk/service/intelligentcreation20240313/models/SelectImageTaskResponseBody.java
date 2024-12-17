// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SelectImageTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SelectImageTaskResponseBody</p>
 */
public class SelectImageTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("failed")
    private String failed;

    @com.aliyun.core.annotation.NameInMap("generationSource")
    private String generationSource;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("imageInfos")
    private java.util.List<ImageInfos> imageInfos;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("subtaskProcessing")
    private String subtaskProcessing;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("total")
    private String total;

    private SelectImageTaskResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.failed = builder.failed;
        this.generationSource = builder.generationSource;
        this.gmtCreate = builder.gmtCreate;
        this.imageInfos = builder.imageInfos;
        this.requestId = builder.requestId;
        this.scene = builder.scene;
        this.status = builder.status;
        this.subtaskProcessing = builder.subtaskProcessing;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectImageTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return failed
     */
    public String getFailed() {
        return this.failed;
    }

    /**
     * @return generationSource
     */
    public String getGenerationSource() {
        return this.generationSource;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return imageInfos
     */
    public java.util.List<ImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subtaskProcessing
     */
    public String getSubtaskProcessing() {
        return this.subtaskProcessing;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorMessage; 
        private String failed; 
        private String generationSource; 
        private String gmtCreate; 
        private java.util.List<ImageInfos> imageInfos; 
        private String requestId; 
        private String scene; 
        private String status; 
        private String subtaskProcessing; 
        private String success; 
        private String total; 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * failed.
         */
        public Builder failed(String failed) {
            this.failed = failed;
            return this;
        }

        /**
         * generationSource.
         */
        public Builder generationSource(String generationSource) {
            this.generationSource = generationSource;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * imageInfos.
         */
        public Builder imageInfos(java.util.List<ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * subtaskProcessing.
         */
        public Builder subtaskProcessing(String subtaskProcessing) {
            this.subtaskProcessing = subtaskProcessing;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public SelectImageTaskResponseBody build() {
            return new SelectImageTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SelectImageTaskResponseBody} extends {@link TeaModel}
     *
     * <p>SelectImageTaskResponseBody</p>
     */
    public static class ImageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customImageUrl")
        private String customImageUrl;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("imageH")
        private String imageH;

        @com.aliyun.core.annotation.NameInMap("imageW")
        private String imageW;

        private ImageInfos(Builder builder) {
            this.customImageUrl = builder.customImageUrl;
            this.gmtCreate = builder.gmtCreate;
            this.imageH = builder.imageH;
            this.imageW = builder.imageW;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfos create() {
            return builder().build();
        }

        /**
         * @return customImageUrl
         */
        public String getCustomImageUrl() {
            return this.customImageUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return imageH
         */
        public String getImageH() {
            return this.imageH;
        }

        /**
         * @return imageW
         */
        public String getImageW() {
            return this.imageW;
        }

        public static final class Builder {
            private String customImageUrl; 
            private String gmtCreate; 
            private String imageH; 
            private String imageW; 

            /**
             * customImageUrl.
             */
            public Builder customImageUrl(String customImageUrl) {
                this.customImageUrl = customImageUrl;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * imageH.
             */
            public Builder imageH(String imageH) {
                this.imageH = imageH;
                return this;
            }

            /**
             * imageW.
             */
            public Builder imageW(String imageW) {
                this.imageW = imageW;
                return this;
            }

            public ImageInfos build() {
                return new ImageInfos(this);
            } 

        } 

    }
}
