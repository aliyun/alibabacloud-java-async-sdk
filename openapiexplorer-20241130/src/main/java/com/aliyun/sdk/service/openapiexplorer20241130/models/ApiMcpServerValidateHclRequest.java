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
 * {@link ApiMcpServerValidateHclRequest} extends {@link RequestModel}
 *
 * <p>ApiMcpServerValidateHclRequest</p>
 */
public class ApiMcpServerValidateHclRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    private ApiMcpServerValidateHclRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiMcpServerValidateHclRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<ApiMcpServerValidateHclRequest, Builder> {
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(ApiMcpServerValidateHclRequest request) {
            super(request);
            this.code = request.code;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        @Override
        public ApiMcpServerValidateHclRequest build() {
            return new ApiMcpServerValidateHclRequest(this);
        } 

    } 

}
