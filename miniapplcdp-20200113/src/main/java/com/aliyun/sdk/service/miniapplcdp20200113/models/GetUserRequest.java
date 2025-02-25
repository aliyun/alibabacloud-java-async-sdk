// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserRequest} extends {@link RequestModel}
 *
 * <p>GetUserRequest</p>
 */
public class GetUserRequest extends Request {
    @Query
    @NameInMap("Source")
    private String source;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.source = request.source;
        } 

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
