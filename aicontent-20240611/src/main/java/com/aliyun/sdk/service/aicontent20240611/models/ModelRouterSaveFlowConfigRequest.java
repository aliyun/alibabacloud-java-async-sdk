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
 * {@link ModelRouterSaveFlowConfigRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterSaveFlowConfigRequest</p>
 */
public class ModelRouterSaveFlowConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rpm")
    private Integer rpm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("smoothFlowEnabled")
    private Boolean smoothFlowEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tpm")
    private Integer tpm;

    private ModelRouterSaveFlowConfigRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.rpm = builder.rpm;
        this.smoothFlowEnabled = builder.smoothFlowEnabled;
        this.tpm = builder.tpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterSaveFlowConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public Integer getModelId() {
        return this.modelId;
    }

    /**
     * @return rpm
     */
    public Integer getRpm() {
        return this.rpm;
    }

    /**
     * @return smoothFlowEnabled
     */
    public Boolean getSmoothFlowEnabled() {
        return this.smoothFlowEnabled;
    }

    /**
     * @return tpm
     */
    public Integer getTpm() {
        return this.tpm;
    }

    public static final class Builder extends Request.Builder<ModelRouterSaveFlowConfigRequest, Builder> {
        private Integer modelId; 
        private Integer rpm; 
        private Boolean smoothFlowEnabled; 
        private Integer tpm; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterSaveFlowConfigRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.rpm = request.rpm;
            this.smoothFlowEnabled = request.smoothFlowEnabled;
            this.tpm = request.tpm;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>607</p>
         */
        public Builder modelId(Integer modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * rpm.
         */
        public Builder rpm(Integer rpm) {
            this.putBodyParameter("rpm", rpm);
            this.rpm = rpm;
            return this;
        }

        /**
         * smoothFlowEnabled.
         */
        public Builder smoothFlowEnabled(Boolean smoothFlowEnabled) {
            this.putBodyParameter("smoothFlowEnabled", smoothFlowEnabled);
            this.smoothFlowEnabled = smoothFlowEnabled;
            return this;
        }

        /**
         * tpm.
         */
        public Builder tpm(Integer tpm) {
            this.putBodyParameter("tpm", tpm);
            this.tpm = tpm;
            return this;
        }

        @Override
        public ModelRouterSaveFlowConfigRequest build() {
            return new ModelRouterSaveFlowConfigRequest(this);
        } 

    } 

}
