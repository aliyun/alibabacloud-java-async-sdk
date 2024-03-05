// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkFileReadedRequest} extends {@link RequestModel}
 *
 * <p>MarkFileReadedRequest</p>
 */
public class MarkFileReadedRequest extends Request {
    @Body
    @NameInMap("applyCode")
    private String applyCode;

    @Body
    @NameInMap("fileId")
    private Long fileId;

    @Body
    @NameInMap("orderId")
    private String orderId;

    @Body
    @NameInMap("scene")
    private String scene;

    private MarkFileReadedRequest(Builder builder) {
        super(builder);
        this.applyCode = builder.applyCode;
        this.fileId = builder.fileId;
        this.orderId = builder.orderId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkFileReadedRequest create() {
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

    public static final class Builder extends Request.Builder<MarkFileReadedRequest, Builder> {
        private String applyCode; 
        private Long fileId; 
        private String orderId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(MarkFileReadedRequest request) {
            super(request);
            this.applyCode = request.applyCode;
            this.fileId = request.fileId;
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
        public MarkFileReadedRequest build() {
            return new MarkFileReadedRequest(this);
        } 

    } 

}
