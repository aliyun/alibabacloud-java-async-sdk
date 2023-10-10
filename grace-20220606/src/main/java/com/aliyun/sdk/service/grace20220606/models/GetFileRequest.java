// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileRequest} extends {@link RequestModel}
 *
 * <p>GetFileRequest</p>
 */
public class GetFileRequest extends Request {
    @Query
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("token")
    private String token;

    private GetFileRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileRequest create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetFileRequest, Builder> {
        private String name; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetFileRequest request) {
            super(request);
            this.name = request.name;
            this.token = request.token;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetFileRequest build() {
            return new GetFileRequest(this);
        } 

    } 

}
