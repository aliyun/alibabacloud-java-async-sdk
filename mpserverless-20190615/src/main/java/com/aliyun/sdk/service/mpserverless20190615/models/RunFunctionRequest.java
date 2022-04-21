// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunFunctionRequest} extends {@link RequestModel}
 *
 * <p>RunFunctionRequest</p>
 */
public class RunFunctionRequest extends Request {
    @Body
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private RunFunctionRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunFunctionRequest create() {
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

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<RunFunctionRequest, Builder> {
        private String body; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunFunctionRequest request) {
            super(request);
            this.body = request.body;
            this.spaceId = request.spaceId;
        } 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public RunFunctionRequest build() {
            return new RunFunctionRequest(this);
        } 

    } 

}
