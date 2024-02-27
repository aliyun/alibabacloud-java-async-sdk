// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCsrRequest} extends {@link RequestModel}
 *
 * <p>DeleteCsrRequest</p>
 */
public class DeleteCsrRequest extends Request {
    @Query
    @NameInMap("CsrId")
    @Validation(required = true)
    private Long csrId;

    private DeleteCsrRequest(Builder builder) {
        super(builder);
        this.csrId = builder.csrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csrId
     */
    public Long getCsrId() {
        return this.csrId;
    }

    public static final class Builder extends Request.Builder<DeleteCsrRequest, Builder> {
        private Long csrId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCsrRequest request) {
            super(request);
            this.csrId = request.csrId;
        } 

        /**
         * CSR ID。
         */
        public Builder csrId(Long csrId) {
            this.putQueryParameter("CsrId", csrId);
            this.csrId = csrId;
            return this;
        }

        @Override
        public DeleteCsrRequest build() {
            return new DeleteCsrRequest(this);
        } 

    } 

}
