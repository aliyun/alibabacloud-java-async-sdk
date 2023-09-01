// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelVersionRequest} extends {@link RequestModel}
 *
 * <p>GetModelVersionRequest</p>
 */
public class GetModelVersionRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Path
    @NameInMap("VersionName")
    @Validation(required = true)
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

        @Override
        public GetModelVersionRequest build() {
            return new GetModelVersionRequest(this);
        } 

    } 

}
