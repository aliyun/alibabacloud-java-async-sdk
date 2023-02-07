// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220729.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSingleDocumentExtractResultRequest} extends {@link RequestModel}
 *
 * <p>GetSingleDocumentExtractResultRequest</p>
 */
public class GetSingleDocumentExtractResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetSingleDocumentExtractResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSingleDocumentExtractResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetSingleDocumentExtractResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetSingleDocumentExtractResultRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 业务id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetSingleDocumentExtractResultRequest build() {
            return new GetSingleDocumentExtractResultRequest(this);
        } 

    } 

}
