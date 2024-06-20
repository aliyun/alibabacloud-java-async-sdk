// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelLabelsRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelLabelsRequest</p>
 */
public class DeleteModelLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private String labelKeys;

    private DeleteModelLabelsRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.labelKeys = builder.labelKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelLabelsRequest create() {
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
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<DeleteModelLabelsRequest, Builder> {
        private String modelId; 
        private String labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelLabelsRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.labelKeys = request.labelKeys;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * LabelKeys.
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public DeleteModelLabelsRequest build() {
            return new DeleteModelLabelsRequest(this);
        } 

    } 

}
