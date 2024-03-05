// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPreViewUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPreViewUrlRequest</p>
 */
public class GetPreViewUrlRequest extends Request {
    @Body
    @NameInMap("applyCode")
    private String applyCode;

    @Body
    @NameInMap("fileId")
    private Long fileId;

    @Body
    @NameInMap("fileKey")
    private String fileKey;

    @Body
    @NameInMap("orderId")
    private String orderId;

    @Body
    @NameInMap("scene")
    private String scene;

    private GetPreViewUrlRequest(Builder builder) {
        super(builder);
        this.applyCode = builder.applyCode;
        this.fileId = builder.fileId;
        this.fileKey = builder.fileKey;
        this.orderId = builder.orderId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPreViewUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyCode
     */
    public String getApplyCode() {
        return this.applyCode;
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

    public static final class Builder extends Request.Builder<GetPreViewUrlRequest, Builder> {
        private String applyCode; 
        private Long fileId; 
        private String fileKey; 
        private String orderId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(GetPreViewUrlRequest request) {
            super(request);
            this.applyCode = request.applyCode;
            this.fileId = request.fileId;
            this.fileKey = request.fileKey;
            this.orderId = request.orderId;
            this.scene = request.scene;
        } 

        /**
         * applyCode.
         */
        public Builder applyCode(String applyCode) {
            this.putBodyParameter("applyCode", applyCode);
            this.applyCode = applyCode;
            return this;
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
        public GetPreViewUrlRequest build() {
            return new GetPreViewUrlRequest(this);
        } 

    } 

}
