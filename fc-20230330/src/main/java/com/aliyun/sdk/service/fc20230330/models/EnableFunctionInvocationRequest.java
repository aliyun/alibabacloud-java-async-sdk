// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link EnableFunctionInvocationRequest} extends {@link RequestModel}
 *
 * <p>EnableFunctionInvocationRequest</p>
 */
public class EnableFunctionInvocationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    private EnableFunctionInvocationRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableFunctionInvocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder extends Request.Builder<EnableFunctionInvocationRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(EnableFunctionInvocationRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public EnableFunctionInvocationRequest build() {
            return new EnableFunctionInvocationRequest(this);
        } 

    } 

}
