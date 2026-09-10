// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarAgentUserSessionsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarAgentUserSessionsRequest</p>
 */
public class DescribePolarAgentUserSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DescribePolarAgentUserSessionsRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentUserSessionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DescribePolarAgentUserSessionsRequest, Builder> {
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarAgentUserSessionsRequest request) {
            super(request);
            this.source = request.source;
        } 

        /**
         * <p>The source of the product. The value is \<code>polardb-console\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb-console</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribePolarAgentUserSessionsRequest build() {
            return new DescribePolarAgentUserSessionsRequest(this);
        } 

    } 

}
