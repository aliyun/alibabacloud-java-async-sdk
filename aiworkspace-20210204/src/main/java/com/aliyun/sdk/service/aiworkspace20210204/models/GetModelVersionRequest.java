// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModelVersionRequest} extends {@link RequestModel}
 *
 * <p>GetModelVersionRequest</p>
 */
public class GetModelVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    private GetModelVersionRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetModelVersionRequest, Builder> {
        private String modelId; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(GetModelVersionRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.versionName = request.versionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-rbvg5wzljz****ks92</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public GetModelVersionRequest build() {
            return new GetModelVersionRequest(this);
        } 

    } 

}
