// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceSearchRequest} extends {@link RequestModel}
 *
 * <p>InvoiceSearchRequest</p>
 */
public class InvoiceSearchRequest extends Request {
    @Query
    @NameInMap("title")
    private String title;

    private InvoiceSearchRequest(Builder builder) {
        super(builder);
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<InvoiceSearchRequest, Builder> {
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceSearchRequest request) {
            super(request);
            this.title = request.title;
        } 

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public InvoiceSearchRequest build() {
            return new InvoiceSearchRequest(this);
        } 

    } 

}
