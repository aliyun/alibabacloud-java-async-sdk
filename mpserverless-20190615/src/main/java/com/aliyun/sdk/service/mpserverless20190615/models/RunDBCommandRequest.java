// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunDBCommandRequest} extends {@link RequestModel}
 *
 * <p>RunDBCommandRequest</p>
 */
public class RunDBCommandRequest extends Request {
    @Body
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private RunDBCommandRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDBCommandRequest create() {
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

    public static final class Builder extends Request.Builder<RunDBCommandRequest, Builder> {
        private String body; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDBCommandRequest request) {
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
        public RunDBCommandRequest build() {
            return new RunDBCommandRequest(this);
        } 

    } 

}
