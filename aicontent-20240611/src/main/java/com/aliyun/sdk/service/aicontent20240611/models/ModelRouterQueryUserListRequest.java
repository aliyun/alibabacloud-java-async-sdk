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
 * {@link ModelRouterQueryUserListRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryUserListRequest</p>
 */
public class ModelRouterQueryUserListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    private ModelRouterQueryUserListRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryUserListRequest create() {
        return builder().build();
    }

@Override
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
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryUserListRequest, Builder> {
        private String keyword; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryUserListRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.phone = request.phone;
        } 

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies the phone number for exact matching (not fuzzy). When specified together with keyword, the two conditions are combined with AND, meaning both must be satisfied. If not specified, no filtering by phone number is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>13800000000</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public ModelRouterQueryUserListRequest build() {
            return new ModelRouterQueryUserListRequest(this);
        } 

    } 

}
