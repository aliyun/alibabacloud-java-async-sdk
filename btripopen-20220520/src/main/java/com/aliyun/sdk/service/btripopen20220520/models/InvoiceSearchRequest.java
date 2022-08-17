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

    @Query
    @NameInMap("user_id")
    private String userId;

    private InvoiceSearchRequest(Builder builder) {
        super(builder);
        this.title = builder.title;
        this.userId = builder.userId;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<InvoiceSearchRequest, Builder> {
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceSearchRequest request) {
            super(request);
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public InvoiceSearchRequest build() {
            return new InvoiceSearchRequest(this);
        } 

    } 

}
