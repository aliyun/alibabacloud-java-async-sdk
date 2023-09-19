// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocStructureResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocStructureResultRequest</p>
 */
public class GetDocStructureResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    private GetDocStructureResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocStructureResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetDocStructureResultRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDocStructureResultRequest request) {
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
        public GetDocStructureResultRequest build() {
            return new GetDocStructureResultRequest(this);
        } 

    } 

}
