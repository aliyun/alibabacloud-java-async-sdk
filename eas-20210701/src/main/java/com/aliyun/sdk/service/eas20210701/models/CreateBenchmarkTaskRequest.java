// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateBenchmarkTaskRequest</p>
 */
public class CreateBenchmarkTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
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
         * The request body. The body includes the parameters that are set to create a stress testing task.
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
