// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link ListCoursesRequest} extends {@link RequestModel}
 *
 * <p>ListCoursesRequest</p>
 */
public class ListCoursesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private java.util.List<Long> id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private ListCoursesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCoursesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List<Long> getId() {
        return this.id;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListCoursesRequest, Builder> {
        private java.util.List<Long> id; 
        private Long page; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCoursesRequest request) {
            super(request);
            this.id = request.id;
            this.page = request.page;
            this.pageSize = request.pageSize;
        } 

        /**
         * Id.
         */
        public Builder id(java.util.List<Long> id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListCoursesRequest build() {
            return new ListCoursesRequest(this);
        } 

    } 

}
