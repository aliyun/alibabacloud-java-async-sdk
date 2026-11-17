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
 * {@link GetModelApiRequest} extends {@link RequestModel}
 *
 * <p>GetModelApiRequest</p>
 */
public class GetModelApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    private GetModelApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public static final class Builder extends Request.Builder<GetModelApiRequest, Builder> {
        private String httpApiId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
        } 

        /**
         * <p>The model API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-d00000000000000000000</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        @Override
        public GetModelApiRequest build() {
            return new GetModelApiRequest(this);
        } 

    } 

}
