// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelVersionLabelsRequest} extends {@link RequestModel}
 *
 * <p>CreateModelVersionLabelsRequest</p>
 */
public class CreateModelVersionLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    private CreateModelVersionLabelsRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.versionName = builder.versionName;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelVersionLabelsRequest create() {
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
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<CreateModelVersionLabelsRequest, Builder> {
        private String modelId; 
        private String versionName; 
        private java.util.List < Label > labels; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelVersionLabelsRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.versionName = request.versionName;
            this.labels = request.labels;
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
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public CreateModelVersionLabelsRequest build() {
            return new CreateModelVersionLabelsRequest(this);
        } 

    } 

}
