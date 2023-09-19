// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentExtractResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentExtractResultRequest</p>
 */
public class GetDocumentExtractResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetDocumentExtractResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentExtractResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetDocumentExtractResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentExtractResultRequest request) {
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
        public GetDocumentExtractResultRequest build() {
            return new GetDocumentExtractResultRequest(this);
        } 

    } 

}
