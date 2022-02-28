// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUserItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUserItemRequest</p>
 */
public class DescribePropertyUserItemRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ForceFlush")
    private Boolean forceFlush;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("User")
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

        private Builder(DescribePropertyUserItemRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.forceFlush = response.forceFlush;
            this.pageSize = response.pageSize;
            this.user = response.user;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ForceFlush.
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * User.
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
