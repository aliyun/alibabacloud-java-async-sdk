// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetModelGroupRequest} extends {@link RequestModel}
 *
 * <p>GetModelGroupRequest</p>
 */
public class GetModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelGroupId;

    private GetModelGroupRequest(Builder builder) {
        super(builder);
        this.modelGroupId = builder.modelGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelGroupId
     */
    public String getModelGroupId() {
        return this.modelGroupId;
    }

    public static final class Builder extends Request.Builder<GetModelGroupRequest, Builder> {
        private String modelGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelGroupRequest request) {
            super(request);
            this.modelGroupId = request.modelGroupId;
        } 

        /**
         * <p>The ID of the model group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mg-xxxxxxxx</p>
         */
        public Builder modelGroupId(String modelGroupId) {
            this.putPathParameter("modelGroupId", modelGroupId);
            this.modelGroupId = modelGroupId;
            return this;
        }

        @Override
        public GetModelGroupRequest build() {
            return new GetModelGroupRequest(this);
        } 

    } 

}
