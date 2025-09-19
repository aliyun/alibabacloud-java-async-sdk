// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFunctionTrialStatusRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionTrialStatusRequest</p>
 */
public class GetFunctionTrialStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    private GetFunctionTrialStatusRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionTrialStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetFunctionTrialStatusRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionTrialStatusRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * <p>The name of the function module.</p>
         * 
         * <strong>example:</strong>
         * <p>trail_file_detect_api_reward</p>
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public GetFunctionTrialStatusRequest build() {
            return new GetFunctionTrialStatusRequest(this);
        } 

    } 

}
