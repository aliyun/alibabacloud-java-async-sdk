// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmDetailByNameRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmDetailByNameRequest</p>
 */
public class GetAlgorithmDetailByNameRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private GetAlgorithmDetailByNameRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDetailByNameRequest create() {
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

    public static final class Builder extends Request.Builder<GetAlgorithmDetailByNameRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmDetailByNameRequest response) {
            super(response);
            this.name = response.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetAlgorithmDetailByNameRequest build() {
            return new GetAlgorithmDetailByNameRequest(this);
        } 

    } 

}
