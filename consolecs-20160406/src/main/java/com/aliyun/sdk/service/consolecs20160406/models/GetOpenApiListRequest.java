// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.consolecs20160406.models;

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
 * {@link GetOpenApiListRequest} extends {@link RequestModel}
 *
 * <p>GetOpenApiListRequest</p>
 */
public class GetOpenApiListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOpenApiListRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenApiListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<GetOpenApiListRequest, Builder> {
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(GetOpenApiListRequest request) {
            super(request);
            this.requestId = request.requestId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public GetOpenApiListRequest build() {
            return new GetOpenApiListRequest(this);
        } 

    } 

}
