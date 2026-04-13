// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetTerraformStateDetectionRequest} extends {@link RequestModel}
 *
 * <p>GetTerraformStateDetectionRequest</p>
 */
public class GetTerraformStateDetectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("detectionId")
    private String detectionId;

    private GetTerraformStateDetectionRequest(Builder builder) {
        super(builder);
        this.detectionId = builder.detectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerraformStateDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionId
     */
    public String getDetectionId() {
        return this.detectionId;
    }

    public static final class Builder extends Request.Builder<GetTerraformStateDetectionRequest, Builder> {
        private String detectionId; 

        private Builder() {
            super();
        } 

        private Builder(GetTerraformStateDetectionRequest request) {
            super(request);
            this.detectionId = request.detectionId;
        } 

        /**
         * detectionId.
         */
        public Builder detectionId(String detectionId) {
            this.putPathParameter("detectionId", detectionId);
            this.detectionId = detectionId;
            return this;
        }

        @Override
        public GetTerraformStateDetectionRequest build() {
            return new GetTerraformStateDetectionRequest(this);
        } 

    } 

}
