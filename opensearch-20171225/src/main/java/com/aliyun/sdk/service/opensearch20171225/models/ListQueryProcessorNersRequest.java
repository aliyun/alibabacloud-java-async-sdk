// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorNersRequest} extends {@link RequestModel}
 *
 * <p>ListQueryProcessorNersRequest</p>
 */
public class ListQueryProcessorNersRequest extends Request {
    @Query
    @NameInMap("domain")
    private String domain;

    private ListQueryProcessorNersRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryProcessorNersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<ListQueryProcessorNersRequest, Builder> {
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryProcessorNersRequest request) {
            super(request);
            this.domain = request.domain;
        } 

        /**
         * ECOMMERCE
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ListQueryProcessorNersRequest build() {
            return new ListQueryProcessorNersRequest(this);
        } 

    } 

}
