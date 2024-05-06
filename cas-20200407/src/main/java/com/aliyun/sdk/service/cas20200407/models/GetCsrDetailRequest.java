// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCsrDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCsrDetailRequest</p>
 */
public class GetCsrDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CsrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long csrId;

    private GetCsrDetailRequest(Builder builder) {
        super(builder);
        this.csrId = builder.csrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCsrDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetCsrDetailRequest, Builder> {
        private Long csrId; 

        private Builder() {
            super();
        } 

        private Builder(GetCsrDetailRequest request) {
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
        public GetCsrDetailRequest build() {
            return new GetCsrDetailRequest(this);
        } 

    } 

}
