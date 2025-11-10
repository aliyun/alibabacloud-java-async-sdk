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
 * {@link GetApiMcpServerRequest} extends {@link RequestModel}
 *
 * <p>GetApiMcpServerRequest</p>
 */
public class GetApiMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetApiMcpServerRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiMcpServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetApiMcpServerRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetApiMcpServerRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v6ZZ7ftCzEILW***</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetApiMcpServerRequest build() {
            return new GetApiMcpServerRequest(this);
        } 

    } 

}
