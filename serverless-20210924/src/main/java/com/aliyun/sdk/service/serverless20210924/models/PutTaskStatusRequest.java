// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>PutTaskStatusRequest</p>
 */
public class PutTaskStatusRequest extends Request {
    @Path
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("body")
    private Task body;

    @Query
    @NameInMap("force")
    private Boolean force;

    private PutTaskStatusRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutTaskStatusRequest create() {
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
    public Task getBody() {
        return this.body;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<PutTaskStatusRequest, Builder> {
        private String name; 
        private Task body; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(PutTaskStatusRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
            this.force = request.force;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(Task body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * 强制更新
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public PutTaskStatusRequest build() {
            return new PutTaskStatusRequest(this);
        } 

    } 

}
