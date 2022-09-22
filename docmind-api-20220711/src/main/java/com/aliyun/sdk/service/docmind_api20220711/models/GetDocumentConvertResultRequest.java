// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentConvertResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentConvertResultRequest</p>
 */
public class GetDocumentConvertResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetDocumentConvertResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentConvertResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetDocumentConvertResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentConvertResultRequest request) {
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
        public GetDocumentConvertResultRequest build() {
            return new GetDocumentConvertResultRequest(this);
        } 

    } 

}
