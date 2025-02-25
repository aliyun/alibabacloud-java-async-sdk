// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBizTypeRequest} extends {@link RequestModel}
 *
 * <p>DeleteBizTypeRequest</p>
 */
public class DeleteBizTypeRequest extends Request {
    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    private DeleteBizTypeRequest(Builder builder) {
        super(builder);
        this.bizTypeName = builder.bizTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBizTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public static final class Builder extends Request.Builder<DeleteBizTypeRequest, Builder> {
        private String bizTypeName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBizTypeRequest request) {
            super(request);
            this.bizTypeName = request.bizTypeName;
        } 

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        @Override
        public DeleteBizTypeRequest build() {
            return new DeleteBizTypeRequest(this);
        } 

    } 

}
