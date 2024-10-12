// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgQueryModelTrainStatusRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgQueryModelTrainStatusRequest</p>
 */
public class Personalizedtxt2imgQueryModelTrainStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    private Personalizedtxt2imgQueryModelTrainStatusRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgQueryModelTrainStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<Personalizedtxt2imgQueryModelTrainStatusRequest, Builder> {
        private String modelId; 

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgQueryModelTrainStatusRequest request) {
            super(request);
            this.modelId = request.modelId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public Personalizedtxt2imgQueryModelTrainStatusRequest build() {
            return new Personalizedtxt2imgQueryModelTrainStatusRequest(this);
        } 

    } 

}
