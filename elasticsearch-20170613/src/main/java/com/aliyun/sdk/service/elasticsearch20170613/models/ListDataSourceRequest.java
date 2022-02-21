// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceRequest</p>
 */
public class ListDataSourceRequest extends Request {
    @Query
    @NameInMap("Page")
    private String page;

    @Query
    @NameInMap("Size")
    private String size;

    private ListDataSourceRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDataSourceRequest, Builder> {
        private String page; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceRequest response) {
            super(response);
            this.page = response.page;
            this.size = response.size;
        } 

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDataSourceRequest build() {
            return new ListDataSourceRequest(this);
        } 

    } 

}
