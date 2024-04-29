// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertySoftwareItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertySoftwareItemRequest</p>
 */
public class DescribePropertySoftwareItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceFlush")
    private Boolean forceFlush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribePropertySoftwareItemRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.forceFlush = builder.forceFlush;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertySoftwareItemRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribePropertySoftwareItemRequest, Builder> {
        private Integer currentPage; 
        private Boolean forceFlush; 
        private String name; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertySoftwareItemRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.forceFlush = request.forceFlush;
            this.name = request.name;
            this.pageSize = request.pageSize;
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
         * Specifies whether to forcefully refresh the data that you want to query.
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * The name of the software that you want to query.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public DescribePropertySoftwareItemRequest build() {
            return new DescribePropertySoftwareItemRequest(this);
        } 

    } 

}
