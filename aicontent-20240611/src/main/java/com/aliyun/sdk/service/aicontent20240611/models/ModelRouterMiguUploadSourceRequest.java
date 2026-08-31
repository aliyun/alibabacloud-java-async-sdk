// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterMiguUploadSourceRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterMiguUploadSourceRequest</p>
 */
public class ModelRouterMiguUploadSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private ModelRouterMiguUploadSourceRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterMiguUploadSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ModelRouterMiguUploadSourceRequest, Builder> {
        private String fileType; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterMiguUploadSourceRequest request) {
            super(request);
            this.fileType = request.fileType;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO</p>
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kling</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ModelRouterMiguUploadSourceRequest build() {
            return new ModelRouterMiguUploadSourceRequest(this);
        } 

    } 

}
