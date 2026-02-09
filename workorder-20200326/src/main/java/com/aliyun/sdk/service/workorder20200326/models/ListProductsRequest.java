// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.language = request.language;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
