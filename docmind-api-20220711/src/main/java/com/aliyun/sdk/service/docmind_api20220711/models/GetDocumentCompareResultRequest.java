// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentCompareResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentCompareResultRequest</p>
 */
public class GetDocumentCompareResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetDocumentCompareResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentCompareResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetDocumentCompareResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentCompareResultRequest request) {
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
        public GetDocumentCompareResultRequest build() {
            return new GetDocumentCompareResultRequest(this);
        } 

    } 

}
