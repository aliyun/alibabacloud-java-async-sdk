// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_verify_agent20240131.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppInfoBySchemeRequest} extends {@link RequestModel}
 *
 * <p>QueryAppInfoBySchemeRequest</p>
 */
public class QueryAppInfoBySchemeRequest extends Request {
    @Body
    @NameInMap("schemeCode")
    private String schemeCode;

    private QueryAppInfoBySchemeRequest(Builder builder) {
        super(builder);
        this.schemeCode = builder.schemeCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInfoBySchemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return schemeCode
     */
    public String getSchemeCode() {
        return this.schemeCode;
    }

    public static final class Builder extends Request.Builder<QueryAppInfoBySchemeRequest, Builder> {
        private String schemeCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppInfoBySchemeRequest request) {
            super(request);
            this.schemeCode = request.schemeCode;
        } 

        /**
         * schemeCode.
         */
        public Builder schemeCode(String schemeCode) {
            this.putBodyParameter("schemeCode", schemeCode);
            this.schemeCode = schemeCode;
            return this;
        }

        @Override
        public QueryAppInfoBySchemeRequest build() {
            return new QueryAppInfoBySchemeRequest(this);
        } 

    } 

}
