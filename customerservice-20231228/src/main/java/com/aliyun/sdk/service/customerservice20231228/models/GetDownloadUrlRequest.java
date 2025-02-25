// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDownloadUrlRequest</p>
 */
public class GetDownloadUrlRequest extends Request {
    @Body
    @NameInMap("fileId")
    private Long fileId;

    @Body
    @NameInMap("fileKey")
    private String fileKey;

    @Body
    @NameInMap("freeOrderApplyCode")
    private String freeOrderApplyCode;

    @Body
    @NameInMap("orderId")
    private String orderId;

    @Body
    @NameInMap("scene")
    private String scene;

    private GetDownloadUrlRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.fileKey = builder.fileKey;
        this.freeOrderApplyCode = builder.freeOrderApplyCode;
        this.orderId = builder.orderId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return freeOrderApplyCode
     */
    public String getFreeOrderApplyCode() {
        return this.freeOrderApplyCode;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<GetDownloadUrlRequest, Builder> {
        private Long fileId; 
        private String fileKey; 
        private String freeOrderApplyCode; 
        private String orderId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(GetDownloadUrlRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.fileKey = request.fileKey;
            this.freeOrderApplyCode = request.freeOrderApplyCode;
            this.orderId = request.orderId;
            this.scene = request.scene;
        } 

        /**
         * fileId.
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("fileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * fileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("fileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * freeOrderApplyCode.
         */
        public Builder freeOrderApplyCode(String freeOrderApplyCode) {
            this.putBodyParameter("freeOrderApplyCode", freeOrderApplyCode);
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("orderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public GetDownloadUrlRequest build() {
            return new GetDownloadUrlRequest(this);
        } 

    } 

}
