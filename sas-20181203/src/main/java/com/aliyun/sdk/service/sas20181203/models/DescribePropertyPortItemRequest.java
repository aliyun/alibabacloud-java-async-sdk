// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyPortItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyPortItemRequest</p>
 */
public class DescribePropertyPortItemRequest extends Request {
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
    @NameInMap("Port")
    private String port;

    private DescribePropertyPortItemRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.forceFlush = builder.forceFlush;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyPortItemRequest create() {
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<DescribePropertyPortItemRequest, Builder> {
        private Integer currentPage; 
        private Boolean forceFlush; 
        private Integer pageSize; 
        private String port; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyPortItemRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.forceFlush = request.forceFlush;
            this.pageSize = request.pageSize;
            this.port = request.port;
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
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public DescribePropertyPortItemRequest build() {
            return new DescribePropertyPortItemRequest(this);
        } 

    } 

}
