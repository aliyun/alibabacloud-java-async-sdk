// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("Size")
    private Integer size;

    private ListProjectRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListProjectRequest, Builder> {
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRequest response) {
            super(response);
            this.page = response.page;
            this.size = response.size;
        } 

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
