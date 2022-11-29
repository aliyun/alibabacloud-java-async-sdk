// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>PutEnvironmentRequest</p>
 */
public class PutEnvironmentRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private Environment body;

    private PutEnvironmentRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public Environment getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PutEnvironmentRequest, Builder> {
        private String name; 
        private Environment body; 

        private Builder() {
            super();
        } 

        private Builder(PutEnvironmentRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * The name of the environment
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * An environment for serverless deployments
         */
        public Builder body(Environment body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PutEnvironmentRequest build() {
            return new PutEnvironmentRequest(this);
        } 

    } 

}
