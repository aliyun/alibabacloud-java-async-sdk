// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSophonCommandsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSophonCommandsRequest</p>
 */
public class DescribeSophonCommandsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private DescribeSophonCommandsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSophonCommandsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeSophonCommandsRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSophonCommandsRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The name of the command. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_process</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeSophonCommandsRequest build() {
            return new DescribeSophonCommandsRequest(this);
        } 

    } 

}
