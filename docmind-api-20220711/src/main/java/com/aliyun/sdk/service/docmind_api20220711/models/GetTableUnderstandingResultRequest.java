// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableUnderstandingResultRequest} extends {@link RequestModel}
 *
 * <p>GetTableUnderstandingResultRequest</p>
 */
public class GetTableUnderstandingResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetTableUnderstandingResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableUnderstandingResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetTableUnderstandingResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetTableUnderstandingResultRequest request) {
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
        public GetTableUnderstandingResultRequest build() {
            return new GetTableUnderstandingResultRequest(this);
        } 

    } 

}
