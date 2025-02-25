// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListKvsRequest} extends {@link RequestModel}
 *
 * <p>ListKvsRequest</p>
 */
public class ListKvsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String prefix;

    private ListKvsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKvsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListKvsRequest, Builder> {
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListKvsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.prefix = request.prefix;
        } 

        /**
         * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreatevNamespace</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number. The product of PageNumber and PageSize cannot exceed 50,000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 50. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The prefix to query.</p>
         * 
         * <strong>example:</strong>
         * <p>prefix-</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListKvsRequest build() {
            return new ListKvsRequest(this);
        } 

    } 

}
