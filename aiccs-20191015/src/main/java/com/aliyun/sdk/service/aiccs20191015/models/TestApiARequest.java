// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestApiARequest} extends {@link RequestModel}
 *
 * <p>TestApiARequest</p>
 */
public class TestApiARequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private TestApiARequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestApiARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<TestApiARequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(TestApiARequest response) {
            super(response);
            this.clientToken = response.clientToken;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public TestApiARequest build() {
            return new TestApiARequest(this);
        } 

    } 

}
