// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutServiceRequest} extends {@link RequestModel}
 *
 * <p>PutServiceRequest</p>
 */
public class PutServiceRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private Service body;

    private PutServiceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutServiceRequest create() {
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
    public Service getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PutServiceRequest, Builder> {
        private String name; 
        private Service body; 

        private Builder() {
            super();
        } 

        private Builder(PutServiceRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * The name of the service
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * A service for serverless deployments
         */
        public Builder body(Service body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PutServiceRequest build() {
            return new PutServiceRequest(this);
        } 

    } 

}
