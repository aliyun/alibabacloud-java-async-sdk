// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListModelCardsRequest} extends {@link RequestModel}
 *
 * <p>ListModelCardsRequest</p>
 */
public class ListModelCardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private ListModelCardsRequest(Builder builder) {
        super(builder);
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelCardsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder extends Request.Builder<ListModelCardsRequest, Builder> {
        private String provider; 

        private Builder() {
            super();
        } 

        private Builder(ListModelCardsRequest request) {
            super(request);
            this.provider = request.provider;
        } 

        /**
         * <p>The identifier of the model provider used to filter model cards by provider.</p>
         * 
         * <strong>example:</strong>
         * <p>provider-xxxxxxxx</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        @Override
        public ListModelCardsRequest build() {
            return new ListModelCardsRequest(this);
        } 

    } 

}
