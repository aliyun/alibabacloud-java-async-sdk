// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApiTestRequest} extends {@link RequestModel}
 *
 * <p>ApiTestRequest</p>
 */
public class ApiTestRequest extends Request {
    @Query
    @NameInMap("testCmd")
    private String testCmd;

    private ApiTestRequest(Builder builder) {
        super(builder);
        this.testCmd = builder.testCmd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return testCmd
     */
    public String getTestCmd() {
        return this.testCmd;
    }

    public static final class Builder extends Request.Builder<ApiTestRequest, Builder> {
        private String testCmd; 

        private Builder() {
            super();
        } 

        private Builder(ApiTestRequest request) {
            super(request);
            this.testCmd = request.testCmd;
        } 

        /**
         * testCmd.
         */
        public Builder testCmd(String testCmd) {
            this.putQueryParameter("testCmd", testCmd);
            this.testCmd = testCmd;
            return this;
        }

        @Override
        public ApiTestRequest build() {
            return new ApiTestRequest(this);
        } 

    } 

}
