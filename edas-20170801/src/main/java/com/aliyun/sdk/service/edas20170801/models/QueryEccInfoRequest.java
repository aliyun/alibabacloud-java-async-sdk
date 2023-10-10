// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEccInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryEccInfoRequest</p>
 */
public class QueryEccInfoRequest extends Request {
    @Query
    @NameInMap("EccId")
    @Validation(required = true)
    private String eccId;

    private QueryEccInfoRequest(Builder builder) {
        super(builder);
        this.eccId = builder.eccId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEccInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eccId
     */
    public String getEccId() {
        return this.eccId;
    }

    public static final class Builder extends Request.Builder<QueryEccInfoRequest, Builder> {
        private String eccId; 

        private Builder() {
            super();
        } 

        private Builder(QueryEccInfoRequest request) {
            super(request);
            this.eccId = request.eccId;
        } 

        /**
         * The ID of the ECC.
         */
        public Builder eccId(String eccId) {
            this.putQueryParameter("EccId", eccId);
            this.eccId = eccId;
            return this;
        }

        @Override
        public QueryEccInfoRequest build() {
            return new QueryEccInfoRequest(this);
        } 

    } 

}
