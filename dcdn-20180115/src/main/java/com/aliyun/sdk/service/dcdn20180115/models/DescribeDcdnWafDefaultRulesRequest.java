// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafDefaultRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafDefaultRulesRequest</p>
 */
public class DescribeDcdnWafDefaultRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private String queryArgs;

    private DescribeDcdnWafDefaultRulesRequest(Builder builder) {
        super(builder);
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDefaultRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryArgs
     */
    public String getQueryArgs() {
        return this.queryArgs;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafDefaultRulesRequest, Builder> {
        private String queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafDefaultRulesRequest request) {
            super(request);
            this.queryArgs = request.queryArgs;
        } 

        /**
         * <p>The query conditions. The value is a string in the JSON format. Format: <code>QueryArgs={&quot;DefenseScene&quot;:&quot;anti_scan&quot;}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DefenseScene&quot;:&quot;anti_scan&quot;}</p>
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public DescribeDcdnWafDefaultRulesRequest build() {
            return new DescribeDcdnWafDefaultRulesRequest(this);
        } 

    } 

}
