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
 * {@link GetModelProxyRequest} extends {@link RequestModel}
 *
 * <p>GetModelProxyRequest</p>
 */
public class GetModelProxyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelProxyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProxyName;

    private GetModelProxyRequest(Builder builder) {
        super(builder);
        this.modelProxyName = builder.modelProxyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelProxyName
     */
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    public static final class Builder extends Request.Builder<GetModelProxyRequest, Builder> {
        private String modelProxyName; 

        private Builder() {
            super();
        } 

        private Builder(GetModelProxyRequest request) {
            super(request);
            this.modelProxyName = request.modelProxyName;
        } 

        /**
         * <p>modelProxyName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelProxyName</p>
         */
        public Builder modelProxyName(String modelProxyName) {
            this.putPathParameter("modelProxyName", modelProxyName);
            this.modelProxyName = modelProxyName;
            return this;
        }

        @Override
        public GetModelProxyRequest build() {
            return new GetModelProxyRequest(this);
        } 

    } 

}
