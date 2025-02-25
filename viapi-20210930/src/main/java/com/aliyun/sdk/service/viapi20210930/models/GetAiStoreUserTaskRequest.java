// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiStoreUserTaskRequest} extends {@link RequestModel}
 *
 * <p>GetAiStoreUserTaskRequest</p>
 */
public class GetAiStoreUserTaskRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private GetAiStoreUserTaskRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiStoreUserTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetAiStoreUserTaskRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetAiStoreUserTaskRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetAiStoreUserTaskRequest build() {
            return new GetAiStoreUserTaskRequest(this);
        } 

    } 

}
