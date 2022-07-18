// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateBenchmarkTaskRequest</p>
 */
public class CreateBenchmarkTaskRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    private CreateBenchmarkTaskRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBenchmarkTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateBenchmarkTaskRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateBenchmarkTaskRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateBenchmarkTaskRequest build() {
            return new CreateBenchmarkTaskRequest(this);
        } 

    } 

}
