// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceSpecDetailRequest} extends {@link RequestModel}
 *
 * <p>QuerySpaceSpecDetailRequest</p>
 */
public class QuerySpaceSpecDetailRequest extends Request {
    @Body
    @NameInMap("SpecCode")
    @Validation(required = true)
    private String specCode;

    private QuerySpaceSpecDetailRequest(Builder builder) {
        super(builder);
        this.specCode = builder.specCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpaceSpecDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    public static final class Builder extends Request.Builder<QuerySpaceSpecDetailRequest, Builder> {
        private String specCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpaceSpecDetailRequest request) {
            super(request);
            this.specCode = request.specCode;
        } 

        /**
         * SpecCode.
         */
        public Builder specCode(String specCode) {
            this.putBodyParameter("SpecCode", specCode);
            this.specCode = specCode;
            return this;
        }

        @Override
        public QuerySpaceSpecDetailRequest build() {
            return new QuerySpaceSpecDetailRequest(this);
        } 

    } 

}
