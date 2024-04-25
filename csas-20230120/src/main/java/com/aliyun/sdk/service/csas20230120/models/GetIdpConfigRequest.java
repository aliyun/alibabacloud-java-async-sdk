// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIdpConfigRequest} extends {@link RequestModel}
 *
 * <p>GetIdpConfigRequest</p>
 */
public class GetIdpConfigRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private GetIdpConfigRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdpConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetIdpConfigRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetIdpConfigRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetIdpConfigRequest build() {
            return new GetIdpConfigRequest(this);
        } 

    } 

}
