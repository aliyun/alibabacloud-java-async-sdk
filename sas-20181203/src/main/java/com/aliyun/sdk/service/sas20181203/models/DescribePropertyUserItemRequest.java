// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUserItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUserItemRequest</p>
 */
public class DescribePropertyUserItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceFlush")
    private Boolean forceFlush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribePropertyUserItemRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.forceFlush = builder.forceFlush;
        this.pageSize = builder.pageSize;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUserItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return forceFlush
     */
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DescribePropertyUserItemRequest, Builder> {
        private Integer currentPage; 
        private Boolean forceFlush; 
        private Integer pageSize; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUserItemRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.forceFlush = request.forceFlush;
            this.pageSize = request.pageSize;
            this.user = request.user;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether to forcefully refresh the data that you want to query. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information about the account.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DescribePropertyUserItemRequest build() {
            return new DescribePropertyUserItemRequest(this);
        } 

    } 

}
