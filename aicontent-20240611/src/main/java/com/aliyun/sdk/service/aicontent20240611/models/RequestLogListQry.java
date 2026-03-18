// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link RequestLogListQry} extends {@link TeaModel}
 *
 * <p>RequestLogListQry</p>
 */
public class RequestLogListQry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private RequestLogListQry(Builder builder) {
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestLogListQry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String keyword; 
        private Integer page; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(RequestLogListQry model) {
            this.keyword = model.keyword;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.status = model.status;
        } 

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public RequestLogListQry build() {
            return new RequestLogListQry(this);
        } 

    } 

}
