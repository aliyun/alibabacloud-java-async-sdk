// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetModelServiceRequest} extends {@link RequestModel}
 *
 * <p>GetModelServiceRequest</p>
 */
public class GetModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceName;

    private GetModelServiceRequest(Builder builder) {
        super(builder);
        this.modelServiceName = builder.modelServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public static final class Builder extends Request.Builder<GetModelServiceRequest, Builder> {
        private String modelServiceName; 

        private Builder() {
            super();
        } 

        private Builder(GetModelServiceRequest request) {
            super(request);
            this.modelServiceName = request.modelServiceName;
        } 

        /**
         * <p>modelServiceName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelServiceName</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putPathParameter("modelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        @Override
        public GetModelServiceRequest build() {
            return new GetModelServiceRequest(this);
        } 

    } 

}
