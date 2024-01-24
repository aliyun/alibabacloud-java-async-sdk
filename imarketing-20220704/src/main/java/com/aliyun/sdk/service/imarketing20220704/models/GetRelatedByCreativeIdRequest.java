// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelatedByCreativeIdRequest} extends {@link RequestModel}
 *
 * <p>GetRelatedByCreativeIdRequest</p>
 */
public class GetRelatedByCreativeIdRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    private GetRelatedByCreativeIdRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelatedByCreativeIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetRelatedByCreativeIdRequest, Builder> {
        private Integer id; 

        private Builder() {
            super();
        } 

        private Builder(GetRelatedByCreativeIdRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetRelatedByCreativeIdRequest build() {
            return new GetRelatedByCreativeIdRequest(this);
        } 

    } 

}
