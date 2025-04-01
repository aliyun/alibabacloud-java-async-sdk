// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateModelLabelsRequest} extends {@link RequestModel}
 *
 * <p>CreateModelLabelsRequest</p>
 */
public class CreateModelLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    private CreateModelLabelsRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelLabelsRequest create() {
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

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<CreateModelLabelsRequest, Builder> {
        private String modelId; 
        private java.util.List<Label> labels; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelLabelsRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.labels = request.labels;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1dkasjfhds23dft</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public CreateModelLabelsRequest build() {
            return new CreateModelLabelsRequest(this);
        } 

    } 

}
