// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetOwnRequestLogRequest} extends {@link RequestModel}
 *
 * <p>GetOwnRequestLogRequest</p>
 */
public class GetOwnRequestLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logRequestId;

    private GetOwnRequestLogRequest(Builder builder) {
        super(builder);
        this.logRequestId = builder.logRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOwnRequestLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public static final class Builder extends Request.Builder<GetOwnRequestLogRequest, Builder> {
        private String logRequestId; 

        private Builder() {
            super();
        } 

        private Builder(GetOwnRequestLogRequest request) {
            super(request);
            this.logRequestId = request.logRequestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123E4567-E89B-12D3-A456-426614174000</p>
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("logRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        @Override
        public GetOwnRequestLogRequest build() {
            return new GetOwnRequestLogRequest(this);
        } 

    } 

}
